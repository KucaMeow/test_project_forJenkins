package ru.itis.semestrovaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class FacebookConnectController {

    @Autowired
    private Facebook facebook;

//    @RequestMapping(method= RequestMethod.GET)
//    public String helloFacebook(Model model) {
//        if (!facebook.isAuthorized()) {
//            return "redirect:/connect/facebook";
//        }
//
//        model.addAttribute(facebook.userOperations().getUserProfile());
//        PagedList<Post> homeFeed = facebook.feedOperations().getHomeFeed();
//        model.addAttribute("feed", homeFeed);
//
//        return "hello";
//    }

}
