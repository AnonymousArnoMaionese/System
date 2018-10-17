package me.minidev.system.object;

import java.util.ArrayList;

public class WarpManager {
	
	private ArrayList<Warp> warps = new ArrayList<>();

	public Warp getWarp(String name) {
		for(Warp warp : warps) {
			if(warp.getName().equalsIgnoreCase(name)) {
				return warp;
			}
		}
		return null;
	}
	
	public ArrayList<Warp> getWarps() {
		return warps;
	}

	public void setWarps(ArrayList<Warp> warps) {
		this.warps = warps;
	}

}