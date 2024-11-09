import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        ShapeFactory sf = new ShapeFactory();
        Shape shape = sf.getObj(input);
        shape.draw();
        in.close();
    }
}
