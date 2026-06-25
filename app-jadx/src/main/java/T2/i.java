package T2;

import S2.u;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.N;
import t2.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class i implements u, a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SurfaceTexture f17074j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f17077m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f17065a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f17066b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f17067c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f17068d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final N f17069e = new N();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final N f17070f = new N();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f17071g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f17072h = new float[16];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f17075k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17076l = -1;

    private void g(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f17077m;
        int i11 = this.f17076l;
        this.f17077m = bArr;
        if (i10 == -1) {
            i10 = this.f17075k;
        }
        this.f17076l = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f17077m)) {
            return;
        }
        byte[] bArr3 = this.f17077m;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f17076l) : null;
        if (eVarA == null || !g.c(eVarA)) {
            eVarA = e.b(this.f17076l);
        }
        this.f17070f.a(j10, eVarA);
    }

    @Override // T2.a
    public void b(long j10, float[] fArr) {
        this.f17068d.e(j10, fArr);
    }

    @Override // T2.a
    public void c() {
        this.f17069e.c();
        this.f17068d.d();
        this.f17066b.set(true);
    }

    public void d(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            r.b();
        } catch (r.a e10) {
            AbstractC6635w.e("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f17065a.compareAndSet(true, false)) {
            ((SurfaceTexture) AbstractC6614a.e(this.f17074j)).updateTexImage();
            try {
                r.b();
            } catch (r.a e11) {
                AbstractC6635w.e("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f17066b.compareAndSet(true, false)) {
                r.o(this.f17071g);
            }
            long timestamp = this.f17074j.getTimestamp();
            Long l10 = (Long) this.f17069e.g(timestamp);
            if (l10 != null) {
                this.f17068d.c(this.f17071g, l10.longValue());
            }
            e eVar = (e) this.f17070f.j(timestamp);
            if (eVar != null) {
                this.f17067c.d(eVar);
            }
        }
        Matrix.multiplyMM(this.f17072h, 0, fArr, 0, this.f17071g, 0);
        this.f17067c.a(this.f17073i, this.f17072h, z10);
    }

    public SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            r.b();
            this.f17067c.b();
            r.b();
            this.f17073i = r.f();
        } catch (r.a e10) {
            AbstractC6635w.e("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f17073i);
        this.f17074j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: T2.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f17064a.f17065a.set(true);
            }
        });
        return this.f17074j;
    }

    public void f(int i10) {
        this.f17075k = i10;
    }

    @Override // S2.u
    public void h(long j10, long j11, C6109x c6109x, MediaFormat mediaFormat) {
        this.f17069e.a(j11, Long.valueOf(j10));
        g(c6109x.f56993C, c6109x.f56994D, j11);
    }
}
