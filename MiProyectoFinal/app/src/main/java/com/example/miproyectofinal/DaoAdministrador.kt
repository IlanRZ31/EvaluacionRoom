package com.example.miproyectofinal

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DaoAdministrador {
    @Query("SELECT * FROM administrador")
    suspend fun obtenerAdministrador(): MutableList<Administrador>

    @Insert
    suspend fun agregarAdministrador(Administrador:Administrador)

    @Query(
        "UPDATE administrador set nombre=:nombre, apellido=:apellido, nombreUsuario=:nombreUsuario," +
                " pwd=:pwd WHERE idAdmin=:idAdmin"
    ) suspend fun actualizarAdministrador(
        idAdmin: Int, nombre: String, apellido: String,
        nombreUsuario: String, pwd: String)

    @Query("DELETE FROM administrador WHERE idAdmin=:idAdmin")
    suspend fun borrarAdministrador(idAdmin: Int)
}