package com.growlyx;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class numberCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if (args[0].equalsIgnoreCase("1")) {
            player.sendMessage("One");
        }  else if (args[0].equalsIgnoreCase("2")) {
            player.sendMessage("Two");
        }  else  {
            player.sendMessage("Invalid");
        }

        return false;
    }
}
