package net.mcreator.drippy.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.drippy.network.DrippyModVariables;
import net.mcreator.drippy.init.DrippyModItems;

public class FullSyringeRightClickedInAirProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == DrippyModItems.FULL_SYRINGE) {
				{
					boolean _setval = true;
					entity.getCapability(DrippyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.isPregnant = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.round(288000 * Math.random());
					entity.getCapability(DrippyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pregancyTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					String _setval = itemstack.getOrCreateTag().getString("dna_type");
					entity.getCapability(DrippyModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pregnancyType = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(DrippyModItems.EMPTY_SYRINGE);
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.getInventory().setChanged();
				}
			}
		}
	}
}
