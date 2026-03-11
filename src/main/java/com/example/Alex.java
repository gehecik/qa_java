package com.example;

public class Alex extends Lion {

    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    @Override
    public int getKittens() {
        return 0;
    }


}
