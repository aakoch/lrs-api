package com.adamkoch.lrs.api;

import java.util.Optional;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#242-actor">Actor</a>.
 *
 * <p>"The Actor defines who performed the action. The Actor of a Statement can be an Agent or a Group."</p>
 *
 * <p>Created by aakoch on 2017-03-11.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Actor {

    String getName();

    Optional<String> getObjectType();
}
