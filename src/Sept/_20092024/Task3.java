package Sept._20092024;
/*Triangle Classifier ( If)
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides, determine
if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or
scalene (no sides are equal).
Use an if-else statement to classify the triangle.
side1, side2, side3 ->*/
public class Task3 {
    public static void main(String[] args) {
        int side1=15;
        int side2=25;
        int side3=35;
        if(side1==side2 && side2==side3){
            System.out.println("Triangle is equilateral");
        }
        else if(side1==side2 || side2==side3 || side3==side1){
            System.out.println("Triangle is isosceles");
        }
        else{
            System.out.println("Traingle is Scalene");
        }
//Output:Traingle is Scalene
    }
}
