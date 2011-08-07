package com.lithium3141.OpenItem;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.pneumaticraft.commandhandler.CommandHandler;

public class OpenItem extends JavaPlugin {
    
    public static final Logger LOG = Logger.getLogger("Minecraft");
    public static final String LOG_PREFIX = "[OpenItem] ";
    
    private CommandHandler commandHandler;

    @Override
    public void onDisable() {
        LOG.info(LOG_PREFIX + "OpenItem disabled");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        List<String> keyPath = new ArrayList<String>();
        keyPath.add(commandLabel.toLowerCase());
        for(String arg : args) {
            keyPath.add(arg.toLowerCase());
        }
        return this.commandHandler.locateAndRunCommand(sender, keyPath);
    }

    @Override
    public void onEnable() {
        // Load commands
        this.loadCommands();
        
        LOG.info(LOG_PREFIX + "OpenItem enabled - version " + this.getDescription().getVersion());
    }
    
    private void loadCommands() {
        this.commandHandler = new CommandHandler(this, new OIPermissionsHandler(this));
    }

}