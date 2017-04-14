package com.adamkoch.lrs.api;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#interaction-activities">Interaction Activities</a>.
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface InteractionActivity {

    InteractionType getInteractionType();

    ResponsePattern getCorrectResponsesPattern();
}
