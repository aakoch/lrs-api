package com.adamkoch.lrs.api;

import java.util.Collection;
import java.util.Optional;

/**
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Group extends Actor {

    @Override
    default Optional<String> getObjectType() {
        return Optional.of(ActorType.GROUP.toString());
    }

    /**
     * Zero or more agents.
     *
     * An Anonymous Group MUST include a "member" property listing constituent Agents.
     * An Identified Group MAY include a "member" property listing constituent Agents.
     *
     * A Group MUST NOT contain Group Objects in the "member" identifiers.
     */
    Collection<Agent> getMember();
}
