package ua.com.springbyexample.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CouponCodeValidator implements ConstraintValidator<CouponCode, String> {

    private static final String COUPON_PREFIX = "CP";
    private static final int COUPON_LENGTH = 10;

    @Override
    public void initialize(CouponCode constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.length() == COUPON_LENGTH && value.startsWith(COUPON_PREFIX);
    }
}
