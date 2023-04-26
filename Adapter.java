// Adaptee class
public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void draw(int x, int y) {
        System.out.println("Drawing rectangle with height " + height + " and width " + width + " at (" + x + ", " + y + ")");
    }
}

// Target interface
public interface Shape {
    void draw();
}

// Adapter class
public class RectangleAdapter implements Shape {
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void draw() {
        rectangle.draw(0, 0);
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Shape shape = new RectangleAdapter(rectangle);
        shape.draw();
    }
}

