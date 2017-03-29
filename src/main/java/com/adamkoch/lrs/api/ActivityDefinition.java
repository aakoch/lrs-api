package com.adamkoch.lrs.api;

import com.adamkoch.lrs.annotations.Optional;
import com.adamkoch.lrs.annotations.Recommended;

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
    @Recommended
    LanguageMap getName();

    /**
     * A description of the Activity.
     */
    @Recommended
    LanguageMap getDescription();

    /**
     * The type of Activity.
     */
    @Recommended
    InternationalizedResourceIdentifier getType();

    /**
     * Resolves to a document with human-readable information about the Activity, which could include a way to launch
     * the activity.
     */
    @Optional
    InternationalizedResourceLocator getMoreInfo();

    /**
     * A map of other properties as needed.
     */
    @Optional
    LrsObject getExtensions();

    Collection<InteractionActivity> getInteractionActivities();
}
