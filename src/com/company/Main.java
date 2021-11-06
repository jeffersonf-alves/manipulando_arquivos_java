package com.company;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner teclado = new Scanner(System.in);

        try {
            PrintStream escrever = new PrintStream("saida.txt");

            System.out.println("Escreva sua mensagem: ");
            String msg = teclado.nextLine();
            escrever.println(msg);
            escrever.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possível criar o arquivo.");
        }


        teclado.close();
    }
}
