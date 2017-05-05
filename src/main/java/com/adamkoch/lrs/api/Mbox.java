package com.adamkoch.lrs.api;

/**
 * <a href="http://xmlns.com/foaf/spec/#term_mbox">Mbox</a>
 *
 * <p>Note: "The domain portions of email addresses are case insensitive. Clients SHOULD use lowercase for the domain
 * portion of the email address when calculating the SHA1 hash for the "mbox_sha1sum" property."</p>
 *
 * <p>Created by aakoch on 2017-04-15.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Mbox extends InverseFunctionalIdentifier {

    Sha1Sum getSha1Sum();

}
