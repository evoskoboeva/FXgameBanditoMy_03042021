package sample;

import java.util.Random;

public class Bandito extends Thread{
    public byte number;

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            number = (byte)  random.nextInt(9);
        }
    }
}
