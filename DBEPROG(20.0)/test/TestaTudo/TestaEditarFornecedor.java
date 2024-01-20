
package TestaTudo;


import DAO.FornecedorDAO;
import model.Fornecedor;

public class TestaEditarFornecedor {
    
    public static void main(String[] args) {
        Fornecedor frn = new Fornecedor(1, "EletronicaMania", "Japao");
        new FornecedorDAO().editar(frn);
    }
    
}
