package net.kai.dndmod;

import net.fabricmc.api.ModInitializer;
import net.kai.dndmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DnDMod implements ModInitializer {
	public static final String MOD_ID = "dndmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
