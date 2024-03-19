public class Rectangle {
    private double height = 1;
    private double width = 2;
    private String colour = "red";

    public Rectangle(){}

    public Rectangle(double height){
        this.height = height;
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String colour){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public String getColour(){
        return colour;
    }

    public double calculateArea(){
        return height*width;
    }

    public static void main(String[] args) throws Exception {
        Rectangle rectangle1 = new Rectangle(6.9, 4.20, "yellow");
        System.out.println("Rectangle rectangle1: ");
        System.out.println("Colour:  " + rectangle1.getColour());
        System.out.println("Height:  " + rectangle1.getHeight());
        System.out.println("Width:  " + rectangle1.getWidth());
        System.out.println("Area:  " + rectangle1.calculateArea());
    }
}
