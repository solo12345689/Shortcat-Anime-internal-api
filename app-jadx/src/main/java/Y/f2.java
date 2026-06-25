package Y;

import java.util.Iterator;
import je.InterfaceC5371a;
import k0.InterfaceC5421k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class f2 implements InterfaceC5421k, Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: a */
    private final E1 f22321a;

    /* JADX INFO: renamed from: b */
    private final int f22322b;

    /* JADX INFO: renamed from: c */
    private final AbstractC2411h0 f22323c;

    /* JADX INFO: renamed from: d */
    private final e2 f22324d;

    /* JADX INFO: renamed from: e */
    private final Object f22325e;

    /* JADX INFO: renamed from: f */
    private final Iterable f22326f = this;

    public f2(E1 e12, int i10, AbstractC2411h0 abstractC2411h0, e2 e2Var) {
        this.f22321a = e12;
        this.f22322b = i10;
        this.f22323c = abstractC2411h0;
        this.f22324d = e2Var;
        this.f22325e = Integer.valueOf(abstractC2411h0.f());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new d2(this.f22321a, this.f22322b, this.f22323c, this.f22324d);
    }
}
