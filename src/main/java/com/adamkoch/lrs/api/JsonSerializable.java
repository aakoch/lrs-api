package com.adamkoch.lrs.api;

import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 * <p>Created by aakoch on 2017-04-24.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface JsonSerializable {
    JsonObject toJson(JsonObjectBuilder builder);
}
