package sg.edu.rp.c346.id22016809.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etToDo = findViewById(R.id.editTextToDo);
        Button addBtn = findViewById(R.id.addBtn);
        Button clearBtn = findViewById(R.id.clearBtn);
        ListView lvToDo = findViewById(R.id.toDoList);

        ArrayList<String> alToDo = new ArrayList<String>();

        ArrayAdapter aaToDo = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alToDo);
        lvToDo.setAdapter(aaToDo);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String task = etToDo.getText().toString();
                if (!task.isEmpty()) {
                    alToDo.add(task);
                    aaToDo.notifyDataSetChanged();
                }
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alToDo.clear();
                aaToDo.notifyDataSetChanged();
            }
        });

    }
}