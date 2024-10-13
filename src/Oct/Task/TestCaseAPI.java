package Oct.Task;


//Single inheritance
public class TestCaseAPI extends BaseTestAPI{
 TestCaseAPI(){
     super();//DC of parent
     System.out.println("Done calling parent DC");
 }
@Override
public void performGET()
{
    System.out.println("I am overriding get method!!");
}
@Override
public void performPOST()
{
    System.out.println("I am overriding the post method");

}
//Overloading
public void performPATCH(String name)
{
    System.out.println("I am ovedrloading the Patch method");
}
//Overloading
public void performPUT(int id)
{
    System.out.println("I am overloading the put method");
}
//override and overload
public void performDELETE(String name, int id)
{
    System.out.println("Performing overriding and overloading both");
}
}
