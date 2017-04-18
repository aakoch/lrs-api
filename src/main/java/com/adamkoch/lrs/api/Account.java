package com.adamkoch.lrs.api;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#2424-account-object">Account</a>.
 *
 * <p>"A user account on an existing system, such as a private system (LMS or intranet) or a public system (social
 * networking site)."</p>
 *
 * <p>"A user account on an existing system e.g. an LMS or intranet."</p>
 *
 * <p>Created by aakoch on 2017-04-14.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Account extends InverseFunctionalIdentifier, LrsObject {
    /**
     * The canonical home page for the system the account is on. This is based on FOAF's accountServiceHomePage.
     */
    InternationalizedResourceLocator getHomePage();

    /**
     * The unique id or name used to log in to this account. This is based on FOAF's accountName.
     */
    String getName();
}
