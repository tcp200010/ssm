package cn.project.controller;

import cn.project.domain.Account;
import cn.project.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * web层的控制器
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView modelAndView){
        //调用service的方法
        List<Account> accounts = accountService.findAll();
        //利用ModelAndView将数据存入request域中，然后转发到success.jsp页面显示
        ModelAndView mv=new ModelAndView();
        mv.addObject("accounts",accounts);//存入request域
        mv.setViewName("list");//转发到list.jsp页面
        return mv;
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        //调用service的方法进行保存
        accountService.saveAccount(account);
        //保存成功后就跳转到success.jsp页面
        return "success";
    }
}
