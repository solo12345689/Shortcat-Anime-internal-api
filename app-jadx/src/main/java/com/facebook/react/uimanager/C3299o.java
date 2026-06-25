package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.react.uimanager.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3299o extends JSApplicationCausedNativeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f37795a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3299o(String msg) {
        super(msg);
        AbstractC5504s.h(msg, "msg");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3299o(String msg, View view, Throwable cause) {
        super(msg, cause);
        AbstractC5504s.h(msg, "msg");
        AbstractC5504s.h(cause, "cause");
        this.f37795a = view;
    }
}
