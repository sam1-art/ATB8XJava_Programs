package Sept._23092024;
/*Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit)
based on user selection using a switch statement.
Input. -
choice - 1 - km → m, km → 1km
choice - 2 - f → c, f → c
*/
public class Task3 {
    public static void main(String[] args) {
        int km =1;
        int meter;
double fahrenheit;
float celcius=2;
        int ch=2    ;
        switch (ch)
        {
            case 1:
                meter=km*1000;
                System.out.println(meter);
                break;
            case 2:
                fahrenheit=celcius * (9.0/5.0) + 32;
                System.out.println(fahrenheit);
                break;

        }

    }
}


