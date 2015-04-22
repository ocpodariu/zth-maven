package ro.teamnet.hello;

import org.junit.Test;

/**
 * Author: Ovidiu
 * Date:   4/22/2015
 */
public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld hello = new HelloWorld();
        hello.sayHello();
    }

    @Test
    public void testReturnHelloKey() {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("From Test: " + helloWorld.returnHelloKey());
        assert helloWorld.returnHelloKey().equals("HelloKey");
    }


}
