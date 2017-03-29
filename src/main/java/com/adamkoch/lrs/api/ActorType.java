package com.adamkoch.lrs.api;

/**
 * Created by aakoch on 2017-03-27.
 *
 * @author aakoch
 * @since 1.0.0
 */
public enum ActorType {
    AGENT("Agent"),
    GROUP("Group");

    private final String value;

    ActorType(String value) {
        this.value = value;
    }

    public static ActorType of(String type) {
        for (ActorType actorType : values()) {
            if (actorType.toString().equals(type)) {
                return actorType;
            }
        }

        throw new IllegalArgumentException("type \"" + type + "\" not found");
    }

    @Override
    public String toString() {
        return value;
    }
}
