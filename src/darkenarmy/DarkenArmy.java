package darkenarmy;

import arc.*;
import mindustry.mod.Mod;
import darkenarmy.content.DarkenArmyUnits;
import darkenarmy.content.DarkenArmyBlocks;
import darkenarmy.content.DarkenArmyTechTree;

public class DarkenArmy extends Mod {
    @Override
public void loadContent() {
    DarkenArmyUnits.load();
    DarkenArmyBlocks.load();
    DarkenArmyTechTree.load();
  

 }
}  
