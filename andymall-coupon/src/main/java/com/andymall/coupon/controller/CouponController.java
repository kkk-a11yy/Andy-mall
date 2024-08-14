package com.andymall.coupon.controller;

import com.andymall.common.utils.PageUtils;
import com.andymall.common.utils.R;
import com.andymall.coupon.entity.CouponEntity;
import com.andymall.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 优惠券信息
 *
 * @author ksia
 * @email ksiafor@gmail.com
 * @date 2023-10-26 17:56:20
 */

/**
 * 使用Nacos
 * 1. common 引入依赖
 * 		<dependency>
 * 			<groupId>com.alibaba.cloud</groupId>
 * 			<artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 * 		</dependency>
 * 2. 	创建bootstrap.properties
 *          spring.application.name=andymall-coupon
*           spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3. 给配置中心添加“数据集（Data ID）andymall-coupon.properties”,默认规则，应用名.properties
 * 4. 给 应用名.properties 添加配置
 * 5. 动态获取配置
 *      @RefreshScope 动态获取并刷新
 *      @Value("${配置项的名}") 获取到
 *配置中心的配置优先于配置文件
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value("${coupon.user.name}")
    private String name;
    @Value("${coupon.user.age}")
    private Integer age;

    @RequestMapping("/test")
    public R test(){
        return R.ok().put("name",name).put("age",age);
    }

    @RequestMapping("/member/list")
    public R membercoupons(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减10");
        return R.ok().put("coupon",Arrays.asList(couponEntity));
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
