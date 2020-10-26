package com.company;

import com.company.thread.Cube;
import com.company.thread.Square;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException{ // throws InterruptedException блокирует поток исполнения
        Random rand = new Random(); // для случайного числа
        Cube cube = new Cube();
        Square square = new Square();
        cube.start();
        square.start();
        while (true)
        {
            int n = rand.nextInt(100); // генерим случайное число
            System.out.println("Первый поток:\t" + Integer.toString(n));
            if (n % 2 == 0) // чет нечет вызываем други потоки
            {
                square.printRes(n);
            }
            else
            {
                cube.printRes(n);
            }
            System.out.println();
            Thread.sleep(1000); // чтобы каждую секунду как по заданию
        }
    }
}
