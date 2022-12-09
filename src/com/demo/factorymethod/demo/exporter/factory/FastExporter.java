package com.demo.factorymethod.demo.exporter.factory;

import com.demo.factorymethod.demo.audioexporter.AACAudioExporter;
import com.demo.factorymethod.demo.audioexporter.AudioExporter;
import com.demo.factorymethod.demo.videoexporter.H264BPVideoExporter;
import com.demo.factorymethod.demo.videoexporter.VideoExporter;

/*
 * Factory aimed at providing a high speed, lower quality export.
 */
public class FastExporter extends ExporterFactory {

	@Override
	public VideoExporter getVideoExporter() {
		return new H264BPVideoExporter();
	}

	@Override
	public AudioExporter getAudioExporter() {
		return new AACAudioExporter();
	}

}
