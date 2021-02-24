package by.academy.hw.hw3.deal.products;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD})
public @interface Producer {
    int startYear();

    String country();

    String founderFullName();
}
