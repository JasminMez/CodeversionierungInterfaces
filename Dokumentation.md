# Dokumentation Codeversionierung

1. Bereits erledig

2. Die GitHub-Flow-Branching-Strategie ist eine Methode um die Zusammenarbeit in gemeinsamen Programmierprojekten zu strukturieren und um
ungewollten Codeverlust zu verhindern. Es gibt einen stabilen Haupt-Branch und jede neue Funtion wird in einem seperaten Branch entwickelt. Wenn dieses 
Feature fertig ist wird ein Pull Request gemacht wobe die neuen Änderungen geprüft und diskutiert. Wenn der Code bestätigt wird, wird dieser in den Remote-
Main-Branch gemerged und der Feature-Branch wird gelöscht. Dieser Prozess wird für jedes neue Feature wiederholt

3. Die GitHub-Flow-Branching-Strategie wurde von unserem Team bei dieser Aufgabe angewendet.Die vorhandene Codebasis wurde in Remote Master-Branch gepushed. 
Jedes Teammitglied hat den Code in sein lokal ersteltes Gitreposetory
gepulled und anschließend den jeweiligen neuen Feature-Branch erstellt. In diesem wurden dann die individuellen Features codiert. Die neuen Dateien
wurden geadded, commited und dann in den Remote-Branch gepushed. Zum Schluss wurde ein Pull-Request im erstellten Branch gemacht um diesen mit dem
Master-Branch zu mergen. Die Konflikte wurden in diesem Schritt behoben und anschließend wurden die Branches zusammengeführt.

4. GitHub-Flow Vorteile: Einfach und linear Nachteile: kein separater Branch für Hotfixes und Releases
Git-Flow Vorteile: Für Fixe gibt es extra Branches Ein Nachteil: komplexer und langsam für kleinere Teams
GitOps Vorteile: Automatisierung Nachteile: komplex einzurichten

