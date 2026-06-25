package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.C6551a;
import z1.k;
import z1.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c extends e implements Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0541c f32514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f32515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f32516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f32517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f32518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList f32519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Drawable.Callback f32520h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f32519g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f32519g);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0541c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f32524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f32525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f32526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C6551a f32527e;

        public C0541c(Context context, C0541c c0541c, Drawable.Callback callback, Resources resources) {
            if (c0541c != null) {
                this.f32523a = c0541c.f32523a;
                f fVar = c0541c.f32524b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f32524b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f32524b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f32524b.mutate();
                    this.f32524b = fVar2;
                    fVar2.setCallback(callback);
                    this.f32524b.setBounds(c0541c.f32524b.getBounds());
                    this.f32524b.g(false);
                }
                ArrayList arrayList = c0541c.f32526d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f32526d = new ArrayList(size);
                    this.f32527e = new C6551a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) c0541c.f32526d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = (String) c0541c.f32527e.get(animator);
                        animatorClone.setTarget(this.f32524b.c(str));
                        this.f32526d.add(animatorClone);
                        this.f32527e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f32525c == null) {
                this.f32525c = new AnimatorSet();
            }
            this.f32525c.playTogether(this.f32526d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32523a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable drawableF = k.f(context.getResources(), i10, context.getTheme());
        cVar.f32529a = drawableF;
        drawableF.setCallback(cVar.f32520h);
        cVar.f32517e = new d(cVar.f32529a.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f32518f;
        if (animatorListener != null) {
            this.f32514b.f32525c.removeListener(animatorListener);
            this.f32518f = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f32514b.f32524b.c(str));
        C0541c c0541c = this.f32514b;
        if (c0541c.f32526d == null) {
            c0541c.f32526d = new ArrayList();
            this.f32514b.f32527e = new C6551a();
        }
        this.f32514b.f32526d.add(animator);
        this.f32514b.f32527e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            B1.a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f32519g == null) {
            this.f32519g = new ArrayList();
        }
        if (this.f32519g.contains(bVar)) {
            return;
        }
        this.f32519g.add(bVar);
        if (this.f32518f == null) {
            this.f32518f = new b();
        }
        this.f32514b.f32525c.addListener(this.f32518f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            return B1.a.b(drawable);
        }
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
        this.f32514b.f32524b.draw(canvas);
        if (this.f32514b.f32525c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f32519g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f32519g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f32529a;
        return drawable != null ? B1.a.d(drawable) : this.f32514b.f32524b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f32529a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f32514b.f32523a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f32529a;
        return drawable != null ? B1.a.e(drawable) : this.f32514b.f32524b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f32529a != null) {
            return new d(this.f32529a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f32529a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f32514b.f32524b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f32529a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f32514b.f32524b.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f32514b.f32524b.getOpacity();
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

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            B1.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = n.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f32504e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f32520h);
                        f fVar = this.f32514b.f32524b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.f32514b.f32524b = fVarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f32505f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f32515c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, androidx.vectordrawable.graphics.drawable.d.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f32514b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f32529a;
        return drawable != null ? B1.a.h(drawable) : this.f32514b.f32524b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f32529a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f32514b.f32525c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f32529a;
        return drawable != null ? drawable.isStateful() : this.f32514b.f32524b.isStateful();
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
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f32514b.f32524b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f32529a;
        return drawable != null ? drawable.setLevel(i10) : this.f32514b.f32524b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f32529a;
        return drawable != null ? drawable.setState(iArr) : this.f32514b.f32524b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f32514b.f32524b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            B1.a.j(drawable, z10);
        } else {
            this.f32514b.f32524b.setAutoMirrored(z10);
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
            this.f32514b.f32524b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            B1.a.o(drawable, colorStateList);
        } else {
            this.f32514b.f32524b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            B1.a.p(drawable, mode);
        } else {
            this.f32514b.f32524b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f32514b.f32524b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f32514b.f32525c.isStarted()) {
                return;
            }
            this.f32514b.f32525c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f32514b.f32525c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f32529a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f32514b.f32524b.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f32528a;

        public d(Drawable.ConstantState constantState) {
            this.f32528a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f32528a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f32528a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f32528a.newDrawable();
            cVar.f32529a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f32520h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f32528a.newDrawable(resources);
            cVar.f32529a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f32520h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f32528a.newDrawable(resources, theme);
            cVar.f32529a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f32520h);
            return cVar;
        }
    }

    private c(Context context, C0541c c0541c, Resources resources) {
        this.f32516d = null;
        this.f32518f = null;
        this.f32519g = null;
        a aVar = new a();
        this.f32520h = aVar;
        this.f32515c = context;
        if (c0541c != null) {
            this.f32514b = c0541c;
        } else {
            this.f32514b = new C0541c(context, c0541c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
