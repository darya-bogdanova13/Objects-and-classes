public class Main {
    public static void main(String[] args) {
        Author bookOne = new Author("Михаил ", "Булгаков ");
        Author bookTwo = new Author("Уильям", "Шекспир");
        Book one = new Book ("Мастер и Маргарита", bookOne, 1967);
        Book two = new Book("Ромео и Джульетта", bookTwo, 1597);
        System.out.println("Название книги " + one.getBookName() + ". Автор " + one.getAuthor() + " , год издания " + one.getBookYear());
        System.out.println("Название книги " + two.getBookName() + ". Автор " + two.getAuthor() + " , год издания " + two.getBookYear());
    }
}