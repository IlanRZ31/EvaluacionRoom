package com.example.miproyectofinal

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "administrador")
data class Administrador(
    @PrimaryKey var idAdmin: Int,
    @ColumnInfo(name = "nombre") var nombre: String,
    @ColumnInfo(name = "apellido") var apellido: String,
    @ColumnInfo(name = "nombreUsuario") var nombreUsuario: String,
    @ColumnInfo(name = "pwd") var pwd: String

)