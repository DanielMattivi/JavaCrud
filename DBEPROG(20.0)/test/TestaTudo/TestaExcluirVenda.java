
package TestaTudo;

import DAO.VendaDAO;


public class TestaExcluirVenda {
    public static void main(String[] args) {
        
        VendaDAO vndao = new VendaDAO();
        
        //Produto pro = (Produto) prodao.pesquisar(1);
        //System.out.println("Achou =" + pro);
        vndao.excluir(1);
    }
    
}
