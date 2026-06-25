package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends E implements G6.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G6.e f36038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G6.d f36039d;

    public F(G6.e eVar, G6.d dVar) {
        super(eVar, dVar);
        this.f36038c = eVar;
        this.f36039d = dVar;
    }

    @Override // G6.d
    public void a(e0 producerContext) {
        AbstractC5504s.h(producerContext, "producerContext");
        G6.e eVar = this.f36038c;
        if (eVar != null) {
            eVar.e(producerContext.q(), producerContext.a(), producerContext.getId(), producerContext.z());
        }
        G6.d dVar = this.f36039d;
        if (dVar != null) {
            dVar.a(producerContext);
        }
    }

    @Override // G6.d
    public void e(e0 producerContext) {
        AbstractC5504s.h(producerContext, "producerContext");
        G6.e eVar = this.f36038c;
        if (eVar != null) {
            eVar.i(producerContext.q(), producerContext.getId(), producerContext.z());
        }
        G6.d dVar = this.f36039d;
        if (dVar != null) {
            dVar.e(producerContext);
        }
    }

    @Override // G6.d
    public void g(e0 producerContext) {
        AbstractC5504s.h(producerContext, "producerContext");
        G6.e eVar = this.f36038c;
        if (eVar != null) {
            eVar.k(producerContext.getId());
        }
        G6.d dVar = this.f36039d;
        if (dVar != null) {
            dVar.g(producerContext);
        }
    }

    @Override // G6.d
    public void i(e0 producerContext, Throwable th2) {
        AbstractC5504s.h(producerContext, "producerContext");
        G6.e eVar = this.f36038c;
        if (eVar != null) {
            eVar.b(producerContext.q(), producerContext.getId(), th2, producerContext.z());
        }
        G6.d dVar = this.f36039d;
        if (dVar != null) {
            dVar.i(producerContext, th2);
        }
    }
}
