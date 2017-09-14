package ru.mycompany.Controllers;

import ru.mycompany.Database.Entity.User;
import ru.mycompany.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users")
    public String listUsers(Model model){
        model.addAttribute("listusers", this.userService.listUsers());
        return "users";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUserForm(Model model){
        model.addAttribute("user", new User());
        return "addUser";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user")User user){
        this.userService.saveOrUpdateUser(user);
        return "redirect:/users";
    }

    @RequestMapping(value = "addUser/{userId}")
    public String updateUserShow(@PathVariable("userId") Integer userId, Model model){
        model.addAttribute("user", this.userService.findById(userId));
        return "addUser";
    }

    @RequestMapping("/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Integer userId) {
        this.userService.removeUser(this.userService.findById(userId));
        return "redirect:/users";
    }
}
