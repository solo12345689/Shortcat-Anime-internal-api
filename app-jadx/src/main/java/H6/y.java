package H6;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements B5.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.f f8016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B5.l f8017b;

    public y(com.facebook.imagepipeline.memory.f pool, B5.l pooledByteStreams) {
        AbstractC5504s.h(pool, "pool");
        AbstractC5504s.h(pooledByteStreams, "pooledByteStreams");
        this.f8016a = pool;
        this.f8017b = pooledByteStreams;
    }

    public final x f(InputStream inputStream, com.facebook.imagepipeline.memory.g outputStream) {
        AbstractC5504s.h(inputStream, "inputStream");
        AbstractC5504s.h(outputStream, "outputStream");
        this.f8017b.a(inputStream, outputStream);
        return outputStream.a();
    }

    @Override // B5.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public x a(InputStream inputStream) throws Throwable {
        AbstractC5504s.h(inputStream, "inputStream");
        com.facebook.imagepipeline.memory.g gVar = new com.facebook.imagepipeline.memory.g(this.f8016a, 0, 2, null);
        try {
            return f(inputStream, gVar);
        } finally {
            gVar.close();
        }
    }

    @Override // B5.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public x b(InputStream inputStream, int i10) throws Throwable {
        AbstractC5504s.h(inputStream, "inputStream");
        com.facebook.imagepipeline.memory.g gVar = new com.facebook.imagepipeline.memory.g(this.f8016a, i10);
        try {
            return f(inputStream, gVar);
        } finally {
            gVar.close();
        }
    }

    @Override // B5.i
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public x d(byte[] bytes) throws Throwable {
        AbstractC5504s.h(bytes, "bytes");
        com.facebook.imagepipeline.memory.g gVar = new com.facebook.imagepipeline.memory.g(this.f8016a, bytes.length);
        try {
            try {
                gVar.write(bytes, 0, bytes.length);
                return gVar.a();
            } catch (IOException e10) {
                throw y5.p.a(e10);
            }
        } finally {
            gVar.close();
        }
    }

    @Override // B5.i
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public com.facebook.imagepipeline.memory.g c() {
        return new com.facebook.imagepipeline.memory.g(this.f8016a, 0, 2, null);
    }

    @Override // B5.i
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.facebook.imagepipeline.memory.g e(int i10) {
        return new com.facebook.imagepipeline.memory.g(this.f8016a, i10);
    }
}
