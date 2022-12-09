package com.demo.factorymethod.demo.exporter.factory;

import com.demo.factorymethod.demo.audioexporter.AudioExporter;
import com.demo.factorymethod.demo.audioexporter.WAVAudioExporter;
import com.demo.factorymethod.demo.videoexporter.LossLessVideoExporter;
import com.demo.factorymethod.demo.videoexporter.VideoExporter;

/**
 * 
 * @author hemkar kumar
 * Factory aimed at providing a low speed, master quality exporter.
 */
public class MasterQualityExporter extends ExporterFactory{

	@Override
	public VideoExporter getVideoExporter() {
		return new LossLessVideoExporter();
	}

	@Override
	public AudioExporter getAudioExporter() {
		return new WAVAudioExporter();
	}

}
