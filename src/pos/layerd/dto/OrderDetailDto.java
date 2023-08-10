/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dto;


public class OrderDetailDto {
    
 
    private String ItemCode;
    private Integer   OrderQTY;
    private Double discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String ItemCode, Integer OrderQTY, Double discount) {
        this.ItemCode = ItemCode;
        this.OrderQTY = OrderQTY;
        this.discount = discount;
    }

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the OrderQTY
     */
    public Integer getOrderQTY() {
        return OrderQTY;
    }

    /**
     * @param OrderQTY the OrderQTY to set
     */
    public void setOrderQTY(Integer OrderQTY) {
        this.OrderQTY = OrderQTY;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" + "ItemCode=" + ItemCode + ", OrderQTY=" + OrderQTY + ", discount=" + discount + '}';
    }

      
    
    
    
    
    
}
