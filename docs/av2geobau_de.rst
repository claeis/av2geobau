===================
av2geobau-Anleitung
===================

Überblick
=========

av2geobau ist ein in Java erstelltes Programm, das eine
Interlis-Transferdatei (itf) in eine DXF-Geobau Datei umwandelt. 
av2geobau funktioniert ohne Datenbank.

Die Datenstruktur der DXF-Datei ist im Prinzip sehr einfach: 
Die verschiedenen Informationen aus dem Datenmodell DM01 werden in 
verschiedene DXF-Layer abgebildet, z.B. die begehbaren LFP1 werden 
in den Layer "01111" abgebildet. Oder die Gebäude in den Layer "01211".

Der Datenumbau ist nicht konfigurierbar.

Log-Meldungen
-------------
Die Log-Meldungen sollen dem Benutzer zeigen, was das Programm macht.
Am Anfang erscheinen Angaben zur Programm-Version.
Falls das Programm ohne Fehler durchläuft, wird das am Ende ausgegeben.::
	
  Info: av2geobau-1.0.0-20190521
  ...
  Info: compile models...
  ...
  Info: ...conversion done

Bei einem Fehler wird das am Ende des Programms vermerkt. Der eigentliche 
Fehler wird aber in der Regel schon früher ausgegeben.::
	
  Info: av2geobau-1.0.0-20190521
  ...
  Info: compile models...
  ...
  Error: DM01.Bodenbedeckung.BoFlaeche_Geometrie: intersection tids 48, 48
  ...
  Error: ...conversion failed


Laufzeitanforderungen
---------------------

Das Programm setzt Java 1.8 voraus.

Lizenz
------

GNU Lesser General Public License v2.1

Funktionsweise
==============

In den folgenden Abschnitten wird die Funktionsweise anhand einzelner
Anwendungsfälle beispielhaft beschrieben. Die detaillierte Beschreibung
einzelner Funktionen ist im Kapitel „Referenz“ zu finden.

Fall 1
------

Die bestehende ITF-Datei ```dm01av.itf``` soll in die DXF-Datei ```geobau.dxf``` 
umgewandelt werden.

``java -jar av2geobau.jar dm01av.itf geobau.dxf``


Referenz
========

In den folgenden Abschnitten werden einzelne Aspekte detailliert, aber
isoliert, beschrieben. Die Funktionsweise als Ganzes wird anhand
einzelner Anwendungsfälle beispielhaft im Kapitel „Funktionsweise“
(weiter oben) beschrieben.

Aufruf-Syntax
-------------

``java -jar av2geobau.jar [Options] in.itf out.dxf``


Optionen:

+-------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| Option                        | Beschreibung                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
+===============================+============================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================+
| --modeldir path               | Dateipfade, die Modell-Dateien (ili-Dateien) enthalten. Mehrere Pfade können durch Semikolon ‚;‘ getrennt werden. Es sind auch URLs von Modell-Repositories möglich. Default ist                                                                                                                                                                                                                                                                                                                                                           |
|                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|                               | %ITF\_DIR;http://models.interlis.ch/;%JAR\_DIR                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
|                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|                               | Es werden folgende Platzhalter unterstützt:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
|                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|                               | %ITF\_DIR ist ein Platzhalter für das Verzeichnis mit der Transferdatei.                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
|                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|                               | %JAR\_DIR ist ein Platzhalter für das Verzeichnis des av2geobau Programms (av2geobau.jar Datei).                                                                                                                                                                                                                                                                                                                                                                                                                                           |
|                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
+-------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| --log filename                | Schreibt die log-Meldungen in eine Datei.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
+-------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| --proxy host                  | Definiert den Name des Hosts der als Proxy für den Zugriff auf Modell-Repositories benutzt werden soll.                                                                                                                                                                                                                                                                                                                                                                                                                                    |
+-------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| --proxyPort port              | Port auf dem Proxy.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
+-------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| --trace                       | Erzeugt zusätzliche Log-Meldungen (wichtig für Programm-Fehleranalysen)                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
+-------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| --help                        | Zeigt einen kurzen Hilfetext an.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           |
+-------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| --version                     | Zeigt die Version des Programmes an.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
+-------------------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+

Abbildungsregeln
----------------

Auf die von der Norm SN 612 020 definierten Linienbreiten und Strichlierungen wird 
verzichtet.

Verschiedene Symbole (LFP, FP, Einzelobjekte) werden als DXF-Block definiert und dann referenziert.

Fixpunkte mit einer Höheninformation werden als 3D-Objekte im DXF gespeichert.

Kreisbogen bleiben erhalten.
