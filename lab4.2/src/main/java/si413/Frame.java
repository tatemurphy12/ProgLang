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

    public void assign(String name, Value val) {
        bindings.put(name, val);
    }
	public void addParentBindings()
	{
		if (parentFrame == null)
		{
			Errors.error(String.format("Error: I am the parent frame."));
		}
		else
		{
			Map<String, Value> parentBinds = parentFrame.getBinds();
			bindings.putAll(parentBinds);
		}
	}
	private Map<String, Value> getBinds() { return bindings; }
	public void setParent(Frame parent) { parentFrame = parent; }
	public Frame getParent() { return parentFrame; }

}
