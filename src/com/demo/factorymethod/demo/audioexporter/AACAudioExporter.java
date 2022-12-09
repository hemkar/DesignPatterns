package com.demo.factorymethod.demo.audioexporter;

public class AACAudioExporter extends AudioExporter {

	@Override
	public void prepareExport(AudioExporter expoeter, String data) {
		System.out.println("Preparing data for AAC format");
		
	}

	@Override
	public void doExport(AudioExporter expoeter, String path) {
		System.out.println("Exporting AAC data to path : "+path);
		
	}

}
