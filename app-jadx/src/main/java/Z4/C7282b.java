package z4;

import H4.g;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import ke.AbstractC5466a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import x4.h;

/* JADX INFO: renamed from: z4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7282b extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f65596m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f65597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f65598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f65599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f65600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f65601e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f65602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f65603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f65604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f65605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f65606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f65607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Drawable f65608l;

    /* JADX INFO: renamed from: z4.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C7282b(Drawable drawable, Drawable drawable2, g gVar, int i10, boolean z10, boolean z11) {
        this.f65597a = gVar;
        this.f65598b = i10;
        this.f65599c = z10;
        this.f65600d = z11;
        this.f65602f = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f65603g = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f65605i = 255;
        this.f65607k = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f65608l = drawableMutate;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable3 = this.f65607k;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate == null) {
            return;
        }
        drawableMutate.setCallback(this);
    }

    private final int a(Integer num, Integer num2) {
        if (this.f65600d || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    private final void b() {
        this.f65606j = 2;
        this.f65607k = null;
        List list = this.f65601e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((androidx.vectordrawable.graphics.drawable.b) list.get(i10)).b(this);
        }
    }

    public final void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dC = h.c(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f65597a);
        double d10 = 2;
        int iC = AbstractC5466a.c((((double) iWidth) - (((double) intrinsicWidth) * dC)) / d10);
        int iC2 = AbstractC5466a.c((((double) iHeight) - (dC * ((double) intrinsicHeight))) / d10);
        drawable.setBounds(rect.left + iC, rect.top + iC2, rect.right - iC, rect.bottom - iC2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i10 = this.f65606j;
        if (i10 == 0) {
            Drawable drawable2 = this.f65607k;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f65605i);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        if (i10 == 2) {
            Drawable drawable3 = this.f65608l;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f65605i);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f65604h) / ((double) this.f65598b);
        double dK = AbstractC5874j.k(dUptimeMillis, 0.0d, 1.0d);
        int i11 = this.f65605i;
        int i12 = (int) (dK * ((double) i11));
        if (this.f65599c) {
            i11 -= i12;
        }
        boolean z10 = dUptimeMillis >= 1.0d;
        if (!z10 && (drawable = this.f65607k) != null) {
            drawable.setAlpha(i11);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        Drawable drawable4 = this.f65608l;
        if (drawable4 != null) {
            drawable4.setAlpha(i12);
            iSave = canvas.save();
            try {
                drawable4.draw(canvas);
            } finally {
            }
        }
        if (z10) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f65605i;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i10 = this.f65606j;
        if (i10 == 0) {
            Drawable drawable2 = this.f65607k;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (i10 != 1) {
            if (i10 == 2 && (drawable = this.f65608l) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.f65608l;
        if (drawable3 != null && (colorFilter = drawable3.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.f65607k;
        if (drawable4 != null) {
            return drawable4.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f65603g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f65602f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f65607k;
        Drawable drawable2 = this.f65608l;
        int i10 = this.f65606j;
        if (i10 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        if (i10 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f65606j == 1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f65607k;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f65608l;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f65607k;
        boolean level = drawable != null ? drawable.setLevel(i10) : false;
        Drawable drawable2 = this.f65608l;
        return level || (drawable2 != null ? drawable2.setLevel(i10) : false);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f65607k;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f65608l;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 >= 0 && i10 < 256) {
            this.f65605i = i10;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i10).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f65607k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f65608l;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f65607k;
        if (drawable != null) {
            drawable.setTint(i10);
        }
        Drawable drawable2 = this.f65608l;
        if (drawable2 != null) {
            drawable2.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f65607k;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f65608l;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f65607k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f65608l;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f65607k;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f65608l;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f65607k;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f65608l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f65606j != 0) {
            return;
        }
        this.f65606j = 1;
        this.f65604h = SystemClock.uptimeMillis();
        List list = this.f65601e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((androidx.vectordrawable.graphics.drawable.b) list.get(i10)).c(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f65607k;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f65608l;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f65606j != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
