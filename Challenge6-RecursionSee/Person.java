/**
 * @author xma29
 *
 */
public class Person
{
private final String name;
private final int age;
private final char gender;
private final Person child1; //left child
private final Person child2; //right child

public Person(String name, int age, char gender, Person c1, Person c2)
{
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.child1 = c1;
    this.child2 = c2;
}

public String toString()
{
    return name+"*"+age+"*"+gender;
}

public String getName() 
{
	return name;
}

public int getAge() 
{
	return age;
}

public char getGender() 
{
	return gender;
}

public boolean equals(Person p)
{
	return (this.name.equals(p.name)) &&
			(this.age==p.age) &&
			(this.gender==p.gender);
}


public void print() 
{
   System.out.println(this);
   if(child1 != null)
       child1.print();
   if(child2 != null)
       child2.print();
   
}

public int count() // total person count including this object
{
	if (this.child1 == null && this.child2 == null) {
		return 1;
	} else if (this.child1 == null ) {
		return 1 + this.child2.count();
	}else if(this.child2 == null) {
		return 1 + this.child1.count();
	}
	return 1 + this.child1.count() + this.child2.count();
}
private int countGrandChildren(int g) {
	if (g == 0) {
		return 1;
	}
	if ((this.child1 != null || this.child2 != null) && g > 0) {
		if (this.child1 == null) {
			return this.child2.countGrandChildren(g - 1);
		} else if (this.child1 == null) {
			return this.child1.countGrandChildren(g - 1);
		} else {
			return this.child1.countGrandChildren(g - 1) + this.child2.countGrandChildren(g - 1);
		}
	}
	return 0;	
	
}
public int countGrandChildren() // but not greatGrandChildren
{
	return countGrandChildren(2);
}

public int countMaxGenerations()
{
	if (this.child1 == null && this.child2 == null) {
		return 1;
	} else if (this.child1 == null) {
		return 1 + this.child2.countMaxGenerations();
	} else if (this.child2 == null) {
		return 1 + this.child1.countMaxGenerations();
	} else if (this.child1 != null && this.child2 != null) {
		if (this.child1.countMaxGenerations() > this.child2.countMaxGenerations()) {
			return 1 + child1.countMaxGenerations();
		} else {
			return 1 + child2.countMaxGenerations();
		}
	}
	return 0;
	
}

public int countGender(char gen)
{
	if (this.child1 == null && this.child2 == null) {
		if (this.gender == gen) {
			return 1;
		} else {
			return 0;
		}
	}
	if (child1 !=null && child2 != null) {
		if (this.gender == gen) {
			return 1 + child1.countGender(gen) + child2.countGender(gen);
		} else {
			return child1.countGender(gen) + child2.countGender(gen);
		}
	} else if (this.child1 == null) {
		if (this.gender == gen) {
			return 1 + child2.countGender(gen);
			} else {
				return child2.countGender(gen);
			} 
	} else if (this.child2 == null) {
		if (this.gender ==  gen) {
			return 1 + child1.countGender(gen);
			} else {
				return child1.countGender(gen);
			}
	}	
	return 0;
}


public Person search(String name, int maxGeneration)
{
	Person r = null;
	if (r == null && this.name.equals(name)) {
		return this;
	}
	if (maxGeneration == 0 || (this.child1 == null && this.child2 == null ) ) {
		if (this.name.equals(name)) {
			return this;
		}
		return null;
	}
	
	if (maxGeneration != 0 && (this.child1 != null || this.child2 != null )) {
		
		if (this.child1 == null) {
			r = this.child2.search(name, maxGeneration - 1);
			if (r != null && r.name.equals(name)) {
				return r;
			}
		} else if (this.child2 == null) {
				r = this.child1.search(name, maxGeneration - 1);
				if (r != null && r.name.equals(name)) {
					return r;
				}	
		} else {
			r = this.child2.search(name, maxGeneration - 1);
			if (r != null && r.name.equals(name)) {
				return r;
			}
			
			r = this.child1.search(name, maxGeneration - 1);
			if (r != null && r.name.equals(name)) {
				return r;
			}	
		}		
	}	
	return r;
}


} // end of class