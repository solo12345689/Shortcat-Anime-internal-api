package r2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import r2.o;
import t2.AbstractC6614a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f58479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f58480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f58481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o.a f58482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o.a f58483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o.a f58484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o.a f58485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f58486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private r f58487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ByteBuffer f58488l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ShortBuffer f58489m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ByteBuffer f58490n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f58491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f58492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f58493q;

    public s() {
        this(false);
    }

    private boolean g() {
        return Math.abs(this.f58480d - 1.0f) < 1.0E-4f && Math.abs(this.f58481e - 1.0f) < 1.0E-4f && this.f58483g.f58443a == this.f58482f.f58443a;
    }

    @Override // r2.o
    public ByteBuffer a() {
        int iK;
        r rVar = this.f58487k;
        if (rVar != null && (iK = rVar.k()) > 0) {
            if (this.f58488l.capacity() < iK) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iK).order(ByteOrder.nativeOrder());
                this.f58488l = byteBufferOrder;
                this.f58489m = byteBufferOrder.asShortBuffer();
            } else {
                this.f58488l.clear();
                this.f58489m.clear();
            }
            rVar.j(this.f58489m);
            this.f58492p += (long) iK;
            this.f58488l.limit(iK);
            this.f58490n = this.f58488l;
        }
        ByteBuffer byteBuffer = this.f58490n;
        this.f58490n = o.f58441a;
        return byteBuffer;
    }

    @Override // r2.o
    public boolean b() {
        if (this.f58483g.f58443a != -1) {
            return this.f58478b || !g();
        }
        return false;
    }

    @Override // r2.o
    public void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r rVar = (r) AbstractC6614a.e(this.f58487k);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f58491o += (long) iRemaining;
            rVar.t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // r2.o
    public boolean d() {
        if (!this.f58493q) {
            return false;
        }
        r rVar = this.f58487k;
        return rVar == null || rVar.k() == 0;
    }

    @Override // r2.o
    public void e() {
        r rVar = this.f58487k;
        if (rVar != null) {
            rVar.s();
        }
        this.f58493q = true;
    }

    @Override // r2.o
    public o.a f(o.a aVar) throws o.b {
        if (aVar.f58445c != 2) {
            throw new o.b(aVar);
        }
        int i10 = this.f58479c;
        if (i10 == -1) {
            i10 = aVar.f58443a;
        }
        this.f58482f = aVar;
        o.a aVar2 = new o.a(i10, aVar.f58444b, 2);
        this.f58483g = aVar2;
        this.f58486j = true;
        return aVar2;
    }

    @Override // r2.o
    public void flush() {
        if (b()) {
            o.a aVar = this.f58482f;
            this.f58484h = aVar;
            o.a aVar2 = this.f58483g;
            this.f58485i = aVar2;
            if (this.f58486j) {
                this.f58487k = new r(aVar.f58443a, aVar.f58444b, this.f58480d, this.f58481e, aVar2.f58443a);
            } else {
                r rVar = this.f58487k;
                if (rVar != null) {
                    rVar.i();
                }
            }
        }
        this.f58490n = o.f58441a;
        this.f58491o = 0L;
        this.f58492p = 0L;
        this.f58493q = false;
    }

    public long h(long j10) {
        if (this.f58492p < 1024) {
            return (long) (((double) this.f58480d) * j10);
        }
        long jL = this.f58491o - ((long) ((r) AbstractC6614a.e(this.f58487k)).l());
        int i10 = this.f58485i.f58443a;
        int i11 = this.f58484h.f58443a;
        return i10 == i11 ? a0.m1(j10, jL, this.f58492p) : a0.m1(j10, jL * ((long) i10), this.f58492p * ((long) i11));
    }

    public void i(float f10) {
        AbstractC6614a.a(f10 > 0.0f);
        if (this.f58481e != f10) {
            this.f58481e = f10;
            this.f58486j = true;
        }
    }

    public void j(float f10) {
        AbstractC6614a.a(f10 > 0.0f);
        if (this.f58480d != f10) {
            this.f58480d = f10;
            this.f58486j = true;
        }
    }

    @Override // r2.o
    public void reset() {
        this.f58480d = 1.0f;
        this.f58481e = 1.0f;
        o.a aVar = o.a.f58442e;
        this.f58482f = aVar;
        this.f58483g = aVar;
        this.f58484h = aVar;
        this.f58485i = aVar;
        ByteBuffer byteBuffer = o.f58441a;
        this.f58488l = byteBuffer;
        this.f58489m = byteBuffer.asShortBuffer();
        this.f58490n = byteBuffer;
        this.f58479c = -1;
        this.f58486j = false;
        this.f58487k = null;
        this.f58491o = 0L;
        this.f58492p = 0L;
        this.f58493q = false;
    }

    s(boolean z10) {
        this.f58480d = 1.0f;
        this.f58481e = 1.0f;
        o.a aVar = o.a.f58442e;
        this.f58482f = aVar;
        this.f58483g = aVar;
        this.f58484h = aVar;
        this.f58485i = aVar;
        ByteBuffer byteBuffer = o.f58441a;
        this.f58488l = byteBuffer;
        this.f58489m = byteBuffer.asShortBuffer();
        this.f58490n = byteBuffer;
        this.f58479c = -1;
        this.f58478b = z10;
    }
}
