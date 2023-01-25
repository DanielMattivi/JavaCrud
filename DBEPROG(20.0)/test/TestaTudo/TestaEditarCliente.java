/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaTudo;

import DAO.ClienteDAO;
import model.Cliente;

/**
 *
 * @author LeKKi
 */
public class TestaEditarCliente {
    
    public static void main(String[] args) {
        //codCliente - Nome - Email
         Cliente cli = new Cliente(2, "Anderson", "andersonsilva@hotmail.com");
         new ClienteDAO().editar(cli);
    } 
}
