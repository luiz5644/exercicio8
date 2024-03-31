import java.util.Scanner;

public class Urna {
    int opcao;
    
    int votos;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    int totbranco = 0;
    int totvotosnulos = 0;
    int senha;
    int senhaadm = 564;
    int totvotos = ((c1+c2+c3)/2)+1;

   
    Scanner entrada = new Scanner(System.in);


    void contabilizarvotos(){
        System.out.printf("%s\n", "=-".repeat(30));
        System.out.println("MENU A");
        System.out.println("olá caro eleitor vamos votar ?\n1 - iniciar votação\n2 - encerrar votação\n3 - sair");
        System.out.printf("%s\n", "=-".repeat(30));   
         opcao = entrada.nextInt();
        
            // menu A
        do{
        

        if(opcao == 1){
            System.err.printf("%s\n", "=-".repeat(30));
            System.out.println("MENU B");
            System.out.println("Oque você deseja:\n1 - votar\n2 - sair");
            System.err.printf("%s\n", "-=".repeat(30));
            opcao = entrada.nextInt();

            
        }switch (opcao) {
            case 1:
            System.out.printf("%s\n", "=-".repeat(30));
            System.out.println("caro eleitor você pode votar nos seguintes candidatos:\n45 - Silvério Reais (PP)\n20 - Monteiro Lobato (PJ)\n12 - Elis Regina (PSJ)\n00 - Voto em branco\nQualquer número - Voto nulo");
            System.out.printf("%s\n", "=-".repeat(30));
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
            else if(votos == 00){
                totbranco ++;
            }
            else{
                totvotosnulos ++;
            }

            case 2:
            System.out.printf("%s\n", "=-".repeat(30));
            System.out.println("MENU A");
            System.out.println("olá caro eleitor vamos votar ?\n1 - iniciar votação\n2 - encerrar votação\n3 - sair");
            System.out.printf("%s\n", "=-".repeat(30));
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

        
        do{
        System.out.println("Digite aqui a senha para saber o resultado da eleição");
        senha = entrada.nextInt();

        if(senha==564){
        System.out.printf("%s\n", "-=".repeat(30));
        System.out.println("RESULTADO DA ELEIÇÃO");
        System.out.printf("%s\n", "-=".repeat(30));
        System.out.printf("Silvério Reais (PP) teve um total de %d votos\nMonteiro Lobato (PJ) teve um total de %d votos\nElis Regina (PJS) teve um total de %d votos\n%d Votos brancos\n%d Votos nulos", c1, c2, c3, totbranco, totvotosnulos);
        if (c1>totvotos){
            System.out.println("\nParabéns Silvério Reais (PP) você foi o ganhador desta eleição");
            
        
        }
        else if(c2>totvotos){
            System.out.println("\nParabéns Monteiro Lobato (PJ) você foi o ganhador desta eleição");
            
        }
        else if (c3>totvotos){
            System.out.println("\nParabéns Elis Regina (PJS) você foi o ganhador desta eleição");
            
        }
        else{
            System.out.println("\nNão temos um candidato ainda");
        }
        System.out.printf("%s\n", "-=".repeat(30));
    }
    }while(senha!= senhaadm);
        
        

    
        
        
        

    }
   
}
