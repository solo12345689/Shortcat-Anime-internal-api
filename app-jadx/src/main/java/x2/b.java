package x2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;
import w2.InterfaceC6939f;
import x2.InterfaceC7048a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC6939f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7048a f63700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f63701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f63702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private w2.o f63703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f63704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f63705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OutputStream f63706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f63707h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f63708i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q f63709j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends InterfaceC7048a.C0959a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    /* JADX INFO: renamed from: x2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0960b implements InterfaceC6939f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC7048a f63710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f63711b = 5242880;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f63712c = 20480;

        @Override // w2.InterfaceC6939f.a
        public InterfaceC6939f a() {
            return new b((InterfaceC7048a) AbstractC6614a.e(this.f63710a), this.f63711b, this.f63712c);
        }

        public C0960b b(InterfaceC7048a interfaceC7048a) {
            this.f63710a = interfaceC7048a;
            return this;
        }
    }

    public b(InterfaceC7048a interfaceC7048a, long j10, int i10) {
        AbstractC6614a.h(j10 > 0 || j10 == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j10 != -1 && j10 < 2097152) {
            AbstractC6635w.i("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.f63700a = (InterfaceC7048a) AbstractC6614a.e(interfaceC7048a);
        this.f63701b = j10 == -1 ? Long.MAX_VALUE : j10;
        this.f63702c = i10;
    }

    private void b() {
        OutputStream outputStream = this.f63706g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            a0.p(this.f63706g);
            this.f63706g = null;
            File file = (File) a0.l(this.f63705f);
            this.f63705f = null;
            this.f63700a.h(file, this.f63707h);
        } catch (Throwable th2) {
            a0.p(this.f63706g);
            this.f63706g = null;
            File file2 = (File) a0.l(this.f63705f);
            this.f63705f = null;
            file2.delete();
            throw th2;
        }
    }

    private void c(w2.o oVar) {
        long j10 = oVar.f62832h;
        this.f63705f = this.f63700a.a((String) a0.l(oVar.f62833i), oVar.f62831g + this.f63708i, j10 != -1 ? Math.min(j10 - this.f63708i, this.f63704e) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f63705f);
        if (this.f63702c > 0) {
            q qVar = this.f63709j;
            if (qVar == null) {
                this.f63709j = new q(fileOutputStream, this.f63702c);
            } else {
                qVar.a(fileOutputStream);
            }
            this.f63706g = this.f63709j;
        } else {
            this.f63706g = fileOutputStream;
        }
        this.f63707h = 0L;
    }

    @Override // w2.InterfaceC6939f
    public void a(w2.o oVar) throws a {
        AbstractC6614a.e(oVar.f62833i);
        if (oVar.f62832h == -1 && oVar.d(2)) {
            this.f63703d = null;
            return;
        }
        this.f63703d = oVar;
        this.f63704e = oVar.d(4) ? this.f63701b : Long.MAX_VALUE;
        this.f63708i = 0L;
        try {
            c(oVar);
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // w2.InterfaceC6939f
    public void close() throws a {
        if (this.f63703d == null) {
            return;
        }
        try {
            b();
        } catch (IOException e10) {
            throw new a(e10);
        }
    }

    @Override // w2.InterfaceC6939f
    public void write(byte[] bArr, int i10, int i11) throws a {
        w2.o oVar = this.f63703d;
        if (oVar == null) {
            return;
        }
        int i12 = 0;
        while (i12 < i11) {
            try {
                if (this.f63707h == this.f63704e) {
                    b();
                    c(oVar);
                }
                int iMin = (int) Math.min(i11 - i12, this.f63704e - this.f63707h);
                ((OutputStream) a0.l(this.f63706g)).write(bArr, i10 + i12, iMin);
                i12 += iMin;
                long j10 = iMin;
                this.f63707h += j10;
                this.f63708i += j10;
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
    }
}
