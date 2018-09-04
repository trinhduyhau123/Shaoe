public class Test {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square(3);
        System.out.println(square1);
        Square square3 = new Square("pink", true, 5);
        System.out.println(square3);
    }
}
