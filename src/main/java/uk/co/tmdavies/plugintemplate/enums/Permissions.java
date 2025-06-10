package uk.co.tmdavies.plugintemplate.enums;

import uk.co.tmdavies.plugintemplate.managers.PluginManager;

public enum Permissions {

    MAIN_COMMAND("use");

    private final String permission;

    Permissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return PluginManager.getPluginInstance().getName() + "." + permission;
    }
}
