package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;

/* JADX INFO: renamed from: com.facebook.react.uimanager.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3282a0 {
    void destroyState();

    ReadableNativeMap getStateData();

    ReadableMapBuffer getStateDataMapBuffer();

    void updateState(WritableMap writableMap);
}
