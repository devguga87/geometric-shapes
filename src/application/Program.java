package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        System.out.print("Enter the numbers of shapes: ");
        int numberOfShapes = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= numberOfShapes; i++){
            System.out.printf("Shape #%d data:%n",i);
            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = sc.nextLine().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            String stringColor = sc.nextLine();
            Color color = Color.valueOf(stringColor);
            if(shape == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                sc.nextLine();
                Shape rectangle = new Rectangle(color, width, height);
                list.add(rectangle);
            } else if(shape == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                sc.nextLine();
                Shape circle = new Circle(color, radius);
                list.add(circle);
            }
        }

        System.out.println("SHAPE AREAS");
        for(Shape s : list){
            System.out.printf("%.2f%n",s.area());
        }

        sc.close();
    }
}
