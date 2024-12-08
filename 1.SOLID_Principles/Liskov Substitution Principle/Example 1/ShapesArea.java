import java.util.Scanner;
interface Shape{
    int calculateArea();

}

class Square implements Shape{
    private int side;
    Square(int side){
        this.side = side;
    }

    void setSide(int side){
        this.side = side;
    }

    int getSide(int side){
        return this.side;        
    }

    @Override
    public int calculateArea(){
        return this.side*this.side;

    }
}

class Rectangle implements Shape{
    private int length, breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    int getLength(){
        return this.length;
    }

    int getBreadth(){
        return this.breadth;
    }

    void setLength(int length){
        this.length = length;        
    }

    void setBreadth(int breadth){
        this.breadth = breadth;
    }

    @Override
    public int calculateArea(){
        return this.length*this.breadth;
    } 
}

class Circle implements Shape{
    private int radius;
    Circle(int radius){
        this.radius = radius;

    }

    int getRadius(){
        return this.radius;
    }

    void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public int calculateArea(){
        return (int)((22/(double)7)*this.radius*this.radius);
    }
}

enum ShapeType{
    SQUARE, RECTANGLE, CIRCLE;
}

class ShapeFactory{
    Shape getShape(ShapeType type, Scanner in){
        switch(type){
            case SQUARE: System.out.println("Enter the side value: ");
            int side = in.nextInt();
            return new Square(side);
            case RECTANGLE : System.out.println("Enter the length, breadth: ");
            int length = in.nextInt();
            int breadth = in.nextInt();
            return new Rectangle(length, breadth);
            case CIRCLE :  System.out.println("Enter the radius: ");
            int radius = in.nextInt();
            return new Circle(radius);
            default : return null;
        }
    }
}

public class ShapesArea{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ShapeFactory shapeFactory = new ShapeFactory();
        while(n-- > 0){
            String type = in.next().toUpperCase();
            try {
                Shape shape = shapeFactory.getShape(ShapeType.valueOf(type), in);
                System.out.println("Area: " + shape.calculateArea());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid shape type. Please enter SQUARE, RECTANGLE, or CIRCLE.");
            }
            
        }
        in.close();
        
        
    }
}