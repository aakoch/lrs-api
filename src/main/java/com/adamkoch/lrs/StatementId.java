package com.adamkoch.lrs;

import java.util.UUID;

/**
 * <a href="https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#241-id">Statement ID</a>.
 *
 * <p>Created by aakoch on 2017-03-11.</p>
 *
 * @author aakoch
 * @since 1.0.0
 */
public class StatementId {

    private final UUID id;

    StatementId(final UUID id) {
        this.id = id;
    }

    public static StatementId of(final String id) {
        final UUID uuid;
        try {
            uuid = UUID.fromString(id);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(
                    "Invalid statement ID \"" + id
                            + "\". Must be a RFC 4122 UUID. See https://github.com/adlnet/xAPI-Spec/blob/master/xAPI-Data.md#stmtid",
                    e);
        }
        return new StatementId(uuid);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        StatementId that = (StatementId) obj;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }

    @Override
    public String toString() {
        return id.toString();
    }
}
