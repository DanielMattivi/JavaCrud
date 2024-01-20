
package TestaTudo;

import DAO.ProdutoDAO;
import model.Produto;

public class TestaExcluirProduto {
    public static void main(String[] args) {
        
        ProdutoDAO prodao = new ProdutoDAO();
        
        //Produto pro = (Produto) prodao.pesquisar(1);
        //System.out.println("Achou =" + pro);
        prodao.excluir(2);
    }
    
}
