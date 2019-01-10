package williansmartins.com.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import williansmartins.com.agenda.helper.FormularioHelper;
import williansmartins.com.agenda.modelo.Aluno;

public class FormularioActivity extends AppCompatActivity {

    FormularioHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        helper = new FormularioHelper(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_formulario, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menu_formulario_ok){
            Aluno aluno = helper.pegaAluno();
            Toast.makeText(FormularioActivity.this, "Aluno salvo!" + aluno, Toast.LENGTH_LONG).show();


            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
