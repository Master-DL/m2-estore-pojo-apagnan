# estore

Projet pour l'enseignement des composants logiciels

## Couplage et dépendances

2. Identifiez les objets "services" et les dépendances de leur code
   a. Combien a-t-on d'objets (pas de classe) ? Où et comment est exprimée
   cette dépendance de leurs codes ?

7
4 sont créés dans la classe Main
et 3 appelés dans les scénarios de Client

   b. Comment avez-vous déterminé cela ? Quelles activités vous ont permis
   de les identifier ?

Parcours du code ligne par lignes

   c. Quel schéma de collaboration a-t-on ?
   TODO



Services requis
L'objectif maintenant est de comprendre comment les objets deviennent couplés et
comment couplage et dépendances sont exprimés dans le code. Cette partie donne
lieu à la dernière étape du refactoring introduisant Bridge.
1. Eliminez les dépendances aux classes concrètes
   ==> Action : Remplacez les types des attributs par les types des services offerts
   ==> Action : Corrigez les appels aux méthodes des services offerts