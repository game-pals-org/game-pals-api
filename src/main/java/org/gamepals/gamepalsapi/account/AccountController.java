package org.gamepals.gamepalsapi.account;

import org.gamepals.gamepalsapi.account.accountpasses.AccountPasses;
import org.gamepals.gamepalsapi.account.loginregisterinfo.LoginRegisterInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/account")
@CrossOrigin
public class AccountController {

    private final AccountService accountService;

    @Autowired
    private AccountController(@Qualifier("accountInMemoryService") AccountService accountService) {
        this.accountService = accountService;

    }

    @PostMapping("/login")
    public LoginRegisterInfo loginUser(@RequestBody AccountPasses passes) throws NoSuchAlgorithmException {
        return accountService.loginUser(passes);
    }

    @PostMapping("/register")
    public LoginRegisterInfo registerUser(@RequestBody AccountPasses passes) throws NoSuchAlgorithmException {
        return accountService.registerUser(passes);
    }
}
