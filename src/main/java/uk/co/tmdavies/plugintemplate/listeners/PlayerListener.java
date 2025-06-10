package uk.co.tmdavies.plugintemplate.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import uk.co.tmdavies.plugintemplate.utils.ShadowUtils;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ShadowUtils.Colour("&8[&a+&8] &7%s", event.getPlayer().getName()));
    }
}
