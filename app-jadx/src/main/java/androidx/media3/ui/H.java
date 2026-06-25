package androidx.media3.ui;

import G3.C1592a;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s2.C6403a;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class H extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: a */
    private final C2923a f31311a;

    /* JADX INFO: renamed from: b */
    private final WebView f31312b;

    /* JADX INFO: renamed from: c */
    private List f31313c;

    /* JADX INFO: renamed from: d */
    private C1592a f31314d;

    /* JADX INFO: renamed from: e */
    private float f31315e;

    /* JADX INFO: renamed from: f */
    private int f31316f;

    /* JADX INFO: renamed from: g */
    private float f31317g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f31319a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f31319a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31319a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31319a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public H(Context context) {
        this(context, null);
    }

    private static int b(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f31319a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    private static String d(C1592a c1592a) {
        int i10 = c1592a.f7133d;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "unset" : a0.I("-0.05em -0.05em 0.15em %s", AbstractC2925c.b(c1592a.f7134e)) : a0.I("0.06em 0.08em 0.15em %s", AbstractC2925c.b(c1592a.f7134e)) : a0.I("0.1em 0.12em 0.15em %s", AbstractC2925c.b(c1592a.f7134e)) : a0.I("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", AbstractC2925c.b(c1592a.f7134e));
    }

    private String e(int i10, float f10) {
        float f11 = F.f(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return f11 == -3.4028235E38f ? "unset" : a0.I("%.2fpx", Float.valueOf(f11 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String h(C6403a c6403a) {
        float f10 = c6403a.f59062q;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = c6403a.f59061p;
        return a0.I("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i() {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.H.i():void");
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List list, C1592a c1592a, float f10, int i10, float f11) {
        this.f31314d = c1592a;
        this.f31315e = f10;
        this.f31316f = i10;
        this.f31317g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C6403a c6403a = (C6403a) list.get(i11);
            if (c6403a.f59049d != null) {
                arrayList.add(c6403a);
            } else {
                arrayList2.add(c6403a);
            }
        }
        if (!this.f31313c.isEmpty() || !arrayList2.isEmpty()) {
            this.f31313c = arrayList2;
            i();
        }
        this.f31311a.a(arrayList, c1592a, f10, i10, f11);
        invalidate();
    }

    public void g() {
        this.f31312b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f31313c.isEmpty()) {
            return;
        }
        i();
    }

    public H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31313c = Collections.EMPTY_LIST;
        this.f31314d = C1592a.f7129g;
        this.f31315e = 0.0533f;
        this.f31316f = 0;
        this.f31317g = 0.08f;
        C2923a c2923a = new C2923a(context, attributeSet);
        this.f31311a = c2923a;
        a aVar = new a(context, attributeSet);
        this.f31312b = aVar;
        aVar.setBackgroundColor(0);
        addView(c2923a);
        addView(aVar);
    }
}
