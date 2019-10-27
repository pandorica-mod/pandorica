package net.pandorica.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ExampleItem extends Item {

	public ExampleItem(Settings item$Settings_1) {
		super(item$Settings_1);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity PlayerEntity, Hand hand) {
		PlayerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
		return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, PlayerEntity.getStackInHand(hand));
	}

}
