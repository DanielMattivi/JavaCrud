package model;


public class Cliente {
    private String nome;
    private String CPF;
    private String email;
    private int codCliente;

    //construtor com codCliente
    public Cliente(String nome, String CPF, String email, int codCliente) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.codCliente = codCliente;
    }
    
    //construtor para Inserir
        public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.CPF = cpf;        
        this.email = email;
    }
    //construtor para Editar
        public Cliente(int codCliente, String nome, String email) {
        this.codCliente = codCliente;
        this.nome = nome;        
        this.email = email;
    }
              
        

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", CPF=" + CPF + ", email=" + email + ", codCliente" + codCliente + "}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.codCliente;
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
        final Cliente other = (Cliente) obj;
        return this.codCliente == other.codCliente;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param cpf
     * @return 
     */
    public boolean setCPF(String cpf) {
        if (cpf.length() > 15)
        {
            this.CPF=null;
            return false; 
        }
        this.CPF = CPF; 
        return true;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }
    
    
}
