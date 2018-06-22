package grananje;
import java.util.*;
public class Grananje {

    public static void main(String[] args) {
        
        Scanner tastatura = new Scanner (System.in);
        System.out.print("Unesite prvi broj:");
        int broj1 = tastatura.nextInt();
        
        System.out.print("Unesite drugi broj:");
        int broj2 = tastatura.nextInt();
        
        if (broj1 > broj2){
            System.out.println(broj1+" je veći od "+broj2);
        }
        else if (broj1 < broj2) {
            System.out.println(broj1+" je manji od "+broj2);
        }
        else
            System.out.println(broj1+ " je jednako "+broj2);
        }
    
}
