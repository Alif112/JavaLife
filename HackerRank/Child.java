
class Baap {    
    public Baap() {
        System.out.println("Baap Constructor");
    }    
    static {
        System.out.println("Baap static block");    
    }    
    {
        System.out.println("Baap initialisation  block");
    }
}

class Parent extends Baap{    
    public Parent() {
        System.out.println("Parent Constructor");
    }    
    static {
        System.out.println("Parent static block");    
    }    
    {
        System.out.println("Parent initialisation  block");
    }
}

public class Child extends Parent {    
    {
        System.out.println("Child initialisation block");
    }
    static {
        System.out.println("Child static block");
    }

    public Child() {
        System.out.println("Child Constructor");
    }    
    public static void main(String[] args) {
        new Child();    
    }
}
