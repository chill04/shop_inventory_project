package com.example.demo.validators;
import com.example.demo.domain.Part;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InventoryMinMaxValidator implements ConstraintValidator<ValidPartsInventory, Part> {
    @Override
    public void initialize(ValidPartsInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(part == null){
            return true;
        }
        int inventory = part.getInv();
        int minInventory = part.getMinInv();
        int maxInventory = part.getMaxInv();

        return inventory >= minInventory && inventory <= maxInventory;
    }
}
