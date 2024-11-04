package br.edu.fateczl.projetoandroid09_1.model;

import androidx.annotation.NonNull;

public class Atleta extends Competidor{
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */
    private String academia;

    @NonNull
    @Override
    public String toString() {
        return "Atleta{" +
                "academia='" + academia + '\'' +
                ", recordeSegundos=" + recordeSegundos +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }

    public int getRecordeSegundos() {
        return recordeSegundos;
    }

    public void setRecordeSegundos(int recordeSegundos) {
        this.recordeSegundos = recordeSegundos;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    private int recordeSegundos;


}
