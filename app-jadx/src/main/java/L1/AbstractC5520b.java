package l1;

import l1.AbstractC5527i;
import p1.C5913a;

/* JADX INFO: renamed from: l1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5520b implements InterfaceC5540v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p1.f f52422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52423b;

    public AbstractC5520b(p1.f fVar, int i10) {
        this.f52422a = fVar;
        this.f52423b = C5519a.f52421a.a(i10);
    }

    @Override // l1.InterfaceC5540v
    public final void b(AbstractC5527i.b bVar, float f10, float f11) {
        String strA = C5519a.f52421a.a(bVar.b());
        C5913a c5913a = new C5913a(new char[0]);
        c5913a.u(p1.i.u(bVar.a().toString()));
        c5913a.u(p1.i.u(strA));
        c5913a.u(new p1.e(f10));
        c5913a.u(new p1.e(f11));
        this.f52422a.V(this.f52423b, c5913a);
    }
}
