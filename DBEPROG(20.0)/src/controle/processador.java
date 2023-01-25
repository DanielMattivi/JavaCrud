
package controle;

import java.util.HashMap;
import controle.command;

public class processador {

    private static final HashMap comandos = new HashMap();

    static {
        comandos.put("0", "view.InterfacePrincipal");
        comandos.put("1", "view.InterfaceCadastrarCliente");
        comandos.put("2", "view.InterfaceCadastrarFornecedor");
        comandos.put("3", "view.InterfaceCadastrarFuncionario");
        comandos.put("4", "view.InterfaceCadastrarProduto");
        comandos.put("5", "view.InterfaceCadastrarVenda");


    }

    public static void direcionar(String cmd) {
        String actionClass = (String) comandos.get(cmd);
        //Cria a instância da classe utilizando introspecção
        try {
            Class classe = Class.forName(actionClass);
            command comando = (command) classe.newInstance();
            comando.executar();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (InstantiationException iex) {
            System.out.println(iex);
        } catch (IllegalAccessException iaex) {
            System.out.println(iaex);
        }

    }
}