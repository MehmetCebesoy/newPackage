// built-in: javanın içinde var
//import:içe aktarmak
//util:(Utility) araç demek
// Package:pakatleme
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    System.out.println("Adınız");

    String isim =scanner.nextLine();
    System.out.println("Merhaba "+isim);
    }
}
