package com.adamkoch.lrs.api;

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
    Score getScore();

    /**
     * Indicates whether or not the attempt on the Activity was successful.
     *
     * @return If defined, Boolean.TRUE or Boolean.FALSE. Null means undefined.
     */
    Boolean getSuccess();

    /**
     * Indicates whether or not the Activity was completed.
     *
     * @return If defined, Boolean.TRUE or Boolean.FALSE. Null means undefined.
     */
    Boolean getCompletion();

    /**
     * A responses appropriately formatted for the given Activity.
     */
    String getResponse();

    /**
     * Period of time over which the Statement occurred.
     *
     * "Due to variable lengths of months, years and even minutes and the flexible nature of the 'timestamp' property as
     * representing either the start, middle or end of the experience, it is not possible for an LRS to accurately
     * deserialize the Result Duration and convert between units of time. For this reason, the Result Duration is
     * considered a string for purposes of Statement comparison."
     */
    Duration getDuration();

    /**
     * A map of other properties as needed. See: Extensions
     */
    LrsObject getExtensions();
}
