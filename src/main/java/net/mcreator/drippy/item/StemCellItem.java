
package net.mcreator.drippy.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.drippy.procedures.StemCellItemInInventoryTickProcedure;
import net.mcreator.drippy.init.DrippyModTabs;

public class StemCellItem extends Item {
	public StemCellItem() {
		super(new Item.Properties().tab(DrippyModTabs.TAB_GENETICS).stacksTo(64).rarity(Rarity.RARE));
		setRegistryName("stem_cell");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		StemCellItemInInventoryTickProcedure.execute(itemstack);
	}
}
