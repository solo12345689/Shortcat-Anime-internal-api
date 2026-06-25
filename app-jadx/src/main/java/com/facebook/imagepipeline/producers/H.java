package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class H extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f36059d = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AssetManager f36060c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(K6.b bVar) {
            String path = bVar.v().getPath();
            AbstractC5504s.e(path);
            String strSubstring = path.substring(1);
            AbstractC5504s.g(strSubstring, "substring(...)");
            return strSubstring;
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Executor executor, B5.i pooledByteBufferFactory, AssetManager assetManager) {
        super(executor, pooledByteBufferFactory);
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(pooledByteBufferFactory, "pooledByteBufferFactory");
        AbstractC5504s.h(assetManager, "assetManager");
        this.f36060c = assetManager;
    }

    private final int g(K6.b bVar) {
        AssetFileDescriptor assetFileDescriptorOpenFd = null;
        try {
            assetFileDescriptorOpenFd = this.f36060c.openFd(f36059d.b(bVar));
            int length = (int) assetFileDescriptorOpenFd.getLength();
            try {
                assetFileDescriptorOpenFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (IOException unused2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected E6.k d(K6.b imageRequest) {
        AbstractC5504s.h(imageRequest, "imageRequest");
        return e(this.f36060c.open(f36059d.b(imageRequest), 2), g(imageRequest));
    }

    @Override // com.facebook.imagepipeline.producers.L
    protected String f() {
        return "LocalAssetFetchProducer";
    }
}
