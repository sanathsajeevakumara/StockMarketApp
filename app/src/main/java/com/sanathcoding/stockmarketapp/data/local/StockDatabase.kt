package com.sanathcoding.stockmarketapp.data.local

import androidx.room.Database
import com.sanathcoding.stockmarketapp.data.mapper.StockeDao

@Database(
    entities = [CompanyListingEntity::class],
    version = 1
)
abstract class StockDatabase {
    abstract val dao: StockeDao
}