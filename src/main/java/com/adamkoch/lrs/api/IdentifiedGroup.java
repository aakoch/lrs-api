package com.adamkoch.lrs.api;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#details-3">Groups</a>
 *
 * <pre>An Identified Group is used to uniquely identify a cluster of Agents.

 The table below lists all properties of an Identified Group.

 Property	Type	Description	Required
 objectType	String	Group.	Required
 name	String	Name of the Group.	Optional
 member	Array of Agent Objects	The members of this Group. This is an unordered list.	Optional
 see 4.1.2.3 Inverse Functional Identifier	An Inverse Functional Identifier unique to the Group.	Required
 </pre>
 *
 * <p>Created by aakoch on 2017-04-17.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface IdentifiedGroup extends Group {

    InverseFunctionalIdentifier getId();

}
