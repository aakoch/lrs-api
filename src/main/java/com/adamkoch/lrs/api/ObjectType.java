package com.adamkoch.lrs.api;

import java.util.Arrays;

/**
 * <p>Created by aakoch on 2017-05-03.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public enum ObjectType {
    ACTIVITY("Activity"),
    AGENT("Agent"),
    GROUP("Group"),
    SUBSTATEMENT("SubStatement"),
    STATEMENTREF("StatementRef");

    private final String value;

    ObjectType(final String value) {
        this.value = value;
    }

    public static ObjectType of(String type) {
        return Arrays.stream(values())
                     .filter(objectType -> objectType.value.equals(type) || objectType.value.toUpperCase().equals(type))
                     .findFirst()
                     .orElseThrow(
                             () -> new IllegalArgumentException
                                     ("Type \"" + type + "\" not found"));
    }

    @Override
    public String toString() {
        return value;
    }
}
