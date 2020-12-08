package lab10;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("dog1",2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние бега собаки: ");
        double inValueRun = sc.nextDouble();
        System.out.println("Введите длину прыжка собаки: ");
        double inValueJump = sc.nextDouble();
        System.out.println("Введите расстояние плавания собаки: ");
        double inValueSwim = sc.nextDouble();
        dog1.info();
        System.out.println("Бег: " + dog1.run(inValueRun));
        System.out.println("Прыжок: " + dog1.jump(inValueJump));
        System.out.println("Плавание: " + dog1.swim(inValueSwim));
                
        Cat cat1 = new Cat("cat1", 3);
        System.out.println("Введите расстояние бега кошки: ");
        inValueRun = sc.nextDouble();
        System.out.println("Введите длину прыжка кошки: ");
        inValueJump = sc.nextDouble();
        System.out.println("Введите расстояние плавания кошки: ");
        inValueSwim = sc.nextDouble();
        cat1.info();
        System.out.println("Бег: " + cat1.run(inValueRun));
        System.out.println("Прыжок: " + cat1.jump(inValueJump));
        System.out.println("Плавание: " + cat1.swim(inValueSwim));
    }
}
