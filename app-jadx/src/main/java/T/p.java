package T;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class p extends RippleDrawable {

    /* JADX INFO: renamed from: e */
    public static final a f16749e = new a(null);

    /* JADX INFO: renamed from: a */
    private final boolean f16750a;

    /* JADX INFO: renamed from: b */
    private C6385r0 f16751b;

    /* JADX INFO: renamed from: c */
    private Integer f16752c;

    /* JADX INFO: renamed from: d */
    private boolean f16753d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f16754a = new b();

        private b() {
        }

        public final void a(RippleDrawable rippleDrawable, int i10) {
            rippleDrawable.setRadius(i10);
        }
    }

    public p(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f16750a = z10;
    }

    private final long a(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        return C6385r0.q(j10, AbstractC5874j.h(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public final void b(long j10, float f10) {
        long jA = a(j10, f10);
        C6385r0 c6385r0 = this.f16751b;
        if (c6385r0 == null ? false : C6385r0.s(c6385r0.A(), jA)) {
            return;
        }
        this.f16751b = C6385r0.m(jA);
        setColor(ColorStateList.valueOf(AbstractC6387s0.k(jA)));
    }

    public final void c(int i10) {
        Integer num = this.f16752c;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f16752c = Integer.valueOf(i10);
        b.f16754a.a(this, i10);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f16750a) {
            this.f16753d = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f16753d = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f16753d;
    }
}
