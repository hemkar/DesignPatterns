package com.demo.factorymethod.demo.videoexporter;

public abstract class VideoExporter {
	public abstract void prepareExport(VideoExporter expoeter,String data);
	public abstract void doExport(VideoExporter expoeter,String path);

}
