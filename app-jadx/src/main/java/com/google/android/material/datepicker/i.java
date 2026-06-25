package com.google.android.material.datepicker;

import L1.B;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.C2746a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import o9.AbstractC5840c;
import o9.AbstractC5842e;
import o9.AbstractC5843f;
import o9.AbstractC5844g;
import o9.AbstractC5846i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i<S> extends q {

    /* JADX INFO: renamed from: o */
    static final Object f42350o = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: p */
    static final Object f42351p = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: q */
    static final Object f42352q = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: r */
    static final Object f42353r = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: b */
    private int f42354b;

    /* JADX INFO: renamed from: c */
    private com.google.android.material.datepicker.a f42355c;

    /* JADX INFO: renamed from: d */
    private com.google.android.material.datepicker.m f42356d;

    /* JADX INFO: renamed from: e */
    private l f42357e;

    /* JADX INFO: renamed from: f */
    private com.google.android.material.datepicker.c f42358f;

    /* JADX INFO: renamed from: g */
    private RecyclerView f42359g;

    /* JADX INFO: renamed from: h */
    private RecyclerView f42360h;

    /* JADX INFO: renamed from: i */
    private View f42361i;

    /* JADX INFO: renamed from: j */
    private View f42362j;

    /* JADX INFO: renamed from: k */
    private View f42363k;

    /* JADX INFO: renamed from: l */
    private View f42364l;

    /* JADX INFO: renamed from: m */
    private MaterialButton f42365m;

    /* JADX INFO: renamed from: n */
    private AccessibilityManager f42366n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o f42367a;

        a(o oVar) {
            this.f42367a = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.Q(this.f42367a.w(i.this.N().e2() - 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f42369a;

        b(int i10) {
            this.f42369a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f42360h.w1(this.f42369a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends C2746a {
        c() {
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            super.g(view, b10);
            b10.B0(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends r {

        /* JADX INFO: renamed from: I */
        final /* synthetic */ int f42372I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.f42372I = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void Q1(RecyclerView.A a10, int[] iArr) {
            if (this.f42372I == 0) {
                iArr[0] = i.this.f42360h.getWidth();
                iArr[1] = i.this.f42360h.getWidth();
            } else {
                iArr[0] = i.this.f42360h.getHeight();
                iArr[1] = i.this.f42360h.getHeight();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements m {
        e() {
        }

        @Override // com.google.android.material.datepicker.i.m
        public void a(long j10) {
            if (i.this.f42355c.f().p(j10)) {
                i.A(i.this);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends C2746a {
        f() {
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            super.g(view, b10);
            b10.c1(false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g extends RecyclerView.o {

        /* JADX INFO: renamed from: a */
        private final Calendar f42376a = t.i();

        /* JADX INFO: renamed from: b */
        private final Calendar f42377b = t.i();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a10) {
            if ((recyclerView.getAdapter() instanceof u) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                i.A(i.this);
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h extends C2746a {
        h() {
        }

        @Override // androidx.core.view.C2746a
        public void g(View view, B b10) {
            super.g(view, b10);
            b10.b(new B.a(16, i.this.f42364l.getVisibility() == 0 ? i.this.getString(AbstractC5846i.f54868z) : i.this.getString(AbstractC5846i.f54866x)));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.i$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0642i extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o f42380a;

        C0642i(o oVar) {
            this.f42380a = oVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int iC2 = i10 < 0 ? i.this.N().c2() : i.this.N().e2();
            com.google.android.material.datepicker.m mVarW = this.f42380a.w(iC2);
            i.this.f42356d = mVarW;
            i.this.f42365m.setText(this.f42380a.x(iC2));
            i.this.U(this.f42380a.y(mVarW));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class j implements View.OnClickListener {
        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.T();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class k implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o f42383a;

        k(o oVar) {
            this.f42383a = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.Q(this.f42383a.w(i.this.N().c2() + 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    enum l {
        DAY,
        YEAR
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface m {
        void a(long j10);
    }

    static /* synthetic */ com.google.android.material.datepicker.d A(i iVar) {
        iVar.getClass();
        return null;
    }

    private void F(View view, o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(AbstractC5842e.f54805r);
        this.f42365m = materialButton;
        materialButton.setTag(f42353r);
        AbstractC2747a0.k0(this.f42365m, new h());
        View viewFindViewById = view.findViewById(AbstractC5842e.f54807t);
        this.f42361i = viewFindViewById;
        viewFindViewById.setTag(f42351p);
        View viewFindViewById2 = view.findViewById(AbstractC5842e.f54806s);
        this.f42362j = viewFindViewById2;
        viewFindViewById2.setTag(f42352q);
        this.f42363k = view.findViewById(AbstractC5842e.f54763A);
        this.f42364l = view.findViewById(AbstractC5842e.f54809v);
        R(l.DAY);
        this.f42365m.setText(this.f42356d.r());
        this.f42360h.k(new C0642i(oVar));
        this.f42365m.setOnClickListener(new j());
        this.f42362j.setOnClickListener(new k(oVar));
        this.f42361i.setOnClickListener(new a(oVar));
        U(oVar.y(this.f42356d));
    }

    private RecyclerView.o G() {
        return new g();
    }

    static int L(Context context) {
        return context.getResources().getDimensionPixelSize(AbstractC5840c.f54708a0);
    }

    private static int M(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC5840c.f54722h0) + resources.getDimensionPixelOffset(AbstractC5840c.f54724i0) + resources.getDimensionPixelOffset(AbstractC5840c.f54720g0);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC5840c.f54712c0);
        int i10 = n.f42437e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(AbstractC5840c.f54708a0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(AbstractC5840c.f54718f0)) + resources.getDimensionPixelOffset(AbstractC5840c.f54705Y);
    }

    public static i O(com.google.android.material.datepicker.d dVar, int i10, com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.g gVar) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.j());
        iVar.setArguments(bundle);
        return iVar;
    }

    private void P(int i10) {
        this.f42360h.post(new b(i10));
    }

    private void S() {
        AbstractC2747a0.k0(this.f42360h, new f());
    }

    public void U(int i10) {
        this.f42362j.setEnabled(i10 + 1 < this.f42360h.getAdapter().e());
        this.f42361i.setEnabled(i10 - 1 >= 0);
    }

    com.google.android.material.datepicker.a H() {
        return this.f42355c;
    }

    com.google.android.material.datepicker.c I() {
        return this.f42358f;
    }

    com.google.android.material.datepicker.m J() {
        return this.f42356d;
    }

    public com.google.android.material.datepicker.d K() {
        return null;
    }

    LinearLayoutManager N() {
        return (LinearLayoutManager) this.f42360h.getLayoutManager();
    }

    void Q(com.google.android.material.datepicker.m mVar) {
        o oVar = (o) this.f42360h.getAdapter();
        int iY = oVar.y(mVar);
        AccessibilityManager accessibilityManager = this.f42366n;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iY2 = iY - oVar.y(this.f42356d);
            boolean z10 = Math.abs(iY2) > 3;
            boolean z11 = iY2 > 0;
            this.f42356d = mVar;
            if (z10 && z11) {
                this.f42360h.n1(iY - 3);
                P(iY);
            } else if (z10) {
                this.f42360h.n1(iY + 3);
                P(iY);
            } else {
                P(iY);
            }
        } else {
            this.f42356d = mVar;
            this.f42360h.n1(iY);
        }
        U(iY);
    }

    void R(l lVar) {
        this.f42357e = lVar;
        if (lVar == l.YEAR) {
            this.f42359g.getLayoutManager().B1(((u) this.f42359g.getAdapter()).v(this.f42356d.f42432c));
            this.f42363k.setVisibility(0);
            this.f42364l.setVisibility(8);
            this.f42361i.setVisibility(8);
            this.f42362j.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f42363k.setVisibility(8);
            this.f42364l.setVisibility(0);
            this.f42361i.setVisibility(0);
            this.f42362j.setVisibility(0);
            Q(this.f42356d);
        }
    }

    void T() {
        l lVar = this.f42357e;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            R(l.DAY);
            this.f42360h.announceForAccessibility(getString(AbstractC5846i.f54839A));
        } else if (lVar == l.DAY) {
            R(lVar2);
            this.f42359g.announceForAccessibility(getString(AbstractC5846i.f54840B));
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f42354b = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f42355c = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f42356d = (com.google.android.material.datepicker.m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f42354b);
        this.f42358f = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f42366n = (AccessibilityManager) requireContext().getSystemService("accessibility");
        com.google.android.material.datepicker.m mVarK = this.f42355c.k();
        if (com.google.android.material.datepicker.k.X(contextThemeWrapper)) {
            i10 = AbstractC5844g.f54834r;
            i11 = 1;
        } else {
            i10 = AbstractC5844g.f54832p;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        viewInflate.setMinimumHeight(M(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(AbstractC5842e.f54810w);
        AbstractC2747a0.k0(gridView, new c());
        int iH = this.f42355c.h();
        gridView.setAdapter((ListAdapter) (iH > 0 ? new com.google.android.material.datepicker.h(iH) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(mVarK.f42433d);
        gridView.setEnabled(false);
        this.f42360h = (RecyclerView) viewInflate.findViewById(AbstractC5842e.f54813z);
        this.f42360h.setLayoutManager(new d(getContext(), i11, false, i11));
        this.f42360h.setTag(f42350o);
        o oVar = new o(contextThemeWrapper, null, this.f42355c, null, new e());
        this.f42360h.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(AbstractC5843f.f54816c);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(AbstractC5842e.f54763A);
        this.f42359g = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f42359g.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f42359g.setAdapter(new u(this));
            this.f42359g.h(G());
        }
        if (viewInflate.findViewById(AbstractC5842e.f54805r) != null) {
            F(viewInflate, oVar);
        }
        if (!com.google.android.material.datepicker.k.X(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f42360h);
        }
        this.f42360h.n1(oVar.y(this.f42356d));
        S();
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f42354b);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f42355c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f42356d);
    }

    @Override // com.google.android.material.datepicker.q
    public boolean w(p pVar) {
        return super.w(pVar);
    }
}
