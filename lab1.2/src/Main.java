import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Podaj a: ");
        a=input.nextInt();//wprowadzanie
        System.out.println("Podaj b: ");
        b=input.nextInt();
        obliczenia(a,b);
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();//wazne do wprowadzania nowej zmiennej przez uzytkownika
    }
    public static void obliczenia(int a, int b){
        System.out.println("Suma: "+a+" + "+b+" = "+(a+b));
        System.out.println("Różnica: "+a+" - "+b+" = "+(a-b));
        System.out.println("Iloczyn: "+a+" * "+b+" = "+(a*b));
    }
}