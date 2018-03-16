import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập giá trị USD:");
        double USD = scanner.nextDouble();
        double VND = USD*23000;
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        System.out.println(formatter.format(VND)+" VNĐ");
    }
}
