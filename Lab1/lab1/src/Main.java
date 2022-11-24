public class Main {
    public static void main(String[] args) {
        RecordBook book1 = new RecordBook("John Doe", 100, 10.0f);
        System.out.println(book1);
        book1.updateInfo(1, "Book 1", "Publisher 1");
        System.out.println(book1);
    }
}