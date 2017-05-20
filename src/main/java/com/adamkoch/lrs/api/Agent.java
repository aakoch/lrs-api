package com.adamkoch.lrs.api;

import java.util.Optional;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#2421-when-the-actor-objecttype-is-agent">Agent</a>.
 *
 * <p>"An Agent (an individual) is a persona or system."</p>
 *
 * <p>An Agent MUST be identified by one (1) of the four types of Inverse Functional Identifiers (see 4.1.2.3 Inverse Functional Identifier);
 An Agent MUST NOT include more than one (1) Inverse Functional Identifier;
 An Agent SHOULD NOT use Inverse Functional Identifiers that are also used as a Group identifier.</p>
 *
 * <p>Created by aakoch on 2017-03-27.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Agent extends Actor {

    @Override
    default Optional<ObjectType> getObjectType() {
        return Optional.of(ObjectType.AGENT);
    }

    InverseFunctionalIdentifier getId();
}
