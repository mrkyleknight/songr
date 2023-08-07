package com.java401d18.songr.Controllers;

//import com.java401d18.songr.Models.SiteUser;
//import com.java401d18.songr.Repositories.SiteUserRepository;
//import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

//    @Autowired
//    SiteUserRepository siteUserRepository;

    @GetMapping("/login")
    public String getLogin() {
        return "login.html";
    }


    @PostMapping("/login")
    public RedirectView login(String userName, String password) {
        return new RedirectView("/albums");
    }

    //
//        // Confirm that password is correct for the given user
//        // 1. Find the corresponding user
//        SiteUser siteUser = siteUserRepository.findSiteUserByUserName(userName);
//
//        if (siteUser == null) {
//            return new RedirectView("/");
//        }
//
//        // 2. Check if the stored password matches
//        if (!BCrypt.checkpw(password, siteUser.getPassword())) {
//            return new RedirectView("/");
//        }
//
//        // Store the username in the session
//        HttpSession session = request.getSession();
//        session.setAttribute("userName", userName);
//
//        return new RedirectView("/albums");
//    }
//
    @PostMapping("/signup")
    public RedirectView signup(String userName, String password) {
        return new RedirectView('/');
    }


}

//        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt(10));
//
//        SiteUser newUser = new SiteUser(userName, hashedPassword);
//        siteUserRepository.save(newUser);
//
//        return new RedirectView("/");
//    }

//    @GetMapping("/logout")
//    public RedirectView logout(HttpServletRequest request) {
//        HttpSession session = request.getSession();
//        session.invalidate();
//        return new RedirectView("/");
//    }
//}

