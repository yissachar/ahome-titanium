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
package com.ait.toolkit.titanium.mobile.client.ui.iphone;

/**
 * A set of constants for the animation styles used for transitions.
 */
public class ListViewCellSelectionStyle {

    public static final int LISTVIEW_CELL_SELECTION_STYLE_BLUE = BLUE();
    public static final int LISTVIEW_CELL_SELECTION_STYLE_GRAY = GRAY();
    public static final int LISTVIEW_CELL_SELECTION_STYLE_NONE = NONE();

    private ListViewCellSelectionStyle() {
    }

    public static native final int BLUE() /*-{
		return Titanium.UI.iPhone.ListViewCellSelectionStyle.BLUE;
    }-*/;

    public static native final int GRAY() /*-{
		return Titanium.UI.iPhone.ListViewCellSelectionStyle.GRAY;
    }-*/;

    public static native final int NONE() /*-{
		return Titanium.UI.iPhone.ListViewCellSelectionStyle.NONE;
    }-*/;

}
