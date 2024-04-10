import java.math.BigInteger;
import java.util.*;
public class Alove {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String x = sc.next();
       String y = sc.next();
       String z = sc.next();
       if(x.equals("0") && y.equals("0") && z.equals("0")){
           System.out.println("000");
       }else{
         System.out.println(mayor(x,y,z));
       }
    }
    
    public static BigInteger mayor(String x, String y, String z){
        BigInteger g1 = new BigInteger(x+y+z);
        BigInteger g2 = new BigInteger(x+z+y);
        
        BigInteger g3 = new BigInteger(y+x+z);
        BigInteger g4 = new BigInteger(y+z+x);
        
        BigInteger g5 = new BigInteger(z+y+x);
        BigInteger g6 = new BigInteger(z+x+y);
        
        BigInteger vec [] = {g1,g2,g3,g4,g5,g6}; 
        
        Arrays.sort(vec);
        
        return vec[5];
    }
    
}
