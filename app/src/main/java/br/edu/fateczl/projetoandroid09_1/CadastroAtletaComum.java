package br.edu.fateczl.projetoandroid09_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import br.edu.fateczl.projetoandroid09_1.controller.CadastroComum;
import br.edu.fateczl.projetoandroid09_1.controller.ICadastro;
import br.edu.fateczl.projetoandroid09_1.model.Atleta;

public class CadastroAtletaComum extends Fragment {
    private View view;
    private Button btnCadastrarComum;
    private EditText etNomeComum;
    private EditText etDataNascimentoComum;
    private EditText etBairroComum;
    private EditText etRecordeSegundos;
    private EditText etAcademia;

    public CadastroAtletaComum() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_cadastro_atleta_comum, container, false);
        etNomeComum = view.findViewById(R.id.etNomeComum);
        etDataNascimentoComum = view.findViewById(R.id.etDataNascimentoComum);
        etBairroComum = view.findViewById(R.id.etBairroComum);
        btnCadastrarComum = view.findViewById(R.id.btnCadastrarComum);
        etRecordeSegundos = view.findViewById(R.id.etRecordeSegundos);
        etAcademia = view.findViewById(R.id.etAcademia);


        btnCadastrarComum.setOnClickListener(e -> cadastroComum());

        return view;
    }

    private void cadastroComum() {
        Atleta atletaComum = new Atleta();

        atletaComum.setNome(etNomeComum.getText().toString());
        atletaComum.setBairro(etBairroComum.getText().toString());
        atletaComum.setDataNascimento(etDataNascimentoComum.getText().toString());
        atletaComum.setAcademia(etAcademia.getText().toString());
        atletaComum.setRecordeSegundos(Integer.parseInt(etRecordeSegundos.getText().toString()));

        ICadastro<Atleta> iCadastro = new CadastroComum();
        iCadastro.cadastrar(atletaComum);
        Toast.makeText(view.getContext(), atletaComum.toString(), Toast.LENGTH_LONG).show();

    }
}