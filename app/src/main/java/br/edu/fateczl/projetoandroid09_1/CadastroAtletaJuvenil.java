package br.edu.fateczl.projetoandroid09_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.fateczl.projetoandroid09_1.controller.CadastroJuvenil;
import br.edu.fateczl.projetoandroid09_1.controller.ICadastro;
import br.edu.fateczl.projetoandroid09_1.model.AtletaJuvenil;

public class CadastroAtletaJuvenil extends Fragment {

    private View view;
    private Button btnCadastrarJuvenil;
    private EditText etNomeJuvenil;
    private EditText etDataNascimentoJuvenil;
    private EditText etAnosPraticaJuvenil;
    private EditText etBairroJuvenil;

    public CadastroAtletaJuvenil() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_cadastro_atleta_juvenil, container, false);
        etNomeJuvenil = view.findViewById(R.id.etNomeJuvenil);
        etDataNascimentoJuvenil = view.findViewById(R.id.etDataNascimentoJuvenil);
        etBairroJuvenil = view.findViewById(R.id.etBairroJuvenil);
        etAnosPraticaJuvenil = view.findViewById(R.id.etAnosPraticaJuvenil);
        btnCadastrarJuvenil = view.findViewById(R.id.btnCadastrarJuvenil);
        btnCadastrarJuvenil.setOnClickListener(e->cadastroJuvenil());
        return view;
    }

    private void cadastroJuvenil() {
        AtletaJuvenil atletaJuvenil = new AtletaJuvenil();

        atletaJuvenil.setNome(etNomeJuvenil.getText().toString());
        atletaJuvenil.setBairro(etBairroJuvenil.getText().toString());
        atletaJuvenil.setDataNascimento(etDataNascimentoJuvenil.getText().toString());
        atletaJuvenil.setAnosPratica(Integer.parseInt(etAnosPraticaJuvenil.getText().toString()));

        ICadastro<AtletaJuvenil> iCadastro = new CadastroJuvenil();
        iCadastro.cadastrar(atletaJuvenil);

        Toast.makeText(view.getContext(), atletaJuvenil.toString(), Toast.LENGTH_LONG).show();

    }
}