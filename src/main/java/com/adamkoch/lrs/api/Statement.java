package com.adamkoch.lrs.api;

import com.adamkoch.lrs.StatementId;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#20-statements">Statement</a>.
 *
 * <p>Created by aakoch on 2017-03-27.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Statement {

    /**
     * ID is an exception to the immutability rule.
     */
    StatementId getId();

    /**
     * Timestamp is an exception to the immutability rule.
     */
    LocalDateTime getTimestamp();

    /**
     * Does the immutability rule mean there should be no setter?
     * A Statement MUST use "actor", "verb", and "object".
     */
    Actor getActor();

    /**
     * Does the immutability rule mean there should be no setter?
     * A Statement MUST use "actor", "verb", and "object".
     *
     * Valid values are: Activity, Agent, Group, SubStatement or StatementRef
     */
    LrsObject getObject();

    /**
     * Does the immutability rule mean there should be no setter?
     * A Statement MUST use "actor", "verb", and "object".
     */
    com.adamkoch.lrs.api.Verb getVerb();

    /**
     * Does the immutability rule mean there should be no setter?
     */
    Result getResult();

    /**
     * Does the immutability rule mean there should be no setter?
     */
    Context getContext();

    /**
     * Authority is an exception to the immutability rule.
     */
    Authority getAuthority();

    /**
     * Version is an exception to the immutability rule.
     * Not recommended
     */
    String getVersion();

    /**
     * Stored is an exception to the immutability rule.
     * Set by LRS.
     */
    LocalDateTime getStored();

    /**
     * Attachments are an exception to the immutability rule.
     */
    Collection getAttachments();
}
