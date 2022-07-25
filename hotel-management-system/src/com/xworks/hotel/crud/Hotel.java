package com.xworks.hotel.crud;

import com.xworks.hotel.dto.FoodItemsDTO;

public interface Hotel {
	  boolean createFoodItem(FoodItemsDTO foodItem);
		 void getFoodItemDetails();
		 boolean updatePriceByName(String name, int price);
		 boolean deleteByName(String name);
		 boolean deleteByType(String type);
		 String[] getAllFoodItemName();
}
