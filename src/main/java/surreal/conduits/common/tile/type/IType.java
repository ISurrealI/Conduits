package surreal.conduits.common.tile.type;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public interface IType {
    boolean canConnectTo(IBlockAccess world, BlockPos fromPos, IBlockState state, EnumFacing facing);
}
