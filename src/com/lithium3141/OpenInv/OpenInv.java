package com.lithium3141.OpenInv;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class OpenInv extends JavaPlugin {
    
    public static final Logger LOG = Logger.getLogger("Minecraft");
    public static final String LOG_PREFIX = "[OpenInv] ";

    @Override
    public void onDisable() {
        LOG.info(LOG_PREFIX + "OpenInv disabled");
    }

    @Override
    public void onEnable() {
        LOG.info(LOG_PREFIX + "OpenInv enabled - version " + this.getDescription().getVersion());
    }

}
