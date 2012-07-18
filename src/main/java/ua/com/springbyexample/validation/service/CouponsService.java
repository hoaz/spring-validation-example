package ua.com.springbyexample.validation.service;

import org.springframework.stereotype.Service;
import ua.com.springbyexample.validation.domain.CouponJson;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;

@Service
public class CouponsService {
    public Collection<CouponJson> generateDiscountCoupons(BigInteger discount, int couponsCount, String couponCode) {
        return Collections.nCopies(couponsCount, new CouponJson(discount, couponCode));
    }
}
