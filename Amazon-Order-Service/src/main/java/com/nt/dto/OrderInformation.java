package com.nt.dto;

import java.util.List;

import com.nt.entity.ProductDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderInformation {

	private String emailId;
	private List<ProductDetails> productsInfo;
	private Double totalAmnt;
}
