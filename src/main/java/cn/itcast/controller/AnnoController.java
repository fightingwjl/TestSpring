package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value="msg") //把msg存到session域
public class AnnoController implements Serializable {

    @RequestMapping(value="/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("testModelAttribute执行了...");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showUser(String username, Map<String, User> map){
        System.out.println("showUser执行了");
        //通过用户查数据库
        User user = new User();
        user.setUsername(username);
        user.setAge(20);
        user.setDate(new Date());
        map.put("abc", user);
    }

    //该方法先执行
//    @ModelAttribute
//    public User showUser(String username){
//        System.out.println("showUser执行了");
//        //通过用户查数据库
//        User user = new User();
//        user.setUsername(username);
//        user.setAge(20);
//        user.setDate(new Date());
//        return user;
//    }


    @RequestMapping(value="/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testModelAttribute执行了...");
        model.addAttribute("msg", "妹妹");
        return "success";
    }

    @RequestMapping(value="/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){
        System.out.println("getSessionAttributes执行了...");
        String msg = (String)modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }

    //清除
    @RequestMapping(value="/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        System.out.println("delSessionAttributes执行了...");
        status.setComplete();
        return "success";
    }

}
