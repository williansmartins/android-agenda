package williansmartins.com.agenda.helper;

import android.widget.EditText;
import android.widget.RatingBar;

import williansmartins.com.agenda.FormularioActivity;
import williansmartins.com.agenda.R;
import williansmartins.com.agenda.modelo.Aluno;

public class FormularioHelper {

    EditText campoId;
    EditText campoNome;
    EditText campoEndereco;
    EditText campoTelefone;
    EditText campoSite;
    RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity){
        //campoId = activity.findViewById(R.id.formulario_id);
        System.out.print(R.id.formulario_nome);
        campoNome = activity.findViewById(R.id.formulario_nome);
        campoEndereco = activity.findViewById(R.id.formulario_endereco);
        campoTelefone = activity.findViewById(R.id.formulario_telefone);
        campoSite = activity.findViewById(R.id.formulario_site);
        campoNota = activity.findViewById(R.id.formulario_nota);

    }

    public Aluno pegaAluno() {
        Aluno aluno = new Aluno();
        //aluno.setId(campoId.getText().toString());
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));

        return aluno;
    }
}
