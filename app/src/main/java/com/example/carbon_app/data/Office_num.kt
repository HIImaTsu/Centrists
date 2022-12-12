package com.example.carbon_app.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "office_num")
data class Office_num(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "block") val block: Char?,
    @ColumnInfo(name = "Number_office") val num: Int?



    )
