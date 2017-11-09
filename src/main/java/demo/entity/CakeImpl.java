package demo.entity;

import org.springframework.stereotype.Component;

/**
 * Created by Max on 2017/9/30.
 */
@Component
public class CakeImpl implements Cake {

    public void cut(){
        System.out.println("切蛋糕了。。");
    }

}
