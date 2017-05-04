package com.adamkoch.lrs.api;

import java.util.Collection;
import java.util.Optional;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#group">When the Actor ObjectType is Group</a>
 *
 * <p>"A Group represents a collection of Agents and can be used in most of the same situations an Agent can be used.
 * There are two types of Groups: Anonymous Groups and Identified Groups."</p>
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Group extends Actor, LrsObject {

    @Override
    default Optional<ObjectType> getObjectType() {
        return Optional.of(ObjectType.GROUP);
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
