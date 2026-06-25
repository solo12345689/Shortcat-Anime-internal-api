package f5;

import S4.l;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l5.AbstractC5555a;
import m5.InterfaceC5642b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P4.a f46877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f46878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f46879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final k f46880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V4.d f46881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f46883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f46884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.j f46885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f46886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f46887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f46888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Bitmap f46889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f46890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f46891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f46892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f46893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f46894r;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends AbstractC5555a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f46895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f46896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f46897f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bitmap f46898g;

        a(Handler handler, int i10, long j10) {
            this.f46895d = handler;
            this.f46896e = i10;
            this.f46897f = j10;
        }

        Bitmap e() {
            return this.f46898g;
        }

        @Override // l5.d
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void m(Bitmap bitmap, InterfaceC5642b interfaceC5642b) {
            this.f46898g = bitmap;
            this.f46895d.sendMessageAtTime(this.f46895d.obtainMessage(1, this), this.f46897f);
        }

        @Override // l5.d
        public void i(Drawable drawable) {
            this.f46898g = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            g.this.f46880d.p((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.b bVar, P4.a aVar, int i10, int i11, l lVar, Bitmap bitmap) {
        this(bVar.g(), com.bumptech.glide.b.v(bVar.i()), aVar, null, i(com.bumptech.glide.b.v(bVar.i()), i10, i11), lVar, bitmap);
    }

    private static S4.f g() {
        return new n5.c(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.j i(k kVar, int i10, int i11) {
        return kVar.g().a(((k5.f) ((k5.f) k5.f.j0(U4.j.f19226b).h0(true)).c0(true)).T(i10, i11));
    }

    private void l() {
        if (!this.f46882f || this.f46883g) {
            return;
        }
        if (this.f46884h) {
            o5.k.b(this.f46891o == null, "Pending target must be null when starting from the first frame");
            this.f46877a.j();
            this.f46884h = false;
        }
        a aVar = this.f46891o;
        if (aVar != null) {
            this.f46891o = null;
            m(aVar);
            return;
        }
        this.f46883g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f46877a.i());
        this.f46877a.g();
        this.f46888l = new a(this.f46878b, this.f46877a.k(), jUptimeMillis);
        this.f46885i.a(k5.f.k0(g())).v0(this.f46877a).q0(this.f46888l);
    }

    private void n() {
        Bitmap bitmap = this.f46889m;
        if (bitmap != null) {
            this.f46881e.c(bitmap);
            this.f46889m = null;
        }
    }

    private void p() {
        if (this.f46882f) {
            return;
        }
        this.f46882f = true;
        this.f46887k = false;
        l();
    }

    private void q() {
        this.f46882f = false;
    }

    void a() {
        this.f46879c.clear();
        n();
        q();
        a aVar = this.f46886j;
        if (aVar != null) {
            this.f46880d.p(aVar);
            this.f46886j = null;
        }
        a aVar2 = this.f46888l;
        if (aVar2 != null) {
            this.f46880d.p(aVar2);
            this.f46888l = null;
        }
        a aVar3 = this.f46891o;
        if (aVar3 != null) {
            this.f46880d.p(aVar3);
            this.f46891o = null;
        }
        this.f46877a.clear();
        this.f46887k = true;
    }

    ByteBuffer b() {
        return this.f46877a.e().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f46886j;
        return aVar != null ? aVar.e() : this.f46889m;
    }

    int d() {
        a aVar = this.f46886j;
        if (aVar != null) {
            return aVar.f46896e;
        }
        return -1;
    }

    Bitmap e() {
        return this.f46889m;
    }

    int f() {
        return this.f46877a.a();
    }

    int h() {
        return this.f46894r;
    }

    int j() {
        return this.f46877a.l() + this.f46892p;
    }

    int k() {
        return this.f46893q;
    }

    void m(a aVar) {
        this.f46883g = false;
        if (this.f46887k) {
            this.f46878b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f46882f) {
            if (this.f46884h) {
                this.f46878b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f46891o = aVar;
                return;
            }
        }
        if (aVar.e() != null) {
            n();
            a aVar2 = this.f46886j;
            this.f46886j = aVar;
            for (int size = this.f46879c.size() - 1; size >= 0; size--) {
                ((b) this.f46879c.get(size)).a();
            }
            if (aVar2 != null) {
                this.f46878b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(l lVar, Bitmap bitmap) {
        this.f46890n = (l) o5.k.e(lVar);
        this.f46889m = (Bitmap) o5.k.e(bitmap);
        this.f46885i = this.f46885i.a(new k5.f().d0(lVar));
        this.f46892p = o5.l.i(bitmap);
        this.f46893q = bitmap.getWidth();
        this.f46894r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f46887k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f46879c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f46879c.isEmpty();
        this.f46879c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f46879c.remove(bVar);
        if (this.f46879c.isEmpty()) {
            q();
        }
    }

    g(V4.d dVar, k kVar, P4.a aVar, Handler handler, com.bumptech.glide.j jVar, l lVar, Bitmap bitmap) {
        this.f46879c = new ArrayList();
        this.f46880d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f46881e = dVar;
        this.f46878b = handler;
        this.f46885i = jVar;
        this.f46877a = aVar;
        o(lVar, bitmap);
    }
}
