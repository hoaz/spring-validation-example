package ua.com.springbyexample.validation;

import ua.com.springbyexample.validation.web.DiscountCouponGenerationCommand;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DiscountCouponValidator implements ConstraintValidator<DiscountCoupon, DiscountCouponGenerationCommand> {
    @Override
    public void initialize(DiscountCoupon constraintAnnotation) {
    }

    @Override
    public boolean isValid(DiscountCouponGenerationCommand command, ConstraintValidatorContext context) {
        return command.getCouponsCount() > 1 || command.getDiscount() == null;
    }
}
