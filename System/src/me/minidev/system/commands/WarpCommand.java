package me.minidev.system.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class WarpCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("Warp")) {
			if(args.length == 0) {
				if((sender.isOp()) || (sender.hasPermission("System-plugin.warp.use"))) {
					sender.sendMessage("§cUltilize: /warp create <name>");
					sender.sendMessage("§cUltilize: /warp delete <name>");
					return true;
				}
			}
		}
		return true;
	}

}