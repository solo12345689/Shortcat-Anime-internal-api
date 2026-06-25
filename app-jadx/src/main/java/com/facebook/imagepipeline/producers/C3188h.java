package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3188h extends U {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x6.k f36186f;

    public C3188h(x6.k kVar, d0 d0Var) {
        super(d0Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f36186f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C5.a g(C5.a aVar) {
        return C5.a.j(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.U
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f36186f.a(e0Var.q(), e0Var.a()), e0Var.E());
    }
}
