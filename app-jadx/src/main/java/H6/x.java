package H6;

import B5.h;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class x implements B5.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    C5.a f8015b;

    public x(C5.a aVar, int i10) {
        y5.k.g(aVar);
        y5.k.b(Boolean.valueOf(i10 >= 0 && i10 <= ((v) aVar.C()).getSize()));
        this.f8015b = aVar.clone();
        this.f8014a = i10;
    }

    @Override // B5.h
    public synchronized byte G(int i10) {
        a();
        y5.k.b(Boolean.valueOf(i10 >= 0));
        y5.k.b(Boolean.valueOf(i10 < this.f8014a));
        y5.k.g(this.f8015b);
        return ((v) this.f8015b.C()).G(i10);
    }

    @Override // B5.h
    public synchronized long K() {
        a();
        y5.k.g(this.f8015b);
        return ((v) this.f8015b.C()).K();
    }

    synchronized void a() {
        if (isClosed()) {
            throw new h.a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        C5.a.m(this.f8015b);
        this.f8015b = null;
    }

    @Override // B5.h
    public synchronized boolean isClosed() {
        return !C5.a.H(this.f8015b);
    }

    @Override // B5.h
    public synchronized int size() {
        a();
        return this.f8014a;
    }

    @Override // B5.h
    public synchronized int u(int i10, byte[] bArr, int i11, int i12) {
        a();
        y5.k.b(Boolean.valueOf(i10 + i12 <= this.f8014a));
        y5.k.g(this.f8015b);
        return ((v) this.f8015b.C()).u(i10, bArr, i11, i12);
    }

    @Override // B5.h
    public synchronized ByteBuffer v() {
        y5.k.g(this.f8015b);
        return ((v) this.f8015b.C()).v();
    }
}
