import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в калькулятор. Введите первое число");
        Scanner s=new Scanner(System.in);

    double firstNumber=s.nextDouble();
        System.out.println("Выбирите нужную операцию \n  при выборе 0 будет произведено сложение \n 1- вычитание\n 2-умножение\n 3-деление 4-деление по модулю ");
double operation=s.nextInt();
if(operation==0){
    System.out.println("Введите второе слагаемое");
    double secondSummand=s.nextDouble();
     double summa=firstNumber+secondSummand;
    System.out.println("Сумма ваших чисел равна: "+" "  +summa);
}
else if (operation==1){
    System.out.println("Введите вычитаемое:"+" ");
    double deductible= s.nextDouble();
    double difference = firstNumber-deductible;
    System.out.println("азность ваших чисел равна: " + ""+difference);
}
else if (operation==2){
    System.out.println("Введите второй множитель:"+" ");
    double m=s.nextDouble();
    double composition =firstNumber*m;
    System.out.println("роизведение ваших чисел равно: "+" "+composition);
}

    }
}
