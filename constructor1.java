class met {
    String a;
    met(String name) 
    {
        a = name;
    }
}

class constructor1 {
    public static void main(String[] args)
     {
        met obj = new met("hello");
        System.out.println(obj.a);
    }
}