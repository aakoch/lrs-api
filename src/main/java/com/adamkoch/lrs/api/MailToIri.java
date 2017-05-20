package com.adamkoch.lrs.api;

/**
 * <a href="http://xmlns.com/foaf/spec/#term_mbox">foaf:mbox</a>
 *
 * <p>Created by aakoch on 2017-03-23.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface MailToIri extends InternationalizedResourceIdentifier {
    String getDomain();

    String getUserName();
}
