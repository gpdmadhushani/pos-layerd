/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.controller;

import java.util.ArrayList;
import pos.layerd.dto.CustomerDto;
import pos.layerd.dto.ItemDto;
import pos.layerd.service.ServiceFactory;

import pos.layerd.service.custom.ItemService;

/**
 *
 * @author TOSHIBA
 */
public class ItemController {
    
    ItemService itemService=(ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);

    public String addItem(ItemDto itemDto) throws Exception {
      return itemService.addItem(itemDto); 
    }

    public ArrayList<ItemDto> getAllItems () throws Exception {
        return itemService.getAllItem();
    }

    public ItemDto getItem(String itemId) throws Exception {
      return itemService.getItem(itemId);
    }

    public String updateItem(ItemDto itemDto) throws Exception {
        return itemService.updateItem(itemDto);
    }

    public String deleteItem(String itemId) throws Exception {
       return itemService.deleteItem(itemId);
    }
    
    
}
