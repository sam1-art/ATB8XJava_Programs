package Oct.Oct_11102024.Task;

public class BaseTestAPI {
    private String name;
    private int id;

    public BaseTestAPI() //Default constructor
    {
        System.out.println("Calling default constructor!!");

    }
    public BaseTestAPI(String name, int id) //Parametrized Constructor
    {
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void performGET()
    {

    }
    public void performPOST()
    {

    }
    public void performPATCH(String sam)
    {

    }
    public void performPUT(int i)
    {

    }
    public void performDELETE(String name, int i)
    {

    }
}
