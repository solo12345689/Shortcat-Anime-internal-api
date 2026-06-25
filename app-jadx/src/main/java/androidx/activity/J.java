package androidx.activity;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends G {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f24192d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, Function1 function1) {
            super(z10);
            this.f24192d = function1;
        }

        @Override // androidx.activity.G
        public void d() {
            this.f24192d.invoke(this);
        }
    }

    public static final G a(H h10, androidx.lifecycle.r rVar, boolean z10, Function1 onBackPressed) {
        AbstractC5504s.h(h10, "<this>");
        AbstractC5504s.h(onBackPressed, "onBackPressed");
        a aVar = new a(z10, onBackPressed);
        if (rVar != null) {
            h10.i(rVar, aVar);
            return aVar;
        }
        h10.h(aVar);
        return aVar;
    }

    public static /* synthetic */ G b(H h10, androidx.lifecycle.r rVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(h10, rVar, z10, function1);
    }
}
