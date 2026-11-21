package arcade;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public final class Game {

    @EqualsAndHashCode.Include
    private final String name;

    private final String description;

    private final Platform platform;

    private final int released;

    @ToString.Exclude
    private final List<Character> characters;

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
    @ToString
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    public static final class Character {

        @EqualsAndHashCode.Include
        private final String name;

        private final String description;

        private final int games;
    }

    public enum Platform {
        @JsonProperty("Neo Geo") NEO_GEO,
        @JsonProperty("Capcom Play System") CAPCOM_PLAY_SYSTEM,
        @JsonProperty("Sega Model Series") SEGA_MODEL_SERIES,
        @JsonProperty("Nintendo") NINTENDO
    }
}
