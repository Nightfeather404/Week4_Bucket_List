package com.example.bucket;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface BucketItemDataAccessObject {

    @Insert
    void insert(BucketItem bucketItem);

    @Delete
    void delete(BucketItem bucketItem);

    @Delete
    void delete(List<BucketItem> bucketItems);

    @Update
    void update(BucketItem bucketItem);

    @Query("SELECT * from bucketitem_table")
    List<BucketItem> getAllBucketItems();
}
