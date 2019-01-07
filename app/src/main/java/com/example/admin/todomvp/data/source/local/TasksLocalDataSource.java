package com.example.admin.todomvp.data.source.local;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;

import com.example.admin.todomvp.data.Task;
import com.example.admin.todomvp.data.source.TasksDataSource;

public class TasksLocalDataSource implements TasksDataSource {
    TasksDbHelper dbHelper;
    SQLiteDatabase database;

    public TasksLocalDataSource(Context context) {
        dbHelper = new TasksDbHelper(context);
        database = dbHelper.getWritableDatabase();
    }

    @Override
    public void saveTask(@NonNull Task task) {
        ContentValues values = new ContentValues();
        values.put(TasksPersistenceContract.TaskEntry.COLUMN_NAME_TITLE,task.getTitle());
        values.put(TasksPersistenceContract.TaskEntry.COLUMN_NAME_DESCRIPTION,task.getDescription());

        database.insert(TasksPersistenceContract.TaskEntry.TABLE_NAME,null,values);

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
