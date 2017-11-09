import demo.aop.advisor.CakeAdvisor;
import demo.entity.Cake;
import demo.entity.CakeImpl;
import javafx.application.Application;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.adapter.AdvisorAdapter;
import org.springframework.aop.framework.adapter.AdvisorAdapterRegistry;
import org.springframework.aop.framework.adapter.UnknownAdviceTypeException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {


//        ProxyFactoryBean bean = new ProxyFactoryBean();
//        bean.setTarget(new CakeImpl());
//        bean.setInterfaces(Cake.class);
//        bean.addAdvice(new CakeAdvisor());
//        //在get的时候java动态生成代理接口的实现类返回，所以强转的是接口，而不是实现类。
//        Cake ck = (Cake)bean.getObject();
//        ck.cut();

//          ProxyFactory proxyFactory = new ProxyFactory();
//        CakeAdvisor cakeAdvisor = new CakeAdvisor();
//        proxyFactory.addAdvice(cakeAdvisor);
//        proxyFactory.setTarget(new CakeImpl());
//        proxyFactory.setInterfaces(Cake.class);

//        Cake cake = (Cake)proxyFactory.getProxy();
//        cake.cut();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring.xml");
        //我们换成了实现类来接受，但是要知道，真正的类型是实现类的子类。
        CakeImpl cake = (CakeImpl)applicationContext.getBean("cakeImpl");
        cake.cut();

        //from test-1.0

    }
}
