package com.adamkoch.lrs.api;

/**
 * <p>Created by aakoch on 2017-04-24.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public interface JsonDeserializable<T> {
    T fromJson(String json);
}
