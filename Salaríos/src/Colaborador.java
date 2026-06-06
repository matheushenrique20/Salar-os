public class Colaborador {

    String nome;
    String cpf;
    double salarioBase;
    String tipoVinculo;

    public Colaborador(String nome, String cpf,
                       double salarioBase,
                       String tipoVinculo) {

        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.tipoVinculo = tipoVinculo;
    }
}