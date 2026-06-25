package w2;

import java.io.InputStream;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6940g f62819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f62820b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f62824f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f62822d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f62823e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f62821c = new byte[1];

    public m(InterfaceC6940g interfaceC6940g, o oVar) {
        this.f62819a = interfaceC6940g;
        this.f62820b = oVar;
    }

    private void a() {
        if (this.f62822d) {
            return;
        }
        this.f62819a.a(this.f62820b);
        this.f62822d = true;
    }

    public void b() {
        a();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f62823e) {
            return;
        }
        this.f62819a.close();
        this.f62823e = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f62821c) == -1) {
            return -1;
        }
        return this.f62821c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        AbstractC6614a.g(!this.f62823e);
        a();
        int i12 = this.f62819a.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f62824f += (long) i12;
        return i12;
    }
}
