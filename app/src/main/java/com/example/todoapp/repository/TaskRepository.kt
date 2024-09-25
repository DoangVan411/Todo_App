package com.example.todoapp.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.todoapp.dao.TaskDao
import com.example.todoapp.model.Task

class TaskRepository(private val taskDao: TaskDao) {
    suspend fun insertTask(task: Task) {
        taskDao.insert(task)
    }

    suspend fun updateTask(task: Task) {
        taskDao.update(task)
    }

    suspend fun deleteTask(task: Task) {
        taskDao.delete(task)
    }

    fun getAllTasks(): LiveData<List<Task>> {
        return taskDao.getAllTasks()
    }

    suspend fun getTaskById(id: Int): Task?{
        return taskDao.getTaskById(id)
    }
}