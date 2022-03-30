
package net.mcreator.drippy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

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
}
