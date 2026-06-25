package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class h extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinkedList f35989f;

    public h(int i10, int i11, int i12) {
        super(i10, i11, i12, false);
        this.f35989f = new LinkedList();
    }

    @Override // com.facebook.imagepipeline.memory.b
    void a(Object obj) {
        C5.f fVar = (C5.f) this.f35989f.poll();
        if (fVar == null) {
            fVar = new C5.f();
        }
        fVar.c(obj);
        this.f35978c.add(fVar);
    }

    @Override // com.facebook.imagepipeline.memory.b
    public Object g() {
        C5.f fVar = (C5.f) this.f35978c.poll();
        k.g(fVar);
        Object objB = fVar.b();
        fVar.a();
        this.f35989f.add(fVar);
        return objB;
    }
}
