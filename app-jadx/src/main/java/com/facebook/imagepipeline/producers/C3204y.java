package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3204y extends U {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x6.k f36319f;

    public C3204y(x6.k kVar, boolean z10, d0 d0Var) {
        super(d0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z10);
        this.f36319f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public E6.k g(E6.k kVar) {
        return E6.k.b(kVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.U
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f36319f.d(e0Var.q(), e0Var.a()), e0Var.E());
    }
}
