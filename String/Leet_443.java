package DSA.String;
import java.util.Scanner;
public class Leet_443 {
    public int compress(char[] chars){
        int index =0; // POINTER FOR WRITING THE COMPRESSED STRING
        int i=0; // POINTER FOR TRAVERSING THE ORIGINAL STRING
        while(i<chars.length){
            char curr_char = chars[i];
            int count =0;
            while(i < chars.length && chars[i] == curr_char){
                i++;
                count++;
            }
            chars[index++] = curr_char;
            if(count > 1){
                for(char c : Integer.toString(count).toCharArray()){
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
    public static void main(String [] args){
        Scanner kd = new Scanner(System.in);
        System.out.println("enter");
        String input = kd.next();
        char[] chars = input.toCharArray();
        Leet_443 com = new Leet_443();
        int newlength = com.compress(chars);
        System.out.println("compressed");
        for(int i=0; i<newlength; i++){
            System.out.println(chars[i]);
        }
        System.out.println(newlength);
    }
}
