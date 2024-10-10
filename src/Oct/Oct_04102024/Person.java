package Oct.Oct_04102024;

public class Person {
    String first_name;
    String Last_name;
    int age;
    int weight;
    long mobile_no;
    Long aadhar_number;
    String address;
    double height;
    String occcupation;
    String gender;

Person()
{
    System.out.println("This is Default constructor");
}

Person(String first_name, String Last_name, int age)
{
    System.out.println("This is Parameterized constructor");
    this.first_name=first_name;
    this.Last_name=Last_name;
    this.age=age;
    System.out.println(first_name);
    System.out.println(Last_name);
    System.out.println(age);

}
void whg(int weight, double height, String gender)
{
    this.weight=weight;
    this.height=height;
    this.gender=gender;
    System.out.println(weight);
    System.out.println(height);
    System.out.println(gender);
}
String workfield(String occupation)
{
     this.occcupation=occupation;
 return occupation;
}
void otherdetails(String address,long mobile_no, long aadhar_number)
{
    this.address=address;
    this.mobile_no=mobile_no;
    this.aadhar_number=aadhar_number;
    System.out.println(address);
    System.out.println(mobile_no);
    System.out.println(aadhar_number);
}

}
