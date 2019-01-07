package com.example.admin.todomvp.addedittask;

import com.example.admin.todomvp.data.Task;
import com.example.admin.todomvp.data.source.TaskRepository;
import com.example.admin.todomvp.data.source.TasksDataSource;

public class AddEditTaskPresenter implements AddEditTaskContract.Presenter {

    TasksDataSource repository;

    AddEditTaskContract.View view;
    public AddEditTaskPresenter(AddEditTaskActivity addEditTaskActivity) {
        view = addEditTaskActivity;
        repository = new TaskRepository(addEditTaskActivity);
    }

    @Override
    public void saveTask(String title, String description) {
        repository.saveTask(new Task(title,description));
    }

    @Override
    public void populateTask() {

    }

    @Override
    public boolean isDataMissing() {
        return false;
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}
