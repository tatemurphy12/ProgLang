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

    public Value lookup(String name) 
	{
		if (bindings.containsKey(name))
			return bindings.get(name);
		if (parentFrame == null)
		{
			Errors.error(String.format("%s is not a binding", name));
			return null;
		}
		else
			return parentFrame.lookup(name);
	}

    public void assign(String name, Value val) {
		Frame definedFrame = assignHelper(name);
		if (definedFrame == null)
			bindings.put(name, val);
		else
			definedFrame.bindings.put(name, val);
    }

	private Frame assignHelper(String name)
	{
		if (bindings.containsKey(name))
			return this;
		else if (parentFrame != null)
				return parentFrame.assignHelper(name);
		else
			return null;	
	}
	private Map<String, Value> getBinds() { return bindings; }
	public void setParent(Frame parent) { parentFrame = parent; }
	public Frame getParent() { return parentFrame; }

}
