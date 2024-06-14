package net.allthemods.alltheores.blocks.mek_reg;

import net.allthemods.alltheores.infos.Reference;
import net.allthemods.alltheores.infos.TranslationKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class MekRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(Reference.MOD_ID);
    //  ***********************DIRTY DUSTS

    public static final DeferredHolder<Item,Item> ALUM_DIRTY = ITEMS.register("dirty_aluminum_dust", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> COPP_DIRTY = ITEMS.register("dirty_copper_dust", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> LEAD_DIRTY = ITEMS.register("dirty_lead_dust", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> NICK_DIRTY = ITEMS.register("dirty_nickel_dust", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> OSMI_DIRTY = ITEMS.register("dirty_osmium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> PLAT_DIRTY = ITEMS.register("dirty_platinum_dust", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> SILV_DIRTY = ITEMS.register("dirty_silver_dust", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> TIN_DIRTY = ITEMS.register("dirty_tin_dust", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> URAN_DIRTY = ITEMS.register("dirty_uranium_dust", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> ZINC_DIRTY = ITEMS.register("dirty_zinc_dust", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> IRIDIUM_DIRTY = ITEMS.register("dirty_iridium_dust", () -> new Item(new Item.Properties()));
    //  ***********************SHARDS
    public static final DeferredHolder<Item,Item> ALUM_SHARD = ITEMS.register("aluminum_shard", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> COPP_SHARD = ITEMS.register("copper_shard", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> LEAD_SHARD = ITEMS.register("lead_shard", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> NICK_SHARD = ITEMS.register("nickel_shard", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> OSMI_SHARD = ITEMS.register("osmium_shard", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> PLAT_SHARD = ITEMS.register("platinum_shard", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> SILV_SHARD = ITEMS.register("silver_shard", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> TIN_SHARD = ITEMS.register("tin_shard", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> URAN_SHARD = ITEMS.register("uranium_shard", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> ZINC_SHARD = ITEMS.register("zinc_shard", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> IRIDIUM_SHARD = ITEMS.register("iridium_shard", () -> new Item(new Item.Properties()));
    //  ************************CRYSTALS
    public static final DeferredHolder<Item,Item> ALUM_CRYSTAL = ITEMS.register("aluminum_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> COPP_CRYSTAL = ITEMS.register("copper_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> LEAD_CRYSTAL = ITEMS.register("lead_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> NICK_CRYSTAL = ITEMS.register("nickel_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> OSMI_CRYSTAL = ITEMS.register("osmium_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> PLAT_CRYSTAL = ITEMS.register("platinum_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> SILV_CRYSTAL = ITEMS.register("silver_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> TIN_CRYSTAL = ITEMS.register("tin_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> URAN_CRYSTAL = ITEMS.register("uranium_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> ZINC_CRYSTAL = ITEMS.register("zinc_crystal", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> IRIDIUM_CRYSTAL = ITEMS.register("iridium_crystal", () -> new Item(new Item.Properties()));
    //  ************************CLUMPS
    public static final DeferredHolder<Item,Item> ALUM_CLUMP = ITEMS.register("aluminum_clump", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> COPP_CLUMP = ITEMS.register("copper_clump", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> LEAD_CLUMP = ITEMS.register("lead_clump", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> NICK_CLUMP = ITEMS.register("nickel_clump", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> OSMI_CLUMP = ITEMS.register("osmium_clump", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> PLAT_CLUMP = ITEMS.register("platinum_clump", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> SILV_CLUMP = ITEMS.register("silver_clump", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> TIN_CLUMP = ITEMS.register("tin_clump", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> URAN_CLUMP = ITEMS.register("uranium_clump", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> ZINC_CLUMP = ITEMS.register("zinc_clump", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item,Item> IRIDIUM_CLUMP = ITEMS.register("iridium_clump", () -> new Item(new Item.Properties()));

    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Reference.MOD_ID);
    public static final DeferredHolder<CreativeModeTab,CreativeModeTab> MEK_TAB = CREATIVE_TABS.register("creative_tab_mek", () -> CreativeModeTab.builder()
            .title(Component.translatable(TranslationKey.tab2()))
            .icon(() -> MekRegistry.IRIDIUM_CLUMP.get().getDefaultInstance())
            .displayItems((parameters, output) -> MekRegistry.ITEMS.getEntries().stream()
                    .map(DeferredHolder::get)
                    .map(Item::getDefaultInstance)
                    .forEach(output::accept))
            .build()
    );
}
