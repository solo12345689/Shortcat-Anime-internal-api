package com.google.firebase.installations;

import n9.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f43296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f43297b;

    public e(i iVar, j jVar) {
        this.f43296a = iVar;
        this.f43297b = jVar;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        this.f43297b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(oa.d dVar) {
        if (!dVar.k() || this.f43296a.f(dVar)) {
            return false;
        }
        this.f43297b.c(g.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
