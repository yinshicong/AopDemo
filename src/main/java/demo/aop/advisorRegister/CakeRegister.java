package demo.aop.advisorRegister;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.adapter.AdvisorAdapter;
import org.springframework.aop.framework.adapter.AdvisorAdapterRegistry;
import org.springframework.aop.framework.adapter.UnknownAdviceTypeException;

/**
 * Created by Max on 2017/9/30.
 */
public class CakeRegister implements AdvisorAdapterRegistry {
    public Advisor wrap(Object o) throws UnknownAdviceTypeException {
        return null;
    }

    public MethodInterceptor[] getInterceptors(Advisor advisor) throws UnknownAdviceTypeException {
        return new MethodInterceptor[0];
    }

    public void registerAdvisorAdapter(AdvisorAdapter advisorAdapter) {

    }

//    private Object object;
//
//    public CakeRegister(Object object) {
//        this.object = object;
//    }
//
//    public Advisor wrap(Object o) throws UnknownAdviceTypeException {
//        return object;
//    }
//
//    public MethodInterceptor[] getInterceptors(Advisor advisor) throws UnknownAdviceTypeException {
//        return advisor.ge
//    }
//
//    public void registerAdvisorAdapter(AdvisorAdapter advisorAdapter) {
//    }

}
