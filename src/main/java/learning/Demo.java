package learning;

import java.util.regex.Pattern;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("\\wm{2}$", "Common"));

	}

}
