package com.example.demo.validators;
import com.example.demo.domain.Part;
import com.example.demo.validators.ValidPartsInventory;
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
        Integer inventory = part.getInv();
        Integer minInventory = part.getMinInv();
        Integer maxInventory = part.getMaxInv();
        String minMessage = "Inventory must be greater than or equal to Minimum Inventory";
        String maxMessage = "Inventory must be less than or equal to Maximum Inventory";
        boolean isValid = true;

        if (inventory != null && minInventory != null && inventory < minInventory) {
            isValid = false;
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate(minMessage)
                    .addPropertyNode("inv")
                    .addConstraintViolation();
        }

        if (inventory != null && maxInventory != null && inventory > maxInventory) {
            isValid = false;
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate(maxMessage)
                    .addPropertyNode("inv")
                    .addConstraintViolation();
        }

        return isValid;
    }
}
