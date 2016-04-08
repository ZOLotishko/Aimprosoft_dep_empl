package test.validation;


import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import net.sf.oval.context.FieldContext;
import net.sf.oval.context.OValContext;
import test.exeption.ValidationException;


import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 08.04.16.
 */
public class MyValidation {

    private Validator validator = new Validator();

    public void valid(Object object) throws ValidationException {

        List<ConstraintViolation> violations = validator.validate(object);

        Map<String,String> map = new HashMap<>();

        if(violations.size() != 0){
            for(ConstraintViolation constraintViolation : violations){
                OValContext context = constraintViolation.getContext();
                if (context instanceof FieldContext) {
                    Field fieldContext = ((FieldContext) context).getField();
                    map.put(fieldContext.getName(), constraintViolation.getMessage());
                }
            }
            throw new ValidationException(map);
        }
    }

}
