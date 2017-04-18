package com.adamkoch.lrs.api;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#243-verb">Verb</a>.
 *
 * <p>"The Verb defines the action between an Actor and an Activity."</p>
 *
 * <p>Created by aakoch on 2017-04-14.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Verb {
    InternationalizedResourceIdentifier getId();

    /**
     * "When queried for Statements with a Format of exact, the LRS MUST return the "display" property exactly as
     * included (or omitted) within the Statement. When queried for Statements with a Format of ids, the LRS SHOULD* NOT
     * include the "display" property. When queried for Statements with a Format of canonical, the LRS SHOULD* return a
     * canonical Display for that Verb. The LRS may determine its canonical Display based on the Verb's "display"
     * property included within Statements it receives, the "name" property included in the metadata as described in 3.2
     * Hosted Metadata, or the Verb's Display as defined in some other location."
     */
    LanguageMap getDisplay();
}
