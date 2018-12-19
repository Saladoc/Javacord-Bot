package org.javacord.bot.tools.timeout;

import java.util.Objects;

public class Member {

    private final long userId;
    private final long serverId;

    public Member(long userId, long serverId) {
        this.userId = userId;
        this.serverId = serverId;
    }

    public long getUserId() {
        return userId;
    }

    public long getServerId() {
        return serverId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return userId == member.userId && serverId == member.serverId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, serverId);
    }
}
