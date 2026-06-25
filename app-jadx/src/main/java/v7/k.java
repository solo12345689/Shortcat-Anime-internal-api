package v7;

import Ud.AbstractC2279u;
import dg.m;
import dg.n;
import dg.t;
import dg.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements InterfaceC6851a {

    /* JADX INFO: renamed from: c */
    private n f62004c;

    @Override // v7.InterfaceC6851a
    public void a(n cookieJar) {
        AbstractC5504s.h(cookieJar, "cookieJar");
        this.f62004c = cookieJar;
    }

    @Override // dg.n
    public List b(u url) {
        AbstractC5504s.h(url, "url");
        n nVar = this.f62004c;
        if (nVar == null) {
            return AbstractC2279u.m();
        }
        List<m> listB = nVar.b(url);
        ArrayList arrayList = new ArrayList();
        for (m mVar : listB) {
            try {
                new t.a().a(mVar.a(), mVar.b());
                arrayList.add(mVar);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    @Override // v7.InterfaceC6851a
    public void c() {
        this.f62004c = null;
    }

    @Override // dg.n
    public void d(u url, List cookies) {
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(cookies, "cookies");
        n nVar = this.f62004c;
        if (nVar != null) {
            nVar.d(url, cookies);
        }
    }
}
