package com.company;

public class Actor extends Person {
    public final int NUMBER_OF_MOVIES_PLAYED_THAN_MAKE_AN_ACTOR_FAMOUS = 2;
    private int numberOfMoviesPlayed;


    public boolean isFamous() {

        if (numberOfMoviesPlayed >= NUMBER_OF_MOVIES_PLAYED_THAN_MAKE_AN_ACTOR_FAMOUS) {
            return true;
        }
        return false;
    }

public void printActorInfo(){
    System.out.println(super.getName() + " born in " + super.getBirthYear() + " is " + (this.isFamous() ? " " : " not ") + " a famous actor!");

}

    public int getNUMBER_OF_MOVIES_PLAYED_THAN_MAKE_AN_ACTOR_FAMOUS() {
        return NUMBER_OF_MOVIES_PLAYED_THAN_MAKE_AN_ACTOR_FAMOUS;
    }

    public int getNumberOfMoviesPlayed() {
        return numberOfMoviesPlayed;
    }

    public void setNumberOfMoviesPlayed(int numberOfMoviesPlayed) {
        this.numberOfMoviesPlayed = numberOfMoviesPlayed;
    }
}
