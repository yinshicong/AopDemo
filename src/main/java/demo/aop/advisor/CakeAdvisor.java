package demo.aop.advisor;

import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.adapter.AdvisorAdapter;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Max on 2017/9/30.
 */
@Component
public class CakeAdvisor implements MethodBeforeAdvice,AfterReturningAdvice,ThrowsAdvice {

    public void afterThrowing(Exception ex){
        System.out.println("蛋糕切坏了。。。");
    }

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("我要水果多的那一块蛋糕。。。");
    }

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("切好蛋糕拿走之前。。。");
    }

}
