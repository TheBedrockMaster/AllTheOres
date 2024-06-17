package net.allthemods.alltheores;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.allthemods.alltheores.blocks.BlockList;
import net.allthemods.alltheores.blocks.mek_reg.ATOSlurries;
import net.allthemods.alltheores.blocks.mek_reg.MekRegistry;
import net.allthemods.alltheores.datagen.DataGenerators;
import net.allthemods.alltheores.infos.Reference;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod(Reference.MOD_ID)
public class AllTheOres {
	public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

	public AllTheOres(IEventBus modEventBus, ModContainer modContainer) {
		//ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configuration.COMMON_SPEC);
		//BlockList.FLUIDS.register(modEventBus);
		BlockList.BLOCKS.register(modEventBus);
		BlockList.CREATIVE_TABS.register(modEventBus);
		BlockList.ITEMS.register(modEventBus);
		if(ModList.get().isLoaded("mekanism")) {
			MekRegistry.ITEMS.register(modEventBus);
			ATOSlurries.SLURRIES.register(modEventBus);
			MekRegistry.CREATIVE_TABS.register(modEventBus);
			
		}
		setupLogFilter();
	}


	private static void setupLogFilter() {
		var rootLogger = LogManager.getRootLogger();
		if (rootLogger instanceof org.apache.logging.log4j.core.Logger logger) {
			logger.addFilter(new SetBlockMessageFilter());
		} else {
			LOGGER.error("Registration failed with unexpected class: {}", rootLogger.getClass());
		}
	}

}
