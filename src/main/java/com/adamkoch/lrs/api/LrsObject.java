package com.adamkoch.lrs.api;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#244-object">LrsObject</a> <p>The LrsObject
 * defines the thing that was acted on. The LrsObject of a Statement can be an Activity, Agent/Group, SubStatement, or
 * Statement Reference.
 *
 * Some examples:
 *
 * The LrsObject is an Activity: "Jeff wrote an essay about hiking."
 *
 * The LrsObject is an Agent: "Nellie interviewed Jeff."
 *
 * The LrsObject is a SubStatement or Statement Reference (different implementations, but similar when human-read):
 * "Nellie commented on 'Jeff wrote an essay about hiking.'"
 *
 * Details
 *
 * Objects which are provided as a value for this property SHOULD include an "objectType" property. If not specified,
 * the objectType is assumed to be Activity. Other valid values are: Agent, Group, SubStatement or StatementRef. The
 * properties of an LrsObject change according to the objectType.</p>
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface LrsObject {
    java.util.Optional<String> getObjectType();
}
