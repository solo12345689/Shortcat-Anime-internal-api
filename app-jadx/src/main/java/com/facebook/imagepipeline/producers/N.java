package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class N extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36087d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Resources f36088c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(K6.b bVar) {
            String path = bVar.v().getPath();
            if (path == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String strSubstring = path.substring(1);
            AbstractC5504s.g(strSubstring, "substring(...)");
            return Integer.parseInt(strSubstring);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Executor executor, B5.i pooledByteBufferFactory, Resources resources) {
        super(executor, pooledByteBufferFactory);
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(pooledByteBufferFactory, "pooledByteBufferFactory");
        AbstractC5504s.h(resources, "resources");
        this.f36088c = resources;
    }

    private final int g(K6.b bVar) {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            assetFileDescriptorOpenRawResourceFd = this.f36088c.openRawResourceFd(f36087d.b(bVar));
            int length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected E6.k d(K6.b imageRequest) {
        AbstractC5504s.h(imageRequest, "imageRequest");
        return e(this.f36088c.openRawResource(f36087d.b(imageRequest)), g(imageRequest));
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalResourceFetchProducer";
    }
}
