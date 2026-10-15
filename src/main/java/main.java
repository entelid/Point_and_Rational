public static void main(String[] args) {

    point Point1 = new point(2, 3);
    point Point2 = new point(4, 3);
    rational Rat1 = new rational(1, 3);
    rational Rat2 = new rational(1, 2);

    System.out.println(Point1); //sysprnl calls toString
    System.out.println(Point1.xMirror());
    System.out.println(Point1.yMirror());
    System.out.println(Point1.distance());
    System.out.println(Point1.compareTo(Point2));
    System.out.println(Rat1.add(Rat2));
    System.out.println(Rat1.subtract(Rat2));
    System.out.println(Rat1.multiply(Rat2));
    System.out.println(Rat1.divide(Rat2));
}

