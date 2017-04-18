package com.adamkoch.lrs.api;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#details-3">Groups</a>
 *
 * <pre>An Anonymous Group is used describe a cluster of people where there is no ready identifier for this cluster,
 * e.g. an ad hoc team.
 *
 * The table below lists all properties of an Anonymous Group.
 *
 * Property	Type	Description	Required
 * objectType	String	Group.	Required
 * name	String	Name of the Group.	Optional
 * member	Array of Agent Objects	The members of this Group. This is an unordered list.</pre>
 *
 * <p>A Learning Record Consumer MUST consider each Anonymous Group distinct even if it has an identical set of
 * members.</p>
 *
 * <p>An Anonymous Group MUST include a "member" property listing constituent Agents. An Anonymous Group MUST NOT
 * contain Group Objects in the "member" identifiers.</p>
 *
 * <p>Created by aakoch on 2017-04-17.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface AnonymousGroup extends Group {
}
