package c9;

import P8.a;
import P8.e;
import Q8.InterfaceC2066n;
import R8.AbstractC2115p;
import android.content.Context;

/* JADX INFO: renamed from: c9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3085b extends P8.e implements L8.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a.g f33547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0216a f33548l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final P8.a f33549m;

    static {
        a.g gVar = new a.g();
        f33547k = gVar;
        r rVar = new r();
        f33548l = rVar;
        f33549m = new P8.a("Blockstore.API", rVar, gVar);
    }

    public C3085b(Context context) {
        super(context, f33549m, a.d.f13552O, e.a.f13564c);
    }

    @Override // L8.b
    public final n9.i a(final L8.f fVar) {
        return m(Q8.r.a().d(AbstractC3086c.f33553d, AbstractC3086c.f33555f).b(new InterfaceC2066n() { // from class: c9.p
            @Override // Q8.InterfaceC2066n
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).C()).K3(new s(this.f33565a, (n9.j) obj2), fVar);
            }
        }).e(1645).c(false).a());
    }

    @Override // L8.b
    public final n9.i b(final L8.c cVar) {
        AbstractC2115p.m(cVar, "DeleteBytesRequest cannot be null");
        return m(Q8.r.a().d(AbstractC3086c.f33556g).b(new InterfaceC2066n() { // from class: c9.o
            @Override // Q8.InterfaceC2066n
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).C()).I3(new u(this.f33563a, (n9.j) obj2), cVar);
            }
        }).c(false).e(1669).a());
    }

    @Override // L8.b
    public final n9.i e(final L8.d dVar) {
        AbstractC2115p.m(dVar, "RetrieveBytesRequest cannot be null");
        return k(Q8.r.a().d(AbstractC3086c.f33557h).b(new InterfaceC2066n() { // from class: c9.q
            @Override // Q8.InterfaceC2066n
            public final void accept(Object obj, Object obj2) {
                ((h) ((g) obj).C()).J3(new t(this.f33567a, (n9.j) obj2), dVar);
            }
        }).c(false).e(1668).a());
    }
}
