import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int pe = 0;
        int votos = 0;
        int ale = 0;
        int lucas = 0;
        int rodrigo = 0;
        int taffe = 0;

        System.out.println("Informe a quantidade de pessoas que irão votar: ");
        int qtdePessoas = scanner.nextInt();

        for (int i = 0; i < qtdePessoas; i++) {
            do {
                System.out.println("80- taffr ");
                System.out.println("70- Rodrigo ");
                System.out.println("60- lucas ");
                System.out.println("50- Alessandro ");
                System.out.println(pe + " vote para o concurso de talentos");
                votos = scanner.nextInt();
                pe++;

            } while (votos != 80 && votos != 70);


            if (votos == 80) {
                taffe++;
            } else if (votos == 70) {
                rodrigo++;
            } else if (votos == 60) {
                lucas++;
            } else if (votos == 50) {
                ale++;
            }


        }

        if (taffe > rodrigo && taffe > lucas && taffe > ale) {
            System.out.println("taffe");
        }else if (rodrigo > taffe && rodrigo > lucas && rodrigo > ale) {
            System.out.println("rodrigo");
        }else if (lucas > taffe && lucas > rodrigo && lucas > ale) {
            System.out.println("lucas");
        }else {
            System.out.println(ale > taffe && ale >rodrigo && ale > lucas); {
                System.out.println("alessandro");
            }
        }
    }
}
