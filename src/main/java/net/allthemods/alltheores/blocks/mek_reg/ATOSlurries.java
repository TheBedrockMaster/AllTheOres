package net.allthemods.alltheores.blocks.mek_reg;



import mekanism.api.chemical.slurry.Slurry;
import net.allthemods.alltheores.infos.Reference;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.LinkedHashMap;
import java.util.Map;

public class ATOSlurries {

    public static final SlurryRegistry SLURRIES = new SlurryRegistry(Reference.MOD_ID);

    public static final Map<ATOResource, DeferredHolder<Slurry, Slurry>> PROCESSED_RESOURCES = new LinkedHashMap<>();

    static {
        for (ATOResource resource : EnumFunc.PRIMARY_RESOURCES) {
             SLURRIES.register(resource);
        }
    }


}
