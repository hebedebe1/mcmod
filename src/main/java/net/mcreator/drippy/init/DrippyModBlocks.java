
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.drippy.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.drippy.block.StemCellDuplicatorBlock;
import net.mcreator.drippy.block.PlayercumBlock;
import net.mcreator.drippy.block.EggblockBlock;
import net.mcreator.drippy.block.CumBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DrippyModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block VILLAGER_CUM = register(new CumBlock());
	public static final Block PLAYERCUM = register(new PlayercumBlock());
	public static final Block EGGBLOCK = register(new EggblockBlock());
	public static final Block STEM_CELL_DUPLICATOR = register(new StemCellDuplicatorBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			EggblockBlock.registerRenderLayer();
		}
	}
}
