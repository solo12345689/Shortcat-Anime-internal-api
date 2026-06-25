package Gf;

import Gf.K;
import Lf.AbstractC1903j;
import Lf.AbstractC1906m;
import Lf.C1902i;
import Lf.C1905l;
import Zd.f;
import Zd.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class K extends Zd.a implements Zd.f {

    /* JADX INFO: renamed from: b */
    public static final a f7520b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Zd.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final K d(i.b bVar) {
            if (bVar instanceof K) {
                return (K) bVar;
            }
            return null;
        }

        private a() {
            super(Zd.f.f23273S, new Function1() { // from class: Gf.J
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return K.a.d((i.b) obj);
                }
            });
        }
    }

    public K() {
        super(Zd.f.f23273S);
    }

    public static /* synthetic */ K a2(K k10, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return k10.Z1(i10, str);
    }

    public abstract void D1(Zd.i iVar, Runnable runnable);

    public void O1(Zd.i iVar, Runnable runnable) {
        AbstractC1903j.c(this, iVar, runnable);
    }

    public boolean S1(Zd.i iVar) {
        return true;
    }

    public /* synthetic */ K Y1(int i10) {
        return Z1(i10, null);
    }

    public K Z1(int i10, String str) {
        AbstractC1906m.a(i10);
        return new C1905l(this, i10, str);
    }

    @Override // Zd.a, Zd.i
    public Zd.i a1(i.c cVar) {
        return f.a.b(this, cVar);
    }

    @Override // Zd.f
    public final void k0(Zd.e eVar) {
        AbstractC5504s.f(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C1902i) eVar).r();
    }

    @Override // Zd.a, Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return f.a.a(this, cVar);
    }

    public String toString() {
        return T.a(this) + '@' + T.b(this);
    }

    @Override // Zd.f
    public final Zd.e u1(Zd.e eVar) {
        return new C1902i(this, eVar);
    }
}
