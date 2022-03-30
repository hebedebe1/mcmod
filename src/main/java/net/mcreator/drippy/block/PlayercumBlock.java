
package net.mcreator.drippy.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.drippy.init.DrippyModFluids;

public class PlayercumBlock extends LiquidBlock {
	public PlayercumBlock() {
		super(DrippyModFluids.PLAYERCUM, BlockBehaviour.Properties.of(Material.WATER, MaterialColor.TERRACOTTA_WHITE).strength(100f)

		);
		setRegistryName("playercum");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
