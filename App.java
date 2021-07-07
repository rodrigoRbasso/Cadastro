


/* Alunos: 18200315 - Paulo Vinicius Pretto
 *         20180666 - Pedro Henrique Semensato Machado
 *         21180520 - rodrigo rampon basso
 *         Fundamentos De Programacao - turma 136 - 2021/1
*/

import java.util.Scanner;
public class App{
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Dinossauro alexandre = new Dinossauro ("Alexandre de Moraes", "991.479.444-32", 22.5, 44, true);
    Dinossauro paulo = new Dinossauro("Paulo Batista da Silva", "034.789.954-83", 22.5, 44, true);
    Dinossauro gilberto = new Dinossauro("Gilberto do Vigor", "123.449.774-61", 23.5, 44, false);
    Dinossauro ronaldo = new Dinossauro("Ronaldo Nazario", "532.479.444-93", 24.5, 44, true);
    Dinossauro arnaldo = new Dinossauro("Arnaldo Cesar Coelho", "891.479.444-32", 25.5, 44, false);
    Cadastro cadastro = new Cadastro();
    cadastro.addDinossauro(alexandre);
    cadastro.addDinossauro(paulo);
    cadastro.addDinossauro(gilberto);
    cadastro.addDinossauro(ronaldo);
    cadastro.addDinossauro(arnaldo);

        for(int i = 0; i<1; i++){
           System.out.println("\nSeja bem vindo ao sistema da firma");
           System.out.println("O que você deseja fazer?");
           System.out.println("  1 - Cadastrar novo Funcionário");
           System.out.println("  2 - Listar os funcionários cadastrados");
           System.out.println("  3 - Imprimir o funcionário com maior salário");
           System.out.println("  4 - Imprimir o percentual de funcionários que possuem filhos");
           System.out.println("  5 - Remover Funcionário");
           System.out.println("  6 - Sair do Programa");
           System.out.println();
           System.out.println("Digite apenas o número desejado");
        
           int menuPrincipal = in.nextInt();
           if(menuPrincipal == 1){
               cadastro.addDinossauro(cadastro.dinossauroUsuario());
               i--;
               continue;

            } else if(menuPrincipal == 2){
                cadastro.listarDinossauro();
                i--;
                continue;

            }else if(menuPrincipal == 3){
               System.out.println("    O Funcionário com maior salário é " + cadastro.maiorSalario().getNome());
               i--;
               continue;

            }else if(menuPrincipal == 4){
               System.out.println("    O percentual de funcionários que possuem filhos é de " + cadastro.percentualFilhos() 
               + "%.");
               i--;
               continue;

            }else if(menuPrincipal == 5){
                System.out.println("Este são os funcionários cadastrados");
                for(int f = 0; f<cadastro.getDinossauros().length;f++){
                    if(cadastro.getDinossauros()[f]!=null){
                        System.out.println("Indexador: " + f + " Corresponde ao funcionário " + cadastro.getDinossauros()[f].getNome());
                    }
                }
                int index = 0;
                System.out.println("Digite o indexador do fucionário que deseja remover");
                index = in.nextInt();
                cadastro.removeDinossauro(index);
                i--;
                continue;

            }else if(menuPrincipal == 6){
               System.out.println("    Aplicação encerrada");
            }else{
                System.out.println("    O valor inserido foi inválido, insira novamente");
                i--;
                continue;
            }


        }
}
}
