package com.adamkoch.lrs.api;

import java.util.Optional;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#243-verb">Verb</a>.
 *
 * Description
 *
 * The Verb defines the action between an Actor and an Activity.
 *
 * Rationale
 *
 * The Verb in an xAPI Statement describes the action performed during the learning experience. The xAPI does not
 * specify any particular Verbs. (With one exception, namely the reserved Verb http://adlnet.gov/expapi/verbs/voided).
 * Instead, it defines how to create Verbs so that communities of practice can establish Verbs meaningful to their
 * members and make them available for use by anyone. A predefined list of Verbs would be limited by definition and
 * might not be able to effectively capture all possible future learning experiences.
 *
 * Details
 *
 * Verbs appear in Statements as Objects consisting of an IRI and a set of display names corresponding to multiple
 * languages or dialects which provide human-readable meanings of the Verb.
 *
 * <p>"The Verb defines the action between an Actor and an Activity."</p>
 *
 * <p>Created by aakoch on 2017-04-14.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Verb {
    /**
     * Corresponds to a Verb definition. Each Verb definition corresponds to the meaning of a Verb, not the word.
     */
    InternationalizedResourceIdentifier getId();

    /**
     * "The human readable representation of the Verb in one or more languages. This does not have any impact on the
     * meaning of the Statement, but serves to give a human-readable display of the meaning already determined by the
     * chosen Verb."
     *
     * The requirements below relate to the "display" property as returned by the LRS via the API.
     * <ul><li>"When queried for Statements with a Format of 'exact', the LRS MUST return the 'display' property
     * exactly as included (or omitted) within the Statement.</li>
     * <li>When queried for Statements with a Format of 'ids', the LRS *SHOULD* NOT include the 'display' property.
     * </li>
     * <li> When queried for Statements with a Format of 'canonical', the LRS *SHOULD* return a canonical Display for
     * that Verb. </li>
     * <li>The LRS may determine its canonical Display based on the Verb's
     * 'display' property included within Statements it receives, the 'name' property included in the metadata as
     * described in 3.2 Hosted Metadata, or the Verb's Display as defined in some other location."</li></ul>
     *
     * "The 'display' property SHOULD be used by all Statements."
     */
    Optional<LanguageMap> getDisplay();
}
