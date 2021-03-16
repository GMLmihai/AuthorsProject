package com.company;

public class Author extends Person {
    public final int NUMBER_OF_BOOKS_THAN_MAKE_AN_AUTHOR_FAMOUS = 10;

    private int numberOfBooksPublished;

    public boolean isFamous() {

        if (numberOfBooksPublished >= NUMBER_OF_BOOKS_THAN_MAKE_AN_AUTHOR_FAMOUS) {
            return true;
        }
        return false;
    }

    public void printAuthorInfo(){
        System.out.println(super.getName() + " born in " + super.getBirthYear() + " is " + (this.isFamous() ? " " : " not ") + " a famous author." );
    }

    public int getNumberOfBooksPublished() {
        return numberOfBooksPublished;
    }

    public void setNumberOfBooksPublished(int numberOfBooksPublished) {
        this.numberOfBooksPublished = numberOfBooksPublished;
    }
}
