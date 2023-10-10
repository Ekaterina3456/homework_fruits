package homework;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Box<Fruit> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();
        Box<Fruit> box3 = new Box<>();
        Box<Fruit> box4 = new Box<>();

        box1.addFruit(new Orange());
        box2.addFruit(new Apple());
        box2.addFruit(new Apple());
        box3.addFruit(new Orange());
        box3.addFruit(new Orange());
        box4.addFruit(new Apple());
        box4.addFruit(new Apple());


        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println(box4);

        box3.removeFructs(box2);
        System.out.println(box2);
        box3.removeFructs(box1);
        System.out.println(box1);
        
        System.out.println(box4.compare(box2));


    }
}
