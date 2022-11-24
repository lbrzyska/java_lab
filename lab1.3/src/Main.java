import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        System.out.println("Podaj liczbe: ");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        parzysta(a);

    }
    public static void parzysta(int a){
        if(a%2==0) System.out.println("Liczba jest parzysta.");
        else System.out.println("Liczba nie jest parzysta.");
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}