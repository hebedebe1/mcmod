
package net.mcreator.drippy.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.drippy.init.DrippyModItems;
import net.mcreator.drippy.init.DrippyModFluids;
import net.mcreator.drippy.init.DrippyModBlocks;

public abstract class CumFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DrippyModFluids.VILLAGER_CUM,
			() -> DrippyModFluids.FLOWING_VILLAGER_CUM,
			FluidAttributes.builder(new ResourceLocation("drippy:blocks/water_still"), new ResourceLocation("drippy:blocks/water_flow"))

					.density(2000).viscosity(2000)

					.rarity(Rarity.UNCOMMON)).explosionResistance(100f)

							.bucket(() -> DrippyModItems.VILLAGER_CUM_BUCKET).block(() -> (LiquidBlock) DrippyModBlocks.VILLAGER_CUM);

	private CumFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.BUBBLE_POP;
	}

	public static class Source extends CumFluid {
		public Source() {
			super();
			setRegistryName("villager_cum");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CumFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_villager_cum");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
