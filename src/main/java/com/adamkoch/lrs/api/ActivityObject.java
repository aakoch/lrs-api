package com.adamkoch.lrs.api;

import java.util.Optional;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#2441-when-the-objecttype-is-activity">Object of
 * type Activity</a>.
 *
 * <p>A Statement can represent an Activity as the Object of the Statement. The following table lists the Object
 * properties in this case.</p>
 *
 * <pre>
 * Property     Type     Description                                 Required
 * objectType   String   MUST be Activity when presentOptional
 * id           IRI      An identifier for a single unique Activity  Required
 * definition   Object   Metadata, See below                         Optional
 * </pre>
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface ActivityObject extends LrsObject {

    /**
     * MUST be Activity when present.
     */
    default Optional<ObjectType> getObjectType() {
        return Optional.of(ObjectType.ACTIVITY);
    }

    /**
     * An identifier for a single unique Activity.
     */
    InternationalizedResourceIdentifier getId();

    /**
     */
    ActivityDefinition getDefinition();
}
