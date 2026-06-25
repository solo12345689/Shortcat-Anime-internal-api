package com.swmansion.rnscreens.gamma.tabs;

import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends Wa.a {

    /* JADX INFO: renamed from: e */
    public static final a f44557e = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReactContext reactContext, int i10) {
        super(reactContext, i10);
        AbstractC5504s.h(reactContext, "reactContext");
    }

    public final void a() {
        d.b(g(), "onWillDisappear");
        e().d(new Za.d(f(), g()));
    }

    public final void b() {
        d.b(g(), "onDidDisappear");
        e().d(new Za.b(f(), g()));
    }

    public final void c() {
        d.b(g(), "onDidAppear");
        e().d(new Za.a(f(), g()));
    }

    public final void d() {
        d.b(g(), "onWillAppear");
        e().d(new Za.c(f(), g()));
    }
}
