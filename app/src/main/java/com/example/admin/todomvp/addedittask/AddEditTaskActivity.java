package com.example.admin.todomvp.addedittask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.admin.todomvp.R;
import com.example.admin.todomvp.data.Task;

public class AddEditTaskActivity extends AppCompatActivity implements  AddEditTaskContract.View {

    AddEditTaskContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtask_frag);
        presenter = new AddEditTaskPresenter(this);
    }

    public void handleClick(View view) {
        EditText titleEditText =  findViewById(R.id.add_task_title);
        EditText descEditText =  findViewById(R.id.add_task_description);

                presenter.saveTask(titleEditText.getText().toString(),
                        descEditText.getText().toString());

    }

    @Override
    public void showEmptyTaskError() {

    }

    @Override
    public void showTasksList() {

    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setPresenter(AddEditTaskContract.Presenter presenter) {

    }
}
