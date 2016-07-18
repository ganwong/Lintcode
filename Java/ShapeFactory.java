/**
 * Shape Factory
 * 
 * Factory is a design pattern in common usage. Implement a ShapeFactory that can generate correct shape.
 * 
 * Your object will be instantiated and called as such:
 * ShapeFactory sf = new ShapeFactory();
 * Shape shape = sf.getShape(shapeType);
 * shape.draw();
 */
interface Shape {
    void draw();
}

class Square implements Shape {
    public void draw() {
    System.out.println(" ----");
    System.out.println("|    |");
    System.out.println("|    |");
    System.out.println(" ----");
    }
}

class Triangle implements Shape {
    public void draw() {
    System.out.println("  /\\");
    System.out.println(" /  \\");
    System.out.println("/____\\");
    }
}

class Rectangle implements Shape {
    public void draw() {
    System.out.println(" ----");
    System.out.println("|    |");
    System.out.println(" ----");
    }
        
}


public class ShapeFactory {
    /**
     * @param shapeType a string
     * @return Get object of type Shape
     */
    public Shape getShape(String shapeType) {
        if (shapeType.equals("Square")) {
            return new Square();
        }
        else if (shapeType.equals("Triangle")) {
            return new Triangle();
        }
        else if (shapeType.equals("Rectangle")) {
            return new Rectangle();
        }
        return null;
        
    }
}