
import java.util.*;

public class MenuInterativoRPG {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Random rand = new Random();
        int esc, esc2;
        int hp = 100;
        int xp = 0;

        do {
            System.out.println("\nGLADIATOR IN HELL");
            System.out.print("\n1 - Instruções\n2 - Jogar\n3 - Créditos\n4 - Sair\n");
            esc = leia.nextInt();

            switch (esc) {
                case 1:

                    System.out.println("\nINSTRUÇÕES:");
                    System.out.println(
                            "\nExplore para ganhar pontos e descanse para recuperar HP.\nSe seu HP chegar a 0, seu personagem morre e o jogo acaba.\n* HP inicia com 100. XP inicia com 0.\n* Explorar: -10 de HP e + 20 de XP\n* Descansar: + 15 de HP");
                    System.out.println("\nDigite qualquer tecla para voltar ao menu.");
                    leia.next();

                    break;

                case 2:

                    hp = 100;
                    xp = 0;

                    do {

                        System.out.println(
                                "\n*****GLADIATOR IN HELL*****");
                        System.out.println("\n1 - Explorar\n2 - Descansar\n3 - Status\n4 - Voltar ao menu");
                        esc2 = leia.nextInt();

                        switch (esc2) {

                            case 1:
                                System.out.println("\n1 - Explorando...");

                                int acao = rand.nextInt(2);

                                if (acao == 0) {

                                    System.out.println("\n[!] INIMIGO ENCONTRADO");
                                    System.out.println("\nStatus: -10 HP / +20 XP");
                                    hp -= 10;
                                    xp += 20;

                                    if (hp <= 0) {
                                        System.out.println("\n***VOCÊ MORREU***");
                                        System.out.println("\nDigite qualquer tecla para voltar ao menu.");
                                        leia.next();

                                    } else {

                                        System.out.println("\nVocê esta com " + hp + " de HP e " + xp + " de XP");
                                    }

                                } else {

                                    System.out.println("\n[!] TESOURO ENCONTRADO");
                                    System.out.println("\nVocê encontrou um tesouso com +30xp");
                                    xp += 30;

                                    System.out.println("\nExp: +" + xp);
                                }

                                break;

                            case 2:

                                if (hp == 100) {

                                    System.out.println("\nVida cheia!");

                                } else {
                                    System.out.println("\nDescansando... +15HP recuperado!");
                                    hp += 15;
                                    if (hp > 100)
                                        hp = 100;

                                    System.out.println("HP atual: " + hp);
                                }
                                break;

                            case 3:

                                System.out.println("\nStatus: " + hp + "HP / " + xp + "exp");

                                break;
                            case 4:

                                break;

                            default:
                                System.out.println("\nOpção invalida");

                        }

                    } while (esc2 != 4 && hp > 0);
                    break;

                case 3:
                    System.out.println("\nCRÉDITOS:");
                    System.out.println("\nMenu feito por MatheussssH\n");
                    System.out.println("\nDigite qualquer tecl para voltar ao menu");
                    leia.next();

                    break;

                default:
                    break;
            }
        } while (esc != 4);
        {
            System.out.println("\nPartida Finalizada...");
        }

    }
}