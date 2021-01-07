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
		String file = "D:\\Programmes\\Eclipse\\workspace\\Meta-SDL\\MetaSDLProj\\model\\System.xmi";
		
		System sys = loader.loadModel( file );
		
		java.lang.System.out.println(sys.getName());
		java.lang.System.out.println(sys.getSignals().get(0).getName());
		

	}

}
