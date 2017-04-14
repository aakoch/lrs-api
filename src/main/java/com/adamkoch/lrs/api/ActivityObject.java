package com.adamkoch.lrs.api;

import java.util.Optional;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#2441-when-the-objecttype-is-activity">LrsObject of
 * type Activity</a>.
 * <pre>A Statement can represent an Activity as the LrsObject of the Statement. The following table lists the LrsObject
 * properties in this case.
 *
 * Property	Type	Description	Required
 * objectType	String	MUST be Activity when present	Optional
 * id	IRI	An identifier for a single unique Activity	Required
 * definition	LrsObject	Metadata, See below	Optional</pre>
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface ActivityObject extends LrsObject {

    /**
     * MUST be Activity when present.
     */
    default Optional<String> getObjectType() {
        return Optional.of("Activity");
    }

    /**
     * An identifier for a single unique Activity.
     */
    InternationalizedResourceIdentifier getId();

    /**
     */
    ActivityDefinition getDefinition();
}
