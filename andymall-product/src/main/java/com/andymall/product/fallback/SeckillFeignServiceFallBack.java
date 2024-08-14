package com.andymall.product.fallback;

import com.andymall.common.exception.BizCodeEnume;
import com.andymall.common.utils.R;
import com.andymall.product.feign.SeckillFeignService;
import org.springframework.stereotype.Component;

@Component
public class SeckillFeignServiceFallBack implements SeckillFeignService {
    @Override
    public R getSkuSeckilInfo(Long skuId) {
        return R.error(BizCodeEnume.TO_MANY_REQUEST.getCode(), BizCodeEnume.TO_MANY_REQUEST.getMsg());
    }
}
