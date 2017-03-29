package com.adamkoch.lrs.api;

import com.adamkoch.lrs.annotations.Required;

import java.util.UUID;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#stmtref">Statement References</a>
 *
 * <p>Created by aakoch on 2017-03-27.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface StatementReference {

    @Required
    default String getObjectType() {
        return "StatementRef";
    }

    @Required
    UUID getId();
}
