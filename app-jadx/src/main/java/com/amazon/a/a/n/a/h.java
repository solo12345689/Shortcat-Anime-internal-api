package com.amazon.a.a.n.a;

import com.amazon.d.a.j;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends a {

    /* JADX INFO: renamed from: b */
    private static final com.amazon.a.a.o.c f34558b = new com.amazon.a.a.o.c("KiwiCommand");

    /* JADX INFO: renamed from: c */
    private final com.amazon.a.a.j.a f34559c;

    /* JADX INFO: renamed from: d */
    private final String f34560d;

    /* JADX INFO: renamed from: e */
    private final String f34561e;

    /* JADX INFO: renamed from: f */
    private final String f34562f;

    /* JADX INFO: renamed from: g */
    private final Map<String, Object> f34563g;

    /* JADX INFO: renamed from: i */
    private boolean f34565i;

    /* JADX INFO: renamed from: j */
    private h f34566j;

    /* JADX INFO: renamed from: k */
    private h f34567k;

    /* JADX INFO: renamed from: h */
    private final com.amazon.a.b.f f34564h = new com.amazon.a.b.f();

    /* JADX INFO: renamed from: l */
    private boolean f34568l = false;

    public h(com.amazon.a.a.j.a aVar, String str, String str2, String str3, String str4) {
        this.f34559c = aVar;
        this.f34560d = str3;
        this.f34561e = str;
        this.f34562f = str2;
        HashMap map = new HashMap();
        this.f34563g = map;
        map.put("requestId", str3);
        map.put(com.amazon.a.a.o.b.f34616I, str4);
        this.f34565i = true;
        this.f34566j = null;
        this.f34567k = null;
    }

    public h a(boolean z10) {
        this.f34568l = z10;
        return this;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return this.f34561e;
    }

    protected void b(com.amazon.d.a.h hVar) {
    }

    protected abstract boolean b(j jVar);

    protected void c(com.amazon.a.a.d.b bVar) {
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return true;
    }

    public boolean i() {
        return this.f34568l;
    }

    protected com.amazon.a.a.j.a j() {
        return this.f34559c;
    }

    public String k() {
        return this.f34560d;
    }

    public void l() {
        com.amazon.a.a.a(this);
    }

    public void a(h hVar) {
        this.f34566j = hVar;
    }

    public void b(h hVar) {
        this.f34567k = hVar;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return this.f34562f;
    }

    protected void a(String str, Object obj) {
        this.f34563g.put(str, obj);
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        return this.f34563g;
    }

    private void a(com.amazon.a.a.i.c cVar) {
        if (cVar == null) {
            return;
        }
        com.amazon.a.a.i.a aVar = new com.amazon.a.a.i.a(cVar);
        com.amazon.a.a.i.e eVarA = com.amazon.a.a.a();
        if (eVarA == null) {
            f34558b.b("Prompt manager is null. Cannot show prompt dropping request");
        } else {
            eVarA.a((com.amazon.a.a.i.b) aVar);
        }
    }

    protected void b(boolean z10) {
        this.f34565i = z10;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void b(com.amazon.a.a.d.b bVar) {
        h hVar;
        if ("UNHANDLED_EXCEPTION".equals(bVar.a()) && com.amazon.a.a.o.b.f34642ah.equals(this.f34562f) && (hVar = this.f34567k) != null) {
            hVar.a(this.f34568l);
            this.f34567k.l();
            return;
        }
        try {
            c(bVar);
        } catch (Exception e10) {
            f34558b.a("Error calling onResult: " + e10);
        }
        if (this.f34565i) {
            a(this.f34564h.a(bVar));
        }
        if (this.f34568l) {
            return;
        }
        this.f34559c.c();
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) {
        boolean zB;
        h hVar;
        String str = (String) jVar.b().get(com.amazon.a.a.o.b.f34648f);
        f34558b.a("onSuccess: result = " + jVar + ", errorMessage: " + str);
        if (com.amazon.a.a.o.f.a(str)) {
            try {
                zB = b(jVar);
            } catch (Exception e10) {
                f34558b.a("Error calling onResult: " + e10);
                zB = false;
            }
            if (zB && (hVar = this.f34566j) != null) {
                hVar.l();
                return;
            } else {
                if (this.f34568l) {
                    return;
                }
                if (zB) {
                    this.f34559c.b();
                    return;
                } else {
                    this.f34559c.c();
                    return;
                }
            }
        }
        if (this.f34568l) {
            return;
        }
        this.f34559c.c();
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(com.amazon.d.a.h hVar) {
        String str;
        h hVar2;
        f34558b.a("onFailure: result = " + hVar);
        if (hVar != null && (str = (String) hVar.f().get(com.amazon.a.a.o.b.an)) != null && str.equalsIgnoreCase("1.0") && (hVar2 = this.f34567k) != null) {
            hVar2.a(this.f34568l);
            this.f34567k.l();
            return;
        }
        try {
            b(hVar);
        } catch (Exception e10) {
            f34558b.a("Error calling onResult: " + e10);
        }
        if (this.f34565i) {
            a(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e()));
        }
        if (this.f34568l) {
            return;
        }
        this.f34559c.c();
    }
}
