package Oct.Oct_11102024;

public class TestCase1 extends BaseClass{
    TestCase1(){
        super(); //DC of parent
        this.setBrowser("edge",true);
    }
    @Override
    public void setBrowser(String browser, boolean isAuth)
    {
        System.out.println("Own logic");
      super.setBrowser(browser,isAuth);
    }

}
