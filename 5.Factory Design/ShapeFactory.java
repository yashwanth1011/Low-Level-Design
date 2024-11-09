public class ShapeFactory {
    Shape shape;
    Shape getObj(String input){
        switch(input){
            case "circle": return new Circle();
            case "rectangle" : return new Rectangle();
            default : return null;
        }          
    }
}
