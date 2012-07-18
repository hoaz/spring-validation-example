package ua.com.springbyexample.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = {DiscountCouponValidator.class})public @interface DiscountCoupon {
    Class<? extends Payload>[] payload() default {};
    String message() default "{ua.com.springbyexample.validation.DiscountCoupon.message}";
    Class<?>[] groups() default {};
}
