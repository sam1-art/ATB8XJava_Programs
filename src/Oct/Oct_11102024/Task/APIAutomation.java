package Oct.Oct_11102024.Task;

public class APIAutomation {
    public static void main(String[] args) {
        BaseTestAPI t1=new TestCaseAPI();//Dynamic dispatch
        t1.performGET();
        t1.performPOST();
        t1.performPUT(15);
        t1.performPATCH("Sam");
        t1.performDELETE("sanket",20);
        t1.setId(11);
        t1.setName("Sam");

    }

}
