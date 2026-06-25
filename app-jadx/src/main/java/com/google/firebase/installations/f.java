package com.google.firebase.installations;

import n9.j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final j f43298a;

    public f(j jVar) {
        this.f43298a = jVar;
    }

    @Override // com.google.firebase.installations.h
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.h
    public boolean b(oa.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f43298a.e(dVar.d());
        return true;
    }
}
