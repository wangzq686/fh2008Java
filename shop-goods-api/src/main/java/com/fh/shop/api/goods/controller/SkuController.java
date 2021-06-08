package com.fh.shop.api.goods.controller;

import com.fh.shop.api.goods.biz.ISkuService;
import com.fh.shop.common.ServerResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wzq
 * @description
 * @date 2021/4/12 12:38
 */
@Api(tags = "商品sku")
@RestController
@RequestMapping("/api")
public class SkuController {

    @Resource(name = "skuService")
    private ISkuService skuService;

    /**
     *
     * @return
     */
    @GetMapping("/skus")
//    @Check  //拦截
    @ApiOperation(value = "查询的是推荐新品上架商品")
    private ServerResponse findRecommendNewProductList(){
        return skuService.findRecommendNewProductList();
    }


}
