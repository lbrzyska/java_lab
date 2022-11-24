import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        System.out.println("Podaj liczbe: ");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        podzielna(a);

    }
    public static void podzielna(int a){
        if(a%3==0 && a%5==0) System.out.println("Liczba jest podzielna przez liczby 3 oraz 5.");
        else System.out.println("Liczba nie jest podzielna jednocześnie przez liczby 3 oraz 5.");
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}