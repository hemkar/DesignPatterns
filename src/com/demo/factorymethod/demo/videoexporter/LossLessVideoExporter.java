package com.demo.factorymethod.demo.videoexporter;

public class LossLessVideoExporter extends VideoExporter {

	@Override
	public void prepareExport(VideoExporter expoeter, String data) {
		System.out.println("Preparing data for loassLess format");
		
	}

	@Override
	public void doExport(VideoExporter expoeter, String path) {
		System.out.println("Exporting lossless data to path : "+path);
		
	}

}
