package org.gamepals.gamepalsapi.account;

import org.gamepals.gamepalsapi.account.accountpasses.AccountPasses;
import org.gamepals.gamepalsapi.account.loginregisterinfo.LoginRegisterInfo;
import org.gamepals.gamepalsapi.account.passwordencryptor.PasswordEncryptor;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AccountInMemoryService implements AccountService {

    private List<Account> users = new ArrayList<>(Arrays.asList(
            new Account("ShadowWarrior", "0EB0CB8F59E4EFFDEDAB83E44E320301C413A24573CB1606F83D8F2A1778E58B", new ArrayList<>(Arrays.asList(1L, 2L, 4L))),
            new Account("pawcio_x2010", "", new ArrayList<>(Arrays.asList(3L, 5L)))
    ));

    @Override
    public LoginRegisterInfo loginUser(AccountPasses passes) throws NoSuchAlgorithmException {
        Account user = users.stream().filter(u -> u.getUsername().equals(passes.getUsername())).findFirst().orElse(null);
        if(user == null){
            return new LoginRegisterInfo(false, "", "User with username " + passes.getUsername() + " is not registered");
        }
        if (user.getEncodedPassword().equals(PasswordEncryptor.encrypt(passes.getPassword()))){
            return new LoginRegisterInfo(true, passes.getUsername(), "Log in successful");
        } else {
            return new LoginRegisterInfo(false, passes.getUsername(), "Incorrect password");
        }
    }

    @Override
    public LoginRegisterInfo registerUser(AccountPasses passes) throws NoSuchAlgorithmException {
        Account user = users.stream().filter(u -> u.getUsername().equals(passes.getUsername())).findFirst().orElse(null);
        if(user != null){
            return new LoginRegisterInfo(false, "", "User with username " + passes.getUsername() + " is already registered ");
        } else{
            users.add(new Account(passes.getUsername(), PasswordEncryptor.encrypt(passes.getPassword()), new ArrayList<>()));
            return new LoginRegisterInfo(true, passes.getUsername(), "Register successful");
        }
    }
}
