package org.javacord.bot.tools.timeout;


import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class TimeoutStore {

    private final Map<Member, Instant> timeoutEndtimes = new ConcurrentHashMap<>();

    /**
     * Add a new timeout to the store.
     *
     * @param member   The member that got timed out.
     * @param duration The duration after which to revoke the timeout.
     * @return The Instant the set timeout expires.
     */
    public Instant addNewTimeout(Member member, Duration duration) {
        Instant expiry = Instant.now().plus(duration);
        timeoutEndtimes.put(member, expiry);
        return expiry;
    }

    public void removeTimeouts(Member... members) {
        for (Member member : members) {
            timeoutEndtimes.remove(member);
        }
    }

    /**
     * Gets the moment the next timeout expires.
     *
     * @return The Instant the next timeout expires.
     */
    public Optional<Instant> getNextExpirationTime() {
        return timeoutEndtimes.values().stream()
                .min(Comparator.naturalOrder());
    }


}
