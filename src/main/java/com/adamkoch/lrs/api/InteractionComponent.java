package com.adamkoch.lrs.api;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#interaction-components">Interaction Components</a>.
 *
 * <p>Created by aakoch on 2017-03-27.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface InteractionComponent {

    void getId();

    LanguageMap getDescription();
}
