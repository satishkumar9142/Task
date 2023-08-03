package com.reactiveworks.json.mainmethod;

import java.io.IOException;
import org.codehaus.jackson.JsonProcessingException;
import com.reactiveworks.json.feature.GsonAllFeature;
import com.reactiveworks.json.feature.JacksonAllfeature;
import com.reactiveworks.json.feature.JsonB_AllFeature;
import com.reactiveworks.json.feature.JsonP_AllFeature;

public class KnowTheFeature {
	
	public static void main(String[] args) throws JsonProcessingException, IOException {
		
		JacksonAllfeature jackson = new JacksonAllfeature();
		GsonAllFeature  gson = new GsonAllFeature();
		JsonB_AllFeature jsonB = new JsonB_AllFeature();
		JsonP_AllFeature jsonP = new JsonP_AllFeature();
		
		//  getJsonParseToGenericObject
		
//		jackson.getJsonParseToGenericObject();
//		gson.getJsonParseToGenericObject();
//		jsonB.getJsonParseToGenericObject();
//		jsonP.getJsonParseToGenericObject();
		
		// getJsonBindToSpecificObject
		
//		jackson.getJsonBindToSpecificObject();
//		gson.getJsonBindToSpecificObject();
//		jsonB.getJsonBindToSpecificObject();
//		jsonP.getJsonBindToSpecificObject();
		
		
//		jackson.getNullHundle();
		gson.getNullHundle();
		
		
		
	}
}
