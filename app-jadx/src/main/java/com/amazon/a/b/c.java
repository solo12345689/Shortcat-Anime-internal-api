package com.amazon.a.b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends com.amazon.a.a.n.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f34754a = new com.amazon.a.a.o.c("LicenseKillTask");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f34755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e f34756c;

    private boolean b() {
        return this.f34755b.b(com.amazon.a.a.m.c.f34462b);
    }

    private com.amazon.a.a.i.c c() {
        com.amazon.a.a.i.c cVar = (com.amazon.a.a.i.c) this.f34755b.a(com.amazon.a.a.m.c.f34463c);
        if (cVar == null) {
            return e.f34762e;
        }
        if (com.amazon.a.a.o.c.f34699a) {
            f34754a.a("Fetched failure content from store: " + cVar);
        }
        this.f34755b.c(com.amazon.a.a.m.c.f34463c);
        return cVar;
    }

    @Override // com.amazon.a.a.n.a
    public void a() {
        if (com.amazon.a.a.o.c.f34699a) {
            f34754a.a("License Kill Task Executing!!!");
        }
        if (b()) {
            f34754a.c("license verification succeeded");
            return;
        }
        if (com.amazon.a.a.o.c.f34699a) {
            f34754a.a("License Kill Task determined app is not licensed, killing app");
        }
        if (m()) {
            n();
        }
        this.f34756c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(c()));
    }
}
