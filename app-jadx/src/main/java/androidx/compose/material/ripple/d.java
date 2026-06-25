package androidx.compose.material.ripple;

import B.j;
import B.o;
import Gf.O;
import T.f;
import Y.h2;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;
import u0.InterfaceC6711f;
import x.InterfaceC6988H;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements InterfaceC6988H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f26536b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h2 f26537a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h2 h2Var) {
            super(0);
            this.f26537a = h2Var;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T.d invoke() {
            return (T.d) this.f26537a.getValue();
        }
    }

    public d(boolean z10, h2 h2Var) {
        this.f26535a = z10;
        this.f26536b = new e(z10, new a(h2Var));
    }

    public abstract void b(o.b bVar, O o10);

    public final void f(InterfaceC6711f interfaceC6711f, float f10, long j10) {
        this.f26536b.b(interfaceC6711f, Float.isNaN(f10) ? f.a(interfaceC6711f, this.f26535a, interfaceC6711f.f()) : interfaceC6711f.l1(f10), j10);
    }

    public abstract void g(o.b bVar);

    public final void h(j jVar, O o10) {
        this.f26536b.c(jVar, o10);
    }
}
