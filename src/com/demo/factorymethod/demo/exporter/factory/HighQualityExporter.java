package com.demo.factorymethod.demo.exporter.factory;

import com.demo.factorymethod.demo.audioexporter.AACAudioExporter;
import com.demo.factorymethod.demo.audioexporter.AudioExporter;
import com.demo.factorymethod.demo.videoexporter.H264Hi422PVideoExporter;
import com.demo.factorymethod.demo.videoexporter.VideoExporter;

/**
 * @author hemkar kumar
 * Factory aimed at providing a slower speed, high quality exporter.
 */
public class HighQualityExporter extends ExporterFactory {

	@Override
	public VideoExporter getVideoExporter() {
		// TODO Auto-generated method stub
		return new H264Hi422PVideoExporter();
	}

	@Override
	public AudioExporter getAudioExporter() {
		// TODO Auto-generated method stub
		return new AACAudioExporter();
	}

}
