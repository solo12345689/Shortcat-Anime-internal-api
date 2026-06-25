package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s5.InterfaceC6433d;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3187g extends C3189i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36185d = new a(null);

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3187g(x6.x memoryCache, x6.k cacheKeyFactory, d0 inputProducer) {
        super(memoryCache, cacheKeyFactory, inputProducer);
        AbstractC5504s.h(memoryCache, "memoryCache");
        AbstractC5504s.h(cacheKeyFactory, "cacheKeyFactory");
        AbstractC5504s.h(inputProducer, "inputProducer");
    }

    @Override // com.facebook.imagepipeline.producers.C3189i
    protected String d() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C3189i
    protected String e() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C3189i
    protected InterfaceC3194n g(InterfaceC3194n consumer, InterfaceC6433d cacheKey, boolean z10) {
        AbstractC5504s.h(consumer, "consumer");
        AbstractC5504s.h(cacheKey, "cacheKey");
        return consumer;
    }
}
