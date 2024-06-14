package net.allthemods.alltheores.blocks.mek_reg;
import mekanism.api.MekanismAPI;
import mekanism.api.chemical.slurry.Slurry;
import mekanism.api.chemical.slurry.SlurryBuilder;
import mekanism.common.registration.impl.SlurryDeferredRegister;
import mekanism.common.registration.impl.SlurryRegistryObject;
import mekanism.common.registration.MekanismDeferredRegister;
import mekanism.common.registration.impl.DeferredChemical.DeferredSlurry;
import mekanism.common.resource.PrimaryResource;
import net.allthemods.alltheores.infos.ItemTagRegistry;
import net.allthemods.alltheores.infos.Reference;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SlurryRegistry extends MekanismDeferredRegister<Slurry> {


    public SlurryRegistry(String modid) {
        super(MekanismAPI.SLURRY_REGISTRY_NAME,modid,DeferredSlurry::new);
    }

    public SlurryRegistryObject<Slurry, Slurry> register(ATOResource resource) {
        return registera(resource.getRegistrySuffix(), builder -> builder.tint(resource.getTint()).ore(resource.getOreTag()));
    }

    public SlurryRegistryObject<Slurry, Slurry> registera(String baseName, UnaryOperator<SlurryBuilder> builderModifier) {
        return new SlurryRegistryObject<>(register("dirty_" + baseName, () -> new Slurry(builderModifier.apply(SlurryBuilder.dirty()))),
                register("clean_" + baseName, () -> new Slurry(builderModifier.apply(SlurryBuilder.clean()))));
    }

    @Override
    @SuppressWarnings("unchecked")
    public <SLURRY extends Slurry> DeferredSlurry<SLURRY> register(String name, Supplier<? extends SLURRY> sup) {
        return (DeferredSlurry<SLURRY>) super.register(name, sup);
    }
}
