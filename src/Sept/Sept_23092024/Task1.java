package Sept.Sept_23092024;
/*Create a simple calculator that performs addition, subtraction, multiplication, and division,
modulus based on user input using switch statements.
Inputs :   num 1, num 2, +
Output :  num1+num2 → print information.*/
public class Task1 {
    public static void main(String[] args) {
    int a=56;
    int b=4;
    int c;
    int ch=1;
    switch (ch)
    {
            case 1:
                c=a+b;
                System.out.println(c);
                break;
            case 2:
                c=a-b;
                System.out.println(c);
                break;
            case 3:
                c=a*b;
                System.out.println(c);
                break;
            case 4:
                c=a/b;
                System.out.println(c);
                break;
            case 5:
                c=a%b;
                System.out.println(c);
                break;
            default:
                System.out.println("None");
                break;


        }

    }
}
