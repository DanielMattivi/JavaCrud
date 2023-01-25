/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


public class geradorRelatorio {

    private File arquivo;

    public geradorRelatorio(String nomeArquivo) throws IOException {
        arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
    }

    public void gravarRelatorio(ArrayList dados) throws IOException {
        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        Iterator it = dados.iterator();
        while (it.hasNext()) {
            bw.write(it.next().toString());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public ArrayList lerRelatorio() throws IOException {
        ArrayList dados = new ArrayList();
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        //enquanto houver mais linhas
        while (br.ready()) {
            //lê a proxima linha
            String linha = br.readLine();
            //guarda a linha no ArrayList
            dados.add(linha);
        }
        return dados;
    }

}
