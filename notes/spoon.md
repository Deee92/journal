## Spoon

method body for abstract methods always null, even if they have statements; use Optional

getBody().getStatements() for an empty method is an empty list

[TypeFilter(CtAssignment.class)](http://spoon.gforge.inria.fr/filter.html) for assignment statements

ReturnOrThrowFilter() for return and throw statements 
