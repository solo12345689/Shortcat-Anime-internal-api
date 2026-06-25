package com.amazon.a.b;

import android.app.Application;
import com.amazon.d.a.j;
import java.security.PublicKey;
import java.util.Date;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a extends com.amazon.a.a.n.a.a {

    /* JADX INFO: renamed from: b */
    private static final com.amazon.a.a.o.c f34737b = new com.amazon.a.a.o.c("VerifyApplicationEntitlmentTask");

    /* JADX INFO: renamed from: c */
    private f f34738c = new f();

    /* JADX INFO: renamed from: d */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c f34739d;

    /* JADX INFO: renamed from: e */
    @com.amazon.a.a.k.a
    private Application f34740e;

    /* JADX INFO: renamed from: f */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.n.b f34741f;

    /* JADX INFO: renamed from: g */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f34742g;

    /* JADX INFO: renamed from: h */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.o.b.b f34743h;

    /* JADX INFO: renamed from: com.amazon.a.b.a$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass1 extends com.amazon.a.a.m.a {
        AnonymousClass1(Object obj, Date date) {
            super(obj, date);
        }

        @Override // com.amazon.a.a.e.a
        public void d() {
            this.f34325a.a(com.amazon.a.a.n.b.d.COMMAND, new a());
        }
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(j jVar) throws com.amazon.a.b.a.a {
        g gVar = new g(jVar.b());
        b bVarA = a(gVar, this.f34743h.a());
        if (bVarA == null) {
            return;
        }
        a(gVar, bVarA);
        a(bVarA);
        this.f34739d.a(new com.amazon.a.b.b.a());
        this.f34741f.a(com.amazon.a.a.n.b.d.BACKGROUND, new i());
    }

    @Override // com.amazon.a.a.n.a.a
    protected String a_() {
        return "get_license";
    }

    @Override // com.amazon.a.a.n.a.a
    protected Map<String, Object> b() {
        return null;
    }

    @Override // com.amazon.a.a.n.a.a
    protected String c() {
        return "1.0";
    }

    @Override // com.amazon.a.a.n.a.a
    protected boolean d() {
        return this.f34742g.a(com.amazon.a.a.m.c.f34462b) == null;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void b(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.i.c cVarA = this.f34738c.a(bVar);
        if (cVarA == null && com.amazon.a.a.o.c.f34700b) {
            f34737b.b("No mapping specified for exception: " + bVar, bVar);
        }
        this.f34742g.a(com.amazon.a.a.m.c.f34463c, cVarA);
        this.f34742g.a(com.amazon.a.a.m.c.f34464d, bVar.getClass().getName());
    }

    private b a(g gVar, PublicKey publicKey) {
        return new b(new com.amazon.a.a.o.b.f(gVar.c(), publicKey));
    }

    private void a(b bVar) {
        f34737b.a("License Verification succeeded!");
        this.f34742g.a(com.amazon.a.a.m.c.f34462b, (com.amazon.a.a.m.a) new com.amazon.a.a.m.a(bVar, bVar.d()) { // from class: com.amazon.a.b.a.1
            AnonymousClass1(Object bVar2, Date date) {
                super(bVar2, date);
            }

            @Override // com.amazon.a.a.e.a
            public void d() {
                this.f34325a.a(com.amazon.a.a.n.b.d.COMMAND, new a());
            }
        });
    }

    private void a(g gVar, b bVar) throws com.amazon.a.b.a.a {
        com.amazon.a.a.o.d.c cVar = new com.amazon.a.a.o.d.c();
        cVar.a(gVar.a(), bVar.b(), (com.amazon.a.a.o.d.b) h.CUSTOMER_ID);
        cVar.a(gVar.b(), bVar.c(), (com.amazon.a.a.o.d.b) h.DEVICE_ID);
        cVar.a(bVar.e(), this.f34740e.getPackageName(), (com.amazon.a.a.o.d.b) h.PACKAGE_NAME);
        cVar.a(bVar.d(), new Date(), (com.amazon.a.a.o.d.b) h.EXPIRATION);
        if (cVar.a()) {
            throw new com.amazon.a.b.a.a(cVar);
        }
    }

    @Override // com.amazon.a.a.n.a.a
    protected void a(com.amazon.d.a.h hVar) {
        com.amazon.a.a.i.c cVar = new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e());
        f34737b.a("onFailure: " + cVar);
        this.f34742g.a(com.amazon.a.a.m.c.f34463c, cVar);
    }
}
