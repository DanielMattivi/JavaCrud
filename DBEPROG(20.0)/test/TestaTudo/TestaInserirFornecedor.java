/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestaTudo;

import DAO.FornecedorDAO;
import model.Fornecedor;

/**
 *
 * @author 08050438
 */
public class TestaInserirFornecedor {
    public static void main(String[] args) {
        Fornecedor frn = new Fornecedor("canadaShop", "CANADA", "04.397.210/0001-16");
            new FornecedorDAO().inserir(frn);
    }
}
