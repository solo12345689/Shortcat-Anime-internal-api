package jg;

import dg.C4618A;
import dg.C4620a;
import dg.G;
import dg.r;
import dg.u;
import fg.AbstractC4807e;
import java.io.IOException;
import jg.j;
import kg.InterfaceC5481d;
import kotlin.jvm.internal.AbstractC5504s;
import mg.C5695a;
import mg.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final g f51844a;

    /* JADX INFO: renamed from: b */
    private final C4620a f51845b;

    /* JADX INFO: renamed from: c */
    private final e f51846c;

    /* JADX INFO: renamed from: d */
    private final r f51847d;

    /* JADX INFO: renamed from: e */
    private j.b f51848e;

    /* JADX INFO: renamed from: f */
    private j f51849f;

    /* JADX INFO: renamed from: g */
    private int f51850g;

    /* JADX INFO: renamed from: h */
    private int f51851h;

    /* JADX INFO: renamed from: i */
    private int f51852i;

    /* JADX INFO: renamed from: j */
    private G f51853j;

    public d(g connectionPool, C4620a address, e call, r eventListener) {
        AbstractC5504s.h(connectionPool, "connectionPool");
        AbstractC5504s.h(address, "address");
        AbstractC5504s.h(call, "call");
        AbstractC5504s.h(eventListener, "eventListener");
        this.f51844a = connectionPool;
        this.f51845b = address;
        this.f51846c = call;
        this.f51847d = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final jg.f b(int r13, int r14, int r15, int r16, boolean r17) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.d.b(int, int, int, int, boolean):jg.f");
    }

    private final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        while (true) {
            f fVarB = b(i10, i11, i12, i13, z10);
            boolean z12 = z10;
            int i14 = i13;
            int i15 = i12;
            int i16 = i11;
            int i17 = i10;
            if (fVarB.u(z11)) {
                return fVarB;
            }
            fVarB.z();
            if (this.f51853j == null) {
                j.b bVar = this.f51848e;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    j jVar = this.f51849f;
                    if (!(jVar != null ? jVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i10 = i17;
            i11 = i16;
            i12 = i15;
            i13 = i14;
            z10 = z12;
        }
    }

    private final G f() {
        f fVarM;
        if (this.f51850g > 1 || this.f51851h > 1 || this.f51852i > 0 || (fVarM = this.f51846c.m()) == null) {
            return null;
        }
        synchronized (fVarM) {
            if (fVarM.q() != 0) {
                return null;
            }
            if (AbstractC4807e.j(fVarM.A().a().l(), this.f51845b.l())) {
                return fVarM.A();
            }
            return null;
        }
    }

    public final InterfaceC5481d a(C4618A client, kg.g chain) {
        AbstractC5504s.h(client, "client");
        AbstractC5504s.h(chain, "chain");
        try {
        } catch (IOException e10) {
            e = e10;
        } catch (i e11) {
            e = e11;
        }
        try {
            return c(chain.e(), chain.g(), chain.i(), client.H(), client.N(), !AbstractC5504s.c(chain.h().l(), "GET")).w(client, chain);
        } catch (IOException e12) {
            e = e12;
            IOException iOException = e;
            h(iOException);
            throw new i(iOException);
        } catch (i e13) {
            e = e13;
            i iVar = e;
            h(iVar.c());
            throw iVar;
        }
    }

    public final C4620a d() {
        return this.f51845b;
    }

    public final boolean e() {
        j jVar;
        if (this.f51850g == 0 && this.f51851h == 0 && this.f51852i == 0) {
            return false;
        }
        if (this.f51853j != null) {
            return true;
        }
        G gF = f();
        if (gF != null) {
            this.f51853j = gF;
            return true;
        }
        j.b bVar = this.f51848e;
        if ((bVar == null || !bVar.b()) && (jVar = this.f51849f) != null) {
            return jVar.a();
        }
        return true;
    }

    public final boolean g(u url) {
        AbstractC5504s.h(url, "url");
        u uVarL = this.f51845b.l();
        return url.m() == uVarL.m() && AbstractC5504s.c(url.h(), uVarL.h());
    }

    public final void h(IOException e10) {
        AbstractC5504s.h(e10, "e");
        this.f51853j = null;
        if ((e10 instanceof n) && ((n) e10).f53687a == mg.b.REFUSED_STREAM) {
            this.f51850g++;
        } else if (e10 instanceof C5695a) {
            this.f51851h++;
        } else {
            this.f51852i++;
        }
    }
}
