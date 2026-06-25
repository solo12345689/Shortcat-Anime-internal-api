package com.facebook.imagepipeline.producers;

import java.io.FileInputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class M extends L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f36086c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Executor executor, B5.i pooledByteBufferFactory) {
        super(executor, pooledByteBufferFactory);
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(pooledByteBufferFactory, "pooledByteBufferFactory");
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected E6.k d(K6.b imageRequest) {
        AbstractC5504s.h(imageRequest, "imageRequest");
        return e(new FileInputStream(imageRequest.u().toString()), (int) imageRequest.u().length());
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalFileFetchProducer";
    }
}
