package Gf;

import Zd.i;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class g1 implements i.b, i.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f7578a = new g1();

    private g1() {
    }

    @Override // Zd.i
    public Zd.i a1(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // Zd.i
    public Zd.i w(Zd.i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 function2) {
        return i.b.a.a(this, obj, function2);
    }

    @Override // Zd.i.b
    public i.c getKey() {
        return this;
    }
}
