package com.mustafa.Siniflar.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter malkocOglu = new Fighter("Malkoc oğlu" , 100 , 20, 90, 20);
        Fighter bizans = new Fighter("Bizans" , 140 , 10, 100, 30);
        Ring r = new Ring(malkocOglu,bizans , 90 , 100);
        r.run();
    }
}
