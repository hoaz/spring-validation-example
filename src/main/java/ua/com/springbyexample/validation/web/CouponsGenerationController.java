package ua.com.springbyexample.validation.web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import ua.com.springbyexample.validation.domain.CouponJson;
import ua.com.springbyexample.validation.service.CouponsService;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class CouponsGenerationController {

    @Resource
    private CouponsService couponsService;

    @RequestMapping(value = "/generate", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Collection<CouponJson> generateDiscountCoupons(@Valid @RequestBody DiscountCouponGenerationCommand command) {
        return couponsService.generateDiscountCoupons(command.getDiscount(), command.getCouponsCount(), command.getCouponCode());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public List<String> handleValidationError(MethodArgumentNotValidException e) {
        List<String> errorMessages = new ArrayList<String>();
        for (ObjectError objectError : e.getBindingResult().getAllErrors()) {
            errorMessages.add(buildMessage(objectError));
        }
        return errorMessages;
    }

    private String buildMessage(ObjectError objectError) {
        if (objectError instanceof FieldError) {
            return ((FieldError) objectError).getField() + ": " + objectError.getDefaultMessage();
        } else {
            return objectError.getDefaultMessage();
        }
    }
}
