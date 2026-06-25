package com.amazon.a.a.n.c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: a */
    private b f34589a;

    @Override // com.amazon.a.a.n.c.c
    public final void a(b bVar) {
        com.amazon.a.a.o.a.a.a((Object) bVar, "workflow");
        com.amazon.a.a.o.a.a.c(this.f34589a, "workflow instance can only be set once");
        this.f34589a = bVar;
    }

    protected final boolean m() {
        return this.f34589a != null;
    }

    protected final void n() {
        com.amazon.a.a.o.a.a.a(m(), "task is no a workflow child");
        this.f34589a.d();
    }
}
