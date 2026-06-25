package H6;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class m implements v, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f7996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f7998c = System.identityHashCode(this);

    public m(int i10) {
        this.f7996a = ByteBuffer.allocateDirect(i10);
        this.f7997b = i10;
    }

    private void h(int i10, v vVar, int i11, int i12) {
        if (!(vVar instanceof m)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        y5.k.i(!isClosed());
        y5.k.i(!vVar.isClosed());
        y5.k.g(this.f7996a);
        w.b(i10, vVar.getSize(), i11, i12, this.f7997b);
        this.f7996a.position(i10);
        ByteBuffer byteBuffer = (ByteBuffer) y5.k.g(vVar.v());
        byteBuffer.position(i11);
        byte[] bArr = new byte[i12];
        this.f7996a.get(bArr, 0, i12);
        byteBuffer.put(bArr, 0, i12);
    }

    @Override // H6.v
    public synchronized byte G(int i10) {
        boolean z10 = true;
        y5.k.i(!isClosed());
        y5.k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f7997b) {
            z10 = false;
        }
        y5.k.b(Boolean.valueOf(z10));
        y5.k.g(this.f7996a);
        return this.f7996a.get(i10);
    }

    @Override // H6.v
    public long K() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // H6.v
    public long a() {
        return this.f7998c;
    }

    @Override // H6.v
    public void b(int i10, v vVar, int i11, int i12) {
        y5.k.g(vVar);
        if (vVar.a() == a()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(a()) + " to BufferMemoryChunk " + Long.toHexString(vVar.a()) + " which are the same ");
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
        this.f7996a = null;
    }

    @Override // H6.v
    public synchronized int g(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        y5.k.g(bArr);
        y5.k.i(!isClosed());
        y5.k.g(this.f7996a);
        iA = w.a(i10, i12, this.f7997b);
        w.b(i10, bArr.length, i11, iA, this.f7997b);
        this.f7996a.position(i10);
        this.f7996a.put(bArr, i11, iA);
        return iA;
    }

    @Override // H6.v
    public int getSize() {
        return this.f7997b;
    }

    @Override // H6.v
    public synchronized boolean isClosed() {
        return this.f7996a == null;
    }

    @Override // H6.v
    public synchronized int u(int i10, byte[] bArr, int i11, int i12) {
        int iA;
        y5.k.g(bArr);
        y5.k.i(!isClosed());
        y5.k.g(this.f7996a);
        iA = w.a(i10, i12, this.f7997b);
        w.b(i10, bArr.length, i11, iA, this.f7997b);
        this.f7996a.position(i10);
        this.f7996a.get(bArr, i11, iA);
        return iA;
    }

    @Override // H6.v
    public synchronized ByteBuffer v() {
        return this.f7996a;
    }
}
