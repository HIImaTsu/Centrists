package com.example.carbon_app.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface OfficeDao {
    @Query("SELECT * FROM office_num")
    fun getAll(): List<Office_num>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(officeNum: Office_num)



}