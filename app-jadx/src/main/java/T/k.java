package T;

import B.o;
import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import ie.InterfaceC5082a;
import ke.AbstractC5466a;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6224f;
import r0.C6230l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f16731f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16732g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f16733h = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f16734i = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p f16735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f16736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f16737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f16738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC5082a f16739e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k(Context context) {
        super(context);
    }

    private final void c(boolean z10) {
        p pVar = new p(z10);
        setBackground(pVar);
        this.f16735a = pVar;
    }

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f16738d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f16737c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f16733h : f16734i;
            p pVar = this.f16735a;
            if (pVar != null) {
                pVar.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: T.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.setRippleState$lambda$2(this.f16730a);
                }
            };
            this.f16738d = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.f16737c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(k kVar) {
        p pVar = kVar.f16735a;
        if (pVar != null) {
            pVar.setState(f16734i);
        }
        kVar.f16738d = null;
    }

    public final void b(o.b bVar, boolean z10, long j10, int i10, long j11, float f10, InterfaceC5082a interfaceC5082a) {
        if (this.f16735a == null || !AbstractC5504s.c(Boolean.valueOf(z10), this.f16736b)) {
            c(z10);
            this.f16736b = Boolean.valueOf(z10);
        }
        p pVar = this.f16735a;
        AbstractC5504s.e(pVar);
        this.f16739e = interfaceC5082a;
        pVar.c(i10);
        f(j10, j11, f10);
        if (z10) {
            pVar.setHotspot(C6224f.m(bVar.a()), C6224f.n(bVar.a()));
        } else {
            pVar.setHotspot(pVar.getBounds().centerX(), pVar.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.f16739e = null;
        Runnable runnable = this.f16738d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f16738d;
            AbstractC5504s.e(runnable2);
            runnable2.run();
        } else {
            p pVar = this.f16735a;
            if (pVar != null) {
                pVar.setState(f16734i);
            }
        }
        p pVar2 = this.f16735a;
        if (pVar2 == null) {
            return;
        }
        pVar2.setVisible(false, false);
        unscheduleDrawable(pVar2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j10, long j11, float f10) {
        p pVar = this.f16735a;
        if (pVar == null) {
            return;
        }
        pVar.b(j11, f10);
        Rect rect = new Rect(0, 0, AbstractC5466a.d(C6230l.i(j10)), AbstractC5466a.d(C6230l.g(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        pVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        InterfaceC5082a interfaceC5082a = this.f16739e;
        if (interfaceC5082a != null) {
            interfaceC5082a.invoke();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
