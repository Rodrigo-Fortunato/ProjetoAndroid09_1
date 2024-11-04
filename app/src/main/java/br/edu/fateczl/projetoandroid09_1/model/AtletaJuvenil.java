package br.edu.fateczl.projetoandroid09_1.model;

import androidx.annotation.NonNull;

public class AtletaJuvenil extends Competidor{
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */
    private int anosPratica;

    @NonNull
    @Override
    public String toString() {
        return "AtletaJuvenil{" +
                "anosPratica=" + anosPratica +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }

    public int getAnosPratica() {
        return anosPratica;
    }

    public void setAnosPratica(int anosPratica) {
        this.anosPratica = anosPratica;
    }
}
