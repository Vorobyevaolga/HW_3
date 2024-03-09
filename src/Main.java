public class Main {
    public static void main(String[] args) {
        Author tolstoj = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");
        Book vIM = new Book("Война и мир", tolstoj, 1867);
        Book kD = new Book("Капитанская дочь", pushkin, 1836);
        System.out.println(vIM);
        System.out.println(kD);
        vIM.setYearBook(1890);
        System.out.println(vIM);
    }
}