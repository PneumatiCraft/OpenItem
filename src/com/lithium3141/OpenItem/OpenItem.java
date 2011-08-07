package com.lithium3141.OpenItem;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class OpenItem extends JavaPlugin {
    
    public static final Logger LOG = Logger.getLogger("Minecraft");
    public static final String LOG_PREFIX = "[OpenItem] ";

    @Override
    public void onDisable() {
        LOG.info(LOG_PREFIX + "OpenItem disabled");
    }

    @Override
    public void onEnable() {
        LOG.info(LOG_PREFIX + "OpenItem enabled - version " + this.getDescription().getVersion());
    }

}
