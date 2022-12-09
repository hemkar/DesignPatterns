package com.demo.factorymethod.demo.exporter.factory;

import com.demo.factorymethod.demo.audioexporter.AudioExporter;
import com.demo.factorymethod.demo.videoexporter.VideoExporter;

/* A factory that represents combination of audio and video exporter.
 * A factory doesn't maintain any of the instance it creates. 
 * We don't have to tell factory we are done using object.
*/
public abstract class ExporterFactory {
	public abstract VideoExporter getVideoExporter();
	public abstract AudioExporter getAudioExporter();
}
