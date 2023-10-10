## Aufgabe 1

Bereits erledigt

---

## Aufgabe 2
GutHub-Flow-Branching-Stragetie:
Die GitHub Flow-Strategie ist einfach, da sie nur einen Haupt-Branch und Feature-Branches verwendet.
Dies erleichtert die Zusammenarbeit und das Testen neuer Funktionen, bevor sie in die Hauptsoftware integriert werden.
Sie fördert auch eine konsistente und schrittweise Entwicklung, was zu stabileren Softwareversionen führt.
Master-Branch: Die Hauptversion des Codes.


> Wie schaut dieses Stratgie aus:
>* Feature-Branches: Eigene Zweige für neue Funktionen.
>* Arbeit am Feature: Entwicklung im Feature-Branch.
>* Pull Request (PR): Anfrage, den Feature-Branch in Master zu übernehmen.
>* Code Review: Überprüfung und Feedback.
>* Tests und Automatisierung: Automatisierte Tests und CI.
>* Merge: Verschmelzen des Feature-Branches mit Master.
>* Deployment: Bereitstellung auf Test- oder Produktionsumgebung.
>* Wiederholung: Wiederholung für weitere Funktionen/Änderungen.

---

## Aufgabe 3
Die GitHub-Flow-Branching-Strategie wurde von unserem Team bei dieser Aufgabe angewendet.
Die vorhandene Codebasis wurde in Remote Master-Branch gepushed.
Jedes Teammitglied hat den Code in seinem lokal erstelten Git-Repository gepulled und anschließend den jeweiligen neuen Feature-Branch erstellt. 
In diesem wurden anschließend die individuellen Features codiert. 
Die neuen Dateien wurden im lokalen-Repository geadded, commited und dann in den Remote-Branch gepushed. 
Zum Schluss wurde ein Pull-Request im erstellten Branch gemacht, um diesen mit dem
Master-Branch zu mergen. Die Konflikte wurden in diesem Schritt behoben und anschließend wurden die Branches zusammengeführt.

> Pull-Rebase wurde nicht expliziet ausprobiert!

---

## Aufgabe 4
### GitHub-Flow 
- Unterschied: 
>           - sehr einfach, da nur Hauptbranch "Master"
>           - Fokus auf Integration und Breitstellung
>           -Feature Branches werden dirket in den Haupt-Branhc merged, 
>            nach überprüfen und testen

- Vorteil:    
>           -einfach zu erlenen und verwenden
>           -fördert häufige Integration und bereitstellung
>           -gegeignet für agile und schnelle Iterationen
>           -transparente und schnelle Codeüberprüfung
 
>           -(Fazit: eher für kleinere und mittlere Teams passend) - 
>            da Mergeverlauf Projekthistory verschmutzen kann

- Nachteil: 
>           -nicht ideal für komplexe Projekte und viele Features und Veröffentlichungen
>           -kann Schwierigkeiten bei der Versionsverwaltung- und verfolgung bereiten

---

### Git-Flow 

- Unterschiede: 
>           -strukturierte Branching Stragtegie mit verscheidenen Branches für Features, 
>            Releases, Hotfixes
>           -betont die Trennung von Entwicklung- und Produktionsumgebungen
>           -erlaubt die gleichzeitige Arbeit an verscheidenen Versionen
- Vorteil: 
>           -klare Struktur und klare Regeln für Branches
>           -geeignet für größere und komplexere Projekte
>           -unterstützt parallele Entwicklung von Features und stabilen Versionen

- Nachteil: 
>           -komplexer und langsam für kleinere Teams
>           -kann längere Realeasezyklen haben

> Wie schaut dieses Stratgie aus:
>* Master-Branch: Stabiler Code für Produktion.
>* Develop-Branch: Aktive Entwicklung.
>* Feature-Branches: Neue Funktionen entwickeln.
>* Release-Branches: Vorbereitung und Tests für Veröffentlichung.
>* Hotfix-Branches: Sofortige Fehlerbehebungen in der Produktion

---

### GitOps 
- Unterschiede: 
>           -automatisiert die Bereitstellung und Verwaltung von
>            Infrastruktur und Anwendungen
- Vorteil: 
>           -Automatisierung und konsistente Bereitstellung und Skallierung
>           -ermöglicht DevOps-Praktiken und Continuous Deployment

- Nachteile: 
>           -komplex einzurichten
>           -erfordert Verständnis Kubernetes und Containerumgebungen
>           -möglicherweise Umschulung eines Teams, die bisher andere 
>            Git-Strategien verwenden haben.
  
> Kubernetes = Open-Source-Plattform für die Containerorchestrierung 
> und das Management von containerisierten Anwendungen
