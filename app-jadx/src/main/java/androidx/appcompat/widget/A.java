package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;
import i.AbstractC4956a;
import j.AbstractC5323a;
import n.InterfaceC5708e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class A extends Spinner {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f24832i = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2651e f24833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private S f24835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f24836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f24837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f24838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f24839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f24840h;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends S {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f24841j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f24841j = fVar;
        }

        @Override // androidx.appcompat.widget.S
        public InterfaceC5708e b() {
            return this.f24841j;
        }

        @Override // androidx.appcompat.widget.S
        public boolean c() {
            if (A.this.getInternalPopup().b()) {
                return true;
            }
            A.this.b();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!A.this.getInternalPopup().b()) {
                A.this.b();
            }
            ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (K1.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.b f24844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f24845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f24846c;

        d() {
        }

        @Override // androidx.appcompat.widget.A.h
        public int a() {
            return 0;
        }

        @Override // androidx.appcompat.widget.A.h
        public boolean b() {
            androidx.appcompat.app.b bVar = this.f24844a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.A.h
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f24844a;
            if (bVar != null) {
                bVar.dismiss();
                this.f24844a = null;
            }
        }

        @Override // androidx.appcompat.widget.A.h
        public void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public CharSequence f() {
            return this.f24846c;
        }

        @Override // androidx.appcompat.widget.A.h
        public Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.A.h
        public void h(CharSequence charSequence) {
            this.f24846c = charSequence;
        }

        @Override // androidx.appcompat.widget.A.h
        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.h
        public void k(int i10, int i11) {
            if (this.f24845b == null) {
                return;
            }
            b.a aVar = new b.a(A.this.getPopupContext());
            CharSequence charSequence = this.f24846c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.b bVarCreate = aVar.j(this.f24845b, A.this.getSelectedItemPosition(), this).create();
            this.f24844a = bVarCreate;
            ListView listViewL = bVarCreate.l();
            listViewL.setTextDirection(i10);
            listViewL.setTextAlignment(i11);
            this.f24844a.show();
        }

        @Override // androidx.appcompat.widget.A.h
        public int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.A.h
        public void m(ListAdapter listAdapter) {
            this.f24845b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            A.this.setSelection(i10);
            if (A.this.getOnItemClickListener() != null) {
                A.this.performItemClick(null, i10, this.f24845b.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.A.h
        public void p(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f24848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f24849b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f24848a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f24849b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f24849b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f24848a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f24848a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f24848a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f24848a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f24848a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f24849b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f24848a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f24848a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends U implements h {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private CharSequence f24850I;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        ListAdapter f24851X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private final Rect f24852Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private int f24853Z;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ A f24855a;

            a(A a10) {
                this.f24855a = a10;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                A.this.setSelection(i10);
                if (A.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    A.this.performItemClick(view, i10, fVar.f24851X.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.V(A.this)) {
                    f.this.dismiss();
                } else {
                    f.this.T();
                    f.super.c();
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f24858a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f24858a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f24858a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f24852Y = new Rect();
            D(A.this);
            J(true);
            P(0);
            L(new a(A.this));
        }

        void T() {
            int i10;
            Drawable drawableG = g();
            if (drawableG != null) {
                drawableG.getPadding(A.this.f24840h);
                i10 = s0.b(A.this) ? A.this.f24840h.right : -A.this.f24840h.left;
            } else {
                Rect rect = A.this.f24840h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = A.this.getPaddingLeft();
            int paddingRight = A.this.getPaddingRight();
            int width = A.this.getWidth();
            A a10 = A.this;
            int i11 = a10.f24839g;
            if (i11 == -2) {
                int iA = a10.a((SpinnerAdapter) this.f24851X, g());
                int i12 = A.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = A.this.f24840h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (iA > i13) {
                    iA = i13;
                }
                F(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i11);
            }
            e(s0.b(A.this) ? i10 + (((width - paddingRight) - z()) - U()) : i10 + paddingLeft + U());
        }

        public int U() {
            return this.f24853Z;
        }

        boolean V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f24852Y);
        }

        @Override // androidx.appcompat.widget.A.h
        public CharSequence f() {
            return this.f24850I;
        }

        @Override // androidx.appcompat.widget.A.h
        public void h(CharSequence charSequence) {
            this.f24850I = charSequence;
        }

        @Override // androidx.appcompat.widget.A.h
        public void j(int i10) {
            this.f24853Z = i10;
        }

        @Override // androidx.appcompat.widget.A.h
        public void k(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean zB = b();
            T();
            I(2);
            super.c();
            ListView listViewO = o();
            listViewO.setChoiceMode(1);
            listViewO.setTextDirection(i10);
            listViewO.setTextAlignment(i11);
            Q(A.this.getSelectedItemPosition());
            if (zB || (viewTreeObserver = A.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.U, androidx.appcompat.widget.A.h
        public void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.f24851X = listAdapter;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f24860a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f24860a ? (byte) 1 : (byte) 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f24860a = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface h {
        int a();

        boolean b();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i10);

        void j(int i10);

        void k(int i10, int i11);

        int l();

        void m(ListAdapter listAdapter);

        void p(Drawable drawable);
    }

    public A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47948J);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f24840h);
        Rect rect = this.f24840h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f24838f.k(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C2651e c2651e = this.f24833a;
        if (c2651e != null) {
            c2651e.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f24838f;
        return hVar != null ? hVar.a() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f24838f;
        return hVar != null ? hVar.l() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f24838f != null ? this.f24839g : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f24838f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f24838f;
        return hVar != null ? hVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f24834b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f24838f;
        return hVar != null ? hVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2651e c2651e = this.f24833a;
        if (c2651e != null) {
            return c2651e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2651e c2651e = this.f24833a;
        if (c2651e != null) {
            return c2651e.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f24838f;
        if (hVar == null || !hVar.b()) {
            return;
        }
        this.f24838f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f24838f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f24860a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f24838f;
        gVar.f24860a = hVar != null && hVar.b();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        S s10 = this.f24835c;
        if (s10 == null || !s10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f24838f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2651e c2651e = this.f24833a;
        if (c2651e != null) {
            c2651e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2651e c2651e = this.f24833a;
        if (c2651e != null) {
            c2651e.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f24838f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            hVar.j(i10);
            this.f24838f.e(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f24838f;
        if (hVar != null) {
            hVar.i(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f24838f != null) {
            this.f24839g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f24838f;
        if (hVar != null) {
            hVar.p(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(AbstractC5323a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f24838f;
        if (hVar != null) {
            hVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2651e c2651e = this.f24833a;
        if (c2651e != null) {
            c2651e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2651e c2651e = this.f24833a;
        if (c2651e != null) {
            c2651e.j(mode);
        }
    }

    public A(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f24837e) {
            this.f24836d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f24838f != null) {
            Context context = this.f24834b;
            if (context == null) {
                context = getContext();
            }
            this.f24838f.m(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public A(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.A] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public A(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.A.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
