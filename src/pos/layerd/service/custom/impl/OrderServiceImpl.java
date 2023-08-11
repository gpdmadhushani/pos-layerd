/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.service.custom.impl;

import pos.layerd.dao.DaoFactory;
import pos.layerd.dao.custom.ItemDao;
import pos.layerd.dao.custom.OrderDao;
import pos.layerd.dao.custom.OrderDetailDao;
import pos.layerd.dto.OrderDto;
import pos.layerd.service.custom.OrderService;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import pos.layerd.db.DBConnection;
import pos.layerd.dto.OrderDetailDto;
import pos.layerd.entity.ItemEntity;
import pos.layerd.entity.OrderDetailEntity;
import pos.layerd.entity.OrderEntity;

/**
 *
 * @author TOSHIBA
 */
public class OrderServiceImpl implements OrderService {
    private OrderDao orderDao=(OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDER);
     private OrderDetailDao orderDetailDao=(OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ORDERDETAIL);
    private ItemDao itemDao=(ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);
    
    @Override
    public String placeOrder(OrderDto dto) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            
           if(orderDao.add(new OrderEntity(dto.getOrderId(),sdf.format(new Date()),dto.getCustomerId()))){
               
               boolean isOrderSaved=true;
               for(OrderDetailDto orderDetailDto :dto.getOrderDetailDtos()){
                if(!orderDetailDao.add(new OrderDetailEntity(dto.getOrderId(),orderDetailDto .getItemCode()
                ,orderDetailDto .getOrderQTY(),orderDetailDto .getDiscount()))){
                    
                  isOrderSaved=false; 
               }
                
                
               }
               if(isOrderSaved){
               
                   boolean isItemUpdated=true;
                   
                   for(OrderDetailDto orderDetailDto :dto.getOrderDetailDtos()){ 
                   ItemEntity entity=itemDao.get(orderDetailDto.getItemCode());
                   entity.setQoh(entity.getQoh()-orderDetailDto.getOrderQTY());
                   if(!itemDao.update(entity)){
                       
                     isItemUpdated=false;  
                   }
               
                   }
                   if(isItemUpdated){
                       connection.commit();
                       return "Success";
                   }else{
                       connection.rollback();
                   return "Item Update Error";  
                   
                   }
               }else{
                   
                
                   connection.rollback();
                   return "Order Detail Save Error";   
                   
                   
               }
          
           
           }else{
               
                   connection.rollback();
                   return "Order Save Error";
           }
            
        } catch(Exception e){
             
            e.printStackTrace();
            connection.rollback();
            throw e;
                    
        }finally{
            connection.setAutoCommit(true);
        }
        
    }
}
    

