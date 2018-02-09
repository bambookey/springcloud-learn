/**
 * @(#)SchedualServiceHiHystric.java, 2018/2/9.
 * <p/>
 */
package com.demo.service.feign.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author lixiangyu
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}