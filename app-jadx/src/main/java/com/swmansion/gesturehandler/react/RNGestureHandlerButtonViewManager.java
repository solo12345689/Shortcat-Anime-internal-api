package com.swmansion.gesturehandler.react;

import K7.C1850t;
import K7.InterfaceC1852u;
import Qa.AbstractC2081d;
import Qa.q;
import Ud.AbstractC2279u;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC2759g0;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002?@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001bH\u0017¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b0\u0010+J\u001f\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0013H\u0017¢\u0006\u0004\b2\u0010\u0016J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000eH\u0017¢\u0006\u0004\b4\u0010\u0012J\u001f\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000eH\u0017¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000109H\u0014¢\u0006\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "LK7/u;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "view", "", "useDrawableOnForeground", "LTd/L;", "setForeground", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Z)V", "", "backgroundColor", "setBackgroundColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;I)V", "useBorderlessDrawable", "setBorderless", "enabled", "setEnabled", "", "borderRadius", "setBorderRadius", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;F)V", "borderTopLeftRadius", "setBorderTopLeftRadius", "borderTopRightRadius", "setBorderTopRightRadius", "borderBottomLeftRadius", "setBorderBottomLeftRadius", "borderBottomRightRadius", "setBorderBottomRightRadius", "borderWidth", "setBorderWidth", "borderColor", "setBorderColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "borderStyle", "setBorderStyle", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/String;)V", "rippleColor", "setRippleColor", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "onAfterUpdateTransaction", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;)V", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "mDelegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "b", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> implements InterfaceC1852u {
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final q0 mDelegate;

    public RNGestureHandlerButtonViewManager() {
        super(null, 1, null);
        this.mDelegate = new C1850t(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    protected q0 getMDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return new a(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a view) {
        AbstractC5504s.h(view, "view");
        super.onAfterUpdateTransaction(view);
        view.t();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @B7.a(name = "backgroundColor")
    public void setBackgroundColor(a view, int backgroundColor) {
        AbstractC5504s.h(view, "view");
        view.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @B7.a(name = "borderBottomLeftRadius")
    public void setBorderBottomLeftRadius(a view, float borderBottomLeftRadius) {
        AbstractC5504s.h(view, "view");
        view.setBorderBottomLeftRadius(borderBottomLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @B7.a(name = "borderBottomRightRadius")
    public void setBorderBottomRightRadius(a view, float borderBottomRightRadius) {
        AbstractC5504s.h(view, "view");
        view.setBorderBottomRightRadius(borderBottomRightRadius);
    }

    @Override // K7.InterfaceC1852u
    @B7.a(name = "borderColor")
    public void setBorderColor(a view, Integer borderColor) {
        AbstractC5504s.h(view, "view");
        view.setBorderColor(borderColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @B7.a(name = "borderRadius")
    public void setBorderRadius(a view, float borderRadius) {
        AbstractC5504s.h(view, "view");
        view.setBorderRadius(borderRadius);
    }

    @Override // K7.InterfaceC1852u
    @B7.a(name = "borderStyle")
    public void setBorderStyle(a view, String borderStyle) {
        AbstractC5504s.h(view, "view");
        view.setBorderStyle(borderStyle);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @B7.a(name = "borderTopLeftRadius")
    public void setBorderTopLeftRadius(a view, float borderTopLeftRadius) {
        AbstractC5504s.h(view, "view");
        view.setBorderTopLeftRadius(borderTopLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @B7.a(name = "borderTopRightRadius")
    public void setBorderTopRightRadius(a view, float borderTopRightRadius) {
        AbstractC5504s.h(view, "view");
        view.setBorderTopRightRadius(borderTopRightRadius);
    }

    @Override // K7.InterfaceC1852u
    @B7.a(name = "borderWidth")
    public void setBorderWidth(a view, float borderWidth) {
        AbstractC5504s.h(view, "view");
        view.setBorderWidth(borderWidth);
    }

    @Override // K7.InterfaceC1852u
    @B7.a(name = "borderless")
    public void setBorderless(a view, boolean useBorderlessDrawable) {
        AbstractC5504s.h(view, "view");
        view.setUseBorderlessDrawable(useBorderlessDrawable);
    }

    @Override // K7.InterfaceC1852u
    @B7.a(name = "enabled")
    public void setEnabled(a view, boolean enabled) {
        AbstractC5504s.h(view, "view");
        view.setEnabled(enabled);
    }

    @Override // K7.InterfaceC1852u
    @B7.a(name = "exclusive")
    public void setExclusive(a view, boolean exclusive) {
        AbstractC5504s.h(view, "view");
        view.setExclusive(exclusive);
    }

    @Override // K7.InterfaceC1852u
    @B7.a(name = "foreground")
    public void setForeground(a view, boolean useDrawableOnForeground) {
        AbstractC5504s.h(view, "view");
        view.setUseDrawableOnForeground(useDrawableOnForeground);
    }

    @Override // K7.InterfaceC1852u
    @B7.a(name = "rippleColor")
    public void setRippleColor(a view, Integer rippleColor) {
        AbstractC5504s.h(view, "view");
        view.setRippleColor(rippleColor);
    }

    @Override // K7.InterfaceC1852u
    @B7.a(name = "rippleRadius")
    public void setRippleRadius(a view, int rippleRadius) {
        AbstractC5504s.h(view, "view");
        view.setRippleRadius(Integer.valueOf(rippleRadius));
    }

    @Override // K7.InterfaceC1852u
    @B7.a(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(a view, boolean touchSoundDisabled) {
        AbstractC5504s.h(view, "view");
        view.setSoundEffectsEnabled(!touchSoundDisabled);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends ViewGroup implements q.e {

        /* JADX INFO: renamed from: v */
        private static a f44257v;

        /* JADX INFO: renamed from: w */
        private static a f44258w;

        /* JADX INFO: renamed from: a */
        private Integer f44260a;

        /* JADX INFO: renamed from: b */
        private Integer f44261b;

        /* JADX INFO: renamed from: c */
        private boolean f44262c;

        /* JADX INFO: renamed from: d */
        private boolean f44263d;

        /* JADX INFO: renamed from: e */
        private float f44264e;

        /* JADX INFO: renamed from: f */
        private float f44265f;

        /* JADX INFO: renamed from: g */
        private float f44266g;

        /* JADX INFO: renamed from: h */
        private float f44267h;

        /* JADX INFO: renamed from: i */
        private float f44268i;

        /* JADX INFO: renamed from: j */
        private float f44269j;

        /* JADX INFO: renamed from: k */
        private Integer f44270k;

        /* JADX INFO: renamed from: l */
        private String f44271l;

        /* JADX INFO: renamed from: m */
        private boolean f44272m;

        /* JADX INFO: renamed from: n */
        private int f44273n;

        /* JADX INFO: renamed from: o */
        private boolean f44274o;

        /* JADX INFO: renamed from: p */
        private long f44275p;

        /* JADX INFO: renamed from: q */
        private int f44276q;

        /* JADX INFO: renamed from: r */
        private boolean f44277r;

        /* JADX INFO: renamed from: s */
        private boolean f44278s;

        /* JADX INFO: renamed from: t */
        public static final C0697a f44255t = new C0697a(null);

        /* JADX INFO: renamed from: u */
        private static TypedValue f44256u = new TypedValue();

        /* JADX INFO: renamed from: x */
        private static View.OnClickListener f44259x = new View.OnClickListener() { // from class: com.swmansion.gesturehandler.react.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.a.n(view);
            }
        };

        /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0697a {
            public /* synthetic */ C0697a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0697a() {
            }
        }

        public a(Context context) {
            super(context);
            this.f44271l = "solid";
            this.f44272m = true;
            this.f44275p = -1L;
            this.f44276q = -1;
            setOnClickListener(f44259x);
            setClickable(true);
            setFocusable(true);
            this.f44274o = true;
            setClipChildren(false);
        }

        private final boolean getHasBorderRadii() {
            return (this.f44264e == 0.0f && this.f44265f == 0.0f && this.f44266g == 0.0f && this.f44267h == 0.0f && this.f44268i == 0.0f) ? false : true;
        }

        private final float[] j() {
            float f10 = this.f44265f;
            float f11 = this.f44266g;
            float f12 = this.f44268i;
            float f13 = this.f44267h;
            float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
            ArrayList arrayList = new ArrayList(8);
            for (int i10 = 0; i10 < 8; i10++) {
                float f14 = fArr[i10];
                if (f14 == 0.0f) {
                    f14 = this.f44264e;
                }
                arrayList.add(Float.valueOf(f14));
            }
            return AbstractC2279u.Y0(arrayList);
        }

        private final PathEffect k() {
            String str = this.f44271l;
            if (AbstractC5504s.c(str, "dotted")) {
                float f10 = this.f44269j;
                return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
            }
            if (!AbstractC5504s.c(str, "dashed")) {
                return null;
            }
            float f11 = this.f44269j;
            float f12 = 3;
            return new DashPathEffect(new float[]{f11 * f12, f11 * f12, f11 * f12, f11 * f12}, 0.0f);
        }

        private final Drawable l() {
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            if (this.f44269j > 0.0f) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.f44269j);
                Integer num = this.f44270k;
                paint.setColor(num != null ? num.intValue() : -16777216);
                paint.setPathEffect(k());
            }
            return paintDrawable;
        }

        private final Drawable m() {
            ColorStateList colorStateList;
            Integer num = this.f44260a;
            if (num != null && num.intValue() == 0) {
                return null;
            }
            int[][] iArr = {new int[]{R.attr.state_enabled}};
            Integer num2 = this.f44261b;
            Integer num3 = this.f44260a;
            if (num3 != null) {
                AbstractC5504s.e(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, f44256u, true);
                colorStateList = new ColorStateList(iArr, new int[]{f44256u.data});
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, this.f44263d ? null : new ShapeDrawable(new RectShape()));
            if (num2 != null) {
                rippleDrawable.setRadius((int) B.i(num2.intValue()));
            }
            return rippleDrawable;
        }

        private final l o() {
            l lVar = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof l) {
                    lVar = (l) parent;
                }
            }
            return lVar;
        }

        private final boolean p(Cf.i iVar) {
            Iterator it = iVar.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof a) {
                    a aVar = (a) view;
                    if (aVar.f44278s || aVar.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && p(AbstractC2759g0.a((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        static /* synthetic */ boolean q(a aVar, Cf.i iVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iVar = AbstractC2759g0.a(aVar);
            }
            return aVar.p(iVar);
        }

        private final void r() {
            if (f44257v == this) {
                f44257v = null;
                f44258w = this;
            }
        }

        private final boolean s() {
            if (q(this, null, 1, null)) {
                return false;
            }
            a aVar = f44257v;
            if (aVar == null) {
                f44257v = this;
                return true;
            }
            if (this.f44272m) {
                return aVar == this;
            }
            return !(aVar != null ? aVar.f44272m : false);
        }

        private final void u(int i10, Drawable drawable, Drawable drawable2) {
            PaintDrawable paintDrawable = new PaintDrawable(i10);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            setBackground(new LayerDrawable(drawable2 != null ? new Drawable[]{paintDrawable, drawable2, drawable} : new Drawable[]{paintDrawable, drawable}));
        }

        @Override // Qa.q.e
        public boolean a() {
            return q.e.a.f(this);
        }

        @Override // Qa.q.e
        public Boolean b(AbstractC2081d abstractC2081d) {
            return q.e.a.g(this, abstractC2081d);
        }

        @Override // Qa.q.e
        public boolean c(MotionEvent event) {
            AbstractC5504s.h(event, "event");
            if (event.getAction() == 3 || event.getAction() == 1 || event.getActionMasked() == 6) {
                return false;
            }
            boolean zS = s();
            if (zS) {
                this.f44278s = true;
            }
            return zS;
        }

        @Override // Qa.q.e
        public boolean d() {
            return q.e.a.h(this);
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f10, float f11) {
            a aVar = f44257v;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f10, f11);
            }
        }

        @Override // Qa.q.e
        public boolean e(View view) {
            return q.e.a.b(this, view);
        }

        @Override // Qa.q.e
        public Boolean f(View view, MotionEvent motionEvent) {
            return q.e.a.e(this, view, motionEvent);
        }

        @Override // Qa.q.e
        public void g(MotionEvent motionEvent) {
            q.e.a.d(this, motionEvent);
        }

        public final float getBorderBottomLeftRadius() {
            return this.f44267h;
        }

        public final float getBorderBottomRightRadius() {
            return this.f44268i;
        }

        public final Integer getBorderColor() {
            return this.f44270k;
        }

        public final float getBorderRadius() {
            return this.f44264e;
        }

        public final String getBorderStyle() {
            return this.f44271l;
        }

        public final float getBorderTopLeftRadius() {
            return this.f44265f;
        }

        public final float getBorderTopRightRadius() {
            return this.f44266g;
        }

        public final float getBorderWidth() {
            return this.f44269j;
        }

        public final boolean getExclusive() {
            return this.f44272m;
        }

        public final Integer getRippleColor() {
            return this.f44260a;
        }

        public final Integer getRippleRadius() {
            return this.f44261b;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.f44263d;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.f44262c;
        }

        @Override // Qa.q.e
        public void h(MotionEvent event) {
            AbstractC5504s.h(event, "event");
            r();
            this.f44278s = false;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            AbstractC5504s.h(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            Object tag = super.getTag(AbstractC3247l.f36928v);
            if (tag instanceof String) {
                info.setViewIdResourceName((String) tag);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            AbstractC5504s.h(event, "event");
            if (super.onInterceptTouchEvent(event)) {
                return true;
            }
            onTouchEvent(event);
            return isPressed();
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i10, KeyEvent keyEvent) {
            this.f44277r = true;
            return super.onKeyUp(i10, keyEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            AbstractC5504s.h(event, "event");
            long eventTime = event.getEventTime();
            int action = event.getAction();
            a aVar = f44257v;
            if (aVar != null && aVar != this) {
                AbstractC5504s.e(aVar);
                if (aVar.f44272m) {
                    if (isPressed()) {
                        setPressed(false);
                    }
                    this.f44275p = eventTime;
                    this.f44276q = action;
                    return false;
                }
            }
            if (event.getAction() == 3) {
                r();
            }
            if (this.f44275p == eventTime && this.f44276q == action && action != 3) {
                return false;
            }
            this.f44275p = eventTime;
            this.f44276q = action;
            return super.onTouchEvent(event);
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!q(this, null, 1, null)) {
                Context context = getContext();
                AbstractC5504s.g(context, "getContext(...)");
                if (com.swmansion.gesturehandler.react.a.d(context)) {
                    l lVarO = o();
                    if (lVarO != null) {
                        lVarO.B(this);
                    }
                } else if (this.f44277r) {
                    l lVarO2 = o();
                    if (lVarO2 != null) {
                        lVarO2.B(this);
                    }
                    this.f44277r = false;
                }
                if (f44258w == this) {
                    r();
                    f44258w = null;
                    return super.performClick();
                }
            }
            return false;
        }

        @Override // android.view.View
        public void setBackgroundColor(int i10) {
            this.f44273n = i10;
            this.f44274o = true;
        }

        public final void setBorderBottomLeftRadius(float f10) {
            this.f44267h = f10 * getResources().getDisplayMetrics().density;
            this.f44274o = true;
        }

        public final void setBorderBottomRightRadius(float f10) {
            this.f44268i = f10 * getResources().getDisplayMetrics().density;
            this.f44274o = true;
        }

        public final void setBorderColor(Integer num) {
            this.f44270k = num;
            this.f44274o = true;
        }

        public final void setBorderRadius(float f10) {
            this.f44264e = f10 * getResources().getDisplayMetrics().density;
            this.f44274o = true;
        }

        public final void setBorderStyle(String str) {
            this.f44271l = str;
            this.f44274o = true;
        }

        public final void setBorderTopLeftRadius(float f10) {
            this.f44265f = f10 * getResources().getDisplayMetrics().density;
            this.f44274o = true;
        }

        public final void setBorderTopRightRadius(float f10) {
            this.f44266g = f10 * getResources().getDisplayMetrics().density;
            this.f44274o = true;
        }

        public final void setBorderWidth(float f10) {
            this.f44269j = f10 * getResources().getDisplayMetrics().density;
            this.f44274o = true;
        }

        public final void setExclusive(boolean z10) {
            this.f44272m = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0017  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void setPressed(boolean r4) {
            /*
                r3 = this;
                boolean r0 = r3.f44272m
                r1 = 0
                if (r0 != 0) goto L17
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.f44257v
                r2 = 1
                if (r0 == 0) goto Lf
                boolean r0 = r0.f44272m
                if (r0 != r2) goto Lf
                goto L17
            Lf:
                r0 = 0
                boolean r0 = q(r3, r0, r2, r0)
                if (r0 != 0) goto L17
                goto L18
            L17:
                r2 = r1
            L18:
                if (r4 == 0) goto L20
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.f44257v
                if (r0 == r3) goto L20
                if (r2 == 0) goto L25
            L20:
                r3.f44278s = r4
                super.setPressed(r4)
            L25:
                if (r4 != 0) goto L2d
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a r4 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.f44257v
                if (r4 != r3) goto L2d
                r3.f44278s = r1
            L2d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.a.setPressed(boolean):void");
        }

        public final void setRippleColor(Integer num) {
            this.f44260a = num;
            this.f44274o = true;
        }

        public final void setRippleRadius(Integer num) {
            this.f44261b = num;
            this.f44274o = true;
        }

        public final void setTouched(boolean z10) {
            this.f44278s = z10;
        }

        public final void setUseBorderlessDrawable(boolean z10) {
            this.f44263d = z10;
        }

        public final void setUseDrawableOnForeground(boolean z10) {
            this.f44262c = z10;
            this.f44274o = true;
        }

        public final void t() {
            if (this.f44274o) {
                this.f44274o = false;
                if (this.f44273n == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Drawable drawableM = m();
                Drawable drawableL = l();
                if (getHasBorderRadii() && (drawableM instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadii(j());
                    ((RippleDrawable) drawableM).setDrawableByLayerId(R.id.mask, paintDrawable);
                }
                if (this.f44262c) {
                    setForeground(drawableM);
                    int i10 = this.f44273n;
                    if (i10 != 0) {
                        u(i10, drawableL, null);
                        return;
                    }
                    return;
                }
                int i11 = this.f44273n;
                if (i11 == 0 && this.f44260a == null) {
                    setBackground(new LayerDrawable(new Drawable[]{drawableM, drawableL}));
                } else {
                    u(i11, drawableL, drawableM);
                }
            }
        }

        public static final void n(View view) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f10, float f11) {
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }
    }
}
