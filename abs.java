abstract class luffy
{
    luffy(){System.out.println("Hito-Hito no mi:-model-\"NIKA\"");}
    abstract void print();
    void gear(){System.out.println("Gear 5th \"Nika man\"");}
}

class hero extends luffy {
    void print() {
        System.out.println("Joy boy returns");
    }
}

public class abs {
    public static void main(String[] args) {
        luffy obj = new hero();
        obj.print();
        obj.gear();
    }
}
