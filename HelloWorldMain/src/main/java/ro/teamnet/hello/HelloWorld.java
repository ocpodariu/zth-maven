package ro.teamnet.hello;

/**
 * Author: Ovidiu
 * Date:   4/22/2015
 */
public class HelloWorld {

    public void sayHello() {
        System.out.println("Hello World!");
    }

    public String returnHelloKey() {
        return "HelloKey";
    }

    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.sayHello();
    }

}
