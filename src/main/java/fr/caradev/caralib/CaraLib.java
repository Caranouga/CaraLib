package fr.caradev.caralib;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(CaraLib.MODID)
public class CaraLib {
    public static final String MODID = "caralib";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CaraLib(IEventBus modEventBus, ModContainer modContainer) {
    }
}