package com.metasdlproj.usingmodel;

import java.io.*;
import org.eclipse.emf.ecore.EPackage;
import com.metasdlproj.model.metaSDLProj.*;
import com.metasdlproj.model.metaSDLProj.System;
import com.metasdlproj.model.metaSDLProj.util.*;

public class UsingMetaSDLProj {
	
	

	public static void main(String[] args) {
		MetaSDLProjFactory factory = MetaSDLProjFactory.eINSTANCE;
		
		SDLModelLoader loader = new SDLModelLoader();
		SDLModelHTML htmlPrinter = new SDLModelHTML();
		SDLModelJavaScript jsPrinter = new SDLModelJavaScript();
		SDLModelPrinter printer = new SDLModelPrinter();

		//=== Adapt this 3 paths with correct ones ===
		String file = "D:\\Programmes\\Eclipse\\workspace\\Meta-SDL\\MetaSDLProj\\model\\PingPong.xmi";
		String html_output = "D:\\Programmes\\Eclipse\\workspace\\Meta-SDL\\MetaSDLProj\\model\\PingPong.html";
		String js_output = "D:\\Programmes\\Eclipse\\workspace\\Meta-SDL\\MetaSDLProj\\model\\PingPong.js";
		//============================================
		
		System sys = loader.loadModel( file );
		
		//java.lang.System.out.println(printer.doSwitch(sys));
		
		String html = htmlPrinter.doSwitch(sys);
		String js = jsPrinter.doSwitch(sys);
		
		//java.lang.System.out.println(html);
		//java.lang.System.out.println(js);
		
		try {
			loader.saveHTML(html, html_output);
			loader.saveHTML(js, js_output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
