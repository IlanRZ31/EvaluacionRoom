package com.example.miproyectofinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    lateinit var bd1: BDCliente
    lateinit var bd2: BDAdministrador



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bd1 = Room.databaseBuilder(this, BDCliente::class.java, "bdcliente").build()
        bd2 = Room.databaseBuilder(this,BDAdministrador::class.java, "bdadministrador").build()
    }
}
