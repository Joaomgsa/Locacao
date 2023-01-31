package br.com.faro;

import br.com.faro.services.LocacaoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // falta arrumar o cadastro do filme para conseguir instanciar um filme com o dados que o usuário preeencher

        System.out.println("Sistema de Locadora  - Digite o nome do usuário :");
        String nomeUsuario = sc.next();
        System.out.println("Sistema de Locadora  - Digite 1 para dia de Semana e 2 para fins de semana :");
        int diasEntrega = sc.nextInt();


        LocacaoService locarFilme = new LocacaoService();

        sc.close();
    }
}