package com.adamkoch.lrs.api;

/**
 * <p>"An openID that uniquely identifies the Agent."</p>
 *
 * <p>"openid - An OpenID for an Agent.<br>
 * Status:	testing<br>
 * Domain:	having this property implies being a Agent<br>
 * Range:	every value of this property is a Document"</p>
 *
 * <p>Inverse Functional Property</p>
 *
 * <p>"A openid is a property of a Agent that associates it with a document that can be used as an indirect
 * identifier in the manner of the OpenID "Identity URL". As the OpenID 1.1 specification notes, OpenID itself 'does
 * not provide any mechanism to exchange profile information, though Consumers of an Identity can learn more about an
 * End User from any public, semantically interesting documents linked thereunder (FOAF, RSS, Atom, vCARD, etc.)'.
 * In this way, FOAF and OpenID complement each other; neither provides a stand-alone approach to online 'trust', but
 * combined they can address interesting parts of this larger problem space."</p>
 *
 * <p>"The openid property is 'inverse functional', meaning that anything that is the foaf:openid of something, is the
 * openid of no more than one thing. FOAF is agnostic as to whether there are (according to the relevant OpenID
 * specifications) OpenID URIs that are equally associated with multiple Agents. FOAF offers sub-classes of Agent, ie.
 * Organization and Group, that allow for such scenarios to be consistent with the notion that any foaf:openid is the
 * foaf:openid of just one Agent."</p>
 *
 * <p>"FOAF does not mandate any particular URI scheme for use as openid values. The OpenID 1.1 specification includes a
 * delegation model that is often used to allow a weblog or homepage document to also serve in OpenID authentication via
 * 'link rel' HTML markup. This deployment model provides a convenient connection to FOAF, since a similar technique is
 * used for FOAF autodiscovery in HTML. A single document can, for example, serve both as a homepage and an OpenID
 * identity URL."</p>
 *
 * <p>Created by aakoch on 2017-04-15.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface OpenId extends InverseFunctionalIdentifier, UniformResourceIdentifier {
}
