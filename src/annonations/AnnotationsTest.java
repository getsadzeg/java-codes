
package annonations;

//some reflection examples

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@SuppressWarnings("unckecked")
public class AnnotationsTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = MyAnnotations.class;
        Annotation[] annotations = c.getAnnotations();
        System.out.println(annotations.length);
        for(Annotation annotation : annotations) {
            if(annotation instanceof Target) {
                Target t = (Target)annotation;
                for(ElementType elementType : t.value()) {
                    System.out.println(elementType);
                }
            }
            else if(annotation instanceof Retention) {
                Retention r = (Retention) annotation;
                System.out.println(r.value());
            }
        }
    }
}
