package org.gamepals.gamepalsapi.account;

import org.gamepals.gamepalsapi.account.accountpasses.AccountPasses;
import org.gamepals.gamepalsapi.account.loginregisterinfo.LoginRegisterInfo;
import org.gamepals.gamepalsapi.account.passwordencryptor.PasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

@Service
public class AccountDbService implements AccountService{
    private  final AccountRepository repository;

    @Autowired
    public AccountDbService(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public LoginRegisterInfo loginUser(AccountPasses passes) throws NoSuchAlgorithmException {
        Account user = repository.findById(passes.getUsername()).orElse(null);
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
        Account user = repository.findById(passes.getUsername()).orElse(null);
        if(user != null){
            return new LoginRegisterInfo(false, "", "User with username " + passes.getUsername() + " is already registered ");
        } else{
           repository.save(new Account(passes.getUsername(), PasswordEncryptor.encrypt(passes.getPassword()), new ArrayList<>()));
            return new LoginRegisterInfo(true, passes.getUsername(), "Register successful");
        }
    }

}
