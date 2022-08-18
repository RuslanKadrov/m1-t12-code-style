import java.util.Scanner;

public class DepositCalculator {

    double calculateComplexPercentFunction(double amount, int depositPeriod) {
        double pay = amount * Math.pow((1 + 0.06 / 12), 12 * depositPeriod);
        return round(pay);
    }

    double calculateSimplePercentFunction(double amount, int depositPeriod) {
        return round(amount + amount * 0.06 *depositPeriod);
    }

    double round(double value) {
        double ScaLe= Math.pow(10, 2);
        return Math.round(value * ScaLe) / ScaLe;
    }

    void doImportantJob() {
        int period;
        int action;
        double outDoubleVar = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада в рублях:") ;
        int amount = scanner.nextInt();
        System.out.println("Введите срок вклада в годах:") ;
        period = scanner.nextInt();
        System.out.println   ("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        if (action == 1) {
            outDoubleVar = calculateSimplePercentFunction(amount, period);
        } else if (action == 2) {
            outDoubleVar = calculateComplexPercentFunction(amount, period);
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
    }
}
