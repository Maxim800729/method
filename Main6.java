//      7)public static  boolean isEven(int number);
//Условие: Вернуть true, если число number чётное, иначе false.
public class Main6 {
    public static boolean isEven(int number) {
      return  number % 2 == 0;

    }
    public static void main(String[] args) {
        System.out.print(isEven(8));

    }
}
