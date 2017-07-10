package com.endurance.intercept;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by harish on 9/7/17.
 */
/*public class AuditInterceptor {
}
*/
@Component
public class AuditInterceptor extends HandlerInterceptorAdapter {
    //private static Logger logger = LogManager.getLogger();
    final static Logger logger = Logger.getLogger(AuditInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(handler instanceof HandlerMethod) {
            logger.debug("URL path"+request.getRequestURI());
            logger.debug(request.getMethod());
            /*PropertyConfigurator.configure("log4j.properties");
            System.out.println(request.getRemoteAddr());
            String parameter=new String("Message");
            //logger.setLevel(Level.WARN);
            if(logger.isDebugEnabled()){
                logger.debug("This is debug : " + parameter);
            }
            LogManager.getRootLogger().setLevel(Level.WARN);
            LogManager.getLogger("logger").setLevel(Level.WARN);
            LogManager.getLogger(AuditInterceptor.class).setLevel(Level.WARN    );
            if(logger.isInfoEnabled()){

            }
            logger.debug("This is debug : " + parameter);
            logger.info("This is info : " + parameter);
            logger.warn("This is warn : " + parameter);
            logger.error("This is error : " + parameter);
            logger.fatal("This is fatal : " + parameter);
            */
            logger.error("LOL");
            /*String log4JPropertyFile = "/home/harish/SpringTrainiing/hibernate-examples/springbootdemo/src/main/resources/config/log4j.properties";
            Properties p = new Properties();
            p.load(new FileInputStream(log4JPropertyFile));
            org.apache.log4j.PropertyConfigurator.configure(p);*/
            /*Properties props = new Properties();
            final InputStream inStream = AuditInterceptor.class.getClassLoader().getResourceAsStream("log4j.properties");
            if (inStream != null) {
                props.load(inStream);
                System.out.println("Here");
                org.apache.log4j.PropertyConfigurator.configure("log4j.properties");
            } else {
                System.out.println("not on classpath");
            }*/
            /*if(((HandlerMethod) handler).getBean() instanceof RequiresAuthentication) {
                String authorizationHeader = request.getHeader("Authorization");

                if(authorizationHeader == null) {
                    throw new InvalidAccessTokenException();
                }

                String[] authorizationComponents = authorizationHeader.split("\\s+");

                if(authorizationComponents.length != 2) {
                    throw new InvalidAccessTokenException();
                }

                String apiKey = authorizationComponents[1];
                Long partnerId;
                Long brandId = null;
                Long userId = null;
                String timestamp = Long.toString(System.currentTimeMillis());
                String username = null;
                Role role;

                switch (authorizationComponents[0]) {
                    case "PartnerKey":
                        partnerId = partnerService.getPartnerIdFromKey(apiKey);
                        role = Role.PARTNER;
                        break;
                    case "Key":
                        OrderDto orderDto = orderService.getOrderFromAccessToken(apiKey);
                        partnerId = orderDto.getPartnerId();
                        brandId = orderDto.getBrandId();
                        userId = orderDto.getId();
                        username = orderDto.getDomain();
                        role = Role.USER;
                        break;
                    default:
                        throw new InvalidAccessTokenException();
                }

                AuthenticatedEntityContext authenticatedEntityContext =
                        new AuthenticatedEntityContext(partnerId, brandId, userId, timestamp, username, apiKey, role, request.getRemoteAddr());
                ThreadLocalWrapper.putRequestEntityContext(authenticatedEntityContext);
            }*/
            System.out.println("Here");
            System.out.println("Before call");
        }

        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.debug(response.getStatus());

    }

}

