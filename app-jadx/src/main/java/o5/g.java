package O5;

import android.content.Context;
import java.util.Set;
import w5.i;
import y5.n;
import z6.C7305t;
import z6.y;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7305t f13030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f13031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f13032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f13033e;

    public g(Context context, b bVar) {
        this(context, y.l(), bVar);
    }

    @Override // y5.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f get() {
        return new f(this.f13029a, this.f13031c, this.f13030b, this.f13032d, this.f13033e).K(null);
    }

    public g(Context context, y yVar, b bVar) {
        this(context, yVar, null, null, bVar);
    }

    public g(Context context, y yVar, Set set, Set set2, b bVar) {
        this.f13029a = context;
        C7305t c7305tJ = yVar.j();
        this.f13030b = c7305tJ;
        if (bVar != null && bVar.d() != null) {
            this.f13031c = bVar.d();
        } else {
            this.f13031c = new h();
        }
        this.f13031c.a(context.getResources(), R5.a.b(), yVar.b(context), yVar.q(), i.o(), c7305tJ.q(), bVar != null ? bVar.a() : null, bVar != null ? bVar.b() : null);
        this.f13032d = set;
        this.f13033e = set2;
        if (bVar != null) {
            bVar.c();
        }
    }
}
