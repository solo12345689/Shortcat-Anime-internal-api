package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f36201a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class a extends AbstractC3199t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f36202c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, InterfaceC3194n consumer) {
            super(consumer);
            AbstractC5504s.h(consumer, "consumer");
            this.f36202c = j0Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void i(E6.k kVar, int i10) {
            C5.a aVarJ = null;
            try {
                if (E6.k.Y(kVar) && kVar != null) {
                    aVarJ = kVar.j();
                }
                p().c(aVarJ, i10);
                C5.a.m(aVarJ);
            } catch (Throwable th2) {
                C5.a.m(aVarJ);
                throw th2;
            }
        }
    }

    public j0(d0 inputProducer) {
        AbstractC5504s.h(inputProducer, "inputProducer");
        this.f36201a = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n consumer, e0 context) {
        AbstractC5504s.h(consumer, "consumer");
        AbstractC5504s.h(context, "context");
        this.f36201a.a(new a(this, consumer), context);
    }
}
