public class Main {
    public static void main(String[] args) {
        Author joanneRowling = new Author("Joanne", "Rowling");
        Book firstBook = new Book ("Harry Potter and the Philosopher's Stone",joanneRowling, 1997);
        Book secondBook = new Book("The Three Musketeers", new Author("Alexandre", "Dumas"), 1844);
        firstBook.setPublishYear(2020);
        System.out.println(firstBook.getPublishYear());
        System.out.println(secondBook.getAuthor());
        System.out.println(secondBook);
        System.out.println(firstBook.getAuthor().equals(secondBook.getAuthor()));
        System.out.println(firstBook.equals(secondBook));


    }
}