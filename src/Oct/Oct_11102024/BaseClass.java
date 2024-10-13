package Oct.Oct_11102024;

public class BaseClass {

    private  String Browser;

    BaseClass()
    {
        System.out.println("DC: BaseClass");
    }
    BaseClass(String b)
    {
        System.out.println("CC: BaseClass");
    }

    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if(isAuth){
            this.Browser = browser;
        }
        else{
            System.out.println("Not allowed");
        }
    }
    void openbrowser()
    {
        System.out.println("Opening browser!!");
    }
    void openbrowser(String browsername)
    {
        System.out.println("open browser->"+ browsername);
    }
    void closebrowser()
    {
        System.out.println("Close browser!!!");
    }
}
