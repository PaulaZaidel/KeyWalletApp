package com.paulazaidel.mypasswords.DataBase

import androidx.room.*
import com.paulazaidel.mypasswords.Models.Account

@Dao
interface AccountDao {

    @Query("SELECT * from accounts ORDER BY description ASC")
    fun getAll(): List<Account>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(account: Account)

    @Update
    fun update(account: Account)

    @Delete
    fun delete(account: Account)
}