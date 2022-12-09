package com.demo.main;

import java.util.Scanner;

import com.demo.factorymethod.demo.audioexporter.AACAudioExporter;
import com.demo.factorymethod.demo.audioexporter.AudioExporter;
import com.demo.factorymethod.demo.audioexporter.WAVAudioExporter;
import com.demo.factorymethod.demo.videoexporter.H264BPVideoExporter;
import com.demo.factorymethod.demo.videoexporter.H264Hi422PVideoExporter;
import com.demo.factorymethod.demo.videoexporter.LossLessVideoExporter;
import com.demo.factorymethod.demo.videoexporter.VideoExporter;

public class TestVideoAudoExample {
	public static void main(String[] args) {
		VideoExporter vExporter;
		AudioExporter aExporter;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter desired output quality (low, high, master) :");
			String quality = sc.nextLine();
			if(quality=="low") {
				 vExporter = new H264BPVideoExporter();
				 aExporter = new AACAudioExporter();
			}else if(quality=="high") {
				 vExporter = new H264Hi422PVideoExporter();
				 aExporter = new AACAudioExporter();
			}else {
				vExporter = new LossLessVideoExporter();
				 aExporter = new WAVAudioExporter();
			}
		}  
		vExporter.prepareExport(vExporter, "Sample data");
		vExporter.doExport(vExporter, "abc/path");
		
		aExporter.prepareExport(aExporter, "Sample data");
		aExporter.doExport(aExporter, "abc/path");
		
	}
}
