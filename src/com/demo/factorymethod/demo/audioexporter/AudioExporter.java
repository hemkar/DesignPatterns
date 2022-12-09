package com.demo.factorymethod.demo.audioexporter;

public abstract class AudioExporter {
	public abstract void prepareExport(AudioExporter exporter,String data);
	public abstract void doExport(AudioExporter exporter,String path);

}
