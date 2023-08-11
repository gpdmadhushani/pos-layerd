/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dto;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author TOSHIBA
 */
public class OrderDto {
    private String orderId;
    private String customerId;
    private ArrayList<OrderDetailDto> orderDetailDtos;

    public OrderDto() {
    }

    public OrderDto(String orderId, String customerId, ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDetailDtos = orderDetailDtos;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the orderDetailDtos
     */
    public ArrayList<OrderDetailDto> getOrderDetailDtos() {
        return orderDetailDtos;
    }

    /**
     * @param orderDetailDtos the orderDetailDtos to set
     */
    public void setOrderDetailDtos(ArrayList<OrderDetailDto> orderDetailDtos) {
        this.orderDetailDtos = orderDetailDtos;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", customerId=" + customerId + ", orderDetailDtos=" + orderDetailDtos + '}';
    }
    
    
      
    
}
