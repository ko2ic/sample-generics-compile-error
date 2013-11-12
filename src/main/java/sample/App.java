package sample;

/**
 * Hello world!
 *
 */
public class App 
{
    interface Interface<E>{}

	public class CompileErrorClass<E extends EClass> implements Interface<E>, Cloneable {
		
		public final Comparable<?> thisIsCompileErrorMethod(E e) {
				LClass<? extends CompileErrorClass<?>> error = null;
				return (Comparable<?>) e.getValue(
												error);

		}  
	}	    
    
	public class EClass implements Comparable<EClass>, Cloneable {

		final <R extends EClass, L extends CompileErrorClass<R>> Object getValue(LClass<L> key) {
			return null;
		}
		
		@Override
		public int compareTo(EClass o) {
			return 0;
		}
	}
	

	
	public class LClass<L extends CompileErrorClass<? extends EClass>> {
	}    
}
