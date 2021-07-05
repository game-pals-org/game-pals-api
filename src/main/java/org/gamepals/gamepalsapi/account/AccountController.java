package org.gamepals.gamepalsapi.account;

import org.gamepals.gamepalsapi.account.accountpasses.AccountPasses;
import org.gamepals.gamepalsapi.account.loginregisterinfo.LoginRegisterInfo;
import org.gamepals.gamepalsapi.announcement.Announcement;
import org.gamepals.gamepalsapi.announcement.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/account")
@CrossOrigin
public class AccountController {

    private final AccountService accountService;
    private final AnnouncementService announcementService;

    @Autowired
    private AccountController(AccountService accountService, AnnouncementService announcementService) {
        this.accountService = accountService;
        this.announcementService = announcementService;
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
