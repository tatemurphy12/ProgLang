package si413;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

/** This represents a single frame, but it is INCOMPLETE.
 * It doesn't have any parent frame or the logic to look up / reassign
 * bindings in the parent frames, which is needed for proper lexical scoping.
 * YOU WILL HAVE TO MODIFY THIS to get things to work!
 */
public class Frame {

	private Frame parentFrame;
    private Map<String, Value> bindings = new HashMap<>();
	private List<String> params = new ArrayList<>();

    public Value lookup(String name) {
        if (bindings.containsKey(name)) return bindings.get(name);
        else return Errors.error(String.format("No binding found for %s in current environemnt", name));
    }


	public void printBinds()
	{
		for (Map.Entry<String, Value> entry : bindings.entrySet())
		{
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
		}
	}

    public void assign(String name, Value val) {
        bindings.put(name, val);
    }

	public void addParam(String p)
	{
		params.add(p);
	}
	public String getParam()
	{
		String current = params.remove(0);
		params.add(current);
		return current;
	}
    public void printParams()
    {
      for (String param : params)
        System.out.println(param);
    }
}
