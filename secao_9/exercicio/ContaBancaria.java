package secao_9.exercicio;

public class ContaBancaria {
    private String nome;
    private double saldo;
    private String numeroConta;

    
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public ContaBancaria(String nome, String numeroConta, double saldoIncial) {
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo");
        }

        this.nome = nome;
        this.numeroConta = numeroConta;
        // Dessa forma iremos proteger o método de encapsulamento
        deposito(saldo);
    }
    
    public ContaBancaria(String nome, String numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }
    
    public double saque(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor do saque não pode ser menor ou igual a 0");
        }

        this.saldo = (saldo - valorSaque) - 5;
        return saldo;
    }

    public double deposito(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("O valor do depósito não pode ser menor ou igual a 0");
        }

        this.saldo += valorDeposito;
        return saldo;
    }

    public String statusConta() {
        return String.format("Numero conta: %s, Nome do titular: %s, Saldo: R$%.2f%n", this.numeroConta, this.nome, this.saldo);
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

}
