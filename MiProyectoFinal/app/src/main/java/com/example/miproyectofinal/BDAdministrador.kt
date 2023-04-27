package com.example.miproyectofinal

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Administrador::class],
    version = 1
)
abstract class BDAdministrador:RoomDatabase() {
    abstract fun daoAdministrador(): DaoAdministrador
}