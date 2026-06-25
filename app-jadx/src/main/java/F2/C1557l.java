package F2;

import F2.C1553h;
import P9.X;
import android.net.Uri;
import java.util.Map;
import q2.C6071C;
import t2.AbstractC6614a;
import w2.InterfaceC6940g;
import w2.q;

/* JADX INFO: renamed from: F2.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1557l implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6247a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C6071C.f f6248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u f6249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC6940g.a f6250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f6251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Q2.k f6252f;

    private u b(C6071C.f fVar) {
        InterfaceC6940g.a aVarC = this.f6250d;
        if (aVarC == null) {
            aVarC = new q.b().c(this.f6251e);
        }
        Uri uri = fVar.f56388c;
        K k10 = new K(uri == null ? null : uri.toString(), fVar.f56393h, aVarC);
        X it = fVar.f56390e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            k10.c((String) entry.getKey(), (String) entry.getValue());
        }
        C1553h.b bVarE = new C1553h.b().f(fVar.f56386a, J.f6153d).c(fVar.f56391f).d(fVar.f56392g).e(S9.f.o(fVar.f56395j));
        Q2.k kVar = this.f6252f;
        if (kVar != null) {
            bVarE.b(kVar);
        }
        C1553h c1553hA = bVarE.a(k10);
        c1553hA.G(0, fVar.d());
        return c1553hA;
    }

    @Override // F2.w
    public u a(C6071C c6071c) {
        u uVar;
        AbstractC6614a.e(c6071c.f56328b);
        C6071C.f fVar = c6071c.f56328b.f56431c;
        if (fVar == null) {
            return u.f6273a;
        }
        synchronized (this.f6247a) {
            try {
                if (!fVar.equals(this.f6248b)) {
                    this.f6248b = fVar;
                    this.f6249c = b(fVar);
                }
                uVar = (u) AbstractC6614a.e(this.f6249c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }
}
