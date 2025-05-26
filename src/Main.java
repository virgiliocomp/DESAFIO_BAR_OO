import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        char gender;
        int beerQuantity;
        int barbecueQuantity;
        int softDrinkQuantity;

        System.out.print("Sexo: ");
        gender = scanner.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        beerQuantity = scanner.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        softDrinkQuantity = scanner.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        barbecueQuantity = scanner.nextInt();

        Bill bill = new Bill(gender, beerQuantity, barbecueQuantity, softDrinkQuantity);
        System.out.println(bill);
    }
}