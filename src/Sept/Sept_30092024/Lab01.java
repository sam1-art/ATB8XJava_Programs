package Sept.Sept_30092024;

//without return type and without argument(parameter)

public class Lab01 {
    public static void main(String[] args) {
          greet(); //call
          greet();
        System.out.println("By using loop: ");
          for(int i=0; i<5;i++){
              greet();
          }
    }
    //define
        public static void greet(){
            System.out.println("Hello");

        }
    }
