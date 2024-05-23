import InterfacesIphone.Internet;
import InterfacesIphone.Musica;
import InterfacesIphone.Telefone;

import java.util.Scanner;

public class Iphone implements Telefone, Musica, Internet  {
    
    //InterfacesIphone.Telefone
    public void ligar(){
        System.out.println("LIGANDO...");
    }
    public void atender(){
        System.out.println("!! ATENDENDO !!");
    }
    public void correioVoz(){
        System.out.println("CORREIO DE VOZ INICIANDO...");
    }
    //Música
    public void tocar(){
        System.out.println("REPRODUZINDO MÚSICA");
    }
    public void pausar(){
        System.out.println("PAUSANDO");
    }
    public void selecionarMusica(){
        System.out.println("SELECIONANDO MÚSICA...");
    }
    //InterfacesIphone.Internet
    public void exibirPagina(){
        System.out.println("EXEBINDO PÁGINA...");
    }
    public void novaAba(){
        System.out.println("ADICIONANDO NOVA ABA...");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PÁGINA...");
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao;

        System.out.println("BEM VINDO!");

        do{
            System.out.println("MENU:");
            System.out.println("1. TELEFONE \n" + "2. MÚSICA \n" + "3. INTERNET \n" + "0. ENCERRAR \n");
            System.out.println("POR FAVOR, DIGITE UMA DAS OPÇÕES ACIMA: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1. TOCAR \n"
                    + "2. PAUSAR \n"
                    + "3. SELECIONAR MÚSICA \n"
                    + "DIGITE A OPÇÃO ESCOLHIDA: ");
                    opcao = scan.nextInt();

                    if (opcao == 1) {
                        iphone.ligar();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("LIGAÇÃO CONCLUÍDA COM SUCESSO.");
                    } else if (opcao == 2) {
                        iphone.atender();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("CHAMADA DE VOZ ATENDIDA.");
                    } else if (opcao == 3) {
                        iphone.correioVoz();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("CORREIO DE VOZ ENCERRADO.");
                    } else{
                        System.out.println("!! ERRO !! \n" 
                        + " DIGITE UM NÚMERO ENTRE 1 E 3");
                        Thread.sleep(1000);
                    }
                    break;
                case 2:
                    System.out.println("1.TOCAR \n"
                    + "2. PAUSAR \n"
                    + "3. SELECIONAR MÚSICA \n"
                    + "DIGITE A OPÇÃO ESCOLHIDA: ");
                    opcao = scan.nextInt();

                    if (opcao == 1) {
                        iphone.tocar();
                        Thread.sleep(1000);

                    } else if(opcao == 2) {
                        iphone.pausar();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("MÚSICA PAUSADA.");

                    } else if (opcao == 3) {
                        iphone.selecionarMusica();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("MÚSICA SELECIONADA.");
                    } else {
                        System.out.println("!! ERROR !! \n"
                        + "DIGITE UM NÚMERO ENTRE 1 E 3");
                        Thread.sleep(1000);
                    }
                    break;
                case 3:
                    System.out.println("1. PÁGINA INICIAL \n"
                    + "2. NOVA ABA \n"
                    + "3. ATUALIZAR PÁGINA \n"
                    + "DIGITE A OPÇÃO ESCOLHIDA: ");
                    opcao = scan.nextInt();

                    if (opcao == 1) {
                        iphone.exibirPagina();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("PÁGINA EXIBIDA.");
                    } else if (opcao == 2) {
                        iphone.pausar();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("NOVA ABA ADICIONADA.");

                    } else if (opcao == 3) {
                        iphone.selecionarMusica();
                        Thread.sleep(1000);
                        System.out.println(" ");
                        System.out.println("PÁGINA ATUALIZADA.");
                    } else {
                        System.out.println("!! ERROR !! \n"
                        + "DIGITE UM NÚMERO ENTRE 1 E 3");
                        Thread.sleep(1000);
                    }
                    break;
                case 0:
                    System.out.println("DESLIGANDO IPHONR...");
                    Thread.sleep(1000);
                    System.out.println(" ");
                    System.out.println("!! IPHONE ENCERRADO !!");
                    break;
                default:
                    System.out.println(" !! ERROR !! \n"
                    + "DIGITE UM NÚMERO ENTRE 1 E 3");
                    Thread.sleep(1000);
                    break;
            }
        } while (opcao != 0);
        scan.close();
    }
    
}
