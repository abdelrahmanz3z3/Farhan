package ly.com.tahaben.usage_overview_data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import ly.com.tahaben.usage_overview_data.local.entity.DayLastUpdatedEntity
import ly.com.tahaben.usage_overview_data.local.entity.LocalDateTypeConverter
import ly.com.tahaben.usage_overview_data.local.entity.UsageDataItemEntity

/**
 * Created by Taha Ben Ashur (https://github.com/tahaak67) on 09,Mar,2023
 */
@Database(
    entities = [UsageDataItemEntity::class, DayLastUpdatedEntity::class],
    version = 1
)
@TypeConverters(LocalDateTypeConverter::class)
abstract class UsageDatabase : RoomDatabase() {
    abstract val dao: UsageDao
}