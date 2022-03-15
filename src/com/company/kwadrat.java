package com.company;

public class kwadrat {
    int bok;

    public kwadrat(int bok) {
        this.bok = bok;
    }
    public int pole(){
        return bok * bok;
    }

    public int obwod() {
        return bok*4;
    }
}
