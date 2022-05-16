package com.ply.tmall.controller;

import com.alibaba.fastjson.JSON;
import com.alipay.api.domain.AlipayTradePrecreateModel;

import com.ply.tmall.pojo.RefundRequestParams;
import com.ply.tmall.pojo.qrcode.PreOrderParams;
import com.ply.tmall.pojo.qrcode.QrServiceEntity;
import com.ply.tmall.pojo.qrcode.RefundQueryParams;
import com.ply.tmall.service.AlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/")
public class IndexController {

    @Autowired
    private AlipayService alipayService;

    /**
     * 退款
     *
     * @param refundRequestParams
     * @return
     */
    @RequestMapping(value = "refund")
    public String refund(RefundRequestParams refundRequestParams) {
        System.out.println(refundRequestParams);

        return JSON.toJSONString(alipayService.pcRefund(refundRequestParams));
    }

    /**
     * 退款查询
     *
     * @param refundQueryParams
     * @return
     */
    @RequestMapping(value = "refund_query")
    public String refundQuery(RefundQueryParams refundQueryParams) {

        return JSON.toJSONString(alipayService.refundQuery(refundQueryParams));
    }

    /**
     * 二维码生成
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "qrcode")
    public String qrcode(AlipayTradePrecreateModel model) {
        return JSON.toJSONString(alipayService.qrcodePay(model));
    }

    /**
     * 支付回调
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "notify_url", method = RequestMethod.POST)
    public String notifyurl(HttpServletRequest request) {
        QrServiceEntity qrServiceEntity = alipayService.alipayNotify(request);
        if (qrServiceEntity.isIsreceive()) {
            return "success";
        } else {
            return "failer";
        }
    }

    /**
     * 跳转到支付宝官网支付
     *
     * @param preOrderParams
     * @return
     */
    @RequestMapping(value = "pcpay", method = RequestMethod.GET)
    public String pcPay(PreOrderParams preOrderParams) {

        return alipayService.pcPreOrder(preOrderParams);
    }
}
