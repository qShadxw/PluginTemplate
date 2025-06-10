package uk.co.tmdavies.plugintemplate.enums;

import uk.co.tmdavies.plugintemplate.utils.ShadowUtils;

import javax.annotation.Nullable;

public enum Messages {

    // Global
    NO_PERMISSION("&cYou do not have permission to execute this command. [%s]"),
    PLAYER_ONLY("&cOnly players may execute this command."),
    RELOAD_SUCCESS("&aSuccessfully reloaded."),
    RELOAD_FAILURE("&cFailed to reload."),

    // Commands
    MAIN_COMMAND("&cUsage: /%s reload");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage(@Nullable Object... args) {
        return ShadowUtils.Colour(message, args);
    }
}
