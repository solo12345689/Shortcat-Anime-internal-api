package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.AbstractC2747a0;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i.AbstractC4956a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class SearchView extends T implements androidx.appcompat.view.c {

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    static final o f25045O0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Rect f25046A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private CharSequence f25047A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int[] f25048B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private boolean f25049B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int[] f25050C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private int f25051C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final ImageView f25052D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    SearchableInfo f25053D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Drawable f25054E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private Bundle f25055E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f25056F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private final Runnable f25057F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f25058G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private Runnable f25059G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Intent f25060H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private final WeakHashMap f25061H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Intent f25062I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private final View.OnClickListener f25063I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    View.OnKeyListener f25064J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f25065K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f25066L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f25067M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private TextWatcher f25068N0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final CharSequence f25069l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private m f25070m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private l f25071n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    View.OnFocusChangeListener f25072o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final SearchAutoComplete f25073p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private View.OnClickListener f25074p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f25075q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f25076q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final View f25077r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f25078r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f25079s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    O1.a f25080s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ImageView f25081t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f25082t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final ImageView f25083u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private CharSequence f25084u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ImageView f25085v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f25086v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ImageView f25087w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f25088w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View f25089x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f25090x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private q f25091y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f25092y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Rect f25093z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private CharSequence f25094z0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class SearchAutoComplete extends C2650d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f25095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SearchView f25096f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f25097g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Runnable f25098h;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC4956a.f47966m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            if (i10 >= 600) {
                return JfifUtil.MARKER_SOFn;
            }
            if (i10 < 640 || i11 < 480) {
                return 160;
            }
            return JfifUtil.MARKER_SOFn;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f25045O0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f25097g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f25097g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f25095e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C2650d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f25097g) {
                removeCallbacks(this.f25098h);
                post(this.f25098h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f25096f.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f25096f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f25096f.hasFocus() && getVisibility() == 0) {
                this.f25097g = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f25097g = false;
                removeCallbacks(this.f25098h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f25097g = true;
                    return;
                }
                this.f25097g = false;
                removeCallbacks(this.f25098h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f25096f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f25095e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f25098h = new a();
            this.f25095e = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            O1.a aVar = SearchView.this.f25080s0;
            if (aVar instanceof b0) {
                aVar.a(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f25072o0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f25081t) {
                searchView.T();
                return;
            }
            if (view == searchView.f25085v) {
                searchView.P();
                return;
            }
            if (view == searchView.f25083u) {
                searchView.U();
            } else if (view == searchView.f25087w) {
                searchView.Y();
            } else if (view == searchView.f25073p) {
                searchView.F();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f25053D0 == null) {
                return false;
            }
            if (searchView.f25073p.isPopupShowing() && SearchView.this.f25073p.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f25073p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f25073p.getText().toString());
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface l {
        boolean a();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface n {
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f25110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f25111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f25112c;

        o() {
            this.f25110a = null;
            this.f25111b = null;
            this.f25112c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f25110a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f25111b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f25112c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f25111b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f25110a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f25112c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class p extends Q1.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f25113c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i10) {
                return new p[i10];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f25113c + "}";
        }

        @Override // Q1.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f25113c));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f25113c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class q extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f25114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f25115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f25116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f25117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f25118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f25119f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f25118e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f25115b = new Rect();
            this.f25117d = new Rect();
            this.f25116c = new Rect();
            a(rect, rect2);
            this.f25114a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f25115b.set(rect);
            this.f25117d.set(rect);
            Rect rect3 = this.f25117d;
            int i10 = this.f25118e;
            rect3.inset(-i10, -i10);
            this.f25116c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f25119f;
                    if (z11 && !this.f25117d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f25119f;
                        this.f25119f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f25115b.contains(x10, y10)) {
                this.f25119f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f25116c.contains(x10, y10)) {
                Rect rect = this.f25116c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f25114a.getWidth() / 2, this.f25114a.getHeight() / 2);
            }
            return this.f25114a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f25045O0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f25047A0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f25055E0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f25053D0.getSearchActivity());
        return intent;
    }

    private Intent B(Cursor cursor, int i10, String str) {
        int position;
        String strN;
        try {
            String strN2 = b0.n(cursor, "suggest_intent_action");
            if (strN2 == null) {
                strN2 = this.f25053D0.getSuggestIntentAction();
            }
            if (strN2 == null) {
                strN2 = "android.intent.action.SEARCH";
            }
            String str2 = strN2;
            String strN3 = b0.n(cursor, "suggest_intent_data");
            if (strN3 == null) {
                strN3 = this.f25053D0.getSuggestIntentData();
            }
            if (strN3 != null && (strN = b0.n(cursor, "suggest_intent_data_id")) != null) {
                strN3 = strN3 + "/" + Uri.encode(strN);
            }
            return A(str2, strN3 == null ? null : Uri.parse(strN3), b0.n(cursor, "suggest_intent_extra_data"), b0.n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f25055E0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void E() {
        this.f25073p.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.f25048B);
        getLocationInWindow(this.f25050C);
        int[] iArr = this.f25048B;
        int i10 = iArr[1];
        int[] iArr2 = this.f25050C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.f25076q0 || this.f25054E == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f25073p.getTextSize()) * 1.25d);
        this.f25054E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f25054E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        SearchableInfo searchableInfo = this.f25053D0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f25053D0.getVoiceSearchLaunchWebSearch() ? this.f25060H : this.f25053D0.getVoiceSearchLaunchRecognizer() ? this.f25062I : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.f25082t0 || this.f25092y0) && !J();
    }

    private void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    private boolean O(int i10, int i11, String str) {
        Cursor cursorC = this.f25080s0.c();
        if (cursorC == null || !cursorC.moveToPosition(i10)) {
            return false;
        }
        M(B(cursorC, i11, str));
        return true;
    }

    private void Z() {
        post(this.f25057F0);
    }

    private void a0(int i10) {
        Editable text = this.f25073p.getText();
        Cursor cursorC = this.f25080s0.c();
        if (cursorC == null) {
            return;
        }
        if (!cursorC.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.f25080s0.convertToString(cursorC);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private void c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f25073p.getText());
        this.f25085v.setVisibility(!zIsEmpty || (this.f25076q0 && !this.f25049B0) ? 0 : 8);
        Drawable drawable = this.f25085v.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f25073p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.f25073p.setThreshold(this.f25053D0.getSuggestThreshold());
        this.f25073p.setImeOptions(this.f25053D0.getImeOptions());
        int inputType = this.f25053D0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f25053D0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f25073p.setInputType(inputType);
        O1.a aVar = this.f25080s0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f25053D0.getSuggestAuthority() != null) {
            b0 b0Var = new b0(getContext(), this, this.f25053D0, this.f25061H0);
            this.f25080s0 = b0Var;
            this.f25073p.setAdapter(b0Var);
            ((b0) this.f25080s0).w(this.f25086v0 ? 2 : 1);
        }
    }

    private void g0() {
        this.f25079s.setVisibility((L() && (this.f25083u.getVisibility() == 0 || this.f25087w.getVisibility() == 0)) ? 0 : 8);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(i.d.f47993e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(i.d.f47994f);
    }

    private void h0(boolean z10) {
        this.f25083u.setVisibility((this.f25082t0 && L() && hasFocus() && (z10 || !this.f25092y0)) ? 0 : 8);
    }

    private void i0(boolean z10) {
        this.f25078r0 = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f25073p.getText());
        this.f25081t.setVisibility(i11);
        h0(!zIsEmpty);
        this.f25075q.setVisibility(z10 ? 8 : 0);
        if (this.f25052D.getDrawable() != null && !this.f25076q0) {
            i10 = 0;
        }
        this.f25052D.setVisibility(i10);
        c0();
        j0(zIsEmpty);
        g0();
    }

    private void j0(boolean z10) {
        int i10 = 8;
        if (this.f25092y0 && !J() && z10) {
            this.f25083u.setVisibility(8);
            i10 = 0;
        }
        this.f25087w.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f25073p.setText(charSequence);
        this.f25073p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void F() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f25073p);
            return;
        }
        o oVar = f25045O0;
        oVar.b(this.f25073p);
        oVar.a(this.f25073p);
    }

    public boolean J() {
        return this.f25078r0;
    }

    void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void P() {
        if (!TextUtils.isEmpty(this.f25073p.getText())) {
            this.f25073p.setText("");
            this.f25073p.requestFocus();
            this.f25073p.setImeVisibility(true);
        } else if (this.f25076q0) {
            l lVar = this.f25071n0;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    boolean Q(int i10, int i11, String str) {
        O(i10, 0, null);
        this.f25073p.setImeVisibility(false);
        E();
        return true;
    }

    boolean R(int i10) {
        a0(i10);
        return true;
    }

    protected void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void T() {
        i0(false);
        this.f25073p.requestFocus();
        this.f25073p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f25074p0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void U() {
        Editable text = this.f25073p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f25070m0;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f25053D0 != null) {
                N(0, null, text.toString());
            }
            this.f25073p.setImeVisibility(false);
            E();
        }
    }

    boolean V(View view, int i10, KeyEvent keyEvent) {
        if (this.f25053D0 != null && this.f25080s0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f25073p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f25073p.setSelection(i10 == 21 ? 0 : this.f25073p.length());
                this.f25073p.setListSelection(0);
                this.f25073p.clearListSelection();
                this.f25073p.b();
                return true;
            }
            if (i10 == 19) {
                this.f25073p.getListSelection();
                return false;
            }
        }
        return false;
    }

    void W(CharSequence charSequence) {
        Editable text = this.f25073p.getText();
        this.f25047A0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        h0(!zIsEmpty);
        j0(zIsEmpty);
        c0();
        g0();
        if (this.f25070m0 != null && !TextUtils.equals(charSequence, this.f25094z0)) {
            this.f25070m0.a(charSequence.toString());
        }
        this.f25094z0 = charSequence.toString();
    }

    void X() {
        i0(J());
        Z();
        if (this.f25073p.hasFocus()) {
            F();
        }
    }

    void Y() {
        SearchableInfo searchableInfo = this.f25053D0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(D(this.f25060H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(C(this.f25062I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.f25073p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f25073p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f25047A0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f25088w0 = true;
        super.clearFocus();
        this.f25073p.clearFocus();
        this.f25073p.setImeVisibility(false);
        this.f25088w0 = false;
    }

    void d0() {
        int[] iArr = this.f25073p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f25077r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f25079s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f25073p.getImeOptions();
    }

    public int getInputType() {
        return this.f25073p.getInputType();
    }

    public int getMaxWidth() {
        return this.f25090x0;
    }

    public CharSequence getQuery() {
        return this.f25073p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f25084u0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f25053D0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f25069l0 : getContext().getText(this.f25053D0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f25058G;
    }

    int getSuggestionRowLayout() {
        return this.f25056F;
    }

    public O1.a getSuggestionsAdapter() {
        return this.f25080s0;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f25073p.setImeOptions(this.f25051C0);
        this.f25049B0 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.f25049B0) {
            return;
        }
        this.f25049B0 = true;
        int imeOptions = this.f25073p.getImeOptions();
        this.f25051C0 = imeOptions;
        this.f25073p.setImeOptions(imeOptions | 33554432);
        this.f25073p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f25057F0);
        post(this.f25059G0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f25073p, this.f25093z);
            Rect rect = this.f25046A;
            Rect rect2 = this.f25093z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            q qVar = this.f25091y;
            if (qVar != null) {
                qVar.a(this.f25046A, this.f25093z);
                return;
            }
            q qVar2 = new q(this.f25046A, this.f25093z, this.f25073p);
            this.f25091y = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.T, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.f25090x0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f25090x0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.f25090x0) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        i0(pVar.f25113c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f25113c = J();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f25088w0 || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f25073p.requestFocus(i10, rect);
        if (zRequestFocus) {
            i0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f25055E0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f25076q0 == z10) {
            return;
        }
        this.f25076q0 = z10;
        i0(z10);
        e0();
    }

    public void setImeOptions(int i10) {
        this.f25073p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f25073p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f25090x0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f25071n0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f25072o0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f25070m0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f25074p0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f25084u0 = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f25086v0 = z10;
        O1.a aVar = this.f25080s0;
        if (aVar instanceof b0) {
            ((b0) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f25053D0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean zI = I();
        this.f25092y0 = zI;
        if (zI) {
            this.f25073p.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f25082t0 = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(O1.a aVar) {
        this.f25080s0 = aVar;
        this.f25073p.setAdapter(aVar);
    }

    void z() {
        if (this.f25089x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f25077r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = s0.b(this);
            int dimensionPixelSize = this.f25076q0 ? resources.getDimensionPixelSize(i.d.f47991c) + resources.getDimensionPixelSize(i.d.f47992d) : 0;
            this.f25073p.getDropDownBackground().getPadding(rect);
            this.f25073p.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f25073p.setDropDownWidth((((this.f25089x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC4956a.f47946H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f25093z = new Rect();
        this.f25046A = new Rect();
        this.f25048B = new int[2];
        this.f25050C = new int[2];
        this.f25057F0 = new b();
        this.f25059G0 = new c();
        this.f25061H0 = new WeakHashMap();
        f fVar = new f();
        this.f25063I0 = fVar;
        this.f25064J0 = new g();
        h hVar = new h();
        this.f25065K0 = hVar;
        i iVar = new i();
        this.f25066L0 = iVar;
        j jVar = new j();
        this.f25067M0 = jVar;
        this.f25068N0 = new a();
        h0 h0VarV = h0.v(context, attributeSet, i.j.f48286f2, i10, 0);
        AbstractC2747a0.i0(this, context, i.j.f48286f2, attributeSet, h0VarV.r(), i10, 0);
        LayoutInflater.from(context).inflate(h0VarV.n(i.j.f48336p2, i.g.f48107r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(i.f.f48051E);
        this.f25073p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f25075q = findViewById(i.f.f48047A);
        View viewFindViewById = findViewById(i.f.f48050D);
        this.f25077r = viewFindViewById;
        View viewFindViewById2 = findViewById(i.f.f48057K);
        this.f25079s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(i.f.f48088y);
        this.f25081t = imageView;
        ImageView imageView2 = (ImageView) findViewById(i.f.f48048B);
        this.f25083u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(i.f.f48089z);
        this.f25085v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(i.f.f48052F);
        this.f25087w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(i.f.f48049C);
        this.f25052D = imageView5;
        AbstractC2747a0.o0(viewFindViewById, h0VarV.g(i.j.f48341q2));
        AbstractC2747a0.o0(viewFindViewById2, h0VarV.g(i.j.f48361u2));
        imageView.setImageDrawable(h0VarV.g(i.j.f48356t2));
        imageView2.setImageDrawable(h0VarV.g(i.j.f48326n2));
        imageView3.setImageDrawable(h0VarV.g(i.j.f48311k2));
        imageView4.setImageDrawable(h0VarV.g(i.j.f48371w2));
        imageView5.setImageDrawable(h0VarV.g(i.j.f48356t2));
        this.f25054E = h0VarV.g(i.j.f48351s2);
        m0.a(imageView, getResources().getString(i.h.f48123n));
        this.f25056F = h0VarV.n(i.j.f48366v2, i.g.f48106q);
        this.f25058G = h0VarV.n(i.j.f48316l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f25068N0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f25064J0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(h0VarV.a(i.j.f48331o2, true));
        int iF = h0VarV.f(i.j.f48296h2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.f25069l0 = h0VarV.p(i.j.f48321m2);
        this.f25084u0 = h0VarV.p(i.j.f48346r2);
        int iK = h0VarV.k(i.j.f48306j2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = h0VarV.k(i.j.f48301i2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(h0VarV.a(i.j.f48291g2, true));
        h0VarV.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f25060H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f25062I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f25089x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.f25076q0);
        e0();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
