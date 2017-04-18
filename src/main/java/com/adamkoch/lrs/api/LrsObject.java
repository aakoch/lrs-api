package com.adamkoch.lrs.api;

/**
 * <h1><a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#244-object">Object</a></h1>
 *
 * <p>The Object defines the thing that was acted on. The LrsObject of a Statement can be an Activity,
 * Agent/Group, SubStatement, or Statement Reference.</p>
 *
 * <h2>Some examples:</h2>
 *
 * <p>The Object is an Activity: "Jeff wrote an essay about hiking."</p>
 *
 * <p>The Object is an Agent: "Nellie interviewed Jeff."</p>
 *
 * <p>The Object is a SubStatement or Statement Reference (different implementations, but similar when human-read):
 * "Nellie commented on 'Jeff wrote an essay about hiking.'"</p>
 *
 * <h2>Details</h2>
 *
 * <p>Objects which are provided as a value for this property SHOULD include an "objectType" property. If not specified,
 * the objectType is assumed to be Activity. Other valid values are: Agent, Group, SubStatement or StatementRef. The
 * properties of an Object change according to the objectType.</p>
 *
 * <p>Created by aakoch on 2017-03-22.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface LrsObject {
    java.util.Optional<String> getObjectType();
}
