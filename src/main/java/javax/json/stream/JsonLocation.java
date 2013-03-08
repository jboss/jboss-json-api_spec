package javax.json.stream;

/**
 * Provides the location information of a JSON event in an input source. The
 * {@code JsonLocation} information can be used to identify incorrect JSON
 * or can be used by higher frameworks to know about the processing location.
 *
 * <p>All the information provided by a {@code JsonLocation} is optional. For
 * example, a provider may only report line numbers. Also, there may not be any
 * location information for an input source. For example, if a
 * {@code JsonParser} is created using
 * {@link javax.json.JsonArray JsonArray} input source, all the methods in
 * this class return -1.
 *
 * @author Jitendra Kotamraju
 * @see JsonParser
 * @see JsonParsingException
 */
public interface JsonLocation {

    /**
     * Return the line number for the current JSON event in the input source.
     *
     * @return the line number or -1 if none is available
     */
    int getLineNumber();

    /**
     * Return the column number for the current JSON event in the input source.
     *
     * @return the column number or -1 if none is available
     */
    int getColumnNumber();

    /**
     * Return the stream offset into the input source this location
     * is pointing to. If the input source is a file or a byte stream then
     * this is the byte offset into that stream, but if the input source is
     * a character media then the offset is the character offset.
     * Returns -1 if there is no offset available.
     *
     * @return the offset of input source stream, or -1 if there is
     * no offset available
     */
    int getStreamOffset();

}
