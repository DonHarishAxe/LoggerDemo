package com.endurance.intercept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/*public class AuditInterceptor {
}
*/
@Component
public class AuditInterceptor extends HandlerInterceptorAdapter {
    //private static Logger logger = LogManager.getLogger();
    //private static final Logger logger = LogManager.getLogger(AuditInterceptor.class.getName());
    static final Logger logger = LogManager.getLogger(AuditInterceptor.class.getName());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof HandlerMethod) {
            logger.error("URL path"+request.getRequestURI());
            logger.error(request.getMethod());
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            //System.out.println(handlerMethod.getMethod(). toString());
            Enumeration en=request.getParameterNames();
            while(en.hasMoreElements())
            {
                Object objOri=en.nextElement();
                String param=(String)objOri;
                String value=request.getParameter(param);
                System.out.println("Parameter Name is '"+param+"' and Parameter Value is '"+value+"'");
            }
            logger.error("Done printing");
        }

        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.error("" + response.getStatus());

    }

}

