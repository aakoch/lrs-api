package com.adamkoch.lrs.api;

import javax.json.JsonObject;
import java.util.Map;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#41-extensions">Extensions</a>
 *
 * A map of other properties as needed.
 * The keys of an extensions map MUST be IRIs.
 * The values of an extension can be any JSON value or data structure.
 *
 * <p>Created by aakoch on 2017-05-30.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface Extensions extends Map<InternationalizedResourceIdentifier, JsonObject> {
}
