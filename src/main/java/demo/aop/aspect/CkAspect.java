package demo.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Max on 2017/9/30.
 */
@Component
public class CkAspect{

    public void before(){
        System.out.println("before 我要水果多的那一块蛋糕。。。");
    }

    public void after(){
        System.out.println("after 蛋糕切好后了。。。");
    }

    public void afterReturning(){
        System.out.println(" afterReturning 切好蛋糕拿走之前。。。");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before...");
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throw throwable;
        }
        System.out.println("around after...");
        return result;
    }

    public void throwEx(){
        System.out.println("蛋糕切坏了。。");
    }

}
