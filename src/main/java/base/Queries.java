package base;

import lombok.NonNull;

import java.util.List;
import java.util.Map;

/**
 * Defines queries for your {@link Repository} implementation.
 *
 * @param <T> the type of your top-level class
 * @param <U> the type of your static nested class
 * @param <V> the type of your enumerated class
 */
public interface Queries<T, U, V extends Enum<V>> {

    /**
     * Returns the name of the game that has the greatest release year.
     * If more games have the greatest value, the first one is considered.
     *
     * @return the result
     * @throws EmptyResultException if there are no <i>games</i>
     */
    String query1() throws EmptyResultException;

    /**
     * Returns the sorted copy of the games using the {@link Comparable} interface.
     *
     * <p>
     * The stages:
     * <ol>
     *     <li> the release year of the <i>game</i> (descending)
     *     <li> the description of the <i>game</i> (descending)
     *     <li> the name of the <i>game</i> (ascending)
     * </ol>
     * </p>
     *
     * <p>
     * Notes:
     * <ol>
     *     <li>The method cannot modify the original list.
     *     <li>This task includes the implementation of the {@link Comparable} interface in your model class due to its nature.
     * </ol>
     * </p>
     *
     * @return the result
     */
    List<T> query2();

    /**
     * Returns the sorted copy of the games using the {@link java.util.Comparator} interface.
     *
     * <p>
     * The stages:
     * <ol>
     *     <li> the description of the <i>game</i> (ascending)
     *     <li> the release year of the <i>game</i> (descending)
     *     <li> the name of the <i>game</i> (ascending)
     * </ol>
     * </p>
     *
     * <p>
     * Notes:
     * <ol>
     *     <li>The method cannot modify the original list.
     *     <li>The {@link java.util.Comparator} interface must be implemented as an anonymous class inside this method (not as a lambda expression).
     * </ol>
     * </p>
     *
     * @return the result
     */
    List<T> query3();

    /**
     * Returns the first game that has the given name.
     *
     * @param name the name of the game
     * @return the result
     * @throws NoResultException if no <i>game</i> matches the condition
     */
    T query4(
            @NonNull String name) throws NoResultException;

    /**
     * Returns all the games that have the given platform but do not contain the given character.
     *
     * @param platform the platform
     * @param character the character
     * @return the result
     */
    List<T> query5(
            @NonNull V platform,
            @NonNull U character);

    /**
     * Returns a dictionary that maps each release year to the first game having that release year.
     *
     * @return the result
     */
    Map<Integer, T> query6();
}
