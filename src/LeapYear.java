public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }

public static boolean isLeapYear (int year) {
    if (year > 9999) {
        return false;
    }
    if (year < 1) {
        return false;
    }
    if (year % 4 == 0) {
        return true;
    }
    if (year % 100 == 0) {
        return true;
    }
    if (year % 400 == 0) {
        return true;
    }else {
        return false;
    }


}


    }



