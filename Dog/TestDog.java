package Dog;
import Dog.Dog;

import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("dog1", 30, "black");
        Dog d2 = new Dog("dog2", 20);
        Dog d3 = new Dog("dog3");
        d3.setAge(1);
        d3.setColor("white");

        System.out.println(d1);
        d1.intoHumanAge();

        System.out.println(d2);
        d2.intoHumanAge();

        System.out.println(d3);
        d3.intoHumanAge();
    }
}
