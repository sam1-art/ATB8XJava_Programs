package Sept.Sept_27092024;
//Give me example of while vs do while loop in Lab ex.
public class Task1 {
    public static void main(String[] args) {

        //while loop->init->condition->body->increment/decrement
        int a=11;
        while(a<20){
            System.out.println("The number is: " +a);
            a++;
        }

        //Do while loop->init->body->condition->increment/decrement
        int i=0;
        do{
            System.out.println("Printing the number as : "+i);
            i++;
        }while(i<10);


    }
}
