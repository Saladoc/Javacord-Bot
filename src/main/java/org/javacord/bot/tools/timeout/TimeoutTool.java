package org.javacord.bot.tools.timeout;

import org.javacord.api.DiscordApi;
import org.javacord.api.entity.server.Server;
import org.javacord.api.entity.user.User;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Duration;

public class TimeoutTool {

    private final DiscordApi api;

    public TimeoutTool(DiscordApi api) {
        this.api = api;
    }

    public void loadFrom(Path directory) throws IOException {
        // TODO
    }

    public void saveTo(Path directory) throws IOException {
        // TODO
    }

    public void setTimeout(Server server, User user, Duration duration) {

    }

    public void revokeTimeout(Server server, User user) {

    }

}
