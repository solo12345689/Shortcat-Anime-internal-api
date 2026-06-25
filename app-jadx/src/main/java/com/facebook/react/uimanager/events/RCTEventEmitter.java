package com.facebook.react.uimanager.events;

import Td.InterfaceC2154e;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "Lcom/facebook/react/bridge/JavaScriptModule;", "", "targetTag", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "params", "LTd/L;", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "Lcom/facebook/react/bridge/WritableArray;", "touches", "changedIndices", "receiveTouches", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InterfaceC2154e
public interface RCTEventEmitter extends JavaScriptModule {
    @InterfaceC2154e
    void receiveEvent(int targetTag, String eventName, WritableMap params);

    @InterfaceC2154e
    void receiveTouches(String eventName, WritableArray touches, WritableArray changedIndices);
}
