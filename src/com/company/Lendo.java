package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lendo {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(new FileInputStream("saida.txt"));

            while(ler.hasNextLine()) {
                String linha = ler.nextLine();
                System.out.println(linha);
            }
            ler.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }

    }
}
