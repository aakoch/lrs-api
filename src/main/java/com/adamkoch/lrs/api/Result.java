package com.adamkoch.lrs.api;

import com.adamkoch.lrs.annotations.Optional;

import java.time.Duration;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#245-result">Result</a>.
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Result {

    /**
     * The score of the Agent in relation to the success or quality of the experience. See: Score
     */
    @Optional
    Score getScore();

    /**
     * Indicates whether or not the attempt on the Activity was successful.
     *
     * @return If defined, Boolean.TRUE or Boolean.FALSE. Null means undefined.
     */
    @Optional
    Boolean getSuccess();

    /**
     * Indicates whether or not the Activity was completed.
     *
     * @return If defined, Boolean.TRUE or Boolean.FALSE. Null means undefined.
     */
    @Optional
    Boolean getCompletion();

    /**
     * A responses appropriately formatted for the given Activity.
     */
    @Optional
    String getResponse();

    /**
     * Period of time over which the Statement occurred.
     */
    @Optional
    Duration getDuration();

    /**
     * A map of other properties as needed. See: Extensions
     */
    @Optional
    LrsObject getExtensions();
}
