package com.gem.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author:gusubaiyi
 * @vx:zdf824780260
 * @blog:www.gusubaiyi.com
 * @date:2020/10/5 6:40 下午
 **/
@Service
public class PaymentService {

    /**
     * @author:gusubaiyi
     * @description: 正常访问的函数
     * @date:2020/10/5 6:43 下午
     **/
    public String paymentInfo_OK(Integer id){
        return "线程池: "+Thread.currentThread().getName()+" paymentInfo_OK,id:  "+ id + "\t" + "O(∩_∩)O哈哈~";
    }

    /**
     * @author:gusubaiyi
     * @description: 非正常访问的函数,耗时3s
     * @date:2020/10/5 6:43 下午
     **/
    public String paymentInfo_TimeOut(Integer id){
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池: "+Thread.currentThread().getName()+" paymentInfo_TimeOut,id:  "+ id + "\t" + "O(∩_∩)O哈哈~"+"  耗时3秒";
    }
}
