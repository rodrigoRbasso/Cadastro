


/* Alunos: 18200315 - Paulo Vinicius Pretto
 *         20180666 - Pedro Henrique Semensato Machado
 *         21180520 - rodrigo rampon basso
 *         Fundamentos De Programacao - turma 136 - 2021/1
*/




public class Dinossauro
{

    private String nome;
    private String cpf;
    private double valorHora;
    private int idDino;
    private boolean filhos;

    Dinossauro(String nome, String cpf, double valorHora, int idDino, boolean filhos){
        this.nome = nome;
        this.cpf = cpf;
        this.valorHora = valorHora;
        this.idDino = idDino;
        this.filhos = filhos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        //Validar se precisa de alguma restrição
        this.cpf = cpf;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int idDino() {
        return this.idDino;
    }

    public void setIdDino(int idDino) {

        if(idDino>44){
            this.idDino = 44;
        }else if(idDino<0){
            this.idDino = 0;
        } else{
            this.idDino = idDino;
        }
    }

    public boolean getFilhos() {
        return this.filhos;
    }

    public void setFilhos(boolean filhos) {
        this.filhos = filhos;
    }

    public double calculaSalario(){
        // Multiplicado por 4, tendo em vista que serão 4 semanas
        double salario = this.valorHora * this.idDino * 4;
        return salario;
    }


    public String toString(){
        //Imprime todos os atributos da classe
        return "\n " + this.nome + "\n " +  this.cpf + "\n " + this.idDino + "\n " + this.valorHora + "\n " + this.filhos;
    }
}

