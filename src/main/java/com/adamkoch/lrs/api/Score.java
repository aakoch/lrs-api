package com.adamkoch.lrs.api;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#2451-score">Score</a>.
 *
 * <p>represents the outcome of a graded Activity achieved by an Agent</p>
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Score {

    /**
     * Decimal	number between -1 and 1, inclusive	The score related to the experience as modified by scaling and/or
     * normalization.
     */
    Number getScaled();

    /**
     * Decimal	number between min and max (if present, otherwise unrestricted), inclusive	The score achieved by the
     * Actor in the experience described by the Statement. This is not modified by any scaling or
     * normalization.
     */
    Number getRaw();

    /**
     * Decimal	number less than max (if present)	The lowest possible score for the experience described by the
     * Statement.
     */
    Number getMin();

    /**
     * Decimal	number greater than min (if present)	The highest possible score for the experience described by the
     * Statement.
     */
    Number getMax();
}
