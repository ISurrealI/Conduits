package surreal.conduits.common.tile.type;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;

public class TypeFluid implements IType {
    @Override
    public boolean canConnectTo(IBlockAccess world, BlockPos pos, IBlockState state, EnumFacing facing) {
        TileEntity tile = world.getTileEntity(pos);
        return tile != null && tile.hasCapability(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, facing);
    }
}
