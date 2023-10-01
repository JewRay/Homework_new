package pro.sky.java.course1.lesson12_13;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Heesung", "Nam");
        Book book1 = new Book("The Legendary Moonlight Sculptor", author1, 2007);

        Author author2 = new Author("Dmitriy", "Rus");
        Book book2 = new Book("Life to game", author2, 2013);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Название книги : " + book1.getTitle());
        System.out.println("Автор книги : " + author1.getName() + " " + author1.getSurname());
        System.out.println("Год публикации : " + book1.getPublishingYear());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Название книги : " + book2.getTitle());
        System.out.println("Автор книги : " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());
        System.out.println("Год публикации : " + book2.getPublishingYear());

        book1.setPublishingYear(2008);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Название книги : " + book1.getTitle());
        System.out.println("Автор книги : " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println("Год публикации : " + book1.getPublishingYear());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("toString");

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("equals");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        if(book1.equals(book2)){
            System.out.println("равны");
        }else {
            System.out.println("не равны");
        }

        Book book3 = new Book("Life to game", new Author("Dmitriy", "Rus"), 2013);

        if(book2.equals(book3)){
            System.out.println("равны");
        }else {
            System.out.println("не равны");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("hashCode");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());



    }
}

