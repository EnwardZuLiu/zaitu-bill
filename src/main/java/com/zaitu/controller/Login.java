/*    */ package com.zaitu.controller;
/*    */ 
/*    */ import com.zaitu.entity.User;
/*    */ import com.zaitu.service.UserService;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.stereotype.Controller;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Controller
/*    */ @RequestMapping({"/ex/login"})
/*    */ public class Login
/*    */ {
/*    */   @Autowired
/*    */   private UserService userService;
/*    */   
/*    */   @RequestMapping(value={"/login"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
/*    */   public String login(User user, HttpServletRequest request)
/*    */   {
/* 24 */     User u = this.userService.login(user);
/* 25 */     if (u != null) {
/* 26 */       request.getSession().setAttribute("user", u);
/* 27 */       if (u.getRoleName().equals("admin"))
/* 28 */         return "redirect:/bill/bill/list";
/* 29 */       if (u.getRoleName().equals("ceo"))
/* 30 */         return "redirect:/bill/bill/ceo/list/1";
/* 31 */       if (u.getRoleName().equals("finance")) {
/* 32 */         return "redirect:/bill/bill/finance/list/1";
/*    */       }
/* 34 */       return "redirect:/bill/bill/list/1";
/*    */     }
/*    */     
/* 37 */     return "redirect:/";
/*    */   }
/*    */   
/*    */   @RequestMapping(value={"/logout"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
/*    */   public String logout(HttpServletRequest request) {
/* 42 */     request.getSession().removeAttribute("user");
/* 43 */     return "redirect:/";
/*    */   }
/*    */ }


/* Location:              D:\szzaituWorkFolder\IdeaProjects\zaitu-bill\WEB-INF\classes\!\com\zaitu\controller\Login.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */