package com.endurance.aspect;

import com.endurance.empoyee.Employee;
import com.endurance.intercept.AuditInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.CodeSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by harish on 10/7/17.
 */
@Aspect
@Component
public class ServiceMonitor {
    static final Logger logger = LogManager.getLogger(AuditInterceptor.class.getName());

    /*@Around("execution(* com.endurance.empoyee.EmployeeService.*(..))")
    public Object logServiceAccess(ProceedingJoinPoint thisJoinPoint) throws Throwable {
        Object[] args = thisJoinPoint.getArgs();
        for (Object o:args
             ) {
            System.out.println("Parameter");
            System.out.println(o.toString());
            //Employee e=(Employee)o;
            //System.out.println(e.getId());
        }
        MethodSignature methodSignature = (MethodSignature) thisJoinPoint.getStaticPart().getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(methodSignature.getName());
        System.out.println("Completed: " + thisJoinPoint);
        String[] parameterNames=((CodeSignature) thisJoinPoint.getStaticPart()
                .getSignature()).getParameterNames();
        //if(parameterNames.length>0)
        logger.info(Arrays.toString(parameterNames));
        logger.info("Parameter names above |");
        Object result=thisJoinPoint.proceed(args);
        System.out.println(result);
        return result;
    }
    @AfterThrowing(pointcut = "execution(* com.endurance.empoyee.EmployeeService.*(..))", throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {

        System.out.println("Okay - we're in the handler...");

        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        String stuff = signature.toString();
        String arguments = Arrays.toString(joinPoint.getArgs());
        logger.error("Write something in the log... We have caught exception in method: "
                + methodName + " with arguments "
                + arguments + "\nand the full toString: " + stuff + "\nthe exception is: "
                + e.getMessage(), e);
    }*/
}