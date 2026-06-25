package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.AbstractC2748b;
import i.AbstractC4956a;
import java.util.ArrayList;
import n.InterfaceC5708e;

/* JADX INFO: renamed from: androidx.appcompat.widget.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class C2649c extends androidx.appcompat.view.menu.a implements AbstractC2748b.a {

    /* JADX INFO: renamed from: A */
    RunnableC0428c f25292A;

    /* JADX INFO: renamed from: B */
    private b f25293B;

    /* JADX INFO: renamed from: C */
    final f f25294C;

    /* JADX INFO: renamed from: D */
    int f25295D;

    /* JADX INFO: renamed from: k */
    d f25296k;

    /* JADX INFO: renamed from: l */
    private Drawable f25297l;

    /* JADX INFO: renamed from: m */
    private boolean f25298m;

    /* JADX INFO: renamed from: n */
    private boolean f25299n;

    /* JADX INFO: renamed from: o */
    private boolean f25300o;

    /* JADX INFO: renamed from: p */
    private int f25301p;

    /* JADX INFO: renamed from: q */
    private int f25302q;

    /* JADX INFO: renamed from: r */
    private int f25303r;

    /* JADX INFO: renamed from: s */
    private boolean f25304s;

    /* JADX INFO: renamed from: t */
    private boolean f25305t;

    /* JADX INFO: renamed from: u */
    private boolean f25306u;

    /* JADX INFO: renamed from: v */
    private boolean f25307v;

    /* JADX INFO: renamed from: w */
    private int f25308w;

    /* JADX INFO: renamed from: x */
    private final SparseBooleanArray f25309x;

    /* JADX INFO: renamed from: y */
    e f25310y;

    /* JADX INFO: renamed from: z */
    a f25311z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, AbstractC4956a.f47962i);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = C2649c.this.f25296k;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) C2649c.this).f24673i : view2);
            }
            j(C2649c.this.f25294C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            C2649c c2649c = C2649c.this;
            c2649c.f25311z = null;
            c2649c.f25295D = 0;
            super.e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public InterfaceC5708e a() {
            a aVar = C2649c.this.f25311z;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class RunnableC0428c implements Runnable {

        /* JADX INFO: renamed from: a */
        private e f25314a;

        public RunnableC0428c(e eVar) {
            this.f25314a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) C2649c.this).f24667c != null) {
                ((androidx.appcompat.view.menu.a) C2649c.this).f24667c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) C2649c.this).f24673i;
            if (view != null && view.getWindowToken() != null && this.f25314a.m()) {
                C2649c.this.f25310y = this.f25314a;
            }
            C2649c.this.f25292A = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class d extends r implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends S {

            /* JADX INFO: renamed from: j */
            final /* synthetic */ C2649c f25317j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C2649c c2649c) {
                super(view);
                this.f25317j = c2649c;
            }

            @Override // androidx.appcompat.widget.S
            public InterfaceC5708e b() {
                e eVar = C2649c.this.f25310y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.S
            public boolean c() {
                C2649c.this.M();
                return true;
            }

            @Override // androidx.appcompat.widget.S
            public boolean d() {
                C2649c c2649c = C2649c.this;
                if (c2649c.f25292A != null) {
                    return false;
                }
                c2649c.D();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC4956a.f47961h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            m0.a(this, getContentDescription());
            setOnTouchListener(new a(this, C2649c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C2649c.this.M();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                B1.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, AbstractC4956a.f47962i);
            h(8388613);
            j(C2649c.this.f25294C);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) C2649c.this).f24667c != null) {
                ((androidx.appcompat.view.menu.a) C2649c.this).f24667c.close();
            }
            C2649c.this.f25310y = null;
            super.e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.F().e(false);
            }
            j.a aVarO = C2649c.this.o();
            if (aVarO != null) {
                aVarO.a(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) C2649c.this).f24667c) {
                return false;
            }
            C2649c.this.f25295D = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a aVarO = C2649c.this.o();
            if (aVarO != null) {
                return aVarO.b(eVar);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public int f25321a;

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$g$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f25321a);
        }

        g(Parcel parcel) {
            this.f25321a = parcel.readInt();
        }
    }

    public C2649c(Context context) {
        super(context, i.g.f48092c, i.g.f48091b);
        this.f25309x = new SparseBooleanArray();
        this.f25294C = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f24673i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean A() {
        return D() | E();
    }

    public Drawable C() {
        d dVar = this.f25296k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f25298m) {
            return this.f25297l;
        }
        return null;
    }

    public boolean D() {
        Object obj;
        RunnableC0428c runnableC0428c = this.f25292A;
        if (runnableC0428c != null && (obj = this.f24673i) != null) {
            ((View) obj).removeCallbacks(runnableC0428c);
            this.f25292A = null;
            return true;
        }
        e eVar = this.f25310y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean E() {
        a aVar = this.f25311z;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean F() {
        return this.f25292A != null || G();
    }

    public boolean G() {
        e eVar = this.f25310y;
        return eVar != null && eVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.f25304s) {
            this.f25303r = androidx.appcompat.view.a.b(this.f24666b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f24667c;
        if (eVar != null) {
            eVar.N(true);
        }
    }

    public void I(boolean z10) {
        this.f25307v = z10;
    }

    public void J(ActionMenuView actionMenuView) {
        this.f24673i = actionMenuView;
        actionMenuView.a(this.f24667c);
    }

    public void K(Drawable drawable) {
        d dVar = this.f25296k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f25298m = true;
            this.f25297l = drawable;
        }
    }

    public void L(boolean z10) {
        this.f25299n = z10;
        this.f25300o = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f25299n || G() || (eVar = this.f24667c) == null || this.f24673i == null || this.f25292A != null || eVar.B().isEmpty()) {
            return false;
        }
        RunnableC0428c runnableC0428c = new RunnableC0428c(new e(this.f24666b, this.f24667c, this.f25296k, true));
        this.f25292A = runnableC0428c;
        ((View) this.f24673i).post(runnableC0428c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        A();
        super.a(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a
    public void c(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f24673i);
        if (this.f25293B == null) {
            this.f25293B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f25293B);
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof g) && (i10 = ((g) parcelable).f25321a) > 0 && (menuItemFindItem = this.f24667c.findItem(i10)) != null) {
            g((androidx.appcompat.view.menu.m) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean g(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.j0() != this.f24667c) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.j0();
        }
        View viewB = B(mVar2.getItem());
        if (viewB == null) {
            return false;
        }
        this.f25295D = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f24666b, mVar, viewB);
        this.f25311z = aVar;
        aVar.g(z10);
        this.f25311z.k();
        super.g(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public Parcelable h() {
        g gVar = new g();
        gVar.f25321a = this.f25295D;
        return gVar;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(boolean z10) {
        super.i(z10);
        ((View) this.f24673i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f24667c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList arrayListU = eVar.u();
            int size = arrayListU.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC2748b abstractC2748bA = ((androidx.appcompat.view.menu.g) arrayListU.get(i10)).a();
                if (abstractC2748bA != null) {
                    abstractC2748bA.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f24667c;
        ArrayList arrayListB = eVar2 != null ? eVar2.B() : null;
        if (this.f25299n && arrayListB != null) {
            int size2 = arrayListB.size();
            if (size2 == 1) {
                z11 = !((androidx.appcompat.view.menu.g) arrayListB.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f25296k == null) {
                this.f25296k = new d(this.f24665a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f25296k.getParent();
            if (viewGroup != this.f24673i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f25296k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f24673i;
                actionMenuView.addView(this.f25296k, actionMenuView.D());
            }
        } else {
            d dVar = this.f25296k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f24673i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f25296k);
                }
            }
        }
        ((ActionMenuView) this.f24673i).setOverflowReserved(this.f25299n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean j() {
        ArrayList arrayListG;
        int size;
        int i10;
        int iJ;
        ?? r02;
        int i11;
        C2649c c2649c = this;
        androidx.appcompat.view.menu.e eVar = c2649c.f24667c;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayListG = eVar.G();
            size = arrayListG.size();
        } else {
            arrayListG = null;
            size = 0;
        }
        int i12 = c2649c.f25303r;
        int i13 = c2649c.f25302q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c2649c.f24673i;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayListG.get(i16);
            if (gVar.o()) {
                i14++;
            } else if (gVar.n()) {
                i15++;
            } else {
                z10 = true;
            }
            if (c2649c.f25307v && gVar.isActionViewExpanded()) {
                i12 = 0;
            }
        }
        if (c2649c.f25299n && (z10 || i15 + i14 > i12)) {
            i12--;
        }
        int i17 = i12 - i14;
        SparseBooleanArray sparseBooleanArray = c2649c.f25309x;
        sparseBooleanArray.clear();
        if (c2649c.f25305t) {
            int i18 = c2649c.f25308w;
            iJ = i13 / i18;
            i10 = i18 + ((i13 % i18) / iJ);
        } else {
            i10 = 0;
            iJ = 0;
        }
        int i19 = 0;
        int i20 = 0;
        ?? r03 = c2649c;
        while (i19 < size) {
            ?? r15 = (androidx.appcompat.view.menu.g) arrayListG.get(i19);
            if (r15.o()) {
                View viewP = r03.p(r15, view, viewGroup);
                if (r03.f25305t) {
                    iJ -= ActionMenuView.J(viewP, i10, iJ, iMakeMeasureSpec, r32);
                } else {
                    viewP.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewP.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.u(true);
                r02 = r32;
                i11 = size;
            } else if (r15.n()) {
                int groupId2 = r15.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i17 > 0 || z11) && i13 > 0 && (!r03.f25305t || iJ > 0);
                boolean z13 = z12;
                i11 = size;
                if (z12) {
                    View viewP2 = r03.p(r15, null, viewGroup);
                    if (r03.f25305t) {
                        int iJ2 = ActionMenuView.J(viewP2, i10, iJ, iMakeMeasureSpec, 0);
                        iJ -= iJ2;
                        if (iJ2 == 0) {
                            z13 = false;
                        }
                    } else {
                        viewP2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = viewP2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z12 = z14 & (!r03.f25305t ? i13 + i20 <= 0 : i13 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i21 = 0; i21 < i19; i21++) {
                        androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayListG.get(i21);
                        if (gVar2.getGroupId() == groupId2) {
                            if (gVar2.l()) {
                                i17++;
                            }
                            gVar2.u(false);
                        }
                    }
                }
                if (z12) {
                    i17--;
                }
                r15.u(z12);
                r02 = 0;
            } else {
                r02 = r32;
                i11 = size;
                r15.u(r02);
            }
            i19++;
            r32 = r02;
            size = i11;
            view = null;
            r03 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void l(Context context, androidx.appcompat.view.menu.e eVar) {
        super.l(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f25300o) {
            this.f25299n = aVarB.f();
        }
        if (!this.f25306u) {
            this.f25301p = aVarB.c();
        }
        if (!this.f25304s) {
            this.f25303r = aVarB.d();
        }
        int measuredWidth = this.f25301p;
        if (this.f25299n) {
            if (this.f25296k == null) {
                d dVar = new d(this.f24665a);
                this.f25296k = dVar;
                if (this.f25298m) {
                    dVar.setImageDrawable(this.f25297l);
                    this.f25297l = null;
                    this.f25298m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f25296k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f25296k.getMeasuredWidth();
        } else {
            this.f25296k = null;
        }
        this.f25302q = measuredWidth;
        this.f25308w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f25296k) {
            return false;
        }
        return super.n(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View p(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.p(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k q(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f24673i;
        androidx.appcompat.view.menu.k kVarQ = super.q(viewGroup);
        if (kVar != kVarQ) {
            ((ActionMenuView) kVarQ).setPresenter(this);
        }
        return kVarQ;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean s(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }
}
