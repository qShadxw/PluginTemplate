package uk.co.tmdavies.plugintemplate;

import org.bukkit.plugin.java.JavaPlugin;
import uk.co.tmdavies.plugintemplate.managers.ConfigManager;
import uk.co.tmdavies.plugintemplate.managers.PluginManager;
import uk.co.tmdavies.plugintemplate.objects.ShadowLogger;

public final class PluginTemplate extends JavaPlugin {

    public static ShadowLogger logger;

    @Override
    public void onLoad() {
        // Init Logger
        logger = new ShadowLogger();

        // Init Instance
        PluginManager.setInstance(this);

        // Init Config
        ConfigManager.initFiles();
    }

    @Override
    public void onEnable() {
        // Registering Commands
        PluginManager.registerCommands();

        // Registering Listeners
        PluginManager.registerListeners();

        // Startup [May look buggy, so alter white space]
        logger.startUp(getName(), getDescription().getVersion(), getDescription().getAuthors());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
