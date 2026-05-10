package com.nt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDetails {

	private Integer productId;
	private String productName;
	private Double price;
}
