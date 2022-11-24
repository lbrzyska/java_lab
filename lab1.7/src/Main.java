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
        Trojkat(a,b,c);
    }
    public static void Trojkat(int a, int b, int c){
        if(a>b && a>c && b+c>a) System.out.print("Da się zbudować trójkąt.");
        else if(b>a && b>c && a+c>b) System.out.print("Da się zbudować trójkąt.");
        else if(c>a&&c>b&&a+b>c) System.out.print("Da się zbudować trójkąt.");
        else System.out.print("Nie da się zbudować trójkąta.");

    }
    public static int getInt(){return new Scanner(System.in).nextInt();
    }
}