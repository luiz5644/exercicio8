import java.util.Scanner;

public class Urna {
    int opcao;
    
    int votos;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    int totbranco = 0;
    


   




    Scanner entrada = new Scanner(System.in);


    void contabilizarvotos(){
        
        System.out.println("olá caro eleitor vamos votar ?\n1 - iniciar votação\n2 - encerrar votação\n3 - sair");
            opcao = entrada.nextInt();
            // menu A
        do{
        

        if(opcao == 1){
            System.out.println("");
            System.out.println("Oque você deseja:\n1 - votar\n2 - sair");
            opcao = entrada.nextInt();

            
        }switch (opcao) {
            case 1:
            System.out.println("caro eleitor você pode votar nos seguintes candidatos:\n45 - Silvério Reais (PP)\n20 - Monteiro Lobato (PJ)\n12 - Elis Regina (PSJ)\nvotos nulos - digite qualquer número");
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
            else{
                totbranco ++;
            }

            case 2:
            System.out.println("");
            System.out.println("olá caro eleitor vamos votar ?\n1 - iniciar votação\n2 - encerrar votação\n3 - sair");
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
        System.out.println("");
        System.out.printf("Aqui está o resultado da votação\nSilvério Reais (PP) teve um total de %d votos\nMonteiro Lobato (PJ) teve um total de %d votos\nElis Regina (PJS) teve um total de %d votos", c1, c2, c3);
        int totvotos = (c1+c2+c3)/2;
        System.out.println("");
        
        if (c1>totvotos){
            System.out.println("Silvério Reais (PP) você foi o ganhador desta eleição");
            System.out.println("");
        }
        else if(c2>totvotos){
            System.out.println("Parabéns Monteiro Lobato (PJ) você foi o ganhador desta eleição");
            System.out.println("");
        }
        else if (c3>totvotos){
            System.out.println("Parabéns Elis Regina (PJS) você foi o ganhador desta eleição");
            System.out.println("");
        }
        else{
            System.out.println("Não temos um candidato ainda");
        }
        
        

    }
   
}
