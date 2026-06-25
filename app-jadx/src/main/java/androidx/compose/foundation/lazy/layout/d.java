package androidx.compose.foundation.lazy.layout;

import F.I;
import F.K;
import F.N;
import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final N f26286a;

    /* JADX INFO: renamed from: b */
    private final Function1 f26287b;

    /* JADX INFO: renamed from: c */
    private final K f26288c;

    /* JADX INFO: renamed from: d */
    private h f26289d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a implements I {

        /* JADX INFO: renamed from: a */
        private final List f26290a = new ArrayList();

        public a() {
        }

        @Override // F.I
        public void a(int i10) {
            c(i10, e.f26292a);
        }

        public final List b() {
            return this.f26290a;
        }

        public void c(int i10, long j10) {
            h hVarC = d.this.c();
            if (hVarC == null) {
                return;
            }
            this.f26290a.add(hVarC.c(i10, j10, d.this.f26288c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a();

        void cancel();
    }

    public d(N n10, Function1 function1) {
        this.f26286a = n10;
        this.f26287b = function1;
        this.f26288c = new K();
    }

    public final List b() {
        Function1 function1 = this.f26287b;
        if (function1 == null) {
            return AbstractC2279u.m();
        }
        a aVar = new a();
        function1.invoke(aVar);
        return aVar.b();
    }

    public final h c() {
        return this.f26289d;
    }

    public final N d() {
        return this.f26286a;
    }

    public final b e(int i10, long j10) {
        b bVarD;
        h hVar = this.f26289d;
        return (hVar == null || (bVarD = hVar.d(i10, j10, this.f26288c)) == null) ? androidx.compose.foundation.lazy.layout.a.f26280a : bVarD;
    }

    public final void f(h hVar) {
        this.f26289d = hVar;
    }

    public /* synthetic */ d(N n10, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : n10, (i10 & 2) != 0 ? null : function1);
    }
}
