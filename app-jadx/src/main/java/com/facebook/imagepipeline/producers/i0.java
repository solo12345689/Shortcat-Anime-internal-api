package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36193d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f36194c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Executor executor, B5.i pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(pooledByteBufferFactory, "pooledByteBufferFactory");
        AbstractC5504s.h(contentResolver, "contentResolver");
        this.f36194c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected E6.k d(K6.b imageRequest) throws FileNotFoundException {
        AbstractC5504s.h(imageRequest, "imageRequest");
        InputStream inputStreamOpenInputStream = this.f36194c.openInputStream(imageRequest.v());
        if (inputStreamOpenInputStream == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream");
        }
        E6.k kVarE = e(inputStreamOpenInputStream, -1);
        AbstractC5504s.g(kVarE, "getEncodedImage(...)");
        return kVarE;
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "QualifiedResourceFetchProducer";
    }
}
