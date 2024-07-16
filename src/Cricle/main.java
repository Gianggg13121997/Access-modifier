package Cricle;

import java.sql.SQLOutput;

public class main {
    public static void main(String[] args) {
        Circle cricle1 = new Circle(1,5);
        Circle cricle2 = new Circle(2,6);
        System.out.println(" ID hinh tron 1 : " + cricle1.getId());
        System.out.println(" ID hinh tron 2 : " + cricle2.getId());
        System.out.println("Dien tich hinh tron 1 : " + cricle1.getArea());
        System.out.println("Dien tich hinh tron 2 : " + cricle2.getArea());
        System.out.println("Chu vi hinh tron 1 : " + cricle1.getPerimeter());
        System.out.println("Chu vi hinh tron 2 : " + cricle2.getPerimeter());
        System.out.println("=======================================================");
        System.out.println("Cap nhat ban kinh : ");
        cricle1.setRadius(10);
        cricle2.setRadius(20);
        System.out.println("ban kinh hinh 1 sau cap nhat :" +cricle1.getRadius());
        System.out.println("ban kinh hinh 2 sau cap nhat :" +cricle2.getRadius());
        System.out.println("chu vi hinh tron 1 sau khi cap nhat :" + cricle1.getPerimeter());
        System.out.println("chu vi hinh tron 2 sau khi cap nhat :" +cricle2.getPerimeter());
        System.out.println("dien tich hinh tron 1 sau khi cap nhat :" + cricle1.getArea());
        System.out.println("dien tich hinh tron 2 sau khi cap nhat:" +cricle2.getArea());
        System.out.println("tong cac hinh tron duoc tao :" +Circle.getCount());
        System.out.println("Ban kinh lon nhat : " + Circle.getMaxRadius());


    }
}
