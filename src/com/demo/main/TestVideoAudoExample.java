package com.demo.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.demo.factorymethod.demo.audioexporter.AudioExporter;
import com.demo.factorymethod.demo.exporter.factory.ExporterFactory;
import com.demo.factorymethod.demo.exporter.factory.FastExporter;
import com.demo.factorymethod.demo.exporter.factory.HighQualityExporter;
import com.demo.factorymethod.demo.exporter.factory.MasterQualityExporter;
import com.demo.factorymethod.demo.videoexporter.VideoExporter;

/*
 * This version of main has less coupling and high cohesion compared to previous version.
 *
 */
public class TestVideoAudoExample {
	
	/*
	 * This function got added in order to reduce coupling and increase cohesion
	 * Most of the time we use map to return a specific factory in factory method design pattern
	 * Responsibility of this function is to construct an exporter factory based on the user's preferences
	 */
	public static ExporterFactory getSpecificFactory() {
		Map<String, ExporterFactory> factories = new HashMap<>();
		factories.put("low", new FastExporter());
		factories.put("high", new HighQualityExporter());
		factories.put("master", new MasterQualityExporter());
		
		// Read input from user and return specific factory
		System.out.println("Enter desired output quality (low, high, master) :");
		try (Scanner sc = new Scanner(System.in)) {
			String quality = sc.nextLine();
			if("low".equals(quality) || "high".equals(quality) || "master".equals(quality) ) {
				return factories.get(quality);
			}else {
				return null;
			}
		}
	}
	
	/**
	 * 
	 * @param args
	 * Main doesn't need to know anything specific about the expoerter.Heence less coupling.
	 * Its responsibility is just to get a factory.
	 */
	public static void main(String[] args) {
		
		ExporterFactory factory = getSpecificFactory();
		
		VideoExporter vExporter = factory.getVideoExporter();
		AudioExporter aExporter = factory.getAudioExporter();

		vExporter.prepareExport(vExporter, "test/Vdata");
		vExporter.doExport(vExporter, "test/Vpath");
		
		aExporter.prepareExport(aExporter, "test/Adata");
		aExporter.doExport(aExporter, "test/Apath");
		
	}
}
