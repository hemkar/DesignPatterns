package com.demo.factorymethod.demo.videoexporter;

public class H264BPVideoExporter extends VideoExporter {

	@Override
	public void prepareExport(VideoExporter expoeter, String data) {
		System.out.println("Preparing data for H.264(BaseLine) format : "+data);
		
	}

	@Override
	public void doExport(VideoExporter expoeter, String path) {
		System.out.println("Exporting H.264(BaseLine) data to path : "+path);
		
	}

}
