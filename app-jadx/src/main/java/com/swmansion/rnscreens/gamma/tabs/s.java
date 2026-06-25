package com.swmansion.rnscreens.gamma.tabs;

import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends Wa.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ReactContext reactContext, int i10) {
        super(reactContext, i10);
        AbstractC5504s.h(reactContext, "reactContext");
    }

    public final void h(String tabKey, int i10, boolean z10) {
        AbstractC5504s.h(tabKey, "tabKey");
        e().d(new Za.e(f(), g(), tabKey, i10, z10));
    }
}
