package Ze;

import Ze.p;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f23279a = 0;

    v b() {
        return new v(this);
    }

    public void h(OutputStream outputStream) throws IOException {
        int iD = d();
        f fVarI = f.I(outputStream, f.t(f.u(iD) + iD));
        fVarI.n0(iD);
        g(fVarI);
        fVarI.H();
    }

    /* JADX INFO: renamed from: Ze.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class AbstractC0406a implements p.a {
        protected static v h(p pVar) {
            return new v(pVar);
        }

        /* JADX INFO: renamed from: Ze.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0407a extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f23280a;

            C0407a(InputStream inputStream, int i10) {
                super(inputStream);
                this.f23280a = i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f23280a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() throws IOException {
                if (this.f23280a <= 0) {
                    return -1;
                }
                int i10 = super.read();
                if (i10 >= 0) {
                    this.f23280a--;
                }
                return i10;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j10) throws IOException {
                long jSkip = super.skip(Math.min(j10, this.f23280a));
                if (jSkip >= 0) {
                    this.f23280a = (int) (((long) this.f23280a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) throws IOException {
                int i12 = this.f23280a;
                if (i12 <= 0) {
                    return -1;
                }
                int i13 = super.read(bArr, i10, Math.min(i11, i12));
                if (i13 >= 0) {
                    this.f23280a -= i13;
                }
                return i13;
            }
        }
    }
}
