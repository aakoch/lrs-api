package com.adamkoch.lrs.api;

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
        for (ObjectType objectType : values()) {
            if (objectType.toString().equals(type)) {
                return objectType;
            }
        }

        throw new IllegalArgumentException("type \"" + type + "\" not found");
    }

    @Override
    public String toString() {
        return value;
    }
}
