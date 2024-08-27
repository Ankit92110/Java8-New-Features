/*
 * Before Java 8
 

public class Test {
  public static int square(int x){
    return x*x;
  }
  public static void main(String[] args) {
     System.out.println("square of 3:" +square(3));
     System.out.println("square of 4:" +square(4));
  }
}
  */

  /*
  *After Java 8 
  */

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
   
    public static void main(String[] args) {
       Function<Integer, Integer> f = x->x*x;
       System.out.println("square of 3:" +f.apply(3));
       System.out.println("square of 4:" +f.apply(4));
       Predicate<Integer> p = x->x%2==0;
       System.out.println(p.test(4));
       System.out.println(p.test(5));
    }
  }

