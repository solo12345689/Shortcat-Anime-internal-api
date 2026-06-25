package androidx.compose.ui.platform;

import Y.InterfaceC2464z0;
import Zd.i;
import kotlin.jvm.functions.Function2;
import l0.k;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2682a1 implements l0.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2464z0 f27413a = Y.W0.a(1.0f);

    @Override // l0.k
    public float E() {
        return this.f27413a.c();
    }

    public void a(float f10) {
        this.f27413a.k(f10);
    }

    @Override // Zd.i
    public Zd.i a1(i.c cVar) {
        return k.a.c(this, cVar);
    }

    @Override // Zd.i.b, Zd.i
    public i.b l(i.c cVar) {
        return k.a.b(this, cVar);
    }

    @Override // Zd.i
    public Zd.i w(Zd.i iVar) {
        return k.a.d(this, iVar);
    }

    @Override // Zd.i
    public Object y1(Object obj, Function2 function2) {
        return k.a.a(this, obj, function2);
    }
}
