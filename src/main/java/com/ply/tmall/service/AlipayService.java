package com.ply.tmall.service;

import com.alipay.api.domain.AlipayTradePrecreateModel;
import com.ply.tmall.pojo.RefundRequestParams;
import com.ply.tmall.pojo.qrcode.*;


import javax.servlet.http.HttpServletRequest;

public interface AlipayService {

    RefundResponse pcRefund(RefundRequestParams requestParams);

    QrCodeResponse qrcodePay(AlipayTradePrecreateModel model);

    QrServiceEntity alipayNotify(HttpServletRequest request);

    RefundQueryResponse refundQuery(RefundQueryParams refundQueryParams);

    String pcPreOrder(PreOrderParams preOrderParams);

}
