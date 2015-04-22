package ro.teamnet.hello;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Author: Ovidiu
 * Date:   4/22/2015
 */
public class HelloWorld {

    static final Logger logger = Logger.getLogger(HelloWorld.class.getName());

    public void sayHello() {
        logger.debug("DEBUG -> Enters in sayHello() method from HelloWorld");
        System.out.println("Hello World!");
    }

    public String returnHelloKey() {
        logger.info("INFO -> Enters in returnHelloKey from HelloWorld");
        return "HelloKey";
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.sayHello();
        System.out.println(hello.returnHelloKey());
    }

}
