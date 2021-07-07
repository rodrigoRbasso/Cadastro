


/* Alunos: 18200315 - Paulo Vinicius Pretto
 *         20180666 - Pedro Henrique Semensato Machado
 *         21180520 - rodrigo rampon basso
 *         Fundamentos De Programacao - turma 136 - 2021/1
*/


import java.util.Scanner;
public class Cadastro {

    private Dinossauro[] dinossauros = new Dinossauro[100];
    
    public Dinossauro[] getDinossauros(){
        return this.dinossauros;
    }

    public void addDinossauro(Dinossauro dinossauro){

        //Metodo para adição de dinossauro

        for(int i = 0; i<dinossauros.length; i++){
            if(dinossauros[i]==null){
                dinossauros[i] = dinossauro;
                return;
            }
        }
    }

    public Dinossauro[] removeDinossauro(int index){
        //Metodo para remoção de Dinossauro

        Dinossauro[] newArray = new Dinossauro[this.dinossauros.length];
        if(this.dinossauros == null || index<0 || 
        index==this.dinossauros.length){
            System.out.println("    Operação inválida");
            return this.dinossauros;
        }

        for(int i = 0, j=0; i<this.dinossauros.length;i++){
            if(i == index){
                System.out.println("    Funcionario " 
                + this.dinossauros[i].getNome() + " removido.");
                continue;
            }
            newArray[j++] = this.dinossauros[i];
        }
        return this.dinossauros = newArray;
    }

    public Dinossauro maiorSalario(){
        //Metodo para calcular o maior salário

        double maiorSalario = 0;
        Dinossauro dinossauroMaiorSalario = null;

        for(int i = 0; i<this.dinossauros.length; i++){
            if(this.dinossauros[i] != null){
                if(this.dinossauros[i].calculaSalario()>maiorSalario){
                    maiorSalario = this.dinossauros[i].calculaSalario();
                    dinossauroMaiorSalario = this.dinossauros[i];
                }
            }
        }

        return dinossauroMaiorSalario;
    }

    public double percentualFilhos(){
        //Metodo para calcular o percentual de funcionarios que tem filho
        double dinossaurosAtivos = 0;
        double dinossaurosComFilhos = 0;

        for (int i = 0; i < this.dinossauros.length; i++) {
            if(this.dinossauros[i]!=null){
                dinossaurosAtivos++;
            }
            if(this.dinossauros[i]!=null){
                if(this.dinossauros[i].getFilhos() == true){
                    dinossaurosComFilhos++;
                }
            }   
        }
        double percentual = (dinossaurosComFilhos*100)/dinossaurosAtivos;
        return percentual;
    }

    public static Dinossauro dinossauroUsuario(){

        //Unico metodo que solicitará input do usuário

        String nome = "";
        String cpf = "";
        double valorHora = 0;
        int horasTrabalhadas = 0;
        boolean temFilhos = false;

        for(int i = 0; i<1; i++){
            Scanner in = new Scanner(System.in);
            System.out.println("Digite o nome do Funcionário:");
            nome = in.nextLine();
            
            for(int j = 0; j<1; j++){
                System.out.println("Digite o valor pago pela hora deste Funcionário:");
                valorHora = in.nextDouble();
                if(valorHora<0){
                    System.out.println("Valor inválido");
                    j--;
                    continue;
                }
            }
            
            in.nextLine();
            for(int k = 0; k<1; k++){
                System.out.println("Digite o CPF do Funcionário:");
                cpf = in.nextLine();
                String aux = cpf.replace(".","").replace("-","");
                if(aux.length()!=11){
                    System.out.println("CPF invalido");
                    k--;
                    continue;
                }
            }

            
            for(int l = 0; l<1; l++){
                System.out.println("Digite a quantidade de Horas trabalhadas na semana:");
                horasTrabalhadas = in.nextInt();
                if(horasTrabalhadas<0){
                    System.out.println("Valor inválido");
                    l--;
                    continue;
                }
            }
    
            System.out.println("O Funcionários possui filhos (true or false)?");         
            temFilhos = in.nextBoolean();
        }

        Dinossauro dinossauroUsuario = new Dinossauro(nome,cpf,valorHora,horasTrabalhadas,temFilhos);
        return dinossauroUsuario;
    }

    public void listarDinossauro(){

        for(int i = 0; i<this.dinossauros.length;i++){
            if(this.dinossauros[i]!=null){
                System.out.println(this.dinossauros[i].getNome());
            }
        }
    }
}