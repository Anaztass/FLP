изучается(флп, джава).
изучается(кл, джава).
изучается(бдо, питон).
изучается(компзрение, питон).
изучается(физра,анатомия).

легкость(легко, питон).
легкость(сложно, анатомия).
легкость(сложно, джава).

тип_дисциплины(А,Б) :- изучается(А,В), легкость(Б,В).

