import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj a: ");
        a=input.nextInt();
        System.out.println("Podaj b: ");
        b=input.nextInt();
        System.out.println("Podaj c: ");
        c=input.nextInt();
        System.out.printf("Równanie ma postać: ");
        rownanie(a,b,c);
        System.out.println(" ");
        rozwiazanie(a,b,c);
    }
    public static void rownanie(int a, int b, int c){
        System.out.println((a*a)+"x^2 + "+b+"x + "+c);


    }
    public static void rozwiazanie(int a, int b, int c){
    double delta;
    delta=(Math.sqrt((b*b)-(4*a*c)));
    if(delta>0)  System.out.println("Delta wynosi "+delta+", pierwiastki wynoszą: "+(-(b)+delta)/(2*a)+" i "+(-(b)-delta)/(2*a));
    else if(delta==0) System.out.println("Delta wynosi 0; istnieje jeden pierwiastek: "+((-b)/(2*a)));
    else if(delta<0) System.out.println("Delta jest ujemna, nie ma pierwiastków.");

    }


    public static int getInt(){return new Scanner(System.in).nextInt();
    }
}