package javax.json;

/**
 * An immutable JSON string value.
 *
 * @author Jitendra Kotamraju
 */
public interface JsonString extends JsonValue {

    /**
     * Returns the JSON string value.
     *
     * @return a JSON string value
     */
    String getString();


    /**
     * Returns the char sequence for the JSON String value
     *
     * @return a char sequence for the JSON String value
     */
    CharSequence getChars();

    /**
     * Compares the specified object with this {@code JsonString} for equality.
     * Returns {@code true} if and only if the specified object is also a
     * {@code JsonString}, and their {@link #getString()} objects are
     * <i>equal</i>.
     *
     * @param obj the object to be compared for equality with this
     *      {@code JsonString}
     * @return {@code true} if the specified object is equal to this
     *      {@code JsonString}
     */
    @Override
    boolean equals(Object obj);

    /**
     * Returns the hash code value for this {@code JsonString} object.
     * The hash code of a {@code JsonString} object is defined to be its
     * {@link #getString()} object's hash code.
     *
     * @return the hash code value for this {@code JsonString} object
     */
    @Override
    int hashCode();

}
