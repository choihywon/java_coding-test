
public class Rectangle {
    private int width; 
    private int height; 


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public int getArea() {
        return width * height;
    }


    public int getPerimeter() {
        return 2 * (width + height);
    }


    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);

        System.out.println("rec (4,5) area: " + rect1.getArea());
        System.out.println("rec (4,5) length: " + rect1.getPerimeter());
        System.out.println("rec (5,8) area: " + rect2.getArea());
        System.out.println("rec (5,8) length: " + rect2.getPerimeter());
    }
}
