import java.io.*:
class serialization
public static void main(String[] args)
try
Myclass object1 = new Myclass("Hello".-7.2.1e10 FileOutputStream fos = new FileOutputStream("serial": ObjectOutputStream oos = new ObjectOutputStream(for oos writeObject(object1):
oos.flush(): oos.close():
catch(Exception e)
System.out.println("Serialization" + e); System.exit(0)
try
int x:
FileInputStream fis = new FileInputStream("serial"); ObjectInputStream ois = new ObjectInputStream(fis): x=ois.readInt();
ois.close():
System.out.println(x):
} catch (Exception e)
System.out.print("deserialization"); System.exit(0)
class Myclass implements Serializable
String
int
double d:
Myclass(String s, int i, double d)
this-
this.s=s:
}