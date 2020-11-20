package com.example.coroutinespractice

class MyRepository{

    suspend fun getUsers() = MyApi().getUsers()
}