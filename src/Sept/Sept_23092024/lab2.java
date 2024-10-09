package Sept.Sept_23092024;

public class lab2 {
    public static void main(String[] args) {
        int itemcode=005;
        switch(itemcode)
        {
            case 001, 005 -> System.out.println("it is a laptop");
            case 002 -> System.out.println("it is a mobile");
            case 003, 004 -> System.out.println("it is a notepad");
            default -> System.out.println("None of this");
        }
    }
}
