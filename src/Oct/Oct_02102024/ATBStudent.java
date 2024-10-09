package Oct.Oct_02102024;
//Create a Class  ATBStudent and 5 Objects - (A/B)
public class ATBStudent {
    String name;
    int age;
    int class_name;
    int roll_no;
    String section;

    public static void main(String[] args) {
        ATBStudent atb=new ATBStudent();
        atb.name="Samiksha";
        System.out.println(atb.name);//Samiksha

        ATBStudent atb1=new ATBStudent();
        atb1.age=28;
        System.out.println(atb1.age);//28

        ATBStudent atb2=new ATBStudent();
        atb2.class_name=10;
        System.out.println(atb2.class_name);//10

        ATBStudent atb3=new ATBStudent();
        atb3.roll_no=123;
        System.out.println(atb3.roll_no);//123

        ATBStudent atb4=new ATBStudent();
        atb4.section="A";
        System.out.println(atb4.section);//A


    }
}
