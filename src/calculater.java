import java.util.Scanner;
public class calculater{
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в калькулятор. Введите первое число");
        Scanner s=new Scanner(System.in);

        double firstNumber=s.nextDouble();
        System.out.println("Выбирите нужную операцию \n  при выборе 0 будет произведено сложение \n 1- вычитание\n 2-умножение\n 3-деление \n 4-деление по модулю\n 5-возведение в степень" +
                " ");
        int operation=s.nextInt();
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
        System.out.println("Разность ваших чисел равна: " + ""+difference);
        }
        else if (operation==2){
        System.out.println("Введите второй множитель:"+" ");
        double m=s.nextDouble();
        double composition =firstNumber*m;
        System.out.println("Произведение ваших чисел равно: "+" "+composition);
        }
        else if (operation==3){
            System.out.println("Введите делитель:"+" ");
            double i_divisior=s.nextDouble();
            double divisionResuit=firstNumber/i_divisior;
            System.out.println("Частное равно:"+" "+divisionResuit);
        }
   else if (operation==4){
            System.out.println("Введите делитель:"+" ");
        double r_divisior=s.nextDouble();
        double r_dision_result=firstNumber%r_divisior;
            System.out.println("Остаток от деления ваших чисел равен:"+" "+r_dision_result);
   }
    else if (operation==5){
        double indicator=s.nextDouble();
        double extent =Math.pow(firstNumber,indicator);
            System.out.println("Результат возведения в степень равен:"+""+extent);
        }
    }
}

