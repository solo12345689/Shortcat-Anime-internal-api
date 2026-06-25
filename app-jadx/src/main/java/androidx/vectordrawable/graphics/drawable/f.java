package androidx.vectordrawable.graphics.drawable;

import A1.d;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.C6551a;
import z1.k;
import z1.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f extends androidx.vectordrawable.graphics.drawable.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f32530k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f32531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f32532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorFilter f32533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f32534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f32535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f32536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f32537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f32538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f32539j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends AbstractC0542f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f32566b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f32565a = A1.d.d(string2);
            }
            this.f32567c = n.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.AbstractC0542f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (n.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f32503d);
                f(typedArrayI, xmlPullParser);
                typedArrayI.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f32587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f32588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f32589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f32590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f32591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f32592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f32593h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f32594i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f32595j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f32596k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f32597l;

        public h(h hVar) {
            this.f32588c = null;
            this.f32589d = f.f32530k;
            if (hVar != null) {
                this.f32586a = hVar.f32586a;
                g gVar = new g(hVar.f32587b);
                this.f32587b = gVar;
                if (hVar.f32587b.f32574e != null) {
                    gVar.f32574e = new Paint(hVar.f32587b.f32574e);
                }
                if (hVar.f32587b.f32573d != null) {
                    this.f32587b.f32573d = new Paint(hVar.f32587b.f32573d);
                }
                this.f32588c = hVar.f32588c;
                this.f32589d = hVar.f32589d;
                this.f32590e = hVar.f32590e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f32591f.getWidth() && i11 == this.f32591f.getHeight();
        }

        public boolean b() {
            return !this.f32596k && this.f32592g == this.f32588c && this.f32593h == this.f32589d && this.f32595j == this.f32590e && this.f32594i == this.f32587b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f32591f == null || !a(i10, i11)) {
                this.f32591f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f32596k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f32591f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f32597l == null) {
                Paint paint = new Paint();
                this.f32597l = paint;
                paint.setFilterBitmap(true);
            }
            this.f32597l.setAlpha(this.f32587b.getRootAlpha());
            this.f32597l.setColorFilter(colorFilter);
            return this.f32597l;
        }

        public boolean f() {
            return this.f32587b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f32587b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32586a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f32587b.g(iArr);
            this.f32596k |= zG;
            return zG;
        }

        public void i() {
            this.f32592g = this.f32588c;
            this.f32593h = this.f32589d;
            this.f32594i = this.f32587b.getRootAlpha();
            this.f32595j = this.f32590e;
            this.f32596k = false;
        }

        public void j(int i10, int i11) {
            this.f32591f.eraseColor(0);
            this.f32587b.b(new Canvas(this.f32591f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.f32588c = null;
            this.f32589d = f.f32530k;
            this.f32587b = new g();
        }
    }

    f() {
        this.f32535f = true;
        this.f32537h = new float[9];
        this.f32538i = new Matrix();
        this.f32539j = new Rect();
        this.f32531b = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static f b(Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f32529a = k.f(resources, i10, theme);
        fVar.f32536g = new i(fVar.f32529a.getConstantState());
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f32531b;
        g gVar = hVar.f32587b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f32577h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f32553b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f32585p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f32586a = cVar.f32568d | hVar.f32586a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f32553b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f32585p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f32586a = bVar.f32568d | hVar.f32586a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f32553b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f32585p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f32586a = dVar2.f32562k | hVar.f32586a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && B1.a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f32531b;
        g gVar = hVar.f32587b;
        hVar.f32589d = f(n.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = n.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f32588c = colorStateListC;
        }
        hVar.f32590e = n.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f32590e);
        gVar.f32580k = n.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f32580k);
        float f10 = n.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f32581l);
        gVar.f32581l = f10;
        if (gVar.f32580k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f32578i = typedArray.getDimension(3, gVar.f32578i);
        float dimension = typedArray.getDimension(2, gVar.f32579j);
        gVar.f32579j = dimension;
        if (gVar.f32578i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(n.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f32583n = string;
            gVar.f32585p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f32531b.f32587b.f32585p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f32529a;
        if (drawable == null) {
            return false;
        }
        B1.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f32539j);
        if (this.f32539j.width() <= 0 || this.f32539j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f32533d;
        if (colorFilter == null) {
            colorFilter = this.f32532c;
        }
        canvas.getMatrix(this.f32538i);
        this.f32538i.getValues(this.f32537h);
        float fAbs = Math.abs(this.f32537h[0]);
        float fAbs2 = Math.abs(this.f32537h[4]);
        float fAbs3 = Math.abs(this.f32537h[1]);
        float fAbs4 = Math.abs(this.f32537h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f32539j.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f32539j.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f32539j;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f32539j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f32539j.offsetTo(0, 0);
        this.f32531b.c(iMin, iMin2);
        if (!this.f32535f) {
            this.f32531b.j(iMin, iMin2);
        } else if (!this.f32531b.b()) {
            this.f32531b.j(iMin, iMin2);
            this.f32531b.i();
        }
        this.f32531b.d(canvas, colorFilter, this.f32539j);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z10) {
        this.f32535f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f32529a;
        return drawable != null ? B1.a.d(drawable) : this.f32531b.f32587b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f32529a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f32531b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f32529a;
        return drawable != null ? B1.a.e(drawable) : this.f32533d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f32529a != null) {
            return new i(this.f32529a.getConstantState());
        }
        this.f32531b.f32586a = getChangingConfigurations();
        return this.f32531b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f32529a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f32531b.f32587b.f32579j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f32529a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f32531b.f32587b.f32578i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f32529a;
        return drawable != null ? B1.a.h(drawable) : this.f32531b.f32590e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f32531b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f32531b.f32588c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f32534e && super.mutate() == this) {
            this.f32531b = new h(this.f32531b);
            this.f32534e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f32531b;
        ColorStateList colorStateList = hVar.f32588c;
        if (colorStateList == null || (mode = hVar.f32589d) == null) {
            z10 = false;
        } else {
            this.f32532c = i(this.f32532c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f32531b.f32587b.getRootAlpha() != i10) {
            this.f32531b.f32587b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            B1.a.j(drawable, z10);
        } else {
            this.f32531b.f32590e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            B1.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            B1.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f32531b;
        if (hVar.f32588c != colorStateList) {
            hVar.f32588c = colorStateList;
            this.f32532c = i(this.f32532c, colorStateList, hVar.f32589d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            B1.a.p(drawable, mode);
            return;
        }
        h hVar = this.f32531b;
        if (hVar.f32589d != mode) {
            hVar.f32589d = mode;
            this.f32532c = i(this.f32532c, hVar.f32588c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f32529a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f32598a;

        public i(Drawable.ConstantState constantState) {
            this.f32598a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f32598a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32598a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f32529a = (VectorDrawable) this.f32598a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f32529a = (VectorDrawable) this.f32598a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f32529a = (VectorDrawable) this.f32598a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f32533d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static abstract class AbstractC0542f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected d.b[] f32565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f32566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f32567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f32568d;

        public AbstractC0542f() {
            super();
            this.f32565a = null;
            this.f32567c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f32565a;
            if (bVarArr != null) {
                d.b.h(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f32565a;
        }

        public String getPathName() {
            return this.f32566b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (A1.d.b(this.f32565a, bVarArr)) {
                A1.d.k(this.f32565a, bVarArr);
            } else {
                this.f32565a = A1.d.f(bVarArr);
            }
        }

        public AbstractC0542f(AbstractC0542f abstractC0542f) {
            super();
            this.f32565a = null;
            this.f32567c = 0;
            this.f32566b = abstractC0542f.f32566b;
            this.f32568d = abstractC0542f.f32568d;
            this.f32565a = A1.d.f(abstractC0542f.f32565a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            B1.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f32531b;
        hVar.f32587b = new g();
        TypedArray typedArrayI = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f32500a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        hVar.f32586a = getChangingConfigurations();
        hVar.f32596k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f32532c = i(this.f32532c, hVar.f32588c, hVar.f32589d);
    }

    f(h hVar) {
        this.f32535f = true;
        this.f32537h = new float[9];
        this.f32538i = new Matrix();
        this.f32539j = new Rect();
        this.f32531b = hVar;
        this.f32532c = i(this.f32532c, hVar.f32588c, hVar.f32589d);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends AbstractC0542f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f32540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        z1.d f32541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f32542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        z1.d f32543h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f32544i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f32545j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f32546k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f32547l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f32548m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f32549n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f32550o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f32551p;

        c() {
            this.f32542g = 0.0f;
            this.f32544i = 1.0f;
            this.f32545j = 1.0f;
            this.f32546k = 0.0f;
            this.f32547l = 1.0f;
            this.f32548m = 0.0f;
            this.f32549n = Paint.Cap.BUTT;
            this.f32550o = Paint.Join.MITER;
            this.f32551p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f32540e = null;
            if (n.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f32566b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f32565a = A1.d.d(string2);
                }
                this.f32543h = n.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f32545j = n.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f32545j);
                this.f32549n = e(n.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f32549n);
                this.f32550o = f(n.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f32550o);
                this.f32551p = n.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f32551p);
                this.f32541f = n.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f32544i = n.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f32544i);
                this.f32542g = n.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f32542g);
                this.f32547l = n.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f32547l);
                this.f32548m = n.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f32548m);
                this.f32546k = n.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f32546k);
                this.f32567c = n.g(typedArray, xmlPullParser, "fillType", 13, this.f32567c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            return this.f32543h.i() || this.f32541f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            return this.f32541f.j(iArr) | this.f32543h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f32502c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        float getFillAlpha() {
            return this.f32545j;
        }

        int getFillColor() {
            return this.f32543h.e();
        }

        float getStrokeAlpha() {
            return this.f32544i;
        }

        int getStrokeColor() {
            return this.f32541f.e();
        }

        float getStrokeWidth() {
            return this.f32542g;
        }

        float getTrimPathEnd() {
            return this.f32547l;
        }

        float getTrimPathOffset() {
            return this.f32548m;
        }

        float getTrimPathStart() {
            return this.f32546k;
        }

        void setFillAlpha(float f10) {
            this.f32545j = f10;
        }

        void setFillColor(int i10) {
            this.f32543h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f32544i = f10;
        }

        void setStrokeColor(int i10) {
            this.f32541f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f32542g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f32547l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f32548m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f32546k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f32542g = 0.0f;
            this.f32544i = 1.0f;
            this.f32545j = 1.0f;
            this.f32546k = 0.0f;
            this.f32547l = 1.0f;
            this.f32548m = 0.0f;
            this.f32549n = Paint.Cap.BUTT;
            this.f32550o = Paint.Join.MITER;
            this.f32551p = 4.0f;
            this.f32540e = cVar.f32540e;
            this.f32541f = cVar.f32541f;
            this.f32542g = cVar.f32542g;
            this.f32544i = cVar.f32544i;
            this.f32543h = cVar.f32543h;
            this.f32567c = cVar.f32567c;
            this.f32545j = cVar.f32545j;
            this.f32546k = cVar.f32546k;
            this.f32547l = cVar.f32547l;
            this.f32548m = cVar.f32548m;
            this.f32549n = cVar.f32549n;
            this.f32550o = cVar.f32550o;
            this.f32551p = cVar.f32551p;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f32569q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f32570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f32571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f32572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f32573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f32574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f32575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f32576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f32577h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f32578i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f32579j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f32580k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f32581l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f32582m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f32583n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f32584o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final C6551a f32585p;

        public g() {
            this.f32572c = new Matrix();
            this.f32578i = 0.0f;
            this.f32579j = 0.0f;
            this.f32580k = 0.0f;
            this.f32581l = 0.0f;
            this.f32582m = 255;
            this.f32583n = null;
            this.f32584o = null;
            this.f32585p = new C6551a();
            this.f32577h = new d();
            this.f32570a = new Path();
            this.f32571b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f32552a.set(matrix);
            dVar2.f32552a.preConcat(dVar2.f32561j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f32553b.size()) {
                e eVar = (e) dVar2.f32553b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f32552a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC0542f) {
                    d(dVar2, (AbstractC0542f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, AbstractC0542f abstractC0542f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f32580k;
            float f11 = i11 / this.f32581l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f32552a;
            this.f32572c.set(matrix);
            this.f32572c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC0542f.d(this.f32570a);
            Path path = this.f32570a;
            this.f32571b.reset();
            if (abstractC0542f.c()) {
                this.f32571b.setFillType(abstractC0542f.f32567c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f32571b.addPath(path, this.f32572c);
                canvas.clipPath(this.f32571b);
                return;
            }
            c cVar = (c) abstractC0542f;
            float f12 = cVar.f32546k;
            if (f12 != 0.0f || cVar.f32547l != 1.0f) {
                float f13 = cVar.f32548m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f32547l + f13) % 1.0f;
                if (this.f32575f == null) {
                    this.f32575f = new PathMeasure();
                }
                this.f32575f.setPath(this.f32570a, false);
                float length = this.f32575f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f32575f.getSegment(f16, length, path, true);
                    this.f32575f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f32575f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f32571b.addPath(path, this.f32572c);
            if (cVar.f32543h.l()) {
                z1.d dVar2 = cVar.f32543h;
                if (this.f32574e == null) {
                    Paint paint = new Paint(1);
                    this.f32574e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f32574e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f32572c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f32545j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(dVar2.e(), cVar.f32545j));
                }
                paint2.setColorFilter(colorFilter);
                this.f32571b.setFillType(cVar.f32567c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f32571b, paint2);
            }
            if (cVar.f32541f.l()) {
                z1.d dVar3 = cVar.f32541f;
                if (this.f32573d == null) {
                    Paint paint3 = new Paint(1);
                    this.f32573d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f32573d;
                Paint.Join join = cVar.f32550o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f32549n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f32551p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f32572c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f32544i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(dVar3.e(), cVar.f32544i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f32542g * fMin * fE);
                canvas.drawPath(this.f32571b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f32577h, f32569q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f32584o == null) {
                this.f32584o = Boolean.valueOf(this.f32577h.a());
            }
            return this.f32584o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f32577h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f32582m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f32582m = i10;
        }

        public g(g gVar) {
            this.f32572c = new Matrix();
            this.f32578i = 0.0f;
            this.f32579j = 0.0f;
            this.f32580k = 0.0f;
            this.f32581l = 0.0f;
            this.f32582m = 255;
            this.f32583n = null;
            this.f32584o = null;
            C6551a c6551a = new C6551a();
            this.f32585p = c6551a;
            this.f32577h = new d(gVar.f32577h, c6551a);
            this.f32570a = new Path(gVar.f32570a);
            this.f32571b = new Path(gVar.f32571b);
            this.f32578i = gVar.f32578i;
            this.f32579j = gVar.f32579j;
            this.f32580k = gVar.f32580k;
            this.f32581l = gVar.f32581l;
            this.f32576g = gVar.f32576g;
            this.f32582m = gVar.f32582m;
            this.f32583n = gVar.f32583n;
            String str = gVar.f32583n;
            if (str != null) {
                c6551a.put(str, this);
            }
            this.f32584o = gVar.f32584o;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f32552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f32553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f32554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f32555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f32556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f32557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f32558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f32559h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f32560i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f32561j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f32562k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f32563l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f32564m;

        public d(d dVar, C6551a c6551a) {
            AbstractC0542f bVar;
            super();
            this.f32552a = new Matrix();
            this.f32553b = new ArrayList();
            this.f32554c = 0.0f;
            this.f32555d = 0.0f;
            this.f32556e = 0.0f;
            this.f32557f = 1.0f;
            this.f32558g = 1.0f;
            this.f32559h = 0.0f;
            this.f32560i = 0.0f;
            Matrix matrix = new Matrix();
            this.f32561j = matrix;
            this.f32564m = null;
            this.f32554c = dVar.f32554c;
            this.f32555d = dVar.f32555d;
            this.f32556e = dVar.f32556e;
            this.f32557f = dVar.f32557f;
            this.f32558g = dVar.f32558g;
            this.f32559h = dVar.f32559h;
            this.f32560i = dVar.f32560i;
            this.f32563l = dVar.f32563l;
            String str = dVar.f32564m;
            this.f32564m = str;
            this.f32562k = dVar.f32562k;
            if (str != null) {
                c6551a.put(str, this);
            }
            matrix.set(dVar.f32561j);
            ArrayList arrayList = dVar.f32553b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f32553b.add(new d((d) obj, c6551a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f32553b.add(bVar);
                    Object obj2 = bVar.f32566b;
                    if (obj2 != null) {
                        c6551a.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f32561j.reset();
            this.f32561j.postTranslate(-this.f32555d, -this.f32556e);
            this.f32561j.postScale(this.f32557f, this.f32558g);
            this.f32561j.postRotate(this.f32554c, 0.0f, 0.0f);
            this.f32561j.postTranslate(this.f32559h + this.f32555d, this.f32560i + this.f32556e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f32563l = null;
            this.f32554c = n.f(typedArray, xmlPullParser, "rotation", 5, this.f32554c);
            this.f32555d = typedArray.getFloat(1, this.f32555d);
            this.f32556e = typedArray.getFloat(2, this.f32556e);
            this.f32557f = n.f(typedArray, xmlPullParser, "scaleX", 3, this.f32557f);
            this.f32558g = n.f(typedArray, xmlPullParser, "scaleY", 4, this.f32558g);
            this.f32559h = n.f(typedArray, xmlPullParser, "translateX", 6, this.f32559h);
            this.f32560i = n.f(typedArray, xmlPullParser, "translateY", 7, this.f32560i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f32564m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f32553b.size(); i10++) {
                if (((e) this.f32553b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f32553b.size(); i10++) {
                zB |= ((e) this.f32553b.get(i10)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f32501b);
            e(typedArrayI, xmlPullParser);
            typedArrayI.recycle();
        }

        public String getGroupName() {
            return this.f32564m;
        }

        public Matrix getLocalMatrix() {
            return this.f32561j;
        }

        public float getPivotX() {
            return this.f32555d;
        }

        public float getPivotY() {
            return this.f32556e;
        }

        public float getRotation() {
            return this.f32554c;
        }

        public float getScaleX() {
            return this.f32557f;
        }

        public float getScaleY() {
            return this.f32558g;
        }

        public float getTranslateX() {
            return this.f32559h;
        }

        public float getTranslateY() {
            return this.f32560i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f32555d) {
                this.f32555d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f32556e) {
                this.f32556e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f32554c) {
                this.f32554c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f32557f) {
                this.f32557f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f32558g) {
                this.f32558g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f32559h) {
                this.f32559h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f32560i) {
                this.f32560i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f32552a = new Matrix();
            this.f32553b = new ArrayList();
            this.f32554c = 0.0f;
            this.f32555d = 0.0f;
            this.f32556e = 0.0f;
            this.f32557f = 1.0f;
            this.f32558g = 1.0f;
            this.f32559h = 0.0f;
            this.f32560i = 0.0f;
            this.f32561j = new Matrix();
            this.f32564m = null;
        }
    }
}
