package com.andymall.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Description:

 * @createTime: 2020-06-19 18:18
 **/

@Data
@ToString
public class SpuItemAttrGroupVo {

    private String groupName;

    private List<Attr> attrs;

}
