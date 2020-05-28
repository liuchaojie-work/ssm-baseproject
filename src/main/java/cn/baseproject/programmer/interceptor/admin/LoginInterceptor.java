package cn.baseproject.programmer.interceptor.admin;

import net.sf.json.JSONObject;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 后台登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String requestURI = httpServletRequest.getRequestURI();
        Object admin = httpServletRequest.getSession().getAttribute("admin");
        if(null == admin){
            //表示未登录或者登录失效
            System.out.println("链接"+requestURI+"进入拦截器！");
            String header = httpServletRequest.getHeader("X-Requested-With");
            //判断是否时ajax请求
            if("XMLHttpRequest".equals(header)){
                //表示是ajax请求
                Map<String, String> ret = new HashMap<String, String>();
                ret.put("type","error");
                ret.put("msg","登录会话超时或还未登录，请重新登录！");
                httpServletResponse.getWriter().write(JSONObject.fromObject(ret).toString());
                return false;
            }
            //若是普通链接跳转，直接重定向到登录页面
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath()+"/system/login");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
