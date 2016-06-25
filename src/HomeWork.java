/**
 * Created by lenoubun16 on 6/24/16.
 */
public class HomeWork {
    public static void main(String[] args) {
        boolean questionOne = sleepIn(false, false);
        boolean questionTwo = sleepIn(true, false);
        boolean questionThree = sleepIn(false,true);

        int sumDoubleOne = sumDouble(1,2);
        int sumDoubleTwo = sumDouble(3,2);
        int sumDoubleThree = sumDouble(2,2);

        printTrFa(questionOne);
        printTrFa(questionTwo);
        printTrFa(questionThree);

        System.out.println(sumDoubleOne);
        System.out.println(sumDoubleTwo);
        System.out.println(sumDoubleThree);

        int close10One = close10(8, 13);
        int close10Two = close10(13, 8);
        int close10Three = close10(13, 7);

        System.out.println(close10One);
        System.out.println(close10Two);
        System.out.println(close10Three);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a+b;
        } else {
            return (a+b)*2;
        }
    }

    public static int close10(int a, int b) {
        int a10 = Math.abs(10-a);
        int b10 = Math.abs(10-b);
        if (a10 > b10) {
            return b;
        } else if (a10 < b10) {
            return a;
        } else {
            return 0;
        }
    }

    public static void printTrFa(boolean treFal) {
        if (treFal) {
            System.out.println("It's true");
        } else {
            System.out.println("It's flse");
        }
    }

}
