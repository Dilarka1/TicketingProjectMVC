package com.cybertek.controller;

import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.service.RoleService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user",new UserDTO());
        model.addAttribute("roles",roleService.findAll());
        model.addAttribute("users",userService.findAll());

        return "/user/create";
    }

    @PostMapping("create")
    public String insertUser(UserDTO user, Model model){

        userService.save(user);

        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles", roleService.findAll());
        model.addAttribute("users", userService.findAll());

        return "user/create";

    }
}

/*
rejected value [RoleDTO(id=2, description=Manager)];
codes [typeMismatch.userDTO.role.id,typeMismatch.role.id,typeMismatch.id,
typeMismatch.java.lang.Long,typeMismatch];
arguments [org.springframework.context.support.DefaultMessageSourceResolvable:
codes [userDTO.role.id,role.id]; arguments []; default message [role.id]];
default message [Failed to convert property value of type 'java.lang.String'
 to required type 'java.lang.Long' for property 'role.id'; nested exception
 is java.lang.NumberFormatException: For input string: "RoleDTO(id=2,description=Manager)"]
 */