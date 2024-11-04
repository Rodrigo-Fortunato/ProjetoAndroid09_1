package br.edu.fateczl.projetoandroid09_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.fateczl.projetoandroid09_1.controller.CadastroJuvenil;
import br.edu.fateczl.projetoandroid09_1.controller.CadastroSenior;
import br.edu.fateczl.projetoandroid09_1.controller.ICadastro;
import br.edu.fateczl.projetoandroid09_1.model.AtletaJuvenil;
import br.edu.fateczl.projetoandroid09_1.model.AtletaSenior;

public class CadastroAtletaSenior extends Fragment {
    /*
     *@author:<Rodrigo Fortunato Martins Neves>
     */
    private View view;
    private Button btnCadastrarSenior;
    private EditText etNomeSenior;
    private EditText etDataNascimentoSenior;
    private EditText etBairroSenior;
    CheckBox cbProblemasCardiacosSenior;


    public CadastroAtletaSenior() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_cadastro_atleta_senior, container, false);
        etNomeSenior = view.findViewById(R.id.etNomeComum);
        etDataNascimentoSenior = view.findViewById(R.id.etDataNascimentoComum);
        etBairroSenior = view.findViewById(R.id.etBairroComum);
        cbProblemasCardiacosSenior = view.findViewById(R.id.cbProblemasCardiacosSenior);
        btnCadastrarSenior = view.findViewById(R.id.btnCadastrarComum);
        btnCadastrarSenior.setOnClickListener(e -> cadastroSenior());

        return view;
    }

    private void cadastroSenior() {
        AtletaSenior atletaSenior = new AtletaSenior();

        atletaSenior.setNome(etNomeSenior.getText().toString());
        atletaSenior.setBairro(etBairroSenior.getText().toString());
        atletaSenior.setDataNascimento(etDataNascimentoSenior.getText().toString());
        atletaSenior.setProblemasCardiaco(cbProblemasCardiacosSenior.isChecked());

        ICadastro<AtletaSenior> iCadastro = new CadastroSenior();
        iCadastro.cadastrar(atletaSenior);
        Toast.makeText(view.getContext(), atletaSenior.toString(), Toast.LENGTH_LONG).show();
    }
}