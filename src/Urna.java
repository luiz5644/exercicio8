import java.util.Scanner;

public class Urna {
    int opcao;
    
    int votos;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;


   




    Scanner entrada = new Scanner(System.in);


    void contabilizarvotos(){
        
        do{
            System.out.println("olá caro eleitor vamos votar ?\n1 - iniciar votação\n2 - encerrar votação\n3 - sair\n");
            opcao = entrada.nextInt();
            // menu A
        

        if(opcao == 1){
            System.out.println("Oque você deseja:\n1 - votar\n2 - sair\n");
            opcao = entrada.nextInt();

            
        }switch (opcao) {
            case 1:
            System.out.println("caro eleitor você pode votar nos seguintes candidatos:\n45 - Silvério Reais (PP)\n20 - Monteiro Lobato (PJ)\n12 - Elis Regina (PSJ)\n");
            votos= entrada.nextInt();
            if (votos == 45){
                c1 ++;
            }
            else if(votos ==20){
                c2++;
            }
            else if(votos == 12){
                c3++;
            }

            case 2:
            System.out.println("olá caro eleitor vamos votar ?\n1 - iniciar votação\n2 - encerrar votação\n3 - sair\n");
            opcao = entrada.nextInt();
            
            if (opcao== 2){
                apuraçãodevotos();

            }break;
            case 3:
            break;

 
        }
        


    }while(opcao != 3);


}
    void apuraçãodevotos(){
        System.out.printf("Aqui está o resultado da votação\nCandidato 1 teve = %d\nCandidato 2 teve = %d\nCandidato 3 teve = %d\n", c1, c2, c3);

    }
    void menua(int opcao){
        System.out.println("olá caro eleitor vamos votar ?\n1 - iniciar votação\n2 - encerrar votação\n3 - sair\n");
            opcao = entrada.nextInt();
    

    }
}
