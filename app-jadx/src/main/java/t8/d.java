package T8;

import P8.a;
import P8.e;
import Q8.InterfaceC2066n;
import Q8.r;
import R8.C2118t;
import R8.C2121w;
import R8.InterfaceC2120v;
import android.content.Context;
import n9.i;
import n9.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends P8.e implements InterfaceC2120v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a.g f17334k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0216a f17335l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final P8.a f17336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f17337n = 0;

    static {
        a.g gVar = new a.g();
        f17334k = gVar;
        c cVar = new c();
        f17335l = cVar;
        f17336m = new P8.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, C2121w c2121w) {
        super(context, f17336m, c2121w, e.a.f13564c);
    }

    @Override // R8.InterfaceC2120v
    public final i c(final C2118t c2118t) {
        r.a aVarA = r.a();
        aVarA.d(d9.d.f45082a);
        aVarA.c(false);
        aVarA.b(new InterfaceC2066n() { // from class: T8.b
            @Override // Q8.InterfaceC2066n
            public final void accept(Object obj, Object obj2) {
                int i10 = d.f17337n;
                ((a) ((e) obj).C()).K3(c2118t);
                ((j) obj2).c(null);
            }
        });
        return i(aVarA.a());
    }
}
