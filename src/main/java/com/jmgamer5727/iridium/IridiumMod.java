package com.jmgamer5727.iridium;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IridiumMod implements ModInitializer {
    public static final String MOD_ID = "iridium";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.initialize();
        LOGGER.info("Iridium Mod has loaded!");
    }
}
