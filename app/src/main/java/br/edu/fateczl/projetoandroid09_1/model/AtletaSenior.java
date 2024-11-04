package br.edu.fateczl.projetoandroid09_1.model;

import androidx.annotation.NonNull;

public class AtletaSenior extends Competidor{
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */
    private boolean problemasCardiaco;

    @NonNull
    @Override
    public String toString() {
        return "AtletaSenior{" +
                "problemasCardiaco=" + problemasCardiaco +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }

    public boolean isProblemasCardiaco() {
        return problemasCardiaco;
    }

    public void setProblemasCardiaco(boolean problemasCardiaco) {
        this.problemasCardiaco = problemasCardiaco;
    }
}
