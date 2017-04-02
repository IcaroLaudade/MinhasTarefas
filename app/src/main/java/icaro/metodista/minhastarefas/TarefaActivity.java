package icaro.metodista.minhastarefas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Icaro on 29/03/2017.
 */

public class TarefaActivity extends AppCompatActivity{
    private List<String> tarefas;
    private ArrayAdapter<String> adapter;
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.tarefa);
        tarefas = new ArrayList<String>();
         ListView lista = (ListView) findViewById(R.id.listaTarefas);
         adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tarefas);
         lista.setAdapter(adapter);
    }

    public void adicionarTarefa(View view) {
         EditText descricao = (EditText) findViewById(R.id.txtAdd);
         if(descricao.getText().toString().trim().length() > 0) {
             tarefas.add(descricao.getText().toString());
             adapter.notifyDataSetChanged();
             descricao.setText("");
             } else {
             Toast.makeText(this, "Campo tarefa vazio!", Toast.LENGTH_SHORT).show();
             }
    }
    public void remover(View view){
        if(tarefas.size()<1){
            Toast.makeText(this,"Nada para apagar",Toast.LENGTH_SHORT).show();
        }
        else {
            tarefas.remove(tarefas.size() - 1);
            adapter.notifyDataSetChanged();
        }
    }

}
