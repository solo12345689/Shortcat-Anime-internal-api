package io.sentry.android.replay.screenshot;

import Td.AbstractC2163n;
import Td.L;
import Td.q;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import ge.AbstractC4877a;
import ie.InterfaceC5082a;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.InterfaceC5192e0;
import io.sentry.android.replay.r;
import io.sentry.android.replay.s;
import io.sentry.util.C5288a;
import io.sentry.util.n;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import md.AbstractC5659b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.android.replay.b f50357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f50358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5322z3 f50359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s f50360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Bitmap f50361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicReference f50362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5288a f50363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f50364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f50365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f50366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f50367k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SurfaceTexture f50368l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Surface f50369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f50370n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            d dVar = d.this;
            matrix.preScale(dVar.f50360d.e(), dVar.f50360d.f());
            return matrix;
        }
    }

    public d(io.sentry.android.replay.b executor, r rVar, C5322z3 options, s config) {
        AbstractC5504s.h(executor, "executor");
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(config, "config");
        this.f50357a = executor;
        this.f50358b = rVar;
        this.f50359c = options;
        this.f50360d = config;
        this.f50362f = new AtomicReference(null);
        this.f50363g = new C5288a();
        this.f50364h = AbstractC2163n.a(q.f17463c, new a());
        this.f50365i = new AtomicBoolean(false);
        this.f50366j = new m();
        this.f50367k = new AtomicBoolean(false);
        SurfaceTexture surfaceTextureA = AbstractC5659b.a(false);
        surfaceTextureA.setDefaultBufferSize(config.d(), config.c());
        this.f50368l = surfaceTextureA;
        this.f50369m = new Surface(surfaceTextureA);
        n.a("ReplayCanvasStrategy");
        this.f50370n = new Runnable() { // from class: io.sentry.android.replay.screenshot.a
            @Override // java.lang.Runnable
            public final void run() {
                d.j(this.f50354a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(d dVar) {
        Bitmap bitmap = dVar.f50361e;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        dVar.f50369m.release();
        dVar.f50368l.release();
    }

    private final Matrix i() {
        return (Matrix) this.f50364h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final d dVar) {
        if (dVar.f50367k.get()) {
            dVar.f50359c.getLogger().c(EnumC5215i3.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture picture = (Picture) dVar.f50362f.getAndSet(null);
        if (picture == null) {
            return;
        }
        try {
            Canvas canvasLockHardwareCanvas = dVar.f50369m.lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                picture.draw(canvasLockHardwareCanvas);
                dVar.f50369m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                if (dVar.f50361e == null) {
                    InterfaceC5192e0 interfaceC5192e0A = dVar.f50363g.a();
                    try {
                        if (dVar.f50361e == null) {
                            dVar.f50361e = Bitmap.createBitmap(dVar.f50360d.d(), dVar.f50360d.c(), Bitmap.Config.ARGB_8888);
                        }
                        L l10 = L.f17438a;
                        AbstractC4877a.a(interfaceC5192e0A, null);
                    } finally {
                    }
                }
                if (dVar.f50367k.get()) {
                    dVar.f50359c.getLogger().c(EnumC5215i3.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = dVar.f50369m;
                Bitmap bitmap = dVar.f50361e;
                AbstractC5504s.e(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.c
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i10) {
                        d.k(this.f50356a, i10);
                    }
                }, dVar.f50357a.h());
            } catch (Throwable th2) {
                dVar.f50369m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th2;
            }
        } catch (Throwable th3) {
            dVar.f50359c.getLogger().b(EnumC5215i3.ERROR, "Canvas Strategy: picture render failed", th3);
            dVar.f50365i.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(d dVar, int i10) {
        r rVar;
        if (dVar.f50367k.get()) {
            dVar.f50359c.getLogger().c(EnumC5215i3.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i10 == 0) {
            dVar.f50365i.set(true);
            Bitmap bitmap = dVar.f50361e;
            if (bitmap == null || bitmap.isRecycled() || (rVar = dVar.f50358b) == null) {
                return;
            }
            rVar.j(bitmap);
            return;
        }
        dVar.f50359c.getLogger().c(EnumC5215i3.ERROR, "Canvas Strategy: PixelCopy failed with code " + i10, new Object[0]);
        dVar.f50365i.set(false);
    }

    @Override // io.sentry.android.replay.screenshot.j
    public boolean a() {
        return this.f50365i.get();
    }

    @Override // io.sentry.android.replay.screenshot.j
    public void b() {
        Bitmap bitmap;
        r rVar;
        if (!a() || (bitmap = this.f50361e) == null || bitmap.isRecycled() || (rVar = this.f50358b) == null) {
            return;
        }
        rVar.j(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.j
    public void c(View root) {
        AbstractC5504s.h(root, "root");
        if (this.f50367k.get()) {
            return;
        }
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(this.f50360d.d(), this.f50360d.c());
        AbstractC5504s.g(canvasBeginRecording, "beginRecording(...)");
        this.f50366j.e(canvasBeginRecording);
        this.f50366j.setMatrix(i());
        root.draw(this.f50366j);
        picture.endRecording();
        if (this.f50367k.get()) {
            return;
        }
        this.f50362f.set(picture);
        l(this.f50357a.h(), new io.sentry.android.replay.util.m("screenshot_recorder.canvas", this.f50370n));
    }

    @Override // io.sentry.android.replay.screenshot.j
    public void close() {
        this.f50367k.set(true);
        l(this.f50357a.h(), new io.sentry.android.replay.util.m("CanvasStrategy.close", new Runnable() { // from class: io.sentry.android.replay.screenshot.b
            @Override // java.lang.Runnable
            public final void run() {
                d.h(this.f50355a);
            }
        }));
        this.f50362f.getAndSet(null);
    }

    public final void l(Handler handler, io.sentry.android.replay.util.m runnable) {
        AbstractC5504s.h(handler, "<this>");
        AbstractC5504s.h(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th2) {
            this.f50359c.getLogger().b(EnumC5215i3.ERROR, "Canvas Strategy: failed to post runnable " + runnable.a(), th2);
        }
    }

    @Override // io.sentry.android.replay.screenshot.j
    public void onContentChanged() {
    }
}
