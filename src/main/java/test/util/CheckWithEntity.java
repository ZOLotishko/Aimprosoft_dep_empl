package test.util;

import net.sf.oval.constraint.CheckWithCheck;

/**
 * Created on 08.04.16.
 */
public class CheckWithEntity implements CheckWithCheck.SimpleCheck {
    @Override
    public boolean isSatisfied(Object o, Object o1) {


        return false;
    }
}
