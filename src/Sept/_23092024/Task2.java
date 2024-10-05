package Sept._23092024;
/*Write a program that takes an integer input (1-12) and prints the name of the corresponding
month using a switch statement.
Input  - 12
Out - Dec.*/
public class Task2 {
    public static void main(String[] args) {
        int day=12;
        switch(12)
            {
                case 1:
                    System.out.println("Jan");
                    break;
                case 2:
                    System.out.println("feb");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("Aug");
                    break;
                case 9:
                    System.out.println("Sept");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("Nov");
                    break;
                case 12:
                    System.out.println("Dec");
                    break;
                default:
                    System.out.println("None");
                    break;


        }
    }
}
