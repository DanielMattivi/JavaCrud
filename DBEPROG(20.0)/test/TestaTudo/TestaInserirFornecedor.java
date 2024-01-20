
package TestaTudo;

import DAO.FornecedorDAO;
import model.Fornecedor;


public class TestaInserirFornecedor {
    public static void main(String[] args) {
        Fornecedor frn = new Fornecedor("canadaShop", "CANADA", "04.397.210/0001-16");
            new FornecedorDAO().inserir(frn);
    }
}
