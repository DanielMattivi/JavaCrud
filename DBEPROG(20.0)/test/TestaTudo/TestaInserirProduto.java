
package TestaTudo;

import DAO.FornecedorDAO;
import DAO.ProdutoDAO;
import model.Fornecedor;
import model.Produto;


public class TestaInserirProduto {
    public static void main(String[] args) {
        Fornecedor fr = (Fornecedor) new FornecedorDAO().pesquisar(1);
           
        Produto pro = new Produto("Boeng", "gol", "aviao", fr);
        new ProdutoDAO().inserir(pro);
    }
}
