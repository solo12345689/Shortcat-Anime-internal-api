package com.swmansion.rnscreens;

import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class B extends com.facebook.react.views.view.g {

    /* JADX INFO: renamed from: a */
    private a f44338a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(boolean z10, int i10, int i11, int i12, int i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(ReactContext reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
    }

    public final a getDelegate$react_native_screens_release() {
        return this.f44338a;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a aVar = this.f44338a;
        if (aVar != null) {
            aVar.a(z10, i10, i11, i12, i13);
        }
    }

    public final void setDelegate$react_native_screens_release(a aVar) {
        this.f44338a = aVar;
    }
}
