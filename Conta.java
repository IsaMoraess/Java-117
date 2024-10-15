public class Conta {
    private double saldoConta;  //Atributo privado que armazena o saldo da conta

    //Construtor da classe, que recebe um valor para inicializar o saldo
    public Conta(double valor) {
        saldoConta = valor;  //Inicializa o saldo com o valor passado como parâmetro
    }
    //Método setter para alterar o saldo da conta
    public void setSaldoConta(double valor) {
        saldoConta = valor;
    }
    //Método getter para obter o saldo da conta
    public double getSaldoConta() {
        return saldoConta;
    }
    //Método que exibe o saldo atual
    public void mostraSaldo() {
        System.out.println("Saldo = R$ " + getSaldoConta());
    }
}
