package test.validate;

import java.util.Map;

/**
 * Created on 06.04.16.
 */
public interface Validate {

    Map<String, String> getMessagesMap();
    void validate();
}
