package com.adamkoch.lrs.api;

import com.adamkoch.lrs.annotations.Optional;
import com.adamkoch.lrs.annotations.Recommended;
import com.adamkoch.lrs.annotations.Required;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#interaction-components">Interaction Components</a>.
 *
 * <p>Created by aakoch on 2017-03-27.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface InteractionComponent {
    @Required
    void getId();

    @Optional
    LanguageMap getDescription();
}
