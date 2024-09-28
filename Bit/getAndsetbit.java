package DSA.bit_manipulation;
import java.util.*;

public class getAndsetbit {
    public static void main(String[] args) {
        System.out.println("Get bit :-");
      int n = 4;
      int pos = 2;
      int bitmask = 1<<pos;
      if((bitmask & n) == 0){
          System.out.println("bit was zero");
      }else {
          System.out.println("bit was one");
      }

      System.out.println("Set bit :-");
      int m = 5;
      int post = 1;
      int bit = 1<<post;
      int newnumber = bit | m;
      System.out.println(newnumber);

    }

}
