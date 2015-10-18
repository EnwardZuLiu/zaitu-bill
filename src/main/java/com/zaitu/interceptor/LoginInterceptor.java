/*    */ package com.zaitu.interceptor;
/*    */ 
/*    */ import com.zaitu.entity.User;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ import org.springframework.web.servlet.ModelAndView;
/*    */ import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LoginInterceptor
/*    */   extends HandlerInterceptorAdapter
/*    */ {
/*    */   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
/*    */     throws Exception
/*    */   {
/* 20 */     User user = (User)request.getSession().getAttribute("user");
/* 21 */     if (user == null) {
/* 22 */       response.sendRedirect(request.getContextPath() + "/");
/* 23 */       return false;
/*    */     }
/* 25 */     return super.preHandle(request, response, handler);
/*    */   }
/*    */   
/*    */ 
/*    */   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
/*    */     throws Exception
/*    */   {
/* 32 */     super.postHandle(request, response, handler, modelAndView);
/*    */   }
/*    */   
/*    */ 
/*    */   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
/*    */     throws Exception
/*    */   {
/* 39 */     super.afterCompletion(request, response, handler, ex);
/*    */   }
/*    */ }


/* Location:              D:\szzaituWorkFolder\IdeaProjects\zaitu-bill\WEB-INF\classes\!\com\zaitu\interceptor\LoginInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */