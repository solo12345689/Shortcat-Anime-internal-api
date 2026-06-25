package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3199t extends AbstractC3183c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3194n f36296b;

    public AbstractC3199t(InterfaceC3194n consumer) {
        AbstractC5504s.h(consumer, "consumer");
        this.f36296b = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3183c
    protected void g() {
        this.f36296b.b();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3183c
    protected void h(Throwable t10) {
        AbstractC5504s.h(t10, "t");
        this.f36296b.a(t10);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3183c
    protected void j(float f10) {
        this.f36296b.d(f10);
    }

    public final InterfaceC3194n p() {
        return this.f36296b;
    }
}
