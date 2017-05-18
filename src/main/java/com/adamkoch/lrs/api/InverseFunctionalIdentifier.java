package com.adamkoch.lrs.api;

import java.util.Optional;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#inversefunctional">Inverse Functional
 * Identifier</a>
 *
 * <p>"An Inverse Functional Identifier (IFI) is a value of an Agent or Identified Group that is guaranteed to only ever
 * refer to that Agent or Identified Group."</p>
 *
 * <pre>
 *     The table below lists all possible Inverse Functional Identifier properties.
 *
 * || Property || Type || Description ||
 * | mbox | mailto IRI | The required format is "mailto:email address". Only email addresses that have only ever been
 * and will ever be assigned to this Agent, but no others, SHOULD be used for this property and mbox_sha1sum. |
 * | mbox_sha1sum | String | The hex-encoded SHA1 hash of a mailto IRI (i.e. the value of an mbox property). An LRS MAY
 * include Agents with a matching hash when a request is based on an mbox. |
 * | openid | URI | An openID that uniquely identifies the Agent. |
 * | account | Object | A user account on an existing system e.g. an LMS or intranet. |
 * </pre>
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface InverseFunctionalIdentifier {

    /**
     * The required format is "mailto:email address". Only email addresses that have only ever been and will ever be
     * assigned to this Agent, but no others, SHOULD be used for this property and mbox_sha1sum.
     */
    Optional<MailToIRI> getMBox();

    /**
     * The hex-encoded SHA1 hash of a mailto IRI (i.e. the value of an mbox property). An LRS MAY include Agents with a
     * matching hash when a request is based on an mbox.
     */
    Optional<Sha1Sum> getMboxSha1Sum();

    /**
     * An openID that uniquely identifies the Agent.
     */
    Optional<OpenId> getOpenId();

    /**
     * A user account on an existing system e.g. an LMS or intranet.
     */
    Optional<Account> getAccount();
}
