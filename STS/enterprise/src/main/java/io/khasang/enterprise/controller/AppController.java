package io.khasang.enterprise.controller;

import io.khasang.enterprise.service.ChatService;
import io.khasang.enterprise.service.ProjectTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;

@Controller
public class AppController {
    ProjectTrackingService trackingService;
    ChatService chatService;

    @Autowired
    public AppController(ProjectTrackingService trackingService, ChatService chatService) {
        this.trackingService = trackingService;
        this.chatService = chatService;
    }

    @RequestMapping(value = {"/", "/index"})
    public String home(Model model) {
        return "index";
    }

    @RequestMapping("/structure")
    public String structure(Model model) {
        return "structure";
    }

    @RequestMapping("/services")
    public String services(Model model) {
        return "services";
    }

    @RequestMapping("/news")
    public String news(Model model) {
        return "news";
    }

    @RequestMapping("/projects")
    public String projects(Model model) {
        return "projects";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @RequestMapping("/registration")
    public String registration(Model model) {
        return "registration";
    }

    @RequestMapping("/contacts")
    public String contacts(Model model) {
        return "contacts";
    }

    @RequestMapping("/customer/customer")
    public String customer() {
        return "customer/customer";
    }

    @RequestMapping("/customer/chat")
    public String chat() {
        return "customer/chat";
    }

}