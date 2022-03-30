
package net.mcreator.drippy.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.drippy.init.DrippyModFluids;

import java.util.List;

public class PlayercumItem extends BucketItem {
	public PlayercumItem() {
		super(() -> DrippyModFluids.PLAYERCUM,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC));
		setRegistryName("playercum_bucket");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Villager"));
	}
}