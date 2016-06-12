
package Property;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Student {
    private StringProperty nameProperty = new SimpleStringProperty(this, "name", "");

    public StringProperty getNameProperty() {
        return nameProperty;
    }

    public void setNameProperty(StringProperty nameProperty) {
        this.nameProperty = nameProperty;
    }
    public String getName() {
        return nameProperty.get();
    }
    public void setName(String name) {
        nameProperty.set(name);
    }
}
