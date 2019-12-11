package net.pandorica.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EruptionBlockBlock extends FallingBlock {
    public EruptionBlockBlock(Block.Settings block$Settings_1) {
        super(block$Settings_1);
    }

    public void onLanding(World world_1, BlockPos blockPos_1, BlockState blockState_1, BlockState blockState_2) {
        world_1.addParticle(new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, blockState_1), 1, 1,
                1, 1.0D, 1.0D, 1.0D);

        super.onLanding(world_1, blockPos_1, blockState_1, blockState_2);
    }
}
