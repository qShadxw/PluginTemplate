package uk.co.tmdavies.plugintemplate.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import uk.co.tmdavies.plugintemplate.enums.Messages;
import uk.co.tmdavies.plugintemplate.enums.Permissions;

import java.util.List;

public class MainCommand implements ShadowCommand {

    @Override
    public String getName() {
        return "plugintemplate";
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String string, String[] args) {
        if (!sender.hasPermission(Permissions.MAIN_COMMAND.getPermission())) {
            sender.sendMessage(Messages.NO_PERMISSION.getMessage(Permissions.MAIN_COMMAND.getPermission()));

            return true;
        }

        sender.sendMessage(Messages.MAIN_COMMAND.getMessage(getName()));

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String string, String[] args) {
        return switch (args.length) {
            case 1 -> List.of("reload");
            default -> null;
        };
    }

}
