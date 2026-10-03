package johnseagull.eateverything;


import johnseagull.figManager.Fig.*;
import johnseagull.figManagerMC.DividerFig;
import net.minecraft.ChatFormatting;


public class Figs {
    public static Figs instance = new Figs();
    public DividerFig divider = new DividerFig("General settings", ChatFormatting.WHITE,true,false,false);
    public FloatFig consumeSeconds = new FloatFig("Consume Seconds","Amount of time for eating non-food items",0.5F,0,60);
    public IntFig nutrition = new IntFig("Nutrition", "Amount of hunger poInts non-food items will restore",0,0,20);
    public FloatFig saturation = new FloatFig("Saturation", "Amount of saturation items will provide. Quick reference: 0.0=none 0.5=same as nutrition 1.0=twice nutrition",0,0,20);
    public BooleanFig alwaysEat = new BooleanFig("Alwats Eat", "If non-food items can be eated at full hunger",true);

}
