package org.gamepals.gamepalsapi.account;

import org.gamepals.gamepalsapi.account.accountpasses.AccountPasses;
import org.gamepals.gamepalsapi.account.loginregisterinfo.LoginRegisterInfo;
import org.gamepals.gamepalsapi.announcement.Announcement;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface AccountService {
    LoginRegisterInfo loginUser(AccountPasses passes) throws NoSuchAlgorithmException;
    LoginRegisterInfo registerUser(AccountPasses passes) throws NoSuchAlgorithmException;
}
