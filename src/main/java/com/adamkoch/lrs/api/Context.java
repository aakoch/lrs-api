package com.adamkoch.lrs.api;

import java.util.Map;
import java.util.UUID;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#context">Context</a>.
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Context {

    /**
     * The registration that the Statement is associated with.
     */
    UUID getRegistration();

    /**
     * Instructor that the Statement relates to, if not included as the Actor of the Statement.
     */
    Agent getInstructor();

    /**
     * Team that this Statement relates to, if not included as the Actor of the Statement.
     */
    Group getTeam();

    /**
     * A map of the types of learning activity context that this Statement is related to. Valid context types are:
     * parent, "grouping", "category" and "other".
     */
    Map getContextActivities();

    /**
     * Revision of the learning activity associated with this Statement. Format is free.
     */
    String getRevision();

    /**
     * Platform used in the experience of this learning activity.
     */
    String getPlatform();

    /**
     * (as defined in RFC 5646)	Code representing the language in which the experience being recorded in this Statement
     * (mainly) occurred in, if applicable and known.
     */
    String getLanguage();

    /**
     * Reference	Another Statement to be considered as context for this Statement.
     */
    StatementReference getStatementReference();

    /**
     * A map of any other domain-specific context relevant to this Statement. For example, in a flight simulator
     * altitude, airspeed, wind, attitude, GPS coordinates might all be relevant (See Extensions)
     */
    Map getExtensions();
}
