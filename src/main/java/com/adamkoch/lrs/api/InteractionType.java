package com.adamkoch.lrs.api;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#interaction-types">Interaction Types</a>.
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public enum InteractionType {

    /**
     * An interaction with two possible responses: true or false.
     */
    TRUE_FALSE("true-false"),

    /**
     * An interaction with a number of possible choices from which the learner can select. This includes interactions in
     * which the learner can select only one answer from the list and those where the learner can select multiple
     * items.
     */
    CHOICE("choice"),

    /**
     * An interaction which requires the learner to supply a short responses in the form of one or more strings of
     * characters. Typically, the correct responses consists of part of a word, one word or a few words. "Short" means
     * that the correct responses pattern and learner responses strings will normally be 250 characters or less.
     */
    FILL_IN("fill-in"),

    /**
     * An interaction which requires the learner to supply a responses in the form of a long string of characters. "Long"
     * means that the correct responses pattern and learner responses strings will normally be more than 250 characters.
     */
    LONG_FILL_IN("long-fill-in"),

    /**
     * An interaction where the learner is asked to match items in one set (the source set) to items in another set (the
     * target set). Items do not have to pair off exactly and it is possible for multiple or zero source items to be
     * matched to a given target and vice versa.
     */
    MATCHING("matching"),

    /**
     * An interaction that requires the learner to perform a task that requires multiple steps.
     */
    PERFORMANCE("performance"),

    /**
     * An interaction where the learner is asked to order items in a set.
     */
    SEQUENCING("sequencing"),

    /**
     * An interaction which asks the learner to select from a discrete set of choices on a scale.
     */
    LIKERT("likert"),

    /**
     * Any interaction which requires a numeric responses from the learner.
     */
    NUMERIC("numeric"),

    /**
     * Another type of interaction that does not fit into those defined above.
     */
    OTHER("other");

    private final String stringRepresentation;

    InteractionType(final String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
