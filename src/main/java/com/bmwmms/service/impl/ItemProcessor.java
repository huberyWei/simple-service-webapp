package com.bmwmms.service.impl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.bmwmms.model.Item;
import com.bmwmms.service.ItemDao;

@Named
@RequestScoped
public class ItemProcessor {

	@Inject
    private ItemDao itemDao;

    public void execute() {
        List<Item> items = itemDao.fetchItems();
        for (Item item : items) {
            System.out.println("Found item " + item);
        }
        System.out.println("---------end");
    }
}
