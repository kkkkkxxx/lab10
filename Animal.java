package lab10;

public abstract class Animal implements IAnimal{
    private String name;
    private int age;
    private double valueRun;
    private double valueSwim;
    private double valueJump;

    Animal(String name, int age, double valueRun, double valueSwim, double valueJump){
        this.name = name;
        this.age = age;
        this.valueRun = valueRun;
        this.valueSwim = valueSwim;
        this.valueJump = valueJump;
    }
    public void info(){
        System.out.println("Имя: "+ name + " Возраст: " + age);
    }
    public boolean run(double lengthRun){
        return (this.valueRun >= lengthRun);
    }
    public boolean swim(double lengthSwim){
        return (this.valueSwim >= lengthSwim);
    }
    public boolean jump(double lengthJump){
        return (this.valueJump >= lengthJump);
    }
}
