package L1;

import L1.E;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import x1.AbstractC7046c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: d */
    private static int f11187d;

    /* JADX INFO: renamed from: a */
    private final AccessibilityNodeInfo f11188a;

    /* JADX INFO: renamed from: b */
    public int f11189b = -1;

    /* JADX INFO: renamed from: c */
    private int f11190c = -1;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: A */
        public static final a f11191A;

        /* JADX INFO: renamed from: B */
        public static final a f11192B;

        /* JADX INFO: renamed from: C */
        public static final a f11193C;

        /* JADX INFO: renamed from: D */
        public static final a f11194D;

        /* JADX INFO: renamed from: E */
        public static final a f11195E;

        /* JADX INFO: renamed from: F */
        public static final a f11196F;

        /* JADX INFO: renamed from: G */
        public static final a f11197G;

        /* JADX INFO: renamed from: H */
        public static final a f11198H;

        /* JADX INFO: renamed from: I */
        public static final a f11199I;

        /* JADX INFO: renamed from: J */
        public static final a f11200J;

        /* JADX INFO: renamed from: K */
        public static final a f11201K;

        /* JADX INFO: renamed from: L */
        public static final a f11202L;

        /* JADX INFO: renamed from: M */
        public static final a f11203M;

        /* JADX INFO: renamed from: N */
        public static final a f11204N;

        /* JADX INFO: renamed from: O */
        public static final a f11205O;

        /* JADX INFO: renamed from: P */
        public static final a f11206P;

        /* JADX INFO: renamed from: Q */
        public static final a f11207Q;

        /* JADX INFO: renamed from: R */
        public static final a f11208R;

        /* JADX INFO: renamed from: S */
        public static final a f11209S;

        /* JADX INFO: renamed from: T */
        public static final a f11210T;

        /* JADX INFO: renamed from: U */
        public static final a f11211U;

        /* JADX INFO: renamed from: V */
        public static final a f11212V;

        /* JADX INFO: renamed from: e */
        public static final a f11213e = new a(1, null);

        /* JADX INFO: renamed from: f */
        public static final a f11214f = new a(2, null);

        /* JADX INFO: renamed from: g */
        public static final a f11215g = new a(4, null);

        /* JADX INFO: renamed from: h */
        public static final a f11216h = new a(8, null);

        /* JADX INFO: renamed from: i */
        public static final a f11217i = new a(16, null);

        /* JADX INFO: renamed from: j */
        public static final a f11218j = new a(32, null);

        /* JADX INFO: renamed from: k */
        public static final a f11219k = new a(64, null);

        /* JADX INFO: renamed from: l */
        public static final a f11220l = new a(128, null);

        /* JADX INFO: renamed from: m */
        public static final a f11221m = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, (CharSequence) null, E.b.class);

        /* JADX INFO: renamed from: n */
        public static final a f11222n = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, (CharSequence) null, E.b.class);

        /* JADX INFO: renamed from: o */
        public static final a f11223o = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, (CharSequence) null, E.c.class);

        /* JADX INFO: renamed from: p */
        public static final a f11224p = new a(2048, (CharSequence) null, E.c.class);

        /* JADX INFO: renamed from: q */
        public static final a f11225q = new a(4096, null);

        /* JADX INFO: renamed from: r */
        public static final a f11226r = new a(8192, null);

        /* JADX INFO: renamed from: s */
        public static final a f11227s = new a(16384, null);

        /* JADX INFO: renamed from: t */
        public static final a f11228t = new a(32768, null);

        /* JADX INFO: renamed from: u */
        public static final a f11229u = new a(65536, null);

        /* JADX INFO: renamed from: v */
        public static final a f11230v = new a(131072, (CharSequence) null, E.g.class);

        /* JADX INFO: renamed from: w */
        public static final a f11231w = new a(262144, null);

        /* JADX INFO: renamed from: x */
        public static final a f11232x = new a(524288, null);

        /* JADX INFO: renamed from: y */
        public static final a f11233y = new a(1048576, null);

        /* JADX INFO: renamed from: z */
        public static final a f11234z = new a(2097152, (CharSequence) null, E.h.class);

        /* JADX INFO: renamed from: a */
        final Object f11235a;

        /* JADX INFO: renamed from: b */
        private final int f11236b;

        /* JADX INFO: renamed from: c */
        private final Class f11237c;

        /* JADX INFO: renamed from: d */
        protected final E f11238d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f11191A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f11192B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, E.e.class);
            f11193C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f11194D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f11195E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f11196F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f11197G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f11198H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f11199I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f11200J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f11201K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f11202L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, E.f.class);
            f11203M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, E.d.class);
            f11204N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f11205O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f11206P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f11207Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f11208R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f11209S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f11210T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f11211U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f11212V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, E e10) {
            return new a(null, this.f11236b, charSequence, e10, this.f11237c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f11235a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f11235a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f11238d == null) {
                return false;
            }
            Class cls = this.f11237c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f11237c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                }
            }
            return this.f11238d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f11235a;
            return obj2 == null ? aVar.f11235a == null : obj2.equals(aVar.f11235a);
        }

        public int hashCode() {
            Object obj = this.f11235a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strJ = B.j(this.f11236b);
            if (strJ.equals("ACTION_UNKNOWN") && c() != null) {
                strJ = c().toString();
            }
            sb2.append(strJ);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, E e10) {
            this(null, i10, charSequence, e10, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, E e10, Class cls) {
            this.f11236b = i10;
            this.f11238d = e10;
            if (obj == null) {
                this.f11235a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f11235a = obj;
            }
            this.f11237c = cls;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void e(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class e {
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class f {

        /* JADX INFO: renamed from: a */
        final Object f11239a;

        f(Object obj) {
            this.f11239a = obj;
        }

        public static f a(int i10, int i11, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static f b(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class g {

        /* JADX INFO: renamed from: a */
        final Object f11240a;

        g(Object obj) {
            this.f11240a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static g b(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class h {

        /* JADX INFO: renamed from: a */
        final Object f11241a;

        h(Object obj) {
            this.f11241a = obj;
        }

        public static h d(int i10, float f10, float f11, float f12) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f11241a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f11241a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f11241a).getMin();
        }
    }

    private B(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f11188a = accessibilityNodeInfo;
    }

    private SparseArray E(View view) {
        SparseArray sparseArrayH = H(view);
        if (sparseArrayH != null) {
            return sparseArrayH;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(AbstractC7046c.f63615I, sparseArray);
        return sparseArray;
    }

    private SparseArray H(View view) {
        return (SparseArray) view.getTag(AbstractC7046c.f63615I);
    }

    private boolean O() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int P(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f11187d;
        f11187d = i11 + 1;
        return i11;
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    private void g() {
        this.f11188a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f11188a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f11188a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f11188a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List h(String str) {
        ArrayList<Integer> integerArrayList = this.f11188a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f11188a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static B k0() {
        return s1(AccessibilityNodeInfo.obtain());
    }

    private boolean l(int i10) {
        Bundle bundleA = A();
        return bundleA != null && (bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public static B l0(B b10) {
        return s1(AccessibilityNodeInfo.obtain(b10.f11188a));
    }

    public static B m0(View view) {
        return s1(AccessibilityNodeInfo.obtain(view));
    }

    private String q() {
        int iP = p();
        return iP == 1 ? "TRUE" : iP == 2 ? "PARTIAL" : "FALSE";
    }

    private void q0(View view) {
        SparseArray sparseArrayH = H(view);
        if (sparseArrayH != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayH.size(); i10++) {
                if (((WeakReference) sparseArrayH.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayH.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    public static B s1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new B(accessibilityNodeInfo);
    }

    public static ClickableSpan[] t(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private void u0(int i10, boolean z10) {
        Bundle bundleA = A();
        if (bundleA != null) {
            int i11 = bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleA.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    static String z(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "FULL" : "PARTIAL" : "COLLAPSED" : "UNDEFINED";
    }

    public Bundle A() {
        return this.f11188a.getExtras();
    }

    public void A0(boolean z10) {
        this.f11188a.setClickable(z10);
    }

    public CharSequence B() {
        return Build.VERSION.SDK_INT >= 26 ? this.f11188a.getHintText() : this.f11188a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    public void B0(Object obj) {
        this.f11188a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f11239a);
    }

    public int C() {
        return this.f11188a.getMaxTextLength();
    }

    public void C0(Object obj) {
        this.f11188a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f11240a);
    }

    public int D() {
        return this.f11188a.getMovementGranularities();
    }

    public void D0(CharSequence charSequence) {
        this.f11188a.setContentDescription(charSequence);
    }

    public void E0(boolean z10) {
        this.f11188a.setContentInvalid(z10);
    }

    public CharSequence F() {
        return this.f11188a.getPackageName();
    }

    public void F0(int i10) {
        this.f11188a.setDrawingOrder(i10);
    }

    public h G() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f11188a.getRangeInfo();
        if (rangeInfo != null) {
            return new h(rangeInfo);
        }
        return null;
    }

    public void G0(boolean z10) {
        this.f11188a.setEditable(z10);
    }

    public void H0(boolean z10) {
        this.f11188a.setEnabled(z10);
    }

    public CharSequence I() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f11188a) : this.f11188a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void I0(CharSequence charSequence) {
        this.f11188a.setError(charSequence);
    }

    public CharSequence J() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.f11188a) : this.f11188a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void J0(boolean z10) {
        this.f11188a.setFocusable(z10);
    }

    public CharSequence K() {
        if (!O()) {
            return this.f11188a.getText();
        }
        List listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f11188a.getText(), 0, this.f11188a.getText().length()));
        for (int i10 = 0; i10 < listH.size(); i10++) {
            spannableString.setSpan(new C1864a(((Integer) listH4.get(i10)).intValue(), this, A().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listH.get(i10)).intValue(), ((Integer) listH2.get(i10)).intValue(), ((Integer) listH3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void K0(boolean z10) {
        this.f11188a.setFocused(z10);
    }

    public CharSequence L() {
        return Build.VERSION.SDK_INT >= 28 ? this.f11188a.getTooltipText() : this.f11188a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void L0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11188a.setHeading(z10);
        } else {
            u0(2, z10);
        }
    }

    public String M() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f11188a) : this.f11188a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void M0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11188a.setHintText(charSequence);
        } else {
            this.f11188a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public String N() {
        return this.f11188a.getViewIdResourceName();
    }

    public void N0(boolean z10) {
        this.f11188a.setImportantForAccessibility(z10);
    }

    public void O0(View view) {
        this.f11188a.setLabelFor(view);
    }

    public void P0(View view) {
        this.f11188a.setLabeledBy(view);
    }

    public boolean Q() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f11188a) : l(64);
    }

    public void Q0(int i10) {
        this.f11188a.setLiveRegion(i10);
    }

    public boolean R() {
        return this.f11188a.isAccessibilityFocused();
    }

    public void R0(boolean z10) {
        this.f11188a.setLongClickable(z10);
    }

    public boolean S() {
        return this.f11188a.isCheckable();
    }

    public void S0(int i10) {
        this.f11188a.setMaxTextLength(i10);
    }

    public boolean T() {
        return this.f11188a.isChecked();
    }

    public void T0(int i10) {
        this.f11188a.setMovementGranularities(i10);
    }

    public boolean U() {
        return this.f11188a.isClickable();
    }

    public void U0(CharSequence charSequence) {
        this.f11188a.setPackageName(charSequence);
    }

    public boolean V() {
        return this.f11188a.isContextClickable();
    }

    public void V0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11188a.setPaneTitle(charSequence);
        } else {
            this.f11188a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean W() {
        return this.f11188a.isEnabled();
    }

    public void W0(View view) {
        this.f11189b = -1;
        this.f11188a.setParent(view);
    }

    public boolean X() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.f11188a) : this.f11188a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void X0(View view, int i10) {
        this.f11189b = i10;
        this.f11188a.setParent(view, i10);
    }

    public boolean Y() {
        return this.f11188a.isFocusable();
    }

    public void Y0(boolean z10) {
        this.f11188a.setPassword(z10);
    }

    public boolean Z() {
        return this.f11188a.isFocused();
    }

    public void Z0(h hVar) {
        this.f11188a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.f11241a);
    }

    public void a(int i10) {
        this.f11188a.addAction(i10);
    }

    public boolean a0() {
        return l(67108864);
    }

    public void a1(CharSequence charSequence) {
        this.f11188a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void b(a aVar) {
        this.f11188a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f11235a);
    }

    public boolean b0() {
        return this.f11188a.isImportantForAccessibility();
    }

    public void b1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11188a.setScreenReaderFocusable(z10);
        } else {
            u0(1, z10);
        }
    }

    public void c(View view) {
        this.f11188a.addChild(view);
    }

    public boolean c0() {
        return this.f11188a.isLongClickable();
    }

    public void c1(boolean z10) {
        this.f11188a.setScrollable(z10);
    }

    public void d(View view, int i10) {
        this.f11188a.addChild(view, i10);
    }

    public boolean d0() {
        return this.f11188a.isPassword();
    }

    public void d1(boolean z10) {
        this.f11188a.setSelected(z10);
    }

    public boolean e0() {
        return Build.VERSION.SDK_INT >= 28 ? this.f11188a.isScreenReaderFocusable() : l(1);
    }

    public void e1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11188a.setShowingHintText(z10);
        } else {
            u0(4, z10);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof B)) {
            return false;
        }
        B b10 = (B) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f11188a;
        if (accessibilityNodeInfo == null) {
            if (b10.f11188a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(b10.f11188a)) {
            return false;
        }
        return this.f11190c == b10.f11190c && this.f11189b == b10.f11189b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            q0(view);
            ClickableSpan[] clickableSpanArrT = t(charSequence);
            if (clickableSpanArrT == null || clickableSpanArrT.length <= 0) {
                return;
            }
            A().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC7046c.f63627a);
            SparseArray sparseArrayE = E(view);
            for (int i10 = 0; i10 < clickableSpanArrT.length; i10++) {
                int iP = P(clickableSpanArrT[i10], sparseArrayE);
                sparseArrayE.put(iP, new WeakReference(clickableSpanArrT[i10]));
                e(clickableSpanArrT[i10], (Spanned) charSequence, iP);
            }
        }
    }

    public boolean f0() {
        return this.f11188a.isScrollable();
    }

    public void f1(View view) {
        this.f11190c = -1;
        this.f11188a.setSource(view);
    }

    public boolean g0() {
        return this.f11188a.isSelected();
    }

    public void g1(View view, int i10) {
        this.f11190c = i10;
        this.f11188a.setSource(view, i10);
    }

    public boolean h0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f11188a.isShowingHintText() : l(4);
    }

    public void h1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f11188a, charSequence);
        } else {
            this.f11188a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f11188a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f11188a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean i0() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f11188a) : l(8388608);
    }

    public void i1(CharSequence charSequence) {
        this.f11188a.setText(charSequence);
    }

    public boolean j0() {
        return this.f11188a.isVisibleToUser();
    }

    public void j1(int i10, int i11) {
        this.f11188a.setTextSelection(i10, i11);
    }

    public int k() {
        return this.f11188a.getActions();
    }

    public void k1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11188a.setTooltipText(charSequence);
        } else {
            this.f11188a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void l1(View view) {
        this.f11188a.setTraversalAfter(view);
    }

    public void m(Rect rect) {
        this.f11188a.getBoundsInParent(rect);
    }

    public void m1(View view, int i10) {
        this.f11188a.setTraversalAfter(view, i10);
    }

    public void n(Rect rect) {
        this.f11188a.getBoundsInScreen(rect);
    }

    public boolean n0(int i10, Bundle bundle) {
        return this.f11188a.performAction(i10, bundle);
    }

    public void n1(View view) {
        this.f11188a.setTraversalBefore(view);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f11188a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f11188a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o1(View view, int i10) {
        this.f11188a.setTraversalBefore(view, i10);
    }

    public int p() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.f11188a) : this.f11188a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f11188a.isChecked() ? 1 : 0);
    }

    public boolean p0(a aVar) {
        return this.f11188a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f11235a);
    }

    public void p1(String str) {
        this.f11188a.setViewIdResourceName(str);
    }

    public void q1(boolean z10) {
        this.f11188a.setVisibleToUser(z10);
    }

    public int r() {
        return this.f11188a.getChildCount();
    }

    public void r0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.e(this.f11188a, z10);
        } else {
            u0(64, z10);
        }
    }

    public AccessibilityNodeInfo r1() {
        return this.f11188a;
    }

    public CharSequence s() {
        return this.f11188a.getClassName();
    }

    public void s0(boolean z10) {
        this.f11188a.setAccessibilityFocused(z10);
    }

    public void t0(List list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11188a.setAvailableExtraData(list);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(F());
        sb2.append("; className: ");
        sb2.append(s());
        sb2.append("; text: ");
        sb2.append(K());
        sb2.append("; error: ");
        sb2.append(x());
        sb2.append("; maxTextLength: ");
        sb2.append(C());
        sb2.append("; stateDescription: ");
        sb2.append(I());
        sb2.append("; contentDescription: ");
        sb2.append(w());
        sb2.append("; supplementalDescription: ");
        sb2.append(J());
        sb2.append("; tooltipText: ");
        sb2.append(L());
        sb2.append("; viewIdResName: ");
        sb2.append(N());
        sb2.append("; uniqueId: ");
        sb2.append(M());
        sb2.append("; checkable: ");
        sb2.append(S());
        sb2.append("; checked: ");
        sb2.append(q());
        sb2.append("; fieldRequired: ");
        sb2.append(X());
        sb2.append("; focusable: ");
        sb2.append(Y());
        sb2.append("; focused: ");
        sb2.append(Z());
        sb2.append("; selected: ");
        sb2.append(g0());
        sb2.append("; clickable: ");
        sb2.append(U());
        sb2.append("; longClickable: ");
        sb2.append(c0());
        sb2.append("; contextClickable: ");
        sb2.append(V());
        sb2.append("; expandedState: ");
        sb2.append(z(y()));
        sb2.append("; enabled: ");
        sb2.append(W());
        sb2.append("; password: ");
        sb2.append(d0());
        sb2.append("; scrollable: " + f0());
        sb2.append("; containerTitle: ");
        sb2.append(v());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(a0());
        sb2.append("; importantForAccessibility: ");
        sb2.append(b0());
        sb2.append("; visible: ");
        sb2.append(j0());
        sb2.append("; isTextSelectable: ");
        sb2.append(i0());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(Q());
        sb2.append("; [");
        List listI = i();
        for (int i10 = 0; i10 < listI.size(); i10++) {
            a aVar = (a) listI.get(i10);
            String strJ = j(aVar.b());
            if (strJ.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strJ = aVar.c().toString();
            }
            sb2.append(strJ);
            if (i10 != listI.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public f u() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f11188a.getCollectionInfo();
        if (collectionInfo != null) {
            return new f(collectionInfo);
        }
        return null;
    }

    public CharSequence v() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f11188a) : this.f11188a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void v0(Rect rect) {
        this.f11188a.setBoundsInParent(rect);
    }

    public CharSequence w() {
        return this.f11188a.getContentDescription();
    }

    public void w0(Rect rect) {
        this.f11188a.setBoundsInScreen(rect);
    }

    public CharSequence x() {
        return this.f11188a.getError();
    }

    public void x0(boolean z10) {
        this.f11188a.setCheckable(z10);
    }

    public int y() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.f11188a) : this.f11188a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void y0(boolean z10) {
        this.f11188a.setChecked(z10);
    }

    public void z0(CharSequence charSequence) {
        this.f11188a.setClassName(charSequence);
    }

    public void o0() {
    }
}
