

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;

/**
 * Immutable implementation of {@link Score}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableScore.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableScore.of()}.
 */
@SuppressWarnings({"all"})
@Generated({"Immutables.generator", "Score"})
public final class ImmutableScore extends Score {
  private final int score;

  private ImmutableScore(int score) {
    this.score = score;
  }

  /**
   * @return The value of the {@code score} attribute
   */
  @Override
  protected int score() {
    return score;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Score#score() score} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for score
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableScore withScore(int value) {
    if (this.score == value) return this;
    return new ImmutableScore(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableScore} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(Object another) {
    if (this == another) return true;
    return another instanceof ImmutableScore
        && equalTo((ImmutableScore) another);
  }

  private boolean equalTo(ImmutableScore another) {
    return score == another.score;
  }

  /**
   * Computes a hash code from attributes: {@code score}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + score;
    return h;
  }

  /**
   * Prints the immutable value {@code Score} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Score")
        .omitNullValues()
        .add("score", score)
        .toString();
  }

  /**
   * Construct a new immutable {@code Score} instance.
   * @param score The value for the {@code score} attribute
   * @return An immutable Score instance
   */
  public static ImmutableScore of(int score) {
    return new ImmutableScore(score);
  }

  /**
   * Creates an immutable copy of a {@link Score} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Score instance
   */
  public static ImmutableScore copyOf(Score instance) {
    if (instance instanceof ImmutableScore) {
      return (ImmutableScore) instance;
    }
    return ImmutableScore.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableScore ImmutableScore}.
   * @return A new ImmutableScore builder
   */
  public static ImmutableScore.Builder builder() {
    return new ImmutableScore.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableScore ImmutableScore}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  public static final class Builder {
    private static final long INIT_BIT_SCORE = 0x1L;
    private long initBits = 0x1L;

    private int score;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Score} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Score instance) {
      Preconditions.checkNotNull(instance, "instance");
      score(instance.score());
      return this;
    }

    /**
     * Initializes the value for the {@link Score#score() score} attribute.
     * @param score The value for score 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder score(int score) {
      this.score = score;
      initBits &= ~INIT_BIT_SCORE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableScore ImmutableScore}.
     * @return An immutable instance of Score
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableScore build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableScore(score);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_SCORE) != 0) attributes.add("score");
      return "Cannot build Score, some of required attributes are not set " + attributes;
    }
  }
}
