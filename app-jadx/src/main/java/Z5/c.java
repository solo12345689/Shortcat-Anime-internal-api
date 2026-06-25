package Z5;

import Z5.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import y5.i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends ImageView {

    /* JADX INFO: renamed from: g */
    private static boolean f23183g = false;

    /* JADX INFO: renamed from: a */
    private final a.C0399a f23184a;

    /* JADX INFO: renamed from: b */
    private float f23185b;

    /* JADX INFO: renamed from: c */
    private b f23186c;

    /* JADX INFO: renamed from: d */
    private boolean f23187d;

    /* JADX INFO: renamed from: e */
    private boolean f23188e;

    /* JADX INFO: renamed from: f */
    private Object f23189f;

    public c(Context context) {
        super(context);
        this.f23184a = new a.C0399a();
        this.f23185b = 0.0f;
        this.f23187d = false;
        this.f23188e = false;
        this.f23189f = null;
        c(context);
    }

    private void c(Context context) {
        try {
            if (L6.b.d()) {
                L6.b.a("DraweeView#init");
            }
            if (this.f23187d) {
                if (L6.b.d()) {
                    L6.b.b();
                    return;
                }
                return;
            }
            boolean z10 = true;
            this.f23187d = true;
            this.f23186c = b.c(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (L6.b.d()) {
                    L6.b.b();
                    return;
                }
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f23183g || context.getApplicationInfo().targetSdkVersion < 24) {
                z10 = false;
            }
            this.f23188e = z10;
            if (L6.b.d()) {
                L6.b.b();
            }
        } catch (Throwable th2) {
            if (L6.b.d()) {
                L6.b.b();
            }
            throw th2;
        }
    }

    private void d() {
        Drawable drawable;
        if (!this.f23188e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z10) {
        f23183g = z10;
    }

    protected void a() {
        this.f23186c.i();
    }

    protected void b() {
        this.f23186c.j();
    }

    protected void e() {
        a();
    }

    protected void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f23185b;
    }

    public Y5.a getController() {
        return this.f23186c.e();
    }

    public Object getExtraData() {
        return this.f23189f;
    }

    public Y5.b getHierarchy() {
        return this.f23186c.f();
    }

    public Drawable getTopLevelDrawable() {
        return this.f23186c.g();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        a.C0399a c0399a = this.f23184a;
        c0399a.f23175a = i10;
        c0399a.f23176b = i11;
        a.b(c0399a, this.f23185b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0399a c0399a2 = this.f23184a;
        super.onMeasure(c0399a2.f23175a, c0399a2.f23176b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23186c.k(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        d();
    }

    public void setAspectRatio(float f10) {
        if (f10 == this.f23185b) {
            return;
        }
        this.f23185b = f10;
        requestLayout();
    }

    public void setController(Y5.a aVar) {
        this.f23186c.o(aVar);
        super.setImageDrawable(this.f23186c.g());
    }

    public void setExtraData(Object obj) {
        this.f23189f = obj;
    }

    public void setHierarchy(Y5.b bVar) {
        this.f23186c.p(bVar);
        super.setImageDrawable(this.f23186c.g());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f23186c.n();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f23186c.n();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i10) {
        c(getContext());
        this.f23186c.n();
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f23186c.n();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z10) {
        this.f23188e = z10;
    }

    @Override // android.view.View
    public String toString() {
        i.a aVarB = i.b(this);
        b bVar = this.f23186c;
        return aVarB.b("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }
}
