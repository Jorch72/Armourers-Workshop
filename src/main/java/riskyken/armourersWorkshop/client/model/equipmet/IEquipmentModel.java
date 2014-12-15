package riskyken.armourersWorkshop.client.model.equipmet;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import riskyken.armourersWorkshop.common.equipment.data.CustomEquipmentItemData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public interface IEquipmentModel {
    
    public void render(Entity entity, CustomEquipmentItemData armourData, float limb1, float limb2, float limb3, float headY, float headX);
    
    public void render(Entity entity, ModelBiped modelBiped, CustomEquipmentItemData armourData);
}