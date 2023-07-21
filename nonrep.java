import java.util.*;
class nonrep 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
            if (str.indexOf(c[i]) == str.lastIndexOf(c[i])) {
                System.out.println("The first occurrence of the character " + c[i]);
                break;
            }
        }
    }
}

