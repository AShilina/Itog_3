import java.util.Scanner;

public class Itog_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите курс доллара к рублю:");

        double kurs = sc.nextDouble();

        System.out.println("Введите сумму в рублях, которую хотите перевести в доллары:");

        double summa = sc.nextDouble();

        double itog = summa / kurs;

        System.out.printf("Сумма в долларах: " + "%.2f\n", itog);

    }

}