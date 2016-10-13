package com.bmwmms.service;

import java.util.List;

import com.bmwmms.model.Item;

public interface ItemDao {
	 List<Item> fetchItems();
}
