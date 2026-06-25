package h6;

import V5.C2313d;
import a6.InterfaceC2580a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import j6.C5336a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: h6.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4912f extends Drawable implements Animatable, N5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC2580a f47681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4909c f47682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC4910d f47683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2313d f47684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f47685e;

    /* JADX INFO: renamed from: h6.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4912f.this.unscheduleSelf(this);
            C4912f.this.invalidateSelf();
        }
    }

    public C4912f(InterfaceC2580a animationBackend) {
        AbstractC5504s.h(animationBackend, "animationBackend");
        this.f47681a = animationBackend;
        this.f47682b = new C4909c(new C5336a(this.f47681a));
        this.f47683c = new C4911e();
        C2313d c2313d = new C2313d();
        c2313d.a(this);
        this.f47684d = c2313d;
        this.f47685e = new a();
    }

    @Override // N5.a
    public void a() {
        this.f47681a.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        int iA = this.f47682b.a();
        if (iA == -1) {
            iA = this.f47681a.a() - 1;
            this.f47682b.g(false);
            this.f47683c.c(this);
        } else if (iA == 0 && this.f47682b.h()) {
            this.f47683c.a(this);
        }
        if (this.f47681a.h(this, canvas, iA)) {
            this.f47683c.d(this, iA);
            this.f47682b.f(iA);
        } else {
            this.f47682b.e();
        }
        long jC = this.f47682b.c();
        if (jC != -1) {
            scheduleSelf(this.f47685e, jC);
        } else {
            this.f47683c.c(this);
            this.f47682b.g(false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f47681a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f47681a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f47682b.b();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC5504s.h(bounds, "bounds");
        this.f47681a.d(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f47684d.b(i10);
        this.f47681a.l(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f47684d.c(colorFilter);
        this.f47681a.f(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f47681a.a() <= 0) {
            return;
        }
        this.f47682b.i();
        this.f47683c.b(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f47682b.j();
        this.f47683c.c(this);
        unscheduleSelf(this.f47685e);
    }
}
