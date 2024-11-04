package br.edu.fateczl.projetoandroid09_1.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.projetoandroid09_1.model.Atleta;

public class CadastroComum implements ICadastro<Atleta>{
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */
    private List<Atleta> lista;

    public CadastroComum() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(Atleta atleta) {
        lista.add(atleta);
    }
}
