package com.company.Ex9;

import java.util.Objects;

public class Prac9_02 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D();
    
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("p1==p2?" + (p1 == p2));
        System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
    }
}

class Point3D {
    int x, y, z;
    
    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        
    }
    
    Point3D() {
        this(0, 0, 0);
    }
    
    public boolean equals(Object o) {
        if (o instanceof Point3D) {
            Point3D p = (Point3D) o;
            return x == p.x && y == p.y && z == p.z;
        }
        return false;
    }
    
    public String toString() {
        return "["+x+","+y+","+z+"]";
    }
}













