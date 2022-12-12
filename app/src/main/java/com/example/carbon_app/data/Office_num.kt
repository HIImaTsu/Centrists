package com.example.carbon_app.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "office_num")
data class Office_num(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "firstName") val user_name: String?,
    @ColumnInfo(name = "Second_name") val num: String?



    )
