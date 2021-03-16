package com.company;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setName("Popescu Ion");
        author1.setBirthYear(1950);
        author1.setNumberOfBooksPublished(11);

        author1.printAuthorInfo();

        Author author2 = new Author();
        author2.setName("Calinescu Maria");
        author2.setBirthYear(1972);
        author2.setNumberOfBooksPublished(4);

        author2.printAuthorInfo();

        Actor actor1 = new Actor();
        actor1.setName("Florin Piersic");
        actor1.setBirthYear(1936);
        actor1.setNumberOfMoviesPlayed(120);

        actor1.printActorInfo();

        Actor actor2 = new Actor();
        actor2.setName("Amza Pellea");
        actor2.setBirthYear(1931);
        actor2.setNumberOfMoviesPlayed(98);

        actor2.printActorInfo();

        Actor actor3 = new Actor();
        actor3.setName("Popescu Ion");
        actor3.setBirthYear(1994);
        actor3.setNumberOfMoviesPlayed(1);

        actor3.printActorInfo();
        // write your code here
    }
}
