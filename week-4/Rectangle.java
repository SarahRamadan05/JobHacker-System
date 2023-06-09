public class Rectangle {
    double width;
    double height;
    public Rectangle(){

        width = 1.0;
        height=1.0;

    }
     public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
     }
     public double getArea(){
        return width* height
     }
     public double getPerimeter(){
        return 2*( width+height)
     }
}
public class TestRectangle{
    publis static void main(String[]args){

        Rectanglr r1= new Rectangle(4,40);
        Rectanglr r2= new Rectangle(3.5,35.9);

        system.out.println("Rectangle 1 = ");
        system.out.println("width = "+r1.width);
        system.out.println("height = "+r1.height);
        system.out.println("Area = "+r1.getArea());
        system.out.println("Perimeter = "+r1.getPerimeter());

        system.out.println("Rectangle 2 = ");
        system.out.println("width = "+r2.width);
        system.out.println("height = "+r2.height);
        system.out.println("Area = "+r2.getArea());
        system.out.println("Perimeter = "+r2.getPerimeter());

    }
}

