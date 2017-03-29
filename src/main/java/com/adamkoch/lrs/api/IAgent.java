package com.adamkoch.lrs.api;

/**
 * <p>Created by aakoch on 2017-03-27.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface IAgent extends Actor {

    @Override
    default String getObjectType() {
        return ActorType.AGENT.toString();
    }
}
