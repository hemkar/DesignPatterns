package com.demo.factorymethod.demo.videoexporter;

public class H264Hi422PVideoExporter extends VideoExporter {

	@Override
	public void prepareExport(VideoExporter expoeter, String data) {
		System.out.println("Preparing data for H.264(Hi422P) format");
		
	}

	@Override
	public void doExport(VideoExporter expoeter, String path) {
		System.out.println("Exporting H.264(Hi422P) data to path : "+path);
		
	}

}
