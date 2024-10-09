package Sept.Sept_25092024;
//Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
// n = 1 ->  Fact = 1*1 -> 1
// n = 3 -> Fact = 3*2*1 -> 6
public class Task2 {
    public static void main(String[] args) {
        int fact= 1;
        int num=5;
        for(int i=1; i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }

}
