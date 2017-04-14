package com.adamkoch.lrs.api;

import java.util.Optional;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#2421-when-the-actor-objecttype-is-agent">Agent</a>.
 *
 * <p>An Agent (an individual) is a persona or system.</p>
 *
 * <p>Created by aakoch on 2017-03-27.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Agent extends Actor, LrsObject {

    @Override
    default Optional<String> getObjectType() {
        return Optional.of(ActorType.AGENT.toString());
    }
}
