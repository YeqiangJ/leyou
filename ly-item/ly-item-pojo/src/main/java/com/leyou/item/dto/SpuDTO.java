package com.leyou.item.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: 姜光明
 * @Date: 2019/5/5 21:08
 */
@Data
public class SpuDTO {
    private Long id;
    private Long brandId;
    private Long cid1;// 1级类目
    private Long cid2;// 2级类目
    private Long cid3;// 3级类目
    private String name;// 名称
    private String subTitle;// 子标题
    private Boolean saleable;// 是否上架
    private Date createTime;// 创建时间
    private String categoryName; // 商品分类名称拼接
    private String brandName;// 品牌名称
    //新增两个属性，来帮助商品的保存
    private List<SkuDTO> skus;
    private SpuDetailDTO spuDetail;


    /**
     * 方便同时获取3级分类
     * @return
     */
    @JsonIgnore
    public List<Long> getCategoryIds() {
        return Arrays.asList(cid1, cid2, cid3);
    }
}