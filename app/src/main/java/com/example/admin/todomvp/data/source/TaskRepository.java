package com.example.admin.todomvp.data.source;

import android.content.Context;
import android.support.annotation.NonNull;

import com.example.admin.todomvp.data.Task;
import com.example.admin.todomvp.data.source.local.TasksLocalDataSource;

public class TaskRepository implements TasksDataSource {

    TasksLocalDataSource localDataSource;
    public TaskRepository(Context context) {
        localDataSource = new TasksLocalDataSource(context);
    }

    @Override
    public void saveTask(@NonNull Task task) {
        localDataSource.saveTask(task);

    }

    @Override
    public void completeTask(@NonNull Task task) {

    }

    @Override
    public void completeTask(@NonNull String taskId) {

    }

    @Override
    public void activateTask(@NonNull Task task) {

    }

    @Override
    public void activateTask(@NonNull String taskId) {

    }

    @Override
    public void clearCompletedTasks() {

    }

    @Override
    public void refreshTasks() {

    }

    @Override
    public void deleteAllTasks() {

    }

    @Override
    public void deleteTask(@NonNull String taskId) {

    }
}
