package com.metasdlproj.usingmodel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import com.metasdlproj.model.metaSDLProj.*;
import com.metasdlproj.model.metaSDLProj.System;
import com.metasdlproj.model.metaSDLProj.util.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;


public class SDLModelLoader {
	
	AdapterFactoryEditingDomain domain;
	
	public SDLModelLoader() {
		EPackage.Registry.INSTANCE.put(MetaSDLProjPackage.eNS_URI, MetaSDLProjPackage.eINSTANCE);
		domain = new AdapterFactoryEditingDomain(new MetaSDLProjAdapterFactory(), new BasicCommandStack());
		
		domain.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}
	
	public System loadModel(String fileName) {
		URI uri = URI.createFileURI(fileName);
		Resource resource = domain.loadResource(uri.toString());
		System sys = (System) resource.getContents().get(0);
		return sys;
	}
	
	public void saveHTML(String html, String fileName) throws IOException {
		File htmlFile = new File(fileName);
		if (htmlFile.createNewFile()) {
			java.lang.System.out.println("File created succesfully");
		} else {
			java.lang.System.out.println("File already exists");
		}
		FileWriter htmlWriter = new FileWriter(fileName);
		htmlWriter.write(html);
		htmlWriter.close();
		java.lang.System.out.println("Successfully wrote to the file");
	}
}
