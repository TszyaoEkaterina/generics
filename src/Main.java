public class Main {
    public static void main(String[] args) {
        MagicBox<String> box = new MagicBox<String>(3);
        System.out.println(box.add("Book"));
        System.out.println(box.add("Computer"));
        System.out.println(box.add("Candy"));
        System.out.println(box.add("iPhone"));
        System.out.println(box.pick());
        MagicBox<String> anotherBox = new MagicBox<String>(2);
        System.out.println(anotherBox.add("Book"));
        System.out.println(anotherBox.pick());
    }
}
