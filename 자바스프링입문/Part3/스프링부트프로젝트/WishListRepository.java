package com.example.restaurant.wishlist.repository;

import com.example.restaurant.db.MemoryDbRespositoryAbstract;
import com.example.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class WishListRepository extends MemoryDbRespositoryAbstract<WishListEntity> {

}
