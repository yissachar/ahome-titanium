/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.titanium.mobile.client.ui.ios;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.titanium.mobile.client.ui.Point;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Continuous or instantaneous force to apply to an item.
 */
public class PushBehavior extends Behavior {

	public PushBehavior() {
		createPeer();
	}

	PushBehavior(JavaScriptObject proxy) {
		jsObj = proxy;
	}

	public native boolean isActive() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.active;
	}-*/;

	public native void setActive(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.active = value;
	}-*/;

	public native double getAngle() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.angle;
	}-*/;

	public native void setAngle(boolean value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.angle = value;
	}-*/;

	public native double getMagnitude() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.magnitude;
	}-*/;

	public native void setMagnitude(double value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.magnitude = value;
	}-*/;

	public native Point getPushDirection() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = jso.pushDirection;
		return o == null
				? null
				: @com.ait.toolkit.titanium.mobile.client.ui.Point::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native void setPushDirection(Point value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pushDirection = value.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public native String getPushMode() /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return jso.pushMode;
	}-*/;

	public native void setPushMode(String value) /*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		jso.pushMode = value;
	}-*/;

	public void createPeer() {
		jsObj = create();
	}

	public static PushBehavior from(JsObject proxy) {
		return new PushBehavior(proxy.getJsObj());
	}

	private static native JavaScriptObject create() /*-{
		return Titanium.UI.iOS.createPushBehavior();
	}-*/;

}
