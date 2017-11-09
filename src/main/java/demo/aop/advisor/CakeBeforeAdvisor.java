package demo.aop.advisor;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Max on 2017/9/30.
 */
public class CakeBeforeAdvisor implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("切蛋糕之前...");

    }

}
