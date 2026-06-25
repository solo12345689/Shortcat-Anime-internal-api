package com.facebook.react.views.text;

import L1.B;
import L1.C;
import Ud.AbstractC2273n;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.AbstractC2747a0;
import com.facebook.react.AbstractC3247l;
import com.facebook.react.AbstractC3250o;
import com.facebook.react.uimanager.D;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends D {

    /* JADX INFO: renamed from: z */
    public static final b f38300z = new b(null);

    /* JADX INFO: renamed from: y */
    private a f38301y;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List f38302a;

        /* JADX INFO: renamed from: com.facebook.react.views.text.n$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0633a {

            /* JADX INFO: renamed from: a */
            private String f38303a;

            /* JADX INFO: renamed from: b */
            private int f38304b;

            /* JADX INFO: renamed from: c */
            private int f38305c;

            /* JADX INFO: renamed from: d */
            private int f38306d;

            public final String a() {
                return this.f38303a;
            }

            public final int b() {
                return this.f38305c;
            }

            public final int c() {
                return this.f38306d;
            }

            public final int d() {
                return this.f38304b;
            }

            public final void e(String str) {
                this.f38303a = str;
            }

            public final void f(int i10) {
                this.f38305c = i10;
            }

            public final void g(int i10) {
                this.f38306d = i10;
            }

            public final void h(int i10) {
                this.f38304b = i10;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b implements Comparator {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Spanned f38307a;

            public b(Spanned spanned) {
                this.f38307a = spanned;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Xd.a.d(Integer.valueOf(this.f38307a.getSpanStart((ClickableSpan) obj)), Integer.valueOf(this.f38307a.getSpanStart((ClickableSpan) obj2)));
            }
        }

        public a(Spanned text) {
            AbstractC5504s.h(text, "text");
            ArrayList arrayList = new ArrayList();
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) text.getSpans(0, text.length(), ClickableSpan.class);
            AbstractC5504s.e(clickableSpanArr);
            if (clickableSpanArr.length > 1) {
                AbstractC2273n.I(clickableSpanArr, new b(text));
            }
            int length = clickableSpanArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                ClickableSpan clickableSpan = clickableSpanArr[i10];
                int spanStart = text.getSpanStart(clickableSpan);
                int spanEnd = text.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= text.length() && spanEnd <= text.length()) {
                    C0633a c0633a = new C0633a();
                    c0633a.e(text.subSequence(spanStart, spanEnd).toString());
                    c0633a.h(spanStart);
                    c0633a.f(spanEnd);
                    c0633a.g(i10);
                    arrayList.add(c0633a);
                }
            }
            this.f38302a = arrayList;
        }

        public final C0633a a(int i10) {
            for (C0633a c0633a : this.f38302a) {
                if (c0633a.c() == i10) {
                    return c0633a;
                }
            }
            return null;
        }

        public final C0633a b(int i10, int i11) {
            for (C0633a c0633a : this.f38302a) {
                if (c0633a.d() == i10 && c0633a.b() == i11) {
                    return c0633a;
                }
            }
            return null;
        }

        public final int c() {
            return this.f38302a.size();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(View view, boolean z10, int i10) {
            AbstractC5504s.h(view, "view");
            AbstractC2747a0.k0(view, new n(view, z10, i10));
        }

        public final void b(View view, boolean z10, int i10) {
            AbstractC5504s.h(view, "view");
            if (AbstractC2747a0.M(view)) {
                return;
            }
            if (view.getTag(AbstractC3247l.f36914h) == null && view.getTag(AbstractC3247l.f36915i) == null && view.getTag(AbstractC3247l.f36907a) == null && view.getTag(AbstractC3247l.f36928v) == null && view.getTag(AbstractC3247l.f36909c) == null && view.getTag(AbstractC3247l.f36912f) == null && view.getTag(AbstractC3247l.f36901B) == null) {
                return;
            }
            AbstractC2747a0.k0(view, new n(view, z10, i10));
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(View view, boolean z10, int i10) {
        super(view, z10, i10);
        AbstractC5504s.h(view, "view");
        this.f38301y = (a) W().getTag(AbstractC3247l.f36912f);
    }

    private final Rect a0(a.C0633a c0633a) {
        if (!(W() instanceof TextView) && !(W() instanceof PreparedLayoutTextView)) {
            return new Rect(0, 0, W().getWidth(), W().getHeight());
        }
        Layout layoutC0 = c0();
        if (layoutC0 == null) {
            return new Rect(0, 0, W().getWidth(), W().getHeight());
        }
        int iD = c0633a.d();
        int iB = c0633a.b();
        int lineForOffset = layoutC0.getLineForOffset(iD);
        int lineEnd = layoutC0.getLineEnd(lineForOffset);
        int lineForOffset2 = layoutC0.getLineForOffset(iB);
        int lineEnd2 = layoutC0.getLineEnd(lineForOffset2);
        if (iD > lineEnd || iB > lineEnd2) {
            return null;
        }
        Rect rect = new Rect();
        double primaryHorizontal = layoutC0.getPrimaryHorizontal(iD);
        boolean z10 = lineForOffset != lineForOffset2;
        layoutC0.getLineBounds(lineForOffset, rect);
        int scrollY = W().getScrollY() + W().getPaddingTop();
        rect.top += scrollY;
        rect.bottom += scrollY;
        rect.left = (int) (((double) rect.left) + ((primaryHorizontal + ((double) W().getPaddingLeft())) - ((double) W().getScrollX())));
        if (z10) {
            return new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
        return new Rect(rect.left, rect.top, (int) layoutC0.getPrimaryHorizontal(iB), rect.bottom);
    }

    private final Layout c0() {
        if (!(W() instanceof PreparedLayoutTextView)) {
            if (!(W() instanceof TextView)) {
                return null;
            }
            View viewW = W();
            AbstractC5504s.f(viewW, "null cannot be cast to non-null type android.widget.TextView");
            return ((TextView) viewW).getLayout();
        }
        View viewW2 = W();
        AbstractC5504s.f(viewW2, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView");
        PreparedLayout preparedLayout = ((PreparedLayoutTextView) viewW2).getPreparedLayout();
        if (preparedLayout != null) {
            return preparedLayout.getLayout();
        }
        return null;
    }

    private final Spanned d0() {
        Layout layout;
        View viewW = W();
        if (viewW instanceof PreparedLayoutTextView) {
            PreparedLayout preparedLayout = ((PreparedLayoutTextView) viewW).getPreparedLayout();
            CharSequence text = (preparedLayout == null || (layout = preparedLayout.getLayout()) == null) ? null : layout.getText();
            if (text instanceof Spanned) {
                return (Spanned) text;
            }
            return null;
        }
        if (viewW instanceof TextView) {
            CharSequence text2 = ((TextView) viewW).getText();
            if (text2 instanceof Spanned) {
                return (Spanned) text2;
            }
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.D, R1.a
    protected int B(float f10, float f11) {
        Spanned spannedD0;
        a.C0633a c0633aB;
        a aVar = this.f38301y;
        if (aVar != null && aVar.c() != 0 && ((W() instanceof TextView) || (W() instanceof PreparedLayoutTextView))) {
            float paddingLeft = (f10 - W().getPaddingLeft()) + W().getScrollX();
            float paddingTop = (f11 - W().getPaddingTop()) + W().getScrollY();
            Layout layoutC0 = c0();
            if (layoutC0 == null) {
                return Integer.MIN_VALUE;
            }
            int offsetForHorizontal = layoutC0.getOffsetForHorizontal(layoutC0.getLineForVertical((int) paddingTop), paddingLeft);
            ClickableSpan clickableSpan = (ClickableSpan) b0(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpan != null && (spannedD0 = d0()) != null && (c0633aB = aVar.b(spannedD0.getSpanStart(clickableSpan), spannedD0.getSpanEnd(clickableSpan))) != null) {
                return c0633aB.c();
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // com.facebook.react.uimanager.D, R1.a
    protected void C(List virtualViewIds) {
        AbstractC5504s.h(virtualViewIds, "virtualViewIds");
        a aVar = this.f38301y;
        if (aVar == null) {
            return;
        }
        int iC = aVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            virtualViewIds.add(Integer.valueOf(i10));
        }
    }

    @Override // com.facebook.react.uimanager.D, R1.a
    protected boolean J(int i10, int i11, Bundle bundle) {
        a.C0633a c0633aA;
        ClickableSpan clickableSpan;
        a aVar = this.f38301y;
        if (aVar == null || aVar == null || (c0633aA = aVar.a(i10)) == null || (clickableSpan = (ClickableSpan) b0(c0633aA.d(), c0633aA.b(), ClickableSpan.class)) == null || i11 != 16) {
            return false;
        }
        clickableSpan.onClick(W());
        return true;
    }

    @Override // com.facebook.react.uimanager.D, R1.a
    protected void N(int i10, B node) {
        AbstractC5504s.h(node, "node");
        a aVar = this.f38301y;
        if (aVar == null) {
            node.D0("");
            node.v0(new Rect(0, 0, 1, 1));
            return;
        }
        a.C0633a c0633aA = aVar.a(i10);
        if (c0633aA == null) {
            node.D0("");
            node.v0(new Rect(0, 0, 1, 1));
            return;
        }
        Rect rectA0 = a0(c0633aA);
        if (rectA0 == null) {
            node.D0("");
            node.v0(new Rect(0, 0, 1, 1));
            return;
        }
        node.D0(c0633aA.a());
        node.a(16);
        node.v0(rectA0);
        node.a1(W().getResources().getString(AbstractC3250o.f37108F));
        node.z0(D.b.f37415a.d(D.b.f37417c));
    }

    @Override // R1.a
    protected void O(int i10, boolean z10) {
        a.C0633a c0633aA;
        ClickableSpan clickableSpan;
        a aVar = this.f38301y;
        if (aVar == null || aVar == null || (c0633aA = aVar.a(i10)) == null || (clickableSpan = (ClickableSpan) b0(c0633aA.d(), c0633aA.b(), ClickableSpan.class)) == null) {
            return;
        }
        if ((clickableSpan instanceof P7.f) && (W() instanceof TextView)) {
            P7.f fVar = (P7.f) clickableSpan;
            fVar.b(z10);
            View viewW = W();
            AbstractC5504s.f(viewW, "null cannot be cast to non-null type android.widget.TextView");
            fVar.a(((TextView) viewW).getHighlightColor());
            W().invalidate();
            return;
        }
        if (W() instanceof PreparedLayoutTextView) {
            if (z10) {
                View viewW2 = W();
                AbstractC5504s.f(viewW2, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView");
                ((PreparedLayoutTextView) viewW2).f(c0633aA.d(), c0633aA.b());
            } else {
                View viewW3 = W();
                AbstractC5504s.f(viewW3, "null cannot be cast to non-null type com.facebook.react.views.text.PreparedLayoutTextView");
                ((PreparedLayoutTextView) viewW3).a();
            }
        }
    }

    @Override // com.facebook.react.uimanager.D, R1.a, androidx.core.view.C2746a
    public C b(View host) {
        AbstractC5504s.h(host, "host");
        if (this.f38301y != null) {
            return Z(host);
        }
        return null;
    }

    protected final Object b0(int i10, int i11, Class cls) {
        Spanned spannedD0 = d0();
        if (spannedD0 == null) {
            return null;
        }
        Object[] spans = spannedD0.getSpans(i10, i11, cls);
        AbstractC5504s.e(spans);
        if (spans.length == 0) {
            return null;
        }
        return spans[0];
    }

    @Override // com.facebook.react.uimanager.D, R1.a, androidx.core.view.C2746a
    public void g(View host, B info) {
        AbstractC5504s.h(host, "host");
        AbstractC5504s.h(info, "info");
        super.g(host, info);
        if (host instanceof PreparedLayoutTextView) {
            info.i1(((PreparedLayoutTextView) host).getText());
        }
    }
}
