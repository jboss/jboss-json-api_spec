package javax.json;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * An immutable JSON number value.
 *
 * <p>
 * Implementations may use a {@link BigDecimal} object to store the numeric
 * value internally.
 * The {@code BigDecimal} object can be constructed from the following types:
 * {@link BigDecimal#BigDecimal(int) <code>int</code>},
 * {@link BigDecimal#BigDecimal(long) <code>long</code>},
 * {@link BigDecimal#BigDecimal(BigInteger) <code>BigInteger</code>},
 * {@link BigDecimal#valueOf(double) <code>double</code>}, and
 * {@link BigDecimal#BigDecimal(String) <code>String</code>}.
 * Some of the method semantics in this class are defined using the
 * {@code BigDecimal} semantics.
 *
 * @author Jitendra Kotamraju
 */
public interface JsonNumber extends JsonValue {

    /**
     * Returns true if this JSON number is a integral number. This method
     * semantics are defined using {@code bigDecimalValue().scale()}. If the
     * scale is zero, then it is considered integral type. This integral type
     * information can be used to invoke an appropriate accessor method to
     * obtain a numeric value as in the following example:
     *
     * <pre>
     * <code>
     * JsonNumber num = ...
     * if (num.isIntegral()) {
     *     num.longValue();     // or other methods to get integral value
     * } else {
     *     num.doubleValue();   // or other methods to get decimal number value
     * }
     * </code>
     * </pre>
     *
     * @return true if this number is a integral number, otherwise false
     */
    boolean isIntegral();

    /**
     * Returns this JSON number as an {@code int}. Note that this conversion
     * can lose information about the overall magnitude and precision of the
     * number value as well as return a result with the opposite sign.
     *
     * @return an {@code int} representation of the JSON number
     * @see java.math.BigDecimal#intValue()
     */
    int intValue();

    /**
     * Returns this JSON number as an {@code int}.
     *
     * @return an {@code int} representation of the JSON number
     * @throws ArithmeticException if the number has a nonzero fractional
     *         part or if it does not fit in an {@code int}
     * @see java.math.BigDecimal#intValueExact()
     */
    int intValueExact();

    /**
     * Returns this JSON number as a {@code long}. Note that this conversion
     * can lose information about the overall magnitude and precision of the
     * number value as well as return a result with the opposite sign.
     *
     * @return a {@code long} representation of the JSON number.
     * @see java.math.BigDecimal#longValue()
     */
    long longValue();

    /**
     * Returns this JSON number as a {@code long}.
     *
     * @return a {@code long} representation of the JSON number
     * @throws ArithmeticException if the number has a non-zero fractional
     *         part or if it does not fit in a {@code long}
     * @see java.math.BigDecimal#longValueExact()
     */
    long longValueExact();

    /**
     * Returns this JSON number as a {@link BigInteger} object. This is a
     * a convenience method for {@code bigDecimalValue().toBigInteger()}.
     * Note that this conversion can lose information about the overall
     * magnitude and precision of the number value as well as return a result
     * with the opposite sign.
     *
     * @return a {@code BigInteger} representation of the JSON number.
     * @see java.math.BigDecimal#toBigInteger()
     */
    BigInteger bigIntegerValue();

    /**
     * Returns this JSON number as a {@link BigDecimal} object. This is a
     * convenience method for {@code bigDecimalValue().toBigIntegerExact()}.
     *
     * @return a {@link BigInteger} representation of the JSON number
     * @throws ArithmeticException if the number has a nonzero fractional part
     * @see java.math.BigDecimal#toBigIntegerExact()
     */
    BigInteger bigIntegerValueExact();

    /**
     * Returns this JSON number as a {@code double}. This is a
     * a convenience method for {@code bigDecimalValue().doubleValue()}.
     * Note that this conversion can lose information about the overall
     * magnitude and precision of the number value as well as return a result
     * with the opposite sign.
     *
     * @return a {@code double} representation of the JSON number
     * @see java.math.BigDecimal#doubleValue()
     */
    double doubleValue();

    /**
     * Returns this JSON number as a {@link BigDecimal} object.
     *
     * @return a {@link BigDecimal} representation of the JSON number
     */
    BigDecimal bigDecimalValue();

    /**
     * Returns a JSON text representation of the JSON number. The
     * representation is equivalent to {@link BigDecimal#toString()}.
     *
     * @return JSON text representation of the number
     */
    @Override
    String toString();

    /**
     * Compares the specified object with this {@code JsonNumber} object for
     * equality. Returns {@code true} if and only if the type of the specified
     * object is also {@code JsonNumber} and their {@link #bigDecimalValue()}
     * objects are <i>equal</i>
     *
     * @param obj the object to be compared for equality with
     *      this {@code JsonNumber}
     * @return {@code true} if the specified object is equal to this
     *      {@code JsonNumber}
     */
    @Override
    boolean equals(Object obj);

    /**
     * Returns the hash code value for this {@code JsonNumber} object.  The
     * hash code of a {@code JsonNumber} object is defined as the hash code of
     * its {@link #bigDecimalValue()} object.
     *
     * @return the hash code value for this {@code JsonNumber} object
     */
    @Override
    int hashCode();

}
