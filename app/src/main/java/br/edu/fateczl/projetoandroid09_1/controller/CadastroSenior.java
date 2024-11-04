package br.edu.fateczl.projetoandroid09_1.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.projetoandroid09_1.model.AtletaSenior;

public class CadastroSenior implements ICadastro<AtletaSenior> {
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */
    private List<AtletaSenior> lista;

    public CadastroSenior() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(AtletaSenior atletaSenior) {
        lista.add(atletaSenior);
    }
}
