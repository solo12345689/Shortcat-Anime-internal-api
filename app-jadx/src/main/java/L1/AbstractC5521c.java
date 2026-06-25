package l1;

import l1.AbstractC5527i;
import p1.C5913a;

/* JADX INFO: renamed from: l1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5521c implements InterfaceC5517E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p1.f f52424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52425b;

    public AbstractC5521c(p1.f fVar, int i10) {
        this.f52424a = fVar;
        this.f52425b = C5519a.f52421a.b(i10);
    }

    @Override // l1.InterfaceC5517E
    public final void b(AbstractC5527i.c cVar, float f10, float f11) {
        String strB = C5519a.f52421a.b(cVar.b());
        C5913a c5913a = new C5913a(new char[0]);
        c5913a.u(p1.i.u(cVar.a().toString()));
        c5913a.u(p1.i.u(strB));
        c5913a.u(new p1.e(f10));
        c5913a.u(new p1.e(f11));
        this.f52424a.V(this.f52425b, c5913a);
    }
}
