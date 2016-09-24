package com.aidancbrady.swagslist;

import java.util.HashSet;
import java.util.Set;

public class SessionData 
{
	public static String username;
	public static String fullName;
	public static Set<EventEntry> cachedEvents = new HashSet<EventEntry>();
	
	public static void reset()
	{
		username = null;
		fullName = null;
		cachedEvents.clear();
	}
}
