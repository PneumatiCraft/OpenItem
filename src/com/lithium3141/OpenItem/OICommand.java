package com.lithium3141.OpenItem;

import org.bukkit.plugin.java.JavaPlugin;

import com.pneumaticraft.commandhandler.Command;

public abstract class OICommand extends Command {

    public OICommand(JavaPlugin plugin) {
        super(plugin);
    }
    
    public OpenItem getPlugin() {
        return (OpenItem)(this.plugin);
    }

}
