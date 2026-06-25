package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.adjust.sdk.network.ErrorCodes;
import i.AbstractC4956a;
import java.lang.reflect.Method;
import n.InterfaceC5708e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class U implements InterfaceC5708e {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static Method f25191G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static Method f25192H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Runnable f25193A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final Handler f25194B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Rect f25195C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Rect f25196D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f25197E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    PopupWindow f25198F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f25200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    P f25201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f25210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f25211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f25213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f25214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f25215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DataSetObserver f25216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f25217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f25218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AdapterView.OnItemClickListener f25219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f25220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final i f25221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final h f25222x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final g f25223y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final e f25224z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = U.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            U.this.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            U.this.r();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (U.this.b()) {
                U.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            U.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = U.this.f25198F) != null && popupWindow.isShowing() && x10 >= 0 && x10 < U.this.f25198F.getWidth() && y10 >= 0 && y10 < U.this.f25198F.getHeight()) {
                U u10 = U.this;
                u10.f25194B.postDelayed(u10.f25221w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            U u11 = U.this;
            u11.f25194B.removeCallbacks(u11.f25221w);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P p10 = U.this.f25201c;
            if (p10 == null || !p10.isAttachedToWindow() || U.this.f25201c.getCount() <= U.this.f25201c.getChildCount()) {
                return;
            }
            int childCount = U.this.f25201c.getChildCount();
            U u10 = U.this;
            if (childCount <= u10.f25213o) {
                u10.f25198F.setInputMethodMode(2);
                U.this.c();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f25191G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f25192H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public U(Context context) {
        this(context, null, AbstractC4956a.f47942D);
    }

    private void C() {
        View view = this.f25214p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f25214p);
            }
        }
    }

    private void O(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f25198F, z10);
            return;
        }
        Method method = f25191G;
        if (method != null) {
            try {
                method.invoke(this.f25198F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private int q() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f25201c == null) {
            Context context = this.f25199a;
            this.f25193A = new a();
            P pS = s(context, !this.f25197E);
            this.f25201c = pS;
            Drawable drawable = this.f25218t;
            if (drawable != null) {
                pS.setSelector(drawable);
            }
            this.f25201c.setAdapter(this.f25200b);
            this.f25201c.setOnItemClickListener(this.f25219u);
            this.f25201c.setFocusable(true);
            this.f25201c.setFocusableInTouchMode(true);
            this.f25201c.setOnItemSelectedListener(new b());
            this.f25201c.setOnScrollListener(this.f25223y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f25220v;
            if (onItemSelectedListener != null) {
                this.f25201c.setOnItemSelectedListener(onItemSelectedListener);
            }
            P p10 = this.f25201c;
            View view2 = this.f25214p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f25215q;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(p10, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f25215q);
                } else {
                    linearLayout.addView(p10, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f25203e;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = p10;
            }
            this.f25198F.setContentView(view);
        } else {
            View view3 = this.f25214p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f25198F.getBackground();
        if (background != null) {
            background.getPadding(this.f25195C);
            Rect rect = this.f25195C;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f25207i) {
                this.f25205g = -i14;
            }
        } else {
            this.f25195C.setEmpty();
            i10 = 0;
        }
        int iU = u(t(), this.f25205g, this.f25198F.getInputMethodMode() == 2);
        if (this.f25211m || this.f25202d == -1) {
            return iU + i10;
        }
        int i15 = this.f25203e;
        if (i15 == -2) {
            int i16 = this.f25199a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f25195C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f25199a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f25195C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f25201c.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f25201c.getPaddingTop() + this.f25201c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(View view, int i10, boolean z10) {
        return c.a(this.f25198F, view, i10, z10);
    }

    public boolean A() {
        return this.f25198F.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f25197E;
    }

    public void D(View view) {
        this.f25217s = view;
    }

    public void E(int i10) {
        this.f25198F.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.f25198F.getBackground();
        if (background == null) {
            R(i10);
            return;
        }
        background.getPadding(this.f25195C);
        Rect rect = this.f25195C;
        this.f25203e = rect.left + rect.right + i10;
    }

    public void G(int i10) {
        this.f25210l = i10;
    }

    public void H(Rect rect) {
        this.f25196D = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.f25198F.setInputMethodMode(i10);
    }

    public void J(boolean z10) {
        this.f25197E = z10;
        this.f25198F.setFocusable(z10);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f25198F.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f25219u = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f25220v = onItemSelectedListener;
    }

    public void N(boolean z10) {
        this.f25209k = true;
        this.f25208j = z10;
    }

    public void P(int i10) {
        this.f25215q = i10;
    }

    public void Q(int i10) {
        P p10 = this.f25201c;
        if (!b() || p10 == null) {
            return;
        }
        p10.setListSelectionHidden(false);
        p10.setSelection(i10);
        if (p10.getChoiceMode() != 0) {
            p10.setItemChecked(i10, true);
        }
    }

    public void R(int i10) {
        this.f25203e = i10;
    }

    public int a() {
        return this.f25204f;
    }

    @Override // n.InterfaceC5708e
    public boolean b() {
        return this.f25198F.isShowing();
    }

    @Override // n.InterfaceC5708e
    public void c() {
        int iQ = q();
        boolean zA = A();
        androidx.core.widget.h.b(this.f25198F, this.f25206h);
        if (this.f25198F.isShowing()) {
            if (t().isAttachedToWindow()) {
                int width = this.f25203e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i10 = this.f25202d;
                if (i10 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.f25198F.setWidth(this.f25203e == -1 ? -1 : 0);
                        this.f25198F.setHeight(0);
                    } else {
                        this.f25198F.setWidth(this.f25203e == -1 ? -1 : 0);
                        this.f25198F.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iQ = i10;
                }
                this.f25198F.setOutsideTouchable((this.f25212n || this.f25211m) ? false : true);
                this.f25198F.update(t(), this.f25204f, this.f25205g, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f25203e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i11 = this.f25202d;
        if (i11 == -1) {
            iQ = -1;
        } else if (i11 != -2) {
            iQ = i11;
        }
        this.f25198F.setWidth(width2);
        this.f25198F.setHeight(iQ);
        O(true);
        this.f25198F.setOutsideTouchable((this.f25212n || this.f25211m) ? false : true);
        this.f25198F.setTouchInterceptor(this.f25222x);
        if (this.f25209k) {
            androidx.core.widget.h.a(this.f25198F, this.f25208j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f25192H;
            if (method != null) {
                try {
                    method.invoke(this.f25198F, this.f25196D);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.f25198F, this.f25196D);
        }
        androidx.core.widget.h.c(this.f25198F, t(), this.f25204f, this.f25205g, this.f25210l);
        this.f25201c.setSelection(-1);
        if (!this.f25197E || this.f25201c.isInTouchMode()) {
            r();
        }
        if (this.f25197E) {
            return;
        }
        this.f25194B.post(this.f25224z);
    }

    @Override // n.InterfaceC5708e
    public void dismiss() {
        this.f25198F.dismiss();
        C();
        this.f25198F.setContentView(null);
        this.f25201c = null;
        this.f25194B.removeCallbacks(this.f25221w);
    }

    public void e(int i10) {
        this.f25204f = i10;
    }

    public Drawable g() {
        return this.f25198F.getBackground();
    }

    public void i(int i10) {
        this.f25205g = i10;
        this.f25207i = true;
    }

    public int l() {
        if (this.f25207i) {
            return this.f25205g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f25216r;
        if (dataSetObserver == null) {
            this.f25216r = new f();
        } else {
            ListAdapter listAdapter2 = this.f25200b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f25200b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f25216r);
        }
        P p10 = this.f25201c;
        if (p10 != null) {
            p10.setAdapter(this.f25200b);
        }
    }

    @Override // n.InterfaceC5708e
    public ListView o() {
        return this.f25201c;
    }

    public void p(Drawable drawable) {
        this.f25198F.setBackgroundDrawable(drawable);
    }

    public void r() {
        P p10 = this.f25201c;
        if (p10 != null) {
            p10.setListSelectionHidden(true);
            p10.requestLayout();
        }
    }

    P s(Context context, boolean z10) {
        return new P(context, z10);
    }

    public View t() {
        return this.f25217s;
    }

    public Object v() {
        if (b()) {
            return this.f25201c.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (b()) {
            return this.f25201c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (b()) {
            return this.f25201c.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (b()) {
            return this.f25201c.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f25203e;
    }

    public U(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public U(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f25202d = -2;
        this.f25203e = -2;
        this.f25206h = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;
        this.f25210l = 0;
        this.f25211m = false;
        this.f25212n = false;
        this.f25213o = Integer.MAX_VALUE;
        this.f25215q = 0;
        this.f25221w = new i();
        this.f25222x = new h();
        this.f25223y = new g();
        this.f25224z = new e();
        this.f25195C = new Rect();
        this.f25199a = context;
        this.f25194B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f48315l1, i10, i11);
        this.f25204f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f48320m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.j.f48325n1, 0);
        this.f25205g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f25207i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C2665t c2665t = new C2665t(context, attributeSet, i10, i11);
        this.f25198F = c2665t;
        c2665t.setInputMethodMode(1);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            P p10;
            if (i10 == -1 || (p10 = U.this.f25201c) == null) {
                return;
            }
            p10.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || U.this.A() || U.this.f25198F.getContentView() == null) {
                return;
            }
            U u10 = U.this;
            u10.f25194B.removeCallbacks(u10.f25221w);
            U.this.f25221w.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
