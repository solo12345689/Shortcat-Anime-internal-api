package r3;

import U2.O;
import java.io.EOFException;
import q2.AbstractC6079K;
import q2.C6109x;
import q2.InterfaceC6098m;
import r3.r;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.InterfaceC6627n;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class u implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O f58532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r.a f58533b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f58539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C6109x f58540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f58541j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6239c f58534c = new C6239c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58536e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f58537f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f58538g = a0.f60567f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C6609I f58535d = new C6609I();

    public u(O o10, r.a aVar) {
        this.f58532a = o10;
        this.f58533b = aVar;
    }

    private void i(int i10) {
        int length = this.f58538g.length;
        int i11 = this.f58537f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f58536e;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f58538g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f58536e, bArr2, 0, i12);
        this.f58536e = 0;
        this.f58537f = i12;
        this.f58538g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(d dVar, long j10, int i10) {
        AbstractC6614a.i(this.f58540i);
        byte[] bArrA = this.f58534c.a(dVar.f58494a, dVar.f58496c);
        this.f58535d.Y(bArrA);
        this.f58532a.f(this.f58535d, bArrA.length);
        long j11 = dVar.f58495b;
        if (j11 == -9223372036854775807L) {
            AbstractC6614a.g(this.f58540i.f57027t == Long.MAX_VALUE);
        } else {
            long j12 = this.f58540i.f57027t;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f58532a.a(j10, i10 | 1, bArrA.length, 0, null);
    }

    @Override // U2.O
    public void a(final long j10, final int i10, int i11, int i12, O.a aVar) {
        if (this.f58539h == null) {
            this.f58532a.a(j10, i10, i11, i12, aVar);
            return;
        }
        AbstractC6614a.b(aVar == null, "DRM on subtitles is not supported");
        int i13 = (this.f58537f - i12) - i11;
        try {
            this.f58539h.a(this.f58538g, i13, i11, r.b.b(), new InterfaceC6627n() { // from class: r3.t
                @Override // t2.InterfaceC6627n
                public final void accept(Object obj) {
                    this.f58529a.j((d) obj, j10, i10);
                }
            });
        } catch (RuntimeException e10) {
            if (!this.f58541j) {
                throw e10;
            }
            AbstractC6635w.j("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e10);
        }
        int i14 = i13 + i11;
        this.f58536e = i14;
        if (i14 == this.f58537f) {
            this.f58536e = 0;
            this.f58537f = 0;
        }
    }

    @Override // U2.O
    public int b(InterfaceC6098m interfaceC6098m, int i10, boolean z10, int i11) throws EOFException {
        if (this.f58539h == null) {
            return this.f58532a.b(interfaceC6098m, i10, z10, i11);
        }
        i(i10);
        int i12 = interfaceC6098m.read(this.f58538g, this.f58537f, i10);
        if (i12 != -1) {
            this.f58537f += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // U2.O
    public void c(C6109x c6109x) {
        AbstractC6614a.e(c6109x.f57022o);
        AbstractC6614a.a(AbstractC6079K.k(c6109x.f57022o) == 3);
        if (!c6109x.equals(this.f58540i)) {
            this.f58540i = c6109x;
            this.f58539h = this.f58533b.b(c6109x) ? this.f58533b.a(c6109x) : null;
        }
        if (this.f58539h == null) {
            this.f58532a.c(c6109x);
        } else {
            this.f58532a.c(c6109x.b().y0("application/x-media3-cues").U(c6109x.f57022o).C0(Long.MAX_VALUE).Y(this.f58533b.c(c6109x)).P());
        }
    }

    @Override // U2.O
    public void g(C6609I c6609i, int i10, int i11) {
        if (this.f58539h == null) {
            this.f58532a.g(c6609i, i10, i11);
            return;
        }
        i(i10);
        c6609i.q(this.f58538g, this.f58537f, i10);
        this.f58537f += i10;
    }

    public void k(boolean z10) {
        this.f58541j = z10;
    }
}
