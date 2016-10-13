package com.bmwmms.dao;

import java.util.List;

import com.bmwmms.model.Item;

public interface ItemDao {
	 List<Item> fetchItems();
}
