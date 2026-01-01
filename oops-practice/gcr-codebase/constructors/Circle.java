import java.util.Scanner;
public class Circle {
    int radius;
    Circle(){
    	radius=4;
    }
    Circle(int radius){
    	this.radius=radius;
    }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int radi=scan.nextInt();
        Circle circle=new Circle();
        System.out.println(circle.radius);
        Circle circle1=new Circle(radi);
        System.out.println(circle1.radius);
	}

}