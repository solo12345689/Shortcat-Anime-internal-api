package H6;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: H6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1653f implements v, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedMemory f7975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ByteBuffer f7976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7977c;

    public C1653f(int i10) {
        y5.k.b(Boolean.valueOf(i10 > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i10);
            this.f7975a = sharedMemoryCreate;
            this.f7976b = sharedMemoryCreate.mapReadWrite();
            this.f7977c = System.identityHashCode(this);
        } catch (ErrnoException e10) {
            throw new RuntimeException("Fail to create AshmemMemory", e10);
        }
    }

    private void h(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof C1653f)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        y5.k.i(!isClosed());
        y5.k.i(!vVar.isClosed());
        y5.k.g(this.f7976b);
        y5.k.g(vVar.v());
        w.b(i10, vVar.getSize(), i11, i12, getSize());
        this.f7976b.position(i10);
        vVar.v().position(i11);
        byte[] bArr = new byte[i12];
        this.f7976b.get(bArr, 0, i12);
        vVar.v().put(bArr, 0, i12);
    }

    @Override // H6.v
    public synchronized byte G(int i10) {
        boolean z10 = true;
        y5.k.i(!isClosed());
        y5.k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= getSize()) {
            z10 = false;
        }
        y5.k.b(Boolean.valueOf(z10));
        y5.k.g(this.f7976b);
        return this.f7976b.get(i10);
    }

    @Override // H6.v
    public long K() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // H6.v
    public long a() {
        return this.f7977c;
    }

    @Override // H6.v
    public void b(int i10, v vVar, int i11, int i12) {
        y5.k.g(vVar);
        if (vVar.a() == a()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(a()) + " to AshmemMemoryChunk " + Long.toHexString(vVar.a()) + " which are the same ");
            y5.k.b(Boolean.FALSE);
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
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f7975a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f7976b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f7976b = null;
                this.f7975a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // H6.v
    public synchronized int g(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        y5.k.g(bArr);
        y5.k.g(this.f7976b);
        iA = w.a(i10, i12, getSize());
        w.b(i10, bArr.length, i11, iA, getSize());
        this.f7976b.position(i10);
        this.f7976b.put(bArr, i11, iA);
        return iA;
    }

    @Override // H6.v
    public int getSize() {
        y5.k.g(this.f7975a);
        return this.f7975a.getSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // H6.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isClosed() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.f7976b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            android.os.SharedMemory r0 = r1.f7975a     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto La
            goto Le
        La:
            r0 = 0
            goto Lf
        Lc:
            r0 = move-exception
            goto L11
        Le:
            r0 = 1
        Lf:
            monitor-exit(r1)
            return r0
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.C1653f.isClosed():boolean");
    }

    @Override // H6.v
    public synchronized int u(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        y5.k.g(bArr);
        y5.k.g(this.f7976b);
        iA = w.a(i10, i12, getSize());
        w.b(i10, bArr.length, i11, iA, getSize());
        this.f7976b.position(i10);
        this.f7976b.get(bArr, i11, iA);
        return iA;
    }

    @Override // H6.v
    public ByteBuffer v() {
        return this.f7976b;
    }
}
