package com.lithium3141.OpenItem.commands;

import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.plugin.java.JavaPlugin;

import com.lithium3141.OpenItem.OICommand;

public class OIGiveCommand extends OICommand {

    public OIGiveCommand(JavaPlugin plugin) {
        super(plugin);
        
        this.setName("Give");
        this.setArgRange(2, 3);
        this.setCommandUsage("/give {player} {item} [quantity]");
        this.addCommandExample("/give Bob torch 32");
        this.setPermission("openitem.give.use", "Use the /give command", PermissionDefault.OP);
        
        this.addKey("give");
    }

    @Override
    public void runCommand(CommandSender sender, List<String> args) {
        sender.sendMessage("Unimplemented");
    }

}
