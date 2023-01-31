# Liskov Substitution Principle

**Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.**

The key to understanding the Liskov Substitution Principle is thinking about _processes that use_ (sub)classes, rather than the (sub)classes themselves. In the example here, the `UnitUpgrader` purports to accept any `Apartment` (an abstract class) and upgrade it. However, once the `UnitUpgrader` starts upgrading the apartment (`upgrade(Apartment)`), it checks the specific class/subtype of the `Apartment` object to make sure it doesn't add a bedroom to a `Studio` (which by definition has zero bedrooms). A `Studio` object therefore cannot be substituted in for any `Apartment`.

How would you correct this situation?

Following the penguin example seen in class: 
1. Remove bedroom variable from Apartment
2. Introduce an ABC ApartmentWithBedrooms which extends Apartment.
3. PenthouseSuite extends ApartmentWithBedrooms
4. Studio extends Apartment
5. UnitUpgrader split into upgradeBedrooms() and upgradeSquareFootage()
