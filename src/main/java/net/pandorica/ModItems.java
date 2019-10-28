package net.pandorica;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item BASALT_DUST = new Item(new Item.Settings().group(ItemGroup.MISC));
    
    public static void registerAll()
    {
        Registry.register(Registry.ITEM, new Identifier("pandorica", "basalt_dust"), BASALT_DUST);
    }
}

// OLD CODE (ref for items with functions)

// public class ExampleItem extends Item {

// 	public ExampleItem(Settings item$Settings_1) {
// 		super(item$Settings_1);
// 	}

// 	@Override
// 	public TypedActionResult<ItemStack> use(World world, PlayerEntity PlayerEntity, Hand hand) {
// 		PlayerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
// 		return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, PlayerEntity.getStackInHand(hand));
// 	}

// }
