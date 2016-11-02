

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Frames}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableFrames.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableFrames.of()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Frames"})
public final class ImmutableFrames extends Frames {
  private final ImmutableList<Frame> frames;

  private ImmutableFrames(Iterable<? extends Frame> frames) {
    this.frames = ImmutableList.copyOf(frames);
  }

  private ImmutableFrames(ImmutableFrames original, ImmutableList<Frame> frames) {
    this.frames = frames;
  }

  /**
   * @return The value of the {@code frames} attribute
   */
  @Override
  protected ImmutableList<Frame> frames() {
    return frames;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Frames#frames() frames}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFrames withFrames(Frame... elements) {
    ImmutableList<Frame> newValue = ImmutableList.copyOf(elements);
    return new ImmutableFrames(this, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Frames#frames() frames}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of frames elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableFrames withFrames(Iterable<? extends Frame> elements) {
    if (this.frames == elements) return this;
    ImmutableList<Frame> newValue = ImmutableList.copyOf(elements);
    return new ImmutableFrames(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableFrames} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableFrames
        && equalTo((ImmutableFrames) another);
  }

  private boolean equalTo(ImmutableFrames another) {
    return frames.equals(another.frames);
  }

  /**
   * Computes a hash code from attributes: {@code frames}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + frames.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Frames} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Frames")
        .omitNullValues()
        .add("frames", frames)
        .toString();
  }

  /**
   * Construct a new immutable {@code Frames} instance.
   * @param frames The value for the {@code frames} attribute
   * @return An immutable Frames instance
   */
  public static ImmutableFrames of(List<Frame> frames) {
    return of((Iterable<? extends Frame>) frames);
  }

  /**
   * Construct a new immutable {@code Frames} instance.
   * @param frames The value for the {@code frames} attribute
   * @return An immutable Frames instance
   */
  public static ImmutableFrames of(Iterable<? extends Frame> frames) {
    return new ImmutableFrames(frames);
  }

  /**
   * Creates an immutable copy of a {@link Frames} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Frames instance
   */
  public static ImmutableFrames copyOf(Frames instance) {
    if (instance instanceof ImmutableFrames) {
      return (ImmutableFrames) instance;
    }
    return ImmutableFrames.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableFrames ImmutableFrames}.
   * @return A new ImmutableFrames builder
   */
  public static ImmutableFrames.Builder builder() {
    return new ImmutableFrames.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableFrames ImmutableFrames}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private ImmutableList.Builder<Frame> frames = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Frames} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Frames instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllFrames(instance.frames());
      return this;
    }

    /**
     * Adds one element to {@link Frames#frames() frames} list.
     * @param element A frames element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addFrames(Frame element) {
      this.frames.add(element);
      return this;
    }

    /**
     * Adds elements to {@link Frames#frames() frames} list.
     * @param elements An array of frames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addFrames(Frame... elements) {
      this.frames.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link Frames#frames() frames} list.
     * @param elements An iterable of frames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder frames(Iterable<? extends Frame> elements) {
      this.frames = ImmutableList.builder();
      return addAllFrames(elements);
    }

    /**
     * Adds elements to {@link Frames#frames() frames} list.
     * @param elements An iterable of frames elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllFrames(Iterable<? extends Frame> elements) {
      this.frames.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableFrames ImmutableFrames}.
     * @return An immutable instance of Frames
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableFrames build() {
      return new ImmutableFrames(null, frames.build());
    }
  }
}
