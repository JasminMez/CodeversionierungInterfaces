# Die folgenden Punkte wurden von:
- Katharina Schimpfößl
- Wechner Christopher
- Jasmin MezeHausken

## Aufgabe 1
Bereits erledig

## Aufgabe 2
Die GitHub-Flow-Branching-Strategie ist eine Methode um die Zusammenarbeit in gemeinsamen Programmierprojekten zu strukturieren und um
ungewollten Codeverlust zu verhindern. Es gibt einen stabilen Haupt-Branch und jede neue Funktion wird in einem seperaten Branch entwickelt. Wenn dieses
Feature fertig ist, wird ein Pull-Request gemacht. Wobei neue Änderungen am Code geprüft und diskutiert werden. Wenn der Code daraufhin bestätigt wird, kann dieser in den Remote-
Main-Branch gemerged werden und der Feature-Branch wird danach gelöscht. Dieser Prozess wird für jedes neue Feature wiederholt.

## Aufgabe 3
Die GitHub-Flow-Branching-Strategie wurde von unserem Team bei dieser Aufgabe angewendet.Die vorhandene Codebasis wurde in Remote Master-Branch gepushed.
Jedes Teammitglied hat den Code in seinem lokal ersteltes Git-Repository
gepulled und anschließend den jeweiligen neuen Feature-Branch erstellt. In diesem wurden anschließend die individuellen Features codiert. Die neuen Dateien
wurden im lokalen-Repository geadded, commited und dann in den Remote-Branch gepushed. Zum Schluss wurde ein Pull-Request im erstellten Branch gemacht, um diesen mit dem
Master-Branch zu mergen. Die Konflikte wurden in diesem Schritt behoben und anschließend wurden die Branches zusammengeführt.

## Aufgabe 4
- GitHub-Flow Vorteil: einfach und linear Nachteil: kein separater Branch für Hotfixes und Releases
- Git-Flow Vorteil: für "Fixes" gibt es extra Branches Nachteil: komplexer und langsam für kleinere Teams
- GitOps Vorteil: Automatisierung Nachteile: komplex einzurichten