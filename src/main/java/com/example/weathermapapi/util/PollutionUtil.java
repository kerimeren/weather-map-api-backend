package com.example.weathermapapi.util;



import java.util.HashMap;
import java.util.Map;

public class PollutionUtil
{
    private final static Map<String, Float> coMap = new HashMap<String, Float>() {{
        put("GOOD_THRESHOLD", 1.1F);
        put("SATISFACTORY_THRESHOLD", 2.1F);
        put("MODERATE_THRESHOLD", 10.0F);
        put("POOR_THRESHOLD", 17.0F);
        put("SEVERE_THRESHOLD", 34.0F);
    }};

    public static String determineCoValue(float coValue)
    {
        float value = roundToOneDecimal(coValue);

        if(value < coMap.get("GOOD_THRESHOLD"))
            return "Good";
        else if(value < coMap.get("SATISFACTORY_THRESHOLD"))
            return "Satisfactory";
        else if(value < coMap.get("MODERATE_THRESHOLD"))
            return "Moderate";
        else if(value < coMap.get("POOR_THRESHOLD"))
            return "Poor";
        else if(value < coMap.get("SEVERE_THRESHOLD"))
            return "Severe";
        else
            return "Hazardous";
    }

    public static Map<String, Float> o3Map = new HashMap<String, Float>() {{
        put("GOOD_THRESHOLD", 51.0F);
        put("SATISFACTORY_THRESHOLD", 101.0F);
        put("MODERATE_THRESHOLD", 169.0F);
        put("POOR_THRESHOLD", 209.0F);
        put("SEVERE_THRESHOLD", 748.0F);
    }};
    public static String determineO3Value(float o3Value)
    {
        float value = roundToOneDecimal(o3Value);
        if(value < o3Map.get("GOOD_THRESHOLD"))
            return "Good";
        else if(value < o3Map.get("SATISFACTORY_THRESHOLD"))
            return "Satisfactory";
        else if(value < o3Map.get("MODERATE_THRESHOLD"))
            return "Moderate";
        else if(value < o3Map.get("POOR_THRESHOLD"))
            return "Poor";
        else if(value < o3Map.get("SEVERE_THRESHOLD"))
            return "Severe";
        else
            return "Hazardous";
    }

    public static Map<String, Float> so2Map = new HashMap<String, Float>() {{
        put("GOOD_THRESHOLD", 41.0F);
        put("SATISFACTORY_THRESHOLD", 81.0F);
        put("MODERATE_THRESHOLD", 381.0F);
        put("POOR_THRESHOLD", 801.0F);
        put("SEVERE_THRESHOLD", 1800.0F);
    }};
    public static String determineSo2Value(float so2Value)
    {
        float value = roundToOneDecimal(so2Value);
        if(value < so2Map.get("GOOD_THRESHOLD"))
            return "Good";
        else if(value < so2Map.get("SATISFACTORY_THRESHOLD"))
            return "Satisfactory";
        else if(value < so2Map.get("MODERATE_THRESHOLD"))
            return "Moderate";
        else if(value < so2Map.get("POOR_THRESHOLD"))
            return "Poor";
        else if(value < so2Map.get("SEVERE_THRESHOLD"))
            return "Severe";
        else
            return "Hazardous";
    }

    private static float roundToOneDecimal(float value)
    {
        return (float) Math.round(value * 10) / 10;
    }

}
