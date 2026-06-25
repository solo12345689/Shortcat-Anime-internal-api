package Zd;

import Zd.i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i.c f23268a;

    public a(i.c key) {
        AbstractC5504s.h(key, "key");
        this.f23268a = key;
    }

    @Override // Zd.i
    public i a1(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // Zd.i.b
    public i.c getKey() {
        return this.f23268a;
    }

    @Override // Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // Zd.i
    public i w(i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 function2) {
        return i.b.a.a(this, obj, function2);
    }
}
