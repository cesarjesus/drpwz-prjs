package datasrv;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class DSrvConfiguration extends Configuration {
    // TODO: implement service configuration

    @NotEmpty
    private String element;

    @NotEmpty
    private String defaultElement = "root";

    @JsonProperty
    public String getElement() {
        return element;
    }

    @JsonProperty
    public void setElement(String element) {
        this.element = element;
    }

    @JsonProperty
    public String getDefaultElement() {
        return defaultElement;
    }

    @JsonProperty
    public void setDefaultElement(String defElem) {
        this.defaultElement = defElem;
    }
}
