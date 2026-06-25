package h6;

import V5.C2313d;
import a6.InterfaceC2580a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import j6.C5336a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: h6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4908b extends Drawable implements Animatable, N5.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f47648r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Class f47649s = C4908b.class;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final InterfaceC4910d f47650t = new C4911e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC2580a f47651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j6.b f47652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f47653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f47654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f47655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f47656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f47658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f47659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f47660j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f47662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f47663m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final InterfaceC2580a.InterfaceC0415a f47665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C2313d f47666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f47667q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f47661k = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile InterfaceC4910d f47664n = f47650t;

    /* JADX INFO: renamed from: h6.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j6.b b(InterfaceC2580a interfaceC2580a) {
            if (interfaceC2580a == null) {
                return null;
            }
            return new C5336a(interfaceC2580a);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: h6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class RunnableC0767b implements Runnable {
        RunnableC0767b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4908b.this.unscheduleSelf(this);
            C4908b.this.invalidateSelf();
        }
    }

    public C4908b(InterfaceC2580a interfaceC2580a) {
        this.f47651a = interfaceC2580a;
        InterfaceC2580a.InterfaceC0415a interfaceC0415a = new InterfaceC2580a.InterfaceC0415a() { // from class: h6.a
        };
        this.f47665o = interfaceC0415a;
        this.f47667q = new RunnableC0767b();
        this.f47652b = f47648r.b(this.f47651a);
        InterfaceC2580a interfaceC2580a2 = this.f47651a;
        if (interfaceC2580a2 != null) {
            interfaceC2580a2.n(interfaceC0415a);
        }
    }

    private final long b() {
        return SystemClock.uptimeMillis();
    }

    private final void c() {
        this.f47663m++;
        if (AbstractC7283a.w(2)) {
            AbstractC7283a.y(f47649s, "Dropped a frame. Count: %s", Integer.valueOf(this.f47663m));
        }
    }

    private final void d(long j10) {
        long j11 = this.f47654d + j10;
        this.f47656f = j11;
        scheduleSelf(this.f47667q, j11);
    }

    @Override // N5.a
    public void a() {
        InterfaceC2580a interfaceC2580a = this.f47651a;
        if (interfaceC2580a != null) {
            interfaceC2580a.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC5504s.h(canvas, "canvas");
        if (this.f47651a == null || this.f47652b == null) {
            return;
        }
        long jB = b();
        long jMax = this.f47653c ? (jB - this.f47654d) + this.f47662l : (long) Math.max(this.f47655e, 0.0d);
        j6.b bVar = this.f47652b;
        AbstractC5504s.e(bVar);
        int iB = bVar.b(jMax, this.f47655e);
        if (iB == -1) {
            InterfaceC2580a interfaceC2580a = this.f47651a;
            AbstractC5504s.e(interfaceC2580a);
            iB = interfaceC2580a.a() - 1;
            this.f47664n.c(this);
            this.f47653c = false;
        } else if (iB == 0 && this.f47657g != -1 && jB >= this.f47656f) {
            this.f47664n.a(this);
        }
        InterfaceC2580a interfaceC2580a2 = this.f47651a;
        AbstractC5504s.e(interfaceC2580a2);
        boolean zH = interfaceC2580a2.h(this, canvas, iB);
        if (zH) {
            this.f47664n.d(this, iB);
            this.f47657g = iB;
        }
        if (!zH) {
            c();
        }
        long jB2 = b();
        if (this.f47653c) {
            j6.b bVar2 = this.f47652b;
            AbstractC5504s.e(bVar2);
            long jA = bVar2.a(jB2 - this.f47654d);
            if (jA != -1) {
                d(jA + this.f47661k);
            } else {
                this.f47664n.c(this);
                this.f47653c = false;
            }
        }
        this.f47655e = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        InterfaceC2580a interfaceC2580a = this.f47651a;
        return interfaceC2580a != null ? interfaceC2580a.c() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        InterfaceC2580a interfaceC2580a = this.f47651a;
        return interfaceC2580a != null ? interfaceC2580a.e() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f47653c;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        AbstractC5504s.h(bounds, "bounds");
        super.onBoundsChange(bounds);
        InterfaceC2580a interfaceC2580a = this.f47651a;
        if (interfaceC2580a != null) {
            interfaceC2580a.d(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        if (this.f47653c) {
            return false;
        }
        long j10 = i10;
        if (this.f47655e == j10) {
            return false;
        }
        this.f47655e = j10;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f47666p == null) {
            this.f47666p = new C2313d();
        }
        C2313d c2313d = this.f47666p;
        AbstractC5504s.e(c2313d);
        c2313d.b(i10);
        InterfaceC2580a interfaceC2580a = this.f47651a;
        if (interfaceC2580a != null) {
            interfaceC2580a.l(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f47666p == null) {
            this.f47666p = new C2313d();
        }
        C2313d c2313d = this.f47666p;
        AbstractC5504s.e(c2313d);
        c2313d.c(colorFilter);
        InterfaceC2580a interfaceC2580a = this.f47651a;
        if (interfaceC2580a != null) {
            interfaceC2580a.f(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        InterfaceC2580a interfaceC2580a;
        if (this.f47653c || (interfaceC2580a = this.f47651a) == null) {
            return;
        }
        AbstractC5504s.e(interfaceC2580a);
        if (interfaceC2580a.a() <= 1) {
            return;
        }
        this.f47653c = true;
        long jB = b();
        long j10 = jB - this.f47658h;
        this.f47654d = j10;
        this.f47656f = j10;
        this.f47655e = jB - this.f47659i;
        this.f47657g = this.f47660j;
        invalidateSelf();
        this.f47664n.b(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f47653c) {
            long jB = b();
            this.f47658h = jB - this.f47654d;
            this.f47659i = jB - this.f47655e;
            this.f47660j = this.f47657g;
            this.f47653c = false;
            this.f47654d = 0L;
            this.f47656f = 0L;
            this.f47655e = -1L;
            this.f47657g = -1;
            unscheduleSelf(this.f47667q);
            this.f47664n.c(this);
        }
    }
}
