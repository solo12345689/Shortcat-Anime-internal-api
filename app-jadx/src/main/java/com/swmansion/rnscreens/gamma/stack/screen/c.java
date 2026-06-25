package com.swmansion.rnscreens.gamma.stack.screen;

import Ya.e;
import Ya.f;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends Wa.a implements Wa.c {

    /* JADX INFO: renamed from: e */
    public static final a f44529e = new a(null);

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

    @Override // Wa.c
    public void a() {
        e().d(new f(f(), g()));
    }

    @Override // Wa.c
    public void b() {
        e().d(new Ya.b(f(), g()));
    }

    @Override // Wa.c
    public void c() {
        e().d(new Ya.a(f(), g()));
    }

    @Override // Wa.c
    public void d() {
        e().d(new e(f(), g()));
    }

    public final void h(boolean z10) {
        e().d(new Ya.c(f(), g(), z10));
    }
}
