package com.shm.product.service;

import com.shm.product.common.DecreaseStockInput;
import com.shm.product.dataobject.ProductInfo;
import com.shm.product.dto.CartDTO;

import java.util.List;


public interface ProductService {
    //查询所有在架商品
    List<ProductInfo> findAllUp();

    //查询商品列表
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}

