package cn.itcast.controller;


import cn.itcast.domain.Account;
import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;


@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username, String password){
        System.out.println("执行了。。。");
        System.out.println(username+"   "+password);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了。。。");
        System.out.println(account);
        return "success";
    }



//    自定义类型转换器
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("执行了。。。");
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/testServelt")
    public String testServelt(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了。。。");
        System.out.println(request);
        System.out.println(response);
        HttpSession session  =request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        return "success";
    }
}
