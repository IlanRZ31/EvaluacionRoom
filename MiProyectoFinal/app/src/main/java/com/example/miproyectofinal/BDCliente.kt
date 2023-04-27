package com.example.miproyectofinal
import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    entities = [Cliente::class],
    version = 1
)
abstract class BDCliente: RoomDatabase() {
    abstract fun daoCliente(): DaoCliente

}



