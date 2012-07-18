package ua.com.springbyexample.validation.web;

import ua.com.springbyexample.validation.CouponCode;
import ua.com.springbyexample.validation.DiscountCoupon;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import java.math.BigInteger;

@DiscountCoupon
public class DiscountCouponGenerationCommand {

    @Min(1)
    private int couponsCount;

    @Digits(integer = 3, fraction = 2)
    private BigInteger discount;

    @CouponCode
    private String couponCode;

    public BigInteger getDiscount() {
        return discount;
    }

    public int getCouponsCount() {
        return couponsCount;
    }

    public void setCouponsCount(int couponsCount) {
        this.couponsCount = couponsCount;
    }

    public void setDiscount(BigInteger discount) {
        this.discount = discount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
}
