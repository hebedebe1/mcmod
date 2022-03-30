package net.mcreator.drippy.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.drippy.init.DrippyModItems;

public class EmptySyringeLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack Syringe = ItemStack.EMPTY;
		if (entity instanceof Player) {
			Syringe = new ItemStack(DrippyModItems.FULL_SYRINGE);
			(Syringe).getOrCreateTag().putString("dna_type", "player");
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = (Syringe);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.getInventory().setChanged();
			}
		} else if (entity instanceof Villager) {
			Syringe = new ItemStack(DrippyModItems.FULL_SYRINGE);
			(Syringe).getOrCreateTag().putString("dna_type", "villager");
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = (Syringe);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.getInventory().setChanged();
			}
		}
	}
}
