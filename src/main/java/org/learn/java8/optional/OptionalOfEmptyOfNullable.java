package org.learn.java8.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalOfEmptyOfNullable {
    public static void main(String[] args) {

        System.out.println("Optional class ofNullable() with Parameter: "+ofNullableWithParameter().get()); // Rohan
        System.out.println("Optional class ofNullable() without parameter: "+ofNullableWithoutParameter()); // Optional.emtpy
        //System.out.println("Optional class ofNullable() without parameter: "+ofNullableWithoutParameter().get()); // NoSuchElementException
        System.out.println("Optional class ofNullable() without parameter: "+ofNullableWithoutParameter().isPresent()); // false
        System.out.println("==================================");
        System.out.println("Optional class of() with paramter: "+ofwithParameter().get()); // Rohan
        //System.out.println("Optional class of() with out paramter: "+ofwithoutParameter()); // NullPointerException
        //System.out.println("Optional class of() with out paramter: "+ofwithoutParameter().get()); NullPointerException
        //System.out.println("Optional class of() with out paramter: "+ofwithoutParameter().isPresent()); // NullPointerException
        System.out.println("==================================");
        System.out.println("Optional class empty(): "+empty()); // Optional.empty
        //System.out.println("Optional class empty(): "+empty().get()); //NoSuchElementException
    }
    public static Optional<String> ofNullableWithParameter() {
        Optional<String> optionalOfNullable = Optional.ofNullable("Rohan");
        return optionalOfNullable;
    }
    public static Optional<String> ofNullableWithoutParameter() {
        Optional<String> optionalOfNullablewithNull = Optional.ofNullable(null);
        return optionalOfNullablewithNull;
    }

    public static Optional<String> ofwithParameter() {
        return Optional.of("Rohan");
    }
    public static Optional<String> ofwithoutParameter() {
        return Optional.of(null);
    }
    public static Optional<String> empty() {
        return Optional.empty();
    }
}

