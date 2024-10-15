public class metodo {
    public static void main(String args[]) {
        Conta consulta;  //Declara uma variável do tipo Conta
        consulta = new Conta(5730);  //Cria um novo objeto Conta cm saldo de 5730
        consulta.mostraSaldo();  //Chama o método para exibir o saldo
    }
}
