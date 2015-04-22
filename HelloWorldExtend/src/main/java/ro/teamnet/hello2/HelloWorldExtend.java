package ro.teamnet.hello2;

import ro.teamnet.hello.HelloWorld;

/**
 * Author: Ovidiu
 * Date:   4/22/2015
 */
public class HelloWorldExtend {

    public HelloWorldExtend() {

    }

    public void extendSayHello() {
        HelloWorld hello = new HelloWorld();
        hello.sayHello();
        System.out.println("The new Hello World!");
    }

    public static void main(String[] args) {
        HelloWorldExtend helloExtend = new HelloWorldExtend();
        helloExtend.extendSayHello();
    }

}
