# Meta-SDL

This project is part of the MSc of Computer Science (SIIA) at the University of Western Brittany. It was developped by Pierre LE DEZ and Ilias MAOUDJ in december 2020.

## UML model

![alt text](https://github.com/PierreLEDEZ/Meta-SDL/blob/main/MetaSDLProj/model/mm.PNG)

## Model creation and HTML/JS generation

A model's declaration is done using an xmi file, this file can be generated directly in Eclipe Modeling Tools.  

### Example

#### Input

```xml
<?xml version="1.0" encoding="UTF-8"?>
<metaSDLProj:System
    xmi:version="2.0"
    xmlns:xmi="http://www.omg.org/XMI"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:metaSDLProj="http://www.example.org/metaSDLProj"
    xsi:schemaLocation="http://www.example.org/metaSDLProj metaSDLProj.ecore"
    name="PingPong">
  <processes name="pPing">
    <states name="idle" nextstate="//@processes.0/@states.1" description="Waiting for start signal">
      <input name="start"/>
      <output name="ping"/>
    </states>
    <states name="running" nextstate="//@processes.0/@states.1" description="Waiting for pong signal">
      <input name="pong"/>
      <output name="ping"/>
    </states>
  </processes>
  <processes name="pPong">
    <states name="idle" nextstate="//@processes.1/@states.0" description="Waiting for ping signal">
      <input name="ping"/>
      <output name="pong"/>
    </states>
  </processes>
  <channels name="external">
    <from name="env"/>
    <to name="pPing"/>
    <signal name="start"/>
  </channels>
  <channels name="internal_1">
    <from name="pPing"/>
    <to name="pPong"/>
    <signal name="ping"/>
  </channels>
  <channels name="internal_2">
    <from name="pPong"/>
    <to name="pPing"/>
    <signal name="pong"/>
  </channels>
  <signals name="start"/>
  <signals name="ping"/>
  <signals name="pong"/>
</metaSDLProj:System>
```

#### Output

![alt text](https://github.com/PierreLEDEZ/Meta-SDL/blob/main/MetaSDLProj/model/output.PNG)
