/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.entity;

/**
 *
 * @author TOSHIBA
 */
public class OrderDetailEntity {
    private String orderId;
    private String itemId;
    private Double discount;
    private Integer qoh;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(String orderId, String itemId,  Integer qoh,Double discount) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.discount = discount;
        this.qoh = qoh;
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
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
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

    /**
     * @return the qoh
     */
    public Integer getQoh() {
        return qoh;
    }

    /**
     * @param qoh the qoh to set
     */
    public void setQoh(Integer qoh) {
        this.qoh = qoh;
    }

    @Override
    public String toString() {
        return "OrderDetailEntity{" + "orderId=" + orderId + ", itemId=" + itemId + ", discount=" + discount + ", qoh=" + qoh + '}';
    }
      
    
    
}
