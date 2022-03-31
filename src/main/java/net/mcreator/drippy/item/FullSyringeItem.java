
package net.mcreator.drippy.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.drippy.procedures.FullSyringeRightClickedInAirProcedure;
import net.mcreator.drippy.init.DrippyModTabs;
import net.mcreator.drippy.init.DrippyModItems;

public class FullSyringeItem extends Item {
	public FullSyringeItem() {
		super(new Item.Properties().tab(DrippyModTabs.TAB_GENETICS).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("full_syringe");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(DrippyModItems.EMPTY_SYRINGE);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FullSyringeRightClickedInAirProcedure.execute(entity, itemstack);
		return ar;
	}
}
