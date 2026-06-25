package f5;

import S4.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import f5.g;
import java.nio.ByteBuffer;
import java.util.List;
import o5.k;

/* JADX INFO: renamed from: f5.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C4776c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: a */
    private final a f46864a;

    /* JADX INFO: renamed from: b */
    private boolean f46865b;

    /* JADX INFO: renamed from: c */
    private boolean f46866c;

    /* JADX INFO: renamed from: d */
    private boolean f46867d;

    /* JADX INFO: renamed from: e */
    private boolean f46868e;

    /* JADX INFO: renamed from: f */
    private int f46869f;

    /* JADX INFO: renamed from: g */
    private int f46870g;

    /* JADX INFO: renamed from: h */
    private boolean f46871h;

    /* JADX INFO: renamed from: i */
    private Paint f46872i;

    /* JADX INFO: renamed from: j */
    private Rect f46873j;

    /* JADX INFO: renamed from: k */
    private List f46874k;

    /* JADX INFO: renamed from: f5.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        final g f46875a;

        a(g gVar) {
            this.f46875a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C4776c(this);
        }
    }

    public C4776c(Context context, P4.a aVar, l lVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.d(context), aVar, i10, i11, lVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect d() {
        if (this.f46873j == null) {
            this.f46873j = new Rect();
        }
        return this.f46873j;
    }

    private Paint h() {
        if (this.f46872i == null) {
            this.f46872i = new Paint(2);
        }
        return this.f46872i;
    }

    private void j() {
        List list = this.f46874k;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) this.f46874k.get(i10)).b(this);
            }
        }
    }

    private void l() {
        this.f46869f = 0;
    }

    private void n() {
        k.b(!this.f46867d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f46864a.f46875a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f46865b) {
                return;
            }
            this.f46865b = true;
            this.f46864a.f46875a.r(this);
            invalidateSelf();
        }
    }

    private void o() {
        this.f46865b = false;
        this.f46864a.f46875a.s(this);
    }

    @Override // f5.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.f46869f++;
        }
        int i10 = this.f46870g;
        if (i10 == -1 || this.f46869f < i10) {
            return;
        }
        stop();
        j();
    }

    public ByteBuffer c() {
        return this.f46864a.f46875a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f46867d) {
            return;
        }
        if (this.f46871h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.f46871h = false;
        }
        canvas.drawBitmap(this.f46864a.f46875a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f46864a.f46875a.e();
    }

    public int f() {
        return this.f46864a.f46875a.f();
    }

    public int g() {
        return this.f46864a.f46875a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f46864a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f46864a.f46875a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f46864a.f46875a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f46864a.f46875a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f46865b;
    }

    public void k() {
        this.f46867d = true;
        this.f46864a.f46875a.a();
    }

    public void m(l lVar, Bitmap bitmap) {
        this.f46864a.f46875a.o(lVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f46871h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        h().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        k.b(!this.f46867d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f46868e = z10;
        if (!z10) {
            o();
        } else if (this.f46866c) {
            n();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f46866c = true;
        l();
        if (this.f46868e) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f46866c = false;
        o();
    }

    C4776c(a aVar) {
        this.f46868e = true;
        this.f46870g = -1;
        this.f46864a = (a) k.e(aVar);
    }
}
