package darkenarmy.content;

import arc.struct.*;
import mindustry.game.Objectives.*;
import mindustry.type.*;
import mindustry.content.*;
import mindustry.ctype.*;

import static mindustry.content.Blocks.*;
import static mindustry.content.TechTree.*;
import static darkenarmy.content.DarkenArmyBlocks.*;
import static darkenarmy.content.DarkenArmyUnits.*;

public class DarkenArmyTechTree {

    public static void load() {
      TechNode tankFabNode = tankFabricator.techNode;
        if (tankFabNode != null) {
            TechNode darkTankFabNode = new TechNode(tankFabNode, darkTankFabricator, 
                darkTankFabricator.researchRequirements());
            darkTankFabNode.objectives.add(new OnSector(SectorPresets.lake));
            
            // Add dark stell unit
            TechNode darkStellNode = new TechNode(darkTankFabNode, darkStell, 
                darkStell.researchRequirements());
    
    }
}
