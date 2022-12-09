package com.demo.factorymethod.demo.audioexporter;

public class WAVAudioExporter extends AudioExporter {

	@Override
	public void prepareExport(AudioExporter exporter, String data) {
		System.out.println("Preparing data for WAVAudio format");
		
	}

	@Override
	public void doExport(AudioExporter exporter, String path) {
		System.out.println("Exporting WAVAudio data to path : "+path);
		
	}

}
