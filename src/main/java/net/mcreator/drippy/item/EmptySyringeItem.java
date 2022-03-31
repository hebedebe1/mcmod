
package net.mcreator.drippy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.drippy.procedures.EmptySyringeLivingEntityIsHitWithItemProcedure;
import net.mcreator.drippy.init.DrippyModTabs;

public class EmptySyringeItem extends Item {
	public EmptySyringeItem() {
		super(new Item.Properties().tab(DrippyModTabs.TAB_GENETICS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("empty_syringe");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		EmptySyringeLivingEntityIsHitWithItemProcedure.execute(entity, sourceentity);
		return retval;
	}
}
