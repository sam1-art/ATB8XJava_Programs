package Oct.Oct_04102024;
//Create a Person Class with 10 A, 5 Behavr( All types of Methods)
// and use the DC and PC to set the values, Create 5 Objects.
public class Task {
    public static void main(String[] args) {
        Person p1=new Person();
        Person p2=new Person("Samiksha","Bagade",28);
        Person p3=new Person();
        Person p4=new Person("sam","bag",22);
        Person p5=new Person();

     p1.whg(55, 5.2F,"Male");
        System.out.println(p1.workfield("Engineer"));
     p1.otherdetails("Mumbai",1234567899,96764833);

        p4.whg(50, 5.6F,"Female");
        System.out.println(p4.workfield("Doctor"));
        p4.otherdetails("Delhi",1634567999,96764833);

        p1.whg(45, 5.1F,"Male");
        System.out.println(p1.workfield("Teacher"));
        p1.otherdetails("Banglore",789913556,96764833);
    }
}
