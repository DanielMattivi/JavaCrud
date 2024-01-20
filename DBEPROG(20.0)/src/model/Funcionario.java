
package model;

public class Funcionario {
    
    private String nome;
    private String cpf;
    private String dataAdmissao;    
    private String dataNascimento;
    private double salario;
    private int codFuncionario;

    
    //Construtor geral
    public Funcionario(String nome, String cpf, String dataAdmissao, double salario, String dataNascimento, int codFuncionario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.codFuncionario = codFuncionario;       
    }
    
    //Construtor para Editar e Excluir
    public Funcionario(int codFuncionario, String nome, String dataAdmissao, double salario, String dataNascimento) {
        this.codFuncionario = codFuncionario;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.dataNascimento = dataNascimento;  
    }
    
    //Construtor para inserir
    public Funcionario(String nome, String cpf, String dataAdmissao, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        
    }
    
    public Funcionario() {}; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        if (cpf.length() > 15)
        {
            this.cpf=null;
            return false; 
        }
        this.cpf = cpf; 
        return true;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double salario) {
        if (salario < 0 ){ 
            System.out.println("O salário precisa ter um valor."); 
            return false;
        }
        this.salario = salario;
        return true;
        
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    //--------------

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.codFuncionario;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        return this.codFuncionario == other.codFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", dataAdmissao=" + dataAdmissao + ", salario=" + salario + ", dataNascimento=" + dataNascimento + ", codFuncionario=" + codFuncionario +'}';
    }
}
