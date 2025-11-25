class Cuboid {
    // Private fields (Encapsulation)
    private double length;
    private double width;
    private double height;

    // Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to compute volume
    public double getVolume() {
        return length * width * height;
    }
}

class Sphere {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cylinder {
    private double radius;
    private double height;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
class Main{
    public static void main(String[] args) {

        // Cuboid
        Cuboid cuboid = new Cuboid();
        cuboid.setLength(5);
        cuboid.setWidth(3);
        cuboid.setHeight(4);
        System.out.println("Volume of Cuboid = " + cuboid.getVolume());

        // Sphere
        Sphere sphere = new Sphere();
        sphere.setRadius(7);
        System.out.println("Volume of Sphere = " + sphere.getVolume());

        // Cylinder
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(3);
        cylinder.setHeight(10);
        System.out.println("Volume of Cylinder = " + cylinder.getVolume());
    }
}

