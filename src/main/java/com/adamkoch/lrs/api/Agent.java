package com.adamkoch.lrs.api;

import com.adamkoch.lrs.annotations.Optional;
import com.adamkoch.lrs.annotations.Required;
import com.adamkoch.lrs.api.Actor;
import com.adamkoch.lrs.api.InverseFunctionalIdentifier;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#2421-when-the-actor-objecttype-is-agent">Agent</a>.
 *
 * <p>An Agent (an individual) is a persona or system.</p>
 *
 * Created by aakoch on 2017-03-22.
 *
 * @author aakoch
 * @since 1.0.0
 */
public abstract class Agent implements IAgent {

    @Required
    private InverseFunctionalIdentifier id;

    /**
     * This property is optional except when the Agent is used as a Statement's object.
     */
    @Optional
    public String getObjectType() {
        return "Agent";
    }

    public InverseFunctionalIdentifier getId() {
        return id;
    }

    public void setId(InverseFunctionalIdentifier id) {
        this.id = id;
    }
}
