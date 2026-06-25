package Z0;

import Gf.C1627p;
import Gf.InterfaceC1623n;
import H1.j;
import Td.u;
import Y0.AbstractC2468c;
import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements AbstractC2468c.a {

    /* JADX INFO: renamed from: a */
    public static final f f23114a = new f();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends j.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1623n f23115a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AbstractC2468c f23116b;

        a(InterfaceC1623n interfaceC1623n, AbstractC2468c abstractC2468c) {
            this.f23115a = interfaceC1623n;
            this.f23116b = abstractC2468c;
        }

        @Override // H1.j.c
        public void a(int i10) {
            this.f23115a.L(new IllegalStateException("Failed to load " + this.f23116b + " (reason=" + i10 + ", " + e.c(i10) + ')'));
        }

        @Override // H1.j.c
        public void b(Typeface typeface) {
            this.f23115a.resumeWith(u.b(typeface));
        }
    }

    private f() {
    }

    public final Handler d() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return h.f23117a.a(looperMyLooper);
    }

    @Override // Y0.AbstractC2468c.a
    public Object a(Context context, AbstractC2468c abstractC2468c, Zd.e eVar) {
        return e(context, abstractC2468c, Z0.a.f23102a, eVar);
    }

    @Override // Y0.AbstractC2468c.a
    public Typeface b(Context context, AbstractC2468c abstractC2468c) {
        throw new IllegalStateException(("GoogleFont only support async loading: " + abstractC2468c).toString());
    }

    public final Object e(Context context, AbstractC2468c abstractC2468c, b bVar, Zd.e eVar) {
        if (!(abstractC2468c instanceof d)) {
            throw new IllegalArgumentException(("Only GoogleFontImpl supported (actual " + abstractC2468c + ')').toString());
        }
        d dVar = (d) abstractC2468c;
        H1.f fVarG = dVar.g();
        int i10 = dVar.i();
        C1627p c1627p = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p.C();
        bVar.a(context, fVarG, i10, f23114a.d(), new a(c1627p, abstractC2468c));
        Object objV = c1627p.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV;
    }
}
