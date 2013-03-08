package javax.json;

/**
 * <code>JsonValue</code> represents an immutable JSON value.
 *
 *
 * <p>A JSON value is one of the following:
 * an object ({@link JsonObject}), an array ({@link JsonArray}),
 * a number ({@link JsonNumber}), a string ({@link JsonString}),
 * {@code true} ({@link JsonValue#TRUE JsonValue.TRUE}), {@code false}
 * ({@link JsonValue#FALSE JsonValue.FALSE}),
 * or {@code null} ({@link JsonValue#NULL JsonValue.NULL}).
 *
 * @author Jitendra Kotamraju
 */
public interface JsonValue {

    /**
     * Indicates the type of a {@link JsonValue} object.
     */
    enum ValueType {
        /**
         * JSON array.
         */
        ARRAY,

        /**
         * JSON object.
         */
        OBJECT,

        /**
         * JSON string.
         */
        STRING,

        /**
         * JSON number.
         */
        NUMBER,

        /**
         * JSON true.
         */
        TRUE,

        /**
         * JSON false.
         */
        FALSE,

        /**
         * JSON null.
         */
        NULL
    }

    /**
     * JSON null value.
     */
    static final JsonValue NULL = new JsonValue() {
        @Override
        public ValueType getValueType() {
            return ValueType.NULL;
        }

        /**
         * Compares the specified object with this {@link JsonValue#NULL}
         * object for equality. Returns {@code true} if and only if the
         * specified object is also a {@code JsonValue}, and their
         * {@link #getValueType()} objects are <i>equal</i>.
         *
         * @param obj the object to be compared for equality with this
         *      {@code JsonValue}
         * @return {@code true} if the specified object is equal to this
         *      {@code JsonValue}
         */
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JsonValue) {
                return getValueType().equals(((JsonValue)obj).getValueType());
            }
            return false;
        }

        /**
         * Returns the hash code value for this {@link JsonValue#NULL} object.
         * The hash code of the {@link JsonValue#NULL} object is defined to be
         * its {@link #getValueType()} object's hash code.
         *
         * @return the hash code value for this JsonString object
         */
        @Override
        public int hashCode() {
            return ValueType.NULL.hashCode();
        }

        /**
         * Returns a "null" string.
         *
         * @return "null"
         */
        @Override
        public String toString() {
            return "null";
        }
    };

    /**
     * JSON true value.
     */
    static final JsonValue TRUE = new JsonValue() {
        @Override
        public ValueType getValueType() {
            return ValueType.TRUE;
        }

        /**
         * Compares the specified object with this {@link JsonValue#TRUE}
         * object for equality. Returns {@code true} if and only if the
         * specified object is also a JsonValue, and their
         * {@link #getValueType()} objects are <i>equal</i>.
         *
         * @param obj the object to be compared for equality with this JsonValue.
         * @return {@code true} if the specified object is equal to this JsonValue.
         */
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JsonValue) {
                return getValueType().equals(((JsonValue)obj).getValueType());
            }
            return false;
        }

        /**
         * Returns the hash code value for this {@link JsonValue#TRUE} object.
         * The hash code of the {@link JsonValue#TRUE} object is defined to be
         * its {@link #getValueType()} object's hash code.
         *
         * @return the hash code value for this JsonString object
         */
        @Override
        public int hashCode() {
            return ValueType.TRUE.hashCode();
        }

        /**
         * Returns "true" string
         *
         * @return "true"
         */
        @Override
        public String toString() {
            return "true";
        }
    };

    /**
     * JSON false value
     */
    static final JsonValue FALSE = new JsonValue() {
        @Override
        public ValueType getValueType() {
            return ValueType.FALSE;
        }

        /**
         * Compares the specified object with this {@link JsonValue#FALSE}
         * object for equality. Returns {@code true} if and only if the
         * specified object is also a JsonValue, and their
         * {@link #getValueType()} objects are <i>equal</i>.
         *
         * @param obj the object to be compared for equality with this JsonValue
         * @return {@code true} if the specified object is equal to this JsonValue
         */
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JsonValue) {
                return getValueType().equals(((JsonValue)obj).getValueType());
            }
            return false;
        }

        /**
         * Returns the hash code value for this {@link JsonValue#FALSE} object.
         * The hash code of the {@link JsonValue#FALSE} object is defined to be
         * its {@link #getValueType()} object's hash code.
         *
         * @return the hash code value for this JsonString object
         */
        @Override
        public int hashCode() {
            return ValueType.FALSE.hashCode();
        }

        /**
         * Returns "false" string
         *
         * @return "false"
         */
        @Override
        public String toString() {
            return "false";
        }
    };

    /**
     * Returns the value type of this JSON value.
     *
     * @return JSON value type
     */
    ValueType getValueType();

    /**
     * Returns JSON text for this JSON value.
     *
     * @return JSON text
     */
    @Override
    String toString();

}
