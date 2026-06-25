package com.facebook.imagepipeline.memory;

import H6.v;
import H6.w;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NativeMemoryChunk implements v, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f35961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f35962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35963c;

    static {
        R7.a.d("imagepipeline");
    }

    public NativeMemoryChunk(int i10) {
        k.b(Boolean.valueOf(i10 > 0));
        this.f35962b = i10;
        this.f35961a = nativeAllocate(i10);
        this.f35963c = false;
    }

    private void h(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        k.i(!isClosed());
        k.i(!vVar.isClosed());
        w.b(i10, vVar.getSize(), i11, i12, this.f35962b);
        nativeMemcpy(vVar.K() + ((long) i11), this.f35961a + ((long) i10), i12);
    }

    private static native long nativeAllocate(int i10);

    private static native void nativeCopyFromByteArray(long j10, byte[] bArr, int i10, int i11);

    private static native void nativeCopyToByteArray(long j10, byte[] bArr, int i10, int i11);

    private static native void nativeFree(long j10);

    private static native void nativeMemcpy(long j10, long j11, int i10);

    private static native byte nativeReadByte(long j10);

    @Override // H6.v
    public synchronized byte G(int i10) {
        boolean z10 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f35962b) {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        return nativeReadByte(this.f35961a + ((long) i10));
    }

    @Override // H6.v
    public long K() {
        return this.f35961a;
    }

    @Override // H6.v
    public long a() {
        return this.f35961a;
    }

    @Override // H6.v
    public void b(int i10, v vVar, int i11, int i12) {
        k.g(vVar);
        if (vVar.a() == a()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(vVar)) + " which share the same address " + Long.toHexString(this.f35961a));
            k.b(Boolean.FALSE);
        }
        if (vVar.a() < a()) {
            synchronized (vVar) {
                synchronized (this) {
                    h(i10, vVar, i11, i12);
                }
            }
        } else {
            synchronized (this) {
                synchronized (vVar) {
                    h(i10, vVar, i11, i12);
                }
            }
        }
    }

    @Override // H6.v, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f35963c) {
            this.f35963c = true;
            nativeFree(this.f35961a);
        }
    }

    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // H6.v
    public synchronized int g(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        iA = w.a(i10, i12, this.f35962b);
        w.b(i10, bArr.length, i11, iA, this.f35962b);
        nativeCopyFromByteArray(this.f35961a + ((long) i10), bArr, i11, iA);
        return iA;
    }

    @Override // H6.v
    public int getSize() {
        return this.f35962b;
    }

    @Override // H6.v
    public synchronized boolean isClosed() {
        return this.f35963c;
    }

    @Override // H6.v
    public synchronized int u(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        k.g(bArr);
        k.i(!isClosed());
        iA = w.a(i10, i12, this.f35962b);
        w.b(i10, bArr.length, i11, iA, this.f35962b);
        nativeCopyToByteArray(this.f35961a + ((long) i10), bArr, i11, iA);
        return iA;
    }

    @Override // H6.v
    public ByteBuffer v() {
        return null;
    }

    public NativeMemoryChunk() {
        this.f35962b = 0;
        this.f35961a = 0L;
        this.f35963c = true;
    }
}
