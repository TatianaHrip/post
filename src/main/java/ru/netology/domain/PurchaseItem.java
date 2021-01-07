package ru.netology.domain;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PurchaseItem {
        private int id;
        private int productId;
        private String productName;
        private int productPrice;
        private int count;

}



