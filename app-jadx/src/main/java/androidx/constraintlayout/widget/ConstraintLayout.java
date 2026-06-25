package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.util.ArrayList;
import java.util.HashMap;
import t1.AbstractC6598k;
import t1.AbstractC6599l;
import t1.C6591d;
import t1.C6592e;
import t1.C6593f;
import t1.C6595h;
import u1.C6718b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static j f27936x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SparseArray f27937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f27938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected C6593f f27939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f27944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f27946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected d f27947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HashMap f27949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f27952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f27953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f27954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f27955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SparseArray f27956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    c f27957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f27958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f27959w;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27960a;

        static {
            int[] iArr = new int[C6592e.b.values().length];
            f27960a = iArr;
            try {
                iArr[C6592e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27960a[C6592e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27960a[C6592e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27960a[C6592e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements C6718b.InterfaceC0913b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f28036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f28038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f28039d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f28041f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f28042g;

        public c(ConstraintLayout constraintLayout) {
            this.f28036a = constraintLayout;
        }

        private boolean d(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i12 == size;
            }
            return false;
        }

        @Override // u1.C6718b.InterfaceC0913b
        public final void a() {
            int childCount = this.f28036a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f28036a.getChildAt(i10);
            }
            int size = this.f28036a.f27938b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.c) this.f28036a.f27938b.get(i11)).l(this.f28036a);
                }
            }
        }

        @Override // u1.C6718b.InterfaceC0913b
        public final void b(C6592e c6592e, C6718b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int i10;
            if (c6592e == null) {
                return;
            }
            if (c6592e.U() == 8 && !c6592e.i0()) {
                aVar.f61133e = 0;
                aVar.f61134f = 0;
                aVar.f61135g = 0;
                return;
            }
            if (c6592e.L() == null) {
                return;
            }
            C6592e.b bVar = aVar.f61129a;
            C6592e.b bVar2 = aVar.f61130b;
            int i11 = aVar.f61131c;
            int i12 = aVar.f61132d;
            int i13 = this.f28037b + this.f28038c;
            int i14 = this.f28039d;
            View view = (View) c6592e.s();
            int[] iArr = a.f27960a;
            int i15 = iArr[bVar.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f28041f, i14, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f28041f, i14 + c6592e.B(), -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f28041f, i14, -2);
                boolean z10 = c6592e.f60397w == 1;
                int i16 = aVar.f61138j;
                if (i16 == C6718b.a.f61127l || i16 == C6718b.a.f61128m) {
                    boolean z11 = view.getMeasuredHeight() == c6592e.x();
                    if (aVar.f61138j == C6718b.a.f61128m || !z10 || ((z10 && z11) || c6592e.m0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c6592e.V(), 1073741824);
                    }
                }
            }
            int i17 = iArr[bVar2.ordinal()];
            if (i17 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else if (i17 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f28042g, i13, -2);
            } else if (i17 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f28042g, i13 + c6592e.T(), -1);
            } else if (i17 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f28042g, i13, -2);
                boolean z12 = c6592e.f60399x == 1;
                int i18 = aVar.f61138j;
                if (i18 == C6718b.a.f61127l || i18 == C6718b.a.f61128m) {
                    boolean z13 = view.getMeasuredWidth() == c6592e.V();
                    if (aVar.f61138j == C6718b.a.f61128m || !z12 || ((z12 && z13) || c6592e.n0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c6592e.x(), 1073741824);
                    }
                }
            }
            C6593f c6593f = (C6593f) c6592e.L();
            if (c6593f != null && AbstractC6598k.b(ConstraintLayout.this.f27945i, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) && view.getMeasuredWidth() == c6592e.V() && view.getMeasuredWidth() < c6593f.V() && view.getMeasuredHeight() == c6592e.x() && view.getMeasuredHeight() < c6593f.x() && view.getBaseline() == c6592e.p() && !c6592e.l0() && d(c6592e.C(), iMakeMeasureSpec, c6592e.V()) && d(c6592e.D(), iMakeMeasureSpec2, c6592e.x())) {
                aVar.f61133e = c6592e.V();
                aVar.f61134f = c6592e.x();
                aVar.f61135g = c6592e.p();
                return;
            }
            C6592e.b bVar3 = C6592e.b.MATCH_CONSTRAINT;
            boolean z14 = bVar == bVar3;
            boolean z15 = bVar2 == bVar3;
            C6592e.b bVar4 = C6592e.b.MATCH_PARENT;
            boolean z16 = bVar2 == bVar4 || bVar2 == C6592e.b.FIXED;
            boolean z17 = bVar == bVar4 || bVar == C6592e.b.FIXED;
            boolean z18 = z14 && c6592e.f60360d0 > 0.0f;
            boolean z19 = z15 && c6592e.f60360d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i19 = aVar.f61138j;
            if (i19 != C6718b.a.f61127l && i19 != C6718b.a.f61128m && z14 && c6592e.f60397w == 0 && z15 && c6592e.f60399x == 0) {
                i10 = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof k) && (c6592e instanceof AbstractC6599l)) {
                    ((k) view).p((AbstractC6599l) c6592e, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                c6592e.R0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i20 = c6592e.f60403z;
                iMax = i20 > 0 ? Math.max(i20, measuredWidth) : measuredWidth;
                int i21 = c6592e.f60317A;
                if (i21 > 0) {
                    iMax = Math.min(i21, iMax);
                }
                int i22 = c6592e.f60321C;
                iMax2 = i22 > 0 ? Math.max(i22, measuredHeight) : measuredHeight;
                boolean z20 = z17;
                int i23 = c6592e.f60323D;
                if (i23 > 0) {
                    iMax2 = Math.min(i23, iMax2);
                }
                if (!AbstractC6598k.b(ConstraintLayout.this.f27945i, 1)) {
                    if (z18 && z16) {
                        iMax = (int) ((iMax2 * c6592e.f60360d0) + 0.5f);
                    } else if (z19 && z20) {
                        iMax2 = (int) ((iMax / c6592e.f60360d0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    c6592e.R0(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i10 = -1;
            }
            boolean z21 = baseline != i10;
            aVar.f61137i = (iMax == aVar.f61131c && iMax2 == aVar.f61132d) ? false : true;
            if (bVar5.f27998f0) {
                z21 = true;
            }
            if (z21 && baseline != -1 && c6592e.p() != baseline) {
                aVar.f61137i = true;
            }
            aVar.f61133e = iMax;
            aVar.f61134f = iMax2;
            aVar.f61136h = z21;
            aVar.f61135g = baseline;
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f28037b = i12;
            this.f28038c = i13;
            this.f28039d = i14;
            this.f28040e = i15;
            this.f28041f = i10;
            this.f28042g = i11;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27937a = new SparseArray();
        this.f27938b = new ArrayList(4);
        this.f27939c = new C6593f();
        this.f27940d = 0;
        this.f27941e = 0;
        this.f27942f = Integer.MAX_VALUE;
        this.f27943g = Integer.MAX_VALUE;
        this.f27944h = true;
        this.f27945i = 257;
        this.f27946j = null;
        this.f27947k = null;
        this.f27948l = -1;
        this.f27949m = new HashMap();
        this.f27950n = -1;
        this.f27951o = -1;
        this.f27952p = -1;
        this.f27953q = -1;
        this.f27954r = 0;
        this.f27955s = 0;
        this.f27956t = new SparseArray();
        this.f27957u = new c(this);
        this.f27958v = 0;
        this.f27959w = 0;
        q(attributeSet, 0, 0);
    }

    private boolean A() {
        int childCount = getChildCount();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            w();
        }
        return z10;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static j getSharedValues() {
        if (f27936x == null) {
            f27936x = new j();
        }
        return f27936x;
    }

    private final C6592e h(int i10) {
        if (i10 == 0) {
            return this.f27939c;
        }
        View viewFindViewById = (View) this.f27937a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f27939c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f28028u0;
    }

    private void q(AttributeSet attributeSet, int i10, int i11) {
        this.f27939c.x0(this);
        this.f27939c.S1(this.f27957u);
        this.f27937a.put(getId(), this);
        this.f27946j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f28550m1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == i.f28640w1) {
                    this.f27940d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f27940d);
                } else if (index == i.f28649x1) {
                    this.f27941e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f27941e);
                } else if (index == i.f28622u1) {
                    this.f27942f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f27942f);
                } else if (index == i.f28631v1) {
                    this.f27943g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f27943g);
                } else if (index == i.f28480e3) {
                    this.f27945i = typedArrayObtainStyledAttributes.getInt(index, this.f27945i);
                } else if (index == i.f28434Z1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f27947k = null;
                        }
                    }
                } else if (index == i.f28259E1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f27946j = eVar;
                        eVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f27946j = null;
                    }
                    this.f27948l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f27939c.T1(this.f27945i);
    }

    private void s() {
        this.f27944h = true;
        this.f27950n = -1;
        this.f27951o = -1;
        this.f27952p = -1;
        this.f27953q = -1;
        this.f27954r = 0;
        this.f27955s = 0;
    }

    private void w() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            C6592e c6592eP = p(getChildAt(i10));
            if (c6592eP != null) {
                c6592eP.s0();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    h(childAt.getId()).y0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f27948l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        e eVar = this.f27946j;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f27939c.r1();
        int size = this.f27938b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.c) this.f27938b.get(i13)).n(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14);
        }
        this.f27956t.clear();
        this.f27956t.put(0, this.f27939c);
        this.f27956t.put(getId(), this.f27939c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            this.f27956t.put(childAt2.getId(), p(childAt2));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            C6592e c6592eP2 = p(childAt3);
            if (c6592eP2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f27939c.c(c6592eP2);
                d(zIsInEditMode, childAt3, c6592eP2, bVar, this.f27956t);
            }
        }
    }

    private void z(C6592e c6592e, b bVar, SparseArray sparseArray, int i10, C6591d.a aVar) {
        View view = (View) this.f27937a.get(i10);
        C6592e c6592e2 = (C6592e) sparseArray.get(i10);
        if (c6592e2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f27998f0 = true;
        C6591d.a aVar2 = C6591d.a.BASELINE;
        if (aVar == aVar2) {
            b bVar2 = (b) view.getLayoutParams();
            bVar2.f27998f0 = true;
            bVar2.f28028u0.G0(true);
        }
        c6592e.o(aVar2).b(c6592e2.o(aVar), bVar.f27963C, bVar.f27962B, true);
        c6592e.G0(true);
        c6592e.o(C6591d.a.TOP).q();
        c6592e.o(C6591d.a.BOTTOM).q();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void d(boolean r15, android.view.View r16, t1.C6592e r17, androidx.constraintlayout.widget.ConstraintLayout.b r18, android.util.SparseArray r19) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(boolean, android.view.View, t1.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f27938b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.c) this.f27938b.get(i10)).m(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(com.amazon.a.a.o.b.f.f34694a);
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        s();
        super.forceLayout();
    }

    public Object g(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f27949m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f27949m.get(str);
    }

    public int getMaxHeight() {
        return this.f27943g;
    }

    public int getMaxWidth() {
        return this.f27942f;
    }

    public int getMinHeight() {
        return this.f27941e;
    }

    public int getMinWidth() {
        return this.f27940d;
    }

    public int getOptimizationLevel() {
        return this.f27939c.G1();
    }

    public View l(int i10) {
        return (View) this.f27937a.get(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            C6592e c6592e = bVar.f28028u0;
            if ((childAt.getVisibility() != 8 || bVar.f28000g0 || bVar.f28002h0 || bVar.f28006j0 || zIsInEditMode) && !bVar.f28004i0) {
                int iW = c6592e.W();
                int iX = c6592e.X();
                childAt.layout(iW, iX, c6592e.V() + iW, c6592e.x() + iX);
            }
        }
        int size = this.f27938b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.constraintlayout.widget.c) this.f27938b.get(i15)).k(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f27958v == i10) {
            int i12 = this.f27959w;
        }
        if (!this.f27944h) {
            int childCount = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                if (getChildAt(i13).isLayoutRequested()) {
                    this.f27944h = true;
                    break;
                }
                i13++;
            }
        }
        this.f27958v = i10;
        this.f27959w = i11;
        this.f27939c.V1(r());
        if (this.f27944h) {
            this.f27944h = false;
            if (A()) {
                this.f27939c.X1();
            }
        }
        v(this.f27939c, this.f27945i, i10, i11);
        u(i10, i11, this.f27939c.V(), this.f27939c.x(), this.f27939c.N1(), this.f27939c.L1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C6592e c6592eP = p(view);
        if ((view instanceof g) && !(c6592eP instanceof C6595h)) {
            b bVar = (b) view.getLayoutParams();
            C6595h c6595h = new C6595h();
            bVar.f28028u0 = c6595h;
            bVar.f28000g0 = true;
            c6595h.w1(bVar.f27985Y);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.o();
            ((b) view.getLayoutParams()).f28002h0 = true;
            if (!this.f27938b.contains(cVar)) {
                this.f27938b.add(cVar);
            }
        }
        this.f27937a.put(view.getId(), view);
        this.f27944h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f27937a.remove(view.getId());
        this.f27939c.q1(p(view));
        this.f27938b.remove(view);
        this.f27944h = true;
    }

    public final C6592e p(View view) {
        if (view == this) {
            return this.f27939c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f28028u0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f28028u0;
        }
        return null;
    }

    protected boolean r() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f27946j = eVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f27937a.remove(getId());
        super.setId(i10);
        this.f27937a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f27943g) {
            return;
        }
        this.f27943g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f27942f) {
            return;
        }
        this.f27942f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f27941e) {
            return;
        }
        this.f27941e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f27940d) {
            return;
        }
        this.f27940d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        d dVar = this.f27947k;
        if (dVar != null) {
            dVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f27945i = i10;
        this.f27939c.T1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void t(int i10) {
        this.f27947k = new d(getContext(), this, i10);
    }

    protected void u(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f27957u;
        int i14 = cVar.f28040e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f28039d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f27942f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f27943g, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f27950n = iMin;
        this.f27951o = iMin2;
    }

    protected void v(C6593f c6593f, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f27957u.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (r()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            y(c6593f, mode, i15, mode2, i16);
            c6593f.O1(i10, mode, i15, mode2, i16, this.f27950n, this.f27951o, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i152 = size - paddingWidth;
        int i162 = size2 - i14;
        y(c6593f, mode, i152, mode2, i162);
        c6593f.O1(i10, mode, i152, mode2, i162, this.f27950n, this.f27951o, i13, iMax);
    }

    public void x(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f27949m == null) {
                this.f27949m = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f27949m.put(strSubstring, (Integer) obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r2
  0x003e: PHI (r2v4 t1.e$b) = (r2v3 t1.e$b), (r2v0 t1.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void y(t1.C6593f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f27957u
            int r1 = r0.f28040e
            int r0 = r0.f28039d
            t1.e$b r2 = t1.C6592e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r6) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r5
            goto L38
        L1a:
            int r9 = r7.f27942f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            t1.e$b r9 = t1.C6592e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f27940d
            int r10 = java.lang.Math.max(r5, r10)
            goto L38
        L2e:
            t1.e$b r9 = t1.C6592e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f27940d
            int r10 = java.lang.Math.max(r5, r10)
        L38:
            if (r11 == r6) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r5
            goto L5d
        L40:
            int r11 = r7.f27943g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            t1.e$b r2 = t1.C6592e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f27941e
            int r12 = java.lang.Math.max(r5, r11)
            goto L5d
        L53:
            t1.e$b r2 = t1.C6592e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f27941e
            int r12 = java.lang.Math.max(r5, r11)
        L5d:
            int r11 = r8.V()
            if (r10 != r11) goto L69
            int r11 = r8.x()
            if (r12 == r11) goto L6c
        L69:
            r8.K1()
        L6c:
            r8.i1(r5)
            r8.j1(r5)
            int r11 = r7.f27942f
            int r11 = r11 - r0
            r8.T0(r11)
            int r11 = r7.f27943g
            int r11 = r11 - r1
            r8.S0(r11)
            r8.W0(r5)
            r8.V0(r5)
            r8.L0(r9)
            r8.g1(r10)
            r8.c1(r2)
            r8.H0(r12)
            int r9 = r7.f27940d
            int r9 = r9 - r0
            r8.W0(r9)
            int r9 = r7.f27941e
            int r9 = r9 - r1
            r8.V0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.y(t1.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f27937a = new SparseArray();
        this.f27938b = new ArrayList(4);
        this.f27939c = new C6593f();
        this.f27940d = 0;
        this.f27941e = 0;
        this.f27942f = Integer.MAX_VALUE;
        this.f27943g = Integer.MAX_VALUE;
        this.f27944h = true;
        this.f27945i = 257;
        this.f27946j = null;
        this.f27947k = null;
        this.f27948l = -1;
        this.f27949m = new HashMap();
        this.f27950n = -1;
        this.f27951o = -1;
        this.f27952p = -1;
        this.f27953q = -1;
        this.f27954r = 0;
        this.f27955s = 0;
        this.f27956t = new SparseArray();
        this.f27957u = new c(this);
        this.f27958v = 0;
        this.f27959w = 0;
        q(attributeSet, i10, 0);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f27961A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f27962B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f27963C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        boolean f27964D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        boolean f27965E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f27966F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public float f27967G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public String f27968H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        float f27969I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        int f27970J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public float f27971K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public float f27972L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f27973M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f27974N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f27975O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f27976P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f27977Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f27978R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f27979S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f27980T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public float f27981U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public float f27982V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public int f27983W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f27984X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f27985Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public boolean f27986Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27987a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f27988a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f27989b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public String f27990b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f27991c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f27992c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f27993d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        boolean f27994d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f27995e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        boolean f27996e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f27997f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        boolean f27998f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f27999g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        boolean f28000g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f28001h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        boolean f28002h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f28003i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        boolean f28004i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f28005j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        boolean f28006j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f28007k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        int f28008k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f28009l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f28010l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f28011m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        int f28012m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f28013n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        int f28014n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f28015o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        int f28016o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f28017p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        int f28018p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f28019q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        float f28020q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f28021r;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        int f28022r0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f28023s;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        int f28024s0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f28025t;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        float f28026t0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f28027u;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        C6592e f28028u0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f28029v;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public boolean f28030v0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f28031w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f28032x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f28033y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f28034z;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f28035a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f28035a = sparseIntArray;
                sparseIntArray.append(i.f28355P2, 64);
                sparseIntArray.append(i.f28605s2, 65);
                sparseIntArray.append(i.f28233B2, 8);
                sparseIntArray.append(i.f28242C2, 9);
                sparseIntArray.append(i.f28260E2, 10);
                sparseIntArray.append(i.f28269F2, 11);
                sparseIntArray.append(i.f28323L2, 12);
                sparseIntArray.append(i.f28314K2, 13);
                sparseIntArray.append(i.f28515i2, 14);
                sparseIntArray.append(i.f28506h2, 15);
                sparseIntArray.append(i.f28470d2, 16);
                sparseIntArray.append(i.f28488f2, 52);
                sparseIntArray.append(i.f28479e2, 53);
                sparseIntArray.append(i.f28524j2, 2);
                sparseIntArray.append(i.f28542l2, 3);
                sparseIntArray.append(i.f28533k2, 4);
                sparseIntArray.append(i.f28395U2, 49);
                sparseIntArray.append(i.f28403V2, 50);
                sparseIntArray.append(i.f28578p2, 5);
                sparseIntArray.append(i.f28587q2, 6);
                sparseIntArray.append(i.f28596r2, 7);
                sparseIntArray.append(i.f28559n1, 1);
                sparseIntArray.append(i.f28278G2, 17);
                sparseIntArray.append(i.f28287H2, 18);
                sparseIntArray.append(i.f28569o2, 19);
                sparseIntArray.append(i.f28560n2, 20);
                sparseIntArray.append(i.f28435Z2, 21);
                sparseIntArray.append(i.f28462c3, 22);
                sparseIntArray.append(i.f28444a3, 23);
                sparseIntArray.append(i.f28419X2, 24);
                sparseIntArray.append(i.f28453b3, 25);
                sparseIntArray.append(i.f28427Y2, 26);
                sparseIntArray.append(i.f28411W2, 55);
                sparseIntArray.append(i.f28471d3, 54);
                sparseIntArray.append(i.f28650x2, 29);
                sparseIntArray.append(i.f28331M2, 30);
                sparseIntArray.append(i.f28551m2, 44);
                sparseIntArray.append(i.f28668z2, 45);
                sparseIntArray.append(i.f28347O2, 46);
                sparseIntArray.append(i.f28659y2, 47);
                sparseIntArray.append(i.f28339N2, 48);
                sparseIntArray.append(i.f28452b2, 27);
                sparseIntArray.append(i.f28443a2, 28);
                sparseIntArray.append(i.f28363Q2, 31);
                sparseIntArray.append(i.f28614t2, 32);
                sparseIntArray.append(i.f28379S2, 33);
                sparseIntArray.append(i.f28371R2, 34);
                sparseIntArray.append(i.f28387T2, 35);
                sparseIntArray.append(i.f28632v2, 36);
                sparseIntArray.append(i.f28623u2, 37);
                sparseIntArray.append(i.f28641w2, 38);
                sparseIntArray.append(i.f28224A2, 39);
                sparseIntArray.append(i.f28305J2, 40);
                sparseIntArray.append(i.f28251D2, 41);
                sparseIntArray.append(i.f28497g2, 42);
                sparseIntArray.append(i.f28461c2, 43);
                sparseIntArray.append(i.f28296I2, 51);
                sparseIntArray.append(i.f28489f3, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f27987a = -1;
            this.f27989b = -1;
            this.f27991c = -1.0f;
            this.f27993d = -1;
            this.f27995e = -1;
            this.f27997f = -1;
            this.f27999g = -1;
            this.f28001h = -1;
            this.f28003i = -1;
            this.f28005j = -1;
            this.f28007k = -1;
            this.f28009l = -1;
            this.f28011m = -1;
            this.f28013n = -1;
            this.f28015o = -1;
            this.f28017p = 0;
            this.f28019q = 0.0f;
            this.f28021r = -1;
            this.f28023s = -1;
            this.f28025t = -1;
            this.f28027u = -1;
            this.f28029v = Integer.MIN_VALUE;
            this.f28031w = Integer.MIN_VALUE;
            this.f28032x = Integer.MIN_VALUE;
            this.f28033y = Integer.MIN_VALUE;
            this.f28034z = Integer.MIN_VALUE;
            this.f27961A = Integer.MIN_VALUE;
            this.f27962B = Integer.MIN_VALUE;
            this.f27963C = 0;
            this.f27964D = true;
            this.f27965E = true;
            this.f27966F = 0.5f;
            this.f27967G = 0.5f;
            this.f27968H = null;
            this.f27969I = 0.0f;
            this.f27970J = 1;
            this.f27971K = -1.0f;
            this.f27972L = -1.0f;
            this.f27973M = 0;
            this.f27974N = 0;
            this.f27975O = 0;
            this.f27976P = 0;
            this.f27977Q = 0;
            this.f27978R = 0;
            this.f27979S = 0;
            this.f27980T = 0;
            this.f27981U = 1.0f;
            this.f27982V = 1.0f;
            this.f27983W = -1;
            this.f27984X = -1;
            this.f27985Y = -1;
            this.f27986Z = false;
            this.f27988a0 = false;
            this.f27990b0 = null;
            this.f27992c0 = 0;
            this.f27994d0 = true;
            this.f27996e0 = true;
            this.f27998f0 = false;
            this.f28000g0 = false;
            this.f28002h0 = false;
            this.f28004i0 = false;
            this.f28006j0 = false;
            this.f28008k0 = -1;
            this.f28010l0 = -1;
            this.f28012m0 = -1;
            this.f28014n0 = -1;
            this.f28016o0 = Integer.MIN_VALUE;
            this.f28018p0 = Integer.MIN_VALUE;
            this.f28020q0 = 0.5f;
            this.f28028u0 = new C6592e();
            this.f28030v0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f28550m1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f28035a.get(index);
                switch (i11) {
                    case 1:
                        this.f27985Y = typedArrayObtainStyledAttributes.getInt(index, this.f27985Y);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f28015o);
                        this.f28015o = resourceId;
                        if (resourceId == -1) {
                            this.f28015o = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f28017p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28017p);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f28019q) % 360.0f;
                        this.f28019q = f10;
                        if (f10 < 0.0f) {
                            this.f28019q = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f27987a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f27987a);
                        break;
                    case 6:
                        this.f27989b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f27989b);
                        break;
                    case 7:
                        this.f27991c = typedArrayObtainStyledAttributes.getFloat(index, this.f27991c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27993d);
                        this.f27993d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f27993d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27995e);
                        this.f27995e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f27995e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27997f);
                        this.f27997f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f27997f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f27999g);
                        this.f27999g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f27999g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28001h);
                        this.f28001h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f28001h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28003i);
                        this.f28003i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f28003i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28005j);
                        this.f28005j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f28005j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28007k);
                        this.f28007k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f28007k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28009l);
                        this.f28009l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f28009l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28021r);
                        this.f28021r = resourceId11;
                        if (resourceId11 == -1) {
                            this.f28021r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28023s);
                        this.f28023s = resourceId12;
                        if (resourceId12 == -1) {
                            this.f28023s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28025t);
                        this.f28025t = resourceId13;
                        if (resourceId13 == -1) {
                            this.f28025t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28027u);
                        this.f28027u = resourceId14;
                        if (resourceId14 == -1) {
                            this.f28027u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f28029v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28029v);
                        break;
                    case 22:
                        this.f28031w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28031w);
                        break;
                    case 23:
                        this.f28032x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28032x);
                        break;
                    case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                        this.f28033y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28033y);
                        break;
                    case 25:
                        this.f28034z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f28034z);
                        break;
                    case 26:
                        this.f27961A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27961A);
                        break;
                    case 27:
                        this.f27986Z = typedArrayObtainStyledAttributes.getBoolean(index, this.f27986Z);
                        break;
                    case 28:
                        this.f27988a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f27988a0);
                        break;
                    case 29:
                        this.f27966F = typedArrayObtainStyledAttributes.getFloat(index, this.f27966F);
                        break;
                    case 30:
                        this.f27967G = typedArrayObtainStyledAttributes.getFloat(index, this.f27967G);
                        break;
                    case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f27975O = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f27976P = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f27977Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27977Q);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f27977Q) == -2) {
                                this.f27977Q = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f27979S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27979S);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f27979S) == -2) {
                                this.f27979S = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f27981U = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f27981U));
                        this.f27975O = 2;
                        break;
                    case 36:
                        try {
                            this.f27978R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27978R);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f27978R) == -2) {
                                this.f27978R = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f27980T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27980T);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f27980T) == -2) {
                                this.f27980T = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f27982V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f27982V));
                        this.f27976P = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                e.p(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f27971K = typedArrayObtainStyledAttributes.getFloat(index, this.f27971K);
                                break;
                            case 46:
                                this.f27972L = typedArrayObtainStyledAttributes.getFloat(index, this.f27972L);
                                break;
                            case 47:
                                this.f27973M = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f27974N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                                this.f27983W = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f27983W);
                                break;
                            case 50:
                                this.f27984X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f27984X);
                                break;
                            case 51:
                                this.f27990b0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28011m);
                                this.f28011m = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f28011m = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28013n);
                                this.f28013n = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f28013n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f27963C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27963C);
                                break;
                            case 55:
                                this.f27962B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27962B);
                                break;
                            default:
                                switch (i11) {
                                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                                        e.n(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.f27964D = true;
                                        break;
                                    case 65:
                                        e.n(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.f27965E = true;
                                        break;
                                    case 66:
                                        this.f27992c0 = typedArrayObtainStyledAttributes.getInt(index, this.f27992c0);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f28000g0 = false;
            this.f27994d0 = true;
            this.f27996e0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f27986Z) {
                this.f27994d0 = false;
                if (this.f27975O == 0) {
                    this.f27975O = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f27988a0) {
                this.f27996e0 = false;
                if (this.f27976P == 0) {
                    this.f27976P = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f27994d0 = false;
                if (i10 == 0 && this.f27975O == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f27986Z = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f27996e0 = false;
                if (i11 == 0 && this.f27976P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f27988a0 = true;
                }
            }
            if (this.f27991c == -1.0f && this.f27987a == -1 && this.f27989b == -1) {
                return;
            }
            this.f28000g0 = true;
            this.f27994d0 = true;
            this.f27996e0 = true;
            if (!(this.f28028u0 instanceof C6595h)) {
                this.f28028u0 = new C6595h();
            }
            ((C6595h) this.f28028u0).w1(this.f27985Y);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f27987a = -1;
            this.f27989b = -1;
            this.f27991c = -1.0f;
            this.f27993d = -1;
            this.f27995e = -1;
            this.f27997f = -1;
            this.f27999g = -1;
            this.f28001h = -1;
            this.f28003i = -1;
            this.f28005j = -1;
            this.f28007k = -1;
            this.f28009l = -1;
            this.f28011m = -1;
            this.f28013n = -1;
            this.f28015o = -1;
            this.f28017p = 0;
            this.f28019q = 0.0f;
            this.f28021r = -1;
            this.f28023s = -1;
            this.f28025t = -1;
            this.f28027u = -1;
            this.f28029v = Integer.MIN_VALUE;
            this.f28031w = Integer.MIN_VALUE;
            this.f28032x = Integer.MIN_VALUE;
            this.f28033y = Integer.MIN_VALUE;
            this.f28034z = Integer.MIN_VALUE;
            this.f27961A = Integer.MIN_VALUE;
            this.f27962B = Integer.MIN_VALUE;
            this.f27963C = 0;
            this.f27964D = true;
            this.f27965E = true;
            this.f27966F = 0.5f;
            this.f27967G = 0.5f;
            this.f27968H = null;
            this.f27969I = 0.0f;
            this.f27970J = 1;
            this.f27971K = -1.0f;
            this.f27972L = -1.0f;
            this.f27973M = 0;
            this.f27974N = 0;
            this.f27975O = 0;
            this.f27976P = 0;
            this.f27977Q = 0;
            this.f27978R = 0;
            this.f27979S = 0;
            this.f27980T = 0;
            this.f27981U = 1.0f;
            this.f27982V = 1.0f;
            this.f27983W = -1;
            this.f27984X = -1;
            this.f27985Y = -1;
            this.f27986Z = false;
            this.f27988a0 = false;
            this.f27990b0 = null;
            this.f27992c0 = 0;
            this.f27994d0 = true;
            this.f27996e0 = true;
            this.f27998f0 = false;
            this.f28000g0 = false;
            this.f28002h0 = false;
            this.f28004i0 = false;
            this.f28006j0 = false;
            this.f28008k0 = -1;
            this.f28010l0 = -1;
            this.f28012m0 = -1;
            this.f28014n0 = -1;
            this.f28016o0 = Integer.MIN_VALUE;
            this.f28018p0 = Integer.MIN_VALUE;
            this.f28020q0 = 0.5f;
            this.f28028u0 = new C6592e();
            this.f28030v0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f27987a = -1;
            this.f27989b = -1;
            this.f27991c = -1.0f;
            this.f27993d = -1;
            this.f27995e = -1;
            this.f27997f = -1;
            this.f27999g = -1;
            this.f28001h = -1;
            this.f28003i = -1;
            this.f28005j = -1;
            this.f28007k = -1;
            this.f28009l = -1;
            this.f28011m = -1;
            this.f28013n = -1;
            this.f28015o = -1;
            this.f28017p = 0;
            this.f28019q = 0.0f;
            this.f28021r = -1;
            this.f28023s = -1;
            this.f28025t = -1;
            this.f28027u = -1;
            this.f28029v = Integer.MIN_VALUE;
            this.f28031w = Integer.MIN_VALUE;
            this.f28032x = Integer.MIN_VALUE;
            this.f28033y = Integer.MIN_VALUE;
            this.f28034z = Integer.MIN_VALUE;
            this.f27961A = Integer.MIN_VALUE;
            this.f27962B = Integer.MIN_VALUE;
            this.f27963C = 0;
            this.f27964D = true;
            this.f27965E = true;
            this.f27966F = 0.5f;
            this.f27967G = 0.5f;
            this.f27968H = null;
            this.f27969I = 0.0f;
            this.f27970J = 1;
            this.f27971K = -1.0f;
            this.f27972L = -1.0f;
            this.f27973M = 0;
            this.f27974N = 0;
            this.f27975O = 0;
            this.f27976P = 0;
            this.f27977Q = 0;
            this.f27978R = 0;
            this.f27979S = 0;
            this.f27980T = 0;
            this.f27981U = 1.0f;
            this.f27982V = 1.0f;
            this.f27983W = -1;
            this.f27984X = -1;
            this.f27985Y = -1;
            this.f27986Z = false;
            this.f27988a0 = false;
            this.f27990b0 = null;
            this.f27992c0 = 0;
            this.f27994d0 = true;
            this.f27996e0 = true;
            this.f27998f0 = false;
            this.f28000g0 = false;
            this.f28002h0 = false;
            this.f28004i0 = false;
            this.f28006j0 = false;
            this.f28008k0 = -1;
            this.f28010l0 = -1;
            this.f28012m0 = -1;
            this.f28014n0 = -1;
            this.f28016o0 = Integer.MIN_VALUE;
            this.f28018p0 = Integer.MIN_VALUE;
            this.f28020q0 = 0.5f;
            this.f28028u0 = new C6592e();
            this.f28030v0 = false;
        }
    }
}
