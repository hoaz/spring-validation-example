package ua.com.springbyexample.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = {CouponCodeValidator.class})
public @interface CouponCode {
    Class<? extends Payload>[] payload() default {};
    String message() default "{ua.com.springbyexample.validation.CouponCode.message}";
    Class<?>[] groups() default {};
}
