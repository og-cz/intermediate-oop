interface Shape {
    void draw(DrawingTool tool);
}

class Circle implements Shape {
    @Override
    public void draw(DrawingTool tool) {
        tool.draw(this);
    }
}

class Square implements Shape {
    @Override
    public void draw(DrawingTool tool) {
        tool.draw(this);
    }
}

interface DrawingTool {
    void draw(Circle circle);
    void draw(Square square);
}

class Pen implements DrawingTool {
    @Override
    public void draw(Circle circle) {
        System.out.println("Drawing Circle with Pen");
    }

    @Override
    public void draw(Square square) {
        System.out.println("Drawing Square with Pen");
    }
}

class Brush implements DrawingTool {
    @Override
    public void draw(Circle circle) {
        System.out.println("Drawing Circle with Brush");
    }

    @Override
    public void draw(Square square) {
        System.out.println("Drawing Square with Brush");
    }
}

public class DoubleDispatcher {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        DrawingTool pen = new Pen();
        DrawingTool brush = new Brush();

        circle.draw(brush);
        square.draw(pen); 
    }
}
