
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.drippy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.drippy.item.StemCellItem;
import net.mcreator.drippy.item.ShoddygeneticextractorItem;
import net.mcreator.drippy.item.PlayercumItem;
import net.mcreator.drippy.item.GeneticFoundationItem;
import net.mcreator.drippy.item.FullSyringeItem;
import net.mcreator.drippy.item.EmptySyringeItem;
import net.mcreator.drippy.item.CumItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DrippyModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item VILLAGER_CUM_BUCKET = register(new CumItem());
	public static final Item PLAYERCUM_BUCKET = register(new PlayercumItem());
	public static final Item FULL_SYRINGE = register(new FullSyringeItem());
	public static final Item EMPTY_SYRINGE = register(new EmptySyringeItem());
	public static final Item EGGBLOCK = register(DrippyModBlocks.EGGBLOCK, DrippyModTabs.TAB_GENETICS);
	public static final Item SHODDYGENETICEXTRACTOR = register(new ShoddygeneticextractorItem());
	public static final Item STEM_CELL = register(new StemCellItem());
	public static final Item GENETIC_FOUNDATION = register(new GeneticFoundationItem());
	public static final Item STEM_CELL_DUPLICATOR = register(DrippyModBlocks.STEM_CELL_DUPLICATOR, DrippyModTabs.TAB_GENETICS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
