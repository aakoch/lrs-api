package com.adamkoch.lrs.api;

import java.util.Collection;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#activity-definition">Activity Definition</a>.
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface ActivityDefinition {

    /**
     * The human readable/visual name of the Activity.
     */
    LanguageMap getName();

    /**
     * A description of the Activity.
     */
    LanguageMap getDescription();

    /**
     * The type of Activity.
     */
    InternationalizedResourceIdentifier getType();

    /**
     * Resolves to a document with human-readable information about the Activity, which could include a way to launch
     * the activity.
     */
    InternationalizedResourceLocator getMoreInfo();

    /**
     * A map of other properties as needed.
     * The keys of an extensions map MUST be IRIs.
     * The values of an extension can be any JSON value or data structure.
     */
    Extensions getExtensions();

    Collection<InteractionActivity> getInteractionActivities();
}
