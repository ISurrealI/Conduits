package surreal.conduits.common.tile.type;

import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.items.CapabilityItemHandler;

public class TypeItem implements IType {
    int perTick;

    public TypeItem(int perTick) {
        this.perTick = perTick;
    }

    @Override
    public boolean canConnectTo(IBlockAccess world, BlockPos pos, IBlockState state, EnumFacing facing) {
        TileEntity tile = world.getTileEntity(pos);
        return tile != null && tile.hasCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, facing);
    }
}
