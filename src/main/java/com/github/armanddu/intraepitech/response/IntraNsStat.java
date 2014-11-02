package com.github.armanddu.intraepitech.response;

/*
 {
 "active":30.8,
 "idle":0,
 "out_active":41.1,
 "out_idle":0,
 "nslog_norm":25
 }
 */

public class IntraNsStat {
	private Number	active;
	private Number	idle;
	private Number	out_active;
	private Number	out_idle;
	private Number	nslog_norm;

	public Number getActive() {
		return active;
	}

	public void setActive(Number active) {
		this.active = active;
	}

	public Number getIdle() {
		return idle;
	}

	public void setIdle(Number idle) {
		this.idle = idle;
	}

	public Number getOut_active() {
		return out_active;
	}

	public void setOut_active(Number out_active) {
		this.out_active = out_active;
	}

	public Number getOut_idle() {
		return out_idle;
	}

	public void setOut_idle(Number out_idle) {
		this.out_idle = out_idle;
	}

	public Number getNslog_norm() {
		return nslog_norm;
	}

	public void setNslog_norm(Number nslog_norm) {
		this.nslog_norm = nslog_norm;
	}

}
