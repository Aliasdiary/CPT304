package top.naccl.bean;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class OrderInfoDTO {

    private String deliveryMethod;

    private String paymentMethod;

    private String deliveryFee;

    private String address;

    private String foodName;

    private Integer quantity;

    private Integer price;

    private Integer id;

}
