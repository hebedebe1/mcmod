
package net.mcreator.drippy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.drippy.init.DrippyModTabs;

public class ShoddygeneticextractorItem extends Item {
	public ShoddygeneticextractorItem() {
		super(new Item.Properties().tab(DrippyModTabs.TAB_GENETICS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("shoddygeneticextractor");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
