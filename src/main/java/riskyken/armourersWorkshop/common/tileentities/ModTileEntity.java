package riskyken.armourersWorkshop.common.tileentities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public abstract class ModTileEntity extends TileEntity {
    
    /**
     * Sync the tile entity with the clients.
     */
    public void syncWithClients() {
        worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
    }
    
    /**
     * Marks the tile entity as dirty and sync it with the clients.
     */
    public void dirtySync() {
        markDirty();
        syncWithClients();
    }
    
    public NBTTagCompound getUpdateTag() {
        return null;
    }
}
