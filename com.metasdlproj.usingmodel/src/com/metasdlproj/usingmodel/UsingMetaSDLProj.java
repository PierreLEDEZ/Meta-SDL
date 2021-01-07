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
		SDLModelPrinter printer = new SDLModelPrinter();
		String file = "D:\\Programmes\\Eclipse\\workspace\\Meta-SDL\\MetaSDLProj\\model\\System.xmi";
		
		System sys = loader.loadModel( file );
		
		java.lang.System.out.println(printer.doSwitch(sys));

	}

}
