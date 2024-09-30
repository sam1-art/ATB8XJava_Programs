package Sept._20092024;
//Leap Year Program - Find 2024

public class Task5 {
    public static void main(String[] args) {
        int year =2024;
        //1. If the year is divisible by 4 and not divisible by 100
        // or
        //2. If the year is divisible by 400.
        if(year %400 == 0 || (year %100 !=0 && year %4 == 0))
            System.out.println(year +" is LEAP Year");
        else
            System.out.println(year +" is NOT a LEAP Year");
    }
}
