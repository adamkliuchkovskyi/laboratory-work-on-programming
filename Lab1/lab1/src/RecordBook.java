public record RecordBook(String author, int pages, float price) {
    private static int id = 0;
    private static String title = "No title";
    private static String publisher = "No publisher";

    public RecordBook(String author, int pages, float price) {
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public RecordBook(){
        this("", 0, 0.0f);
    }

    public void updateInfo(int id, String title, String publisher){
        this.id = id;
        this.title = title;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "RecordBook{" +
                "id=" + this.id +
                ", title='" + this.title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", publisher='" + this.publisher + '\'' +
                '}';
    }

    static void printInfo(){
        System.out.println("id: " + id);
        System.out.println("title: " + title);
        System.out.println("publisher: " + publisher);
    }

    public static RecordBook fromString(String bookString){
        String[] bookData = bookString.split(",");
        return new RecordBook(bookData[1], Integer.parseInt(bookData[2]), Float.parseFloat(bookData[3]));
    }
}