package br.edu.fateczl.projetoandroid09_1.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fateczl.projetoandroid09_1.model.AtletaJuvenil;

public class CadastroJuvenil  implements ICadastro<AtletaJuvenil> {
    private List<AtletaJuvenil> lista;

    public CadastroJuvenil() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(AtletaJuvenil atletaJuvenil) {
        lista.add(atletaJuvenil);
    }
}
