class Monkey {
    public void jump() {
        System.out.println("Monkey jumps");
    }
    
    public void bite() {
        System.out.println("Monkey bites");
    }
}
interface Animal {
    void eat();
    void sleep();
}
class Human extends Monkey implements Animal {
    public void eat() {
        System.out.println("Human eats");
    }
    
    public void sleep() {
        System.out.println("Human sleeps");
    }
}
class mon {
    public static void main(String[] args) {
        Human human = new Human();
        human.jump();
        human.bite(); 
        human.eat(); 
        human.sleep(); 
    }
}

