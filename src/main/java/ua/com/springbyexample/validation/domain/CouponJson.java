package ua.com.springbyexample.validation.domain;

import java.math.BigInteger;
import java.util.List;

public class CouponJson {
    private BigInteger discount;
    private String couponCode;

    public CouponJson(BigInteger discount, String couponCode) {
        this.discount = discount;
        this.couponCode = couponCode;
    }

    public BigInteger getDiscount() {
        return discount;
    }

    public String getCouponCode() {
        return couponCode;
    }
}
