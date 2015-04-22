package ro.teamnet.hello;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Author: Ovidiu
 * Date:   4/22/2015
 */
public class HelloWorldTest {

    HelloWorld hello;

    @Before
    public void init() {
        System.out.println("Initializing fields...");
        hello = new HelloWorld();
    }

    @Test
    public void testSayHello() {
        hello.sayHello();
    }

    @Test
    public void testReturnHelloKey() {
        System.out.println("From Test: " + hello.returnHelloKey());
        Assert.assertNotNull(hello);
        assert hello.returnHelloKey().equals("HelloKey");
    }


}
