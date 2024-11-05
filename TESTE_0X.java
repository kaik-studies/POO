package filename.java;

public class filemame {
  public static void main(String[] args) {
   int x = 0, y = 0, z = 0;
   System.out.println(x);
   System.out.println(y);
   System.out.println(z + "x");
   x = 42;
   System.out.println(x);
   System.out.println(y);
   System.out.println(z + "x");
   y = x++;
   System.out.println(x);
   System.out.println(y);
   System.out.println(z + "x");
   z = ++x;
   System.out.println(x);
   System.out.println(y);
   System.out.println(z + "x");
   x = ++z + z;
   
   System.out.println(x);
   System.out.println(y);
   System.out.println(z + "x");
   }
}
