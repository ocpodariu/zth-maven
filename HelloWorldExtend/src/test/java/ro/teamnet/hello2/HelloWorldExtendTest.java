package ro.teamnet.hello2;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Author: Ovidiu
 * Date:   4/22/2015
 */
public class HelloWorldExtendTest {

    private static HelloWorldExtend helloExtend;

    @BeforeClass
    public static void init() {
        System.out.println("Initializing fields...");
        helloExtend = new HelloWorldExtend();
    }

    @Test
    public void testExtendSayHello() {
        helloExtend.extendSayHello();
    }

    @Test
    public void testAddition() {
        assert (2 + 3) == 5;
    }

}
