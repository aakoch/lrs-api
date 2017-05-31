package com.adamkoch.lrs.api;

/**
 * <h1>This is not yet implemented and more research into this needs to be done.</h1>
 *
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#authority">Authority</a>.
 *
 * <p>"The authority property provides information about whom or what has asserted that this Statement is true."</p>
 *
 * <p>"Authority MUST be an Agent, except in 3-legged OAuth, where it MUST be a Group with two Agents. The two Agents
 * represent an application and user together."</p>
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Authority extends Actor {
    InverseFunctionalIdentifier getId();
}
