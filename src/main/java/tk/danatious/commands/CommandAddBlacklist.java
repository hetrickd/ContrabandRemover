package tk.danatious.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tk.danatious.BlacklistManager;

public class CommandAddBlacklist implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0] == null) {
            return false;
        }

        BlacklistManager.addToBlacklist(args[0]);

        return true;
    }

}