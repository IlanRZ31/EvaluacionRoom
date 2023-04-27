package com.example.miproyectofinal

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DaoCliente {
    @Query("SELECT * FROM cliente")
    suspend fun obtenerClientes(): MutableList<Cliente>

    @Insert
    suspend fun agregarCliente(cliente: Cliente)

    @Query(
        "UPDATE cliente set nombre=:nombre, apellido=:apellido, nombreUsuario=:nombreUsuario," +
                " pwd=:pwd WHERE idCliente=:idCliente"
    ) suspend fun actualizarCliente(
        idCliente: Int, nombre: String, apellido: String,
        nombreUsuario: String, pwd: String)

    @Query("DELETE FROM cliente WHERE idCliente=:idCliente")
    suspend fun borrarCliente(idCliente: Int)
}