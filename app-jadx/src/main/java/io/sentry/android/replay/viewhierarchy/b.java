package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.sentry.C5322z3;
import io.sentry.android.replay.util.q;
import io.sentry.android.replay.util.r;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: m */
    public static final a f50478m = new a(null);

    /* JADX INFO: renamed from: n */
    public static final int f50479n = 8;

    /* JADX INFO: renamed from: a */
    private final float f50480a;

    /* JADX INFO: renamed from: b */
    private final float f50481b;

    /* JADX INFO: renamed from: c */
    private final int f50482c;

    /* JADX INFO: renamed from: d */
    private final int f50483d;

    /* JADX INFO: renamed from: e */
    private final float f50484e;

    /* JADX INFO: renamed from: f */
    private final int f50485f;

    /* JADX INFO: renamed from: g */
    private final b f50486g;

    /* JADX INFO: renamed from: h */
    private final boolean f50487h;

    /* JADX INFO: renamed from: i */
    private boolean f50488i;

    /* JADX INFO: renamed from: j */
    private final boolean f50489j;

    /* JADX INFO: renamed from: k */
    private final Rect f50490k;

    /* JADX INFO: renamed from: l */
    private List f50491l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(Class cls, Set set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean c(View view, C5322z3 c5322z3) {
            String strF = c5322z3.getSessionReplay().f();
            if (strF == null) {
                return false;
            }
            return AbstractC5504s.c(view.getClass().getName(), strF);
        }

        private final boolean d(ViewParent viewParent, C5322z3 c5322z3) {
            String strT = c5322z3.getSessionReplay().t();
            if (strT == null) {
                return false;
            }
            return AbstractC5504s.c(viewParent.getClass().getName(), strT);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean e(android.view.View r8, io.sentry.C5322z3 r9) {
            /*
                r7 = this;
                java.lang.Object r0 = r8.getTag()
                boolean r1 = r0 instanceof java.lang.String
                r2 = 0
                if (r1 == 0) goto Lc
                java.lang.String r0 = (java.lang.String) r0
                goto Ld
            Lc:
                r0 = r2
            Ld:
                r1 = 2
                java.lang.String r3 = "toLowerCase(...)"
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L28
                java.util.Locale r6 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toLowerCase(r6)
                kotlin.jvm.internal.AbstractC5504s.g(r0, r3)
                if (r0 == 0) goto L28
                java.lang.String r6 = "sentry-unmask"
                boolean r0 = Df.r.W(r0, r6, r5, r1, r2)
                if (r0 != r4) goto L28
                goto L36
            L28:
                int r0 = io.sentry.android.replay.f.f50287a
                java.lang.Object r0 = r8.getTag(r0)
                java.lang.String r6 = "unmask"
                boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r6)
                if (r0 == 0) goto L37
            L36:
                return r5
            L37:
                java.lang.Object r0 = r8.getTag()
                boolean r6 = r0 instanceof java.lang.String
                if (r6 == 0) goto L42
                java.lang.String r0 = (java.lang.String) r0
                goto L43
            L42:
                r0 = r2
            L43:
                if (r0 == 0) goto L59
                java.util.Locale r6 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toLowerCase(r6)
                kotlin.jvm.internal.AbstractC5504s.g(r0, r3)
                if (r0 == 0) goto L59
                java.lang.String r3 = "sentry-mask"
                boolean r0 = Df.r.W(r0, r3, r5, r1, r2)
                if (r0 != r4) goto L59
                goto L67
            L59:
                int r0 = io.sentry.android.replay.f.f50287a
                java.lang.Object r0 = r8.getTag(r0)
                java.lang.String r1 = "mask"
                boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r1)
                if (r0 == 0) goto L68
            L67:
                return r4
            L68:
                boolean r0 = r7.c(r8, r9)
                if (r0 != 0) goto L84
                android.view.ViewParent r0 = r8.getParent()
                if (r0 == 0) goto L84
                android.view.ViewParent r0 = r8.getParent()
                java.lang.String r1 = "getParent(...)"
                kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
                boolean r0 = r7.d(r0, r9)
                if (r0 == 0) goto L84
                return r5
            L84:
                java.lang.Class r0 = r8.getClass()
                io.sentry.B3 r1 = r9.getSessionReplay()
                java.util.Set r1 = r1.s()
                java.lang.String r2 = "getUnmaskViewClasses(...)"
                kotlin.jvm.internal.AbstractC5504s.g(r1, r2)
                boolean r0 = r7.b(r0, r1)
                if (r0 == 0) goto L9c
                return r5
            L9c:
                java.lang.Class r8 = r8.getClass()
                io.sentry.B3 r9 = r9.getSessionReplay()
                java.util.Set r9 = r9.e()
                java.lang.String r0 = "getMaskViewClasses(...)"
                kotlin.jvm.internal.AbstractC5504s.g(r9, r0)
                boolean r8 = r7.b(r8, r9)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.viewhierarchy.b.a.e(android.view.View, io.sentry.z3):boolean");
        }

        public final b a(View view, b bVar, int i10, C5322z3 options) {
            Drawable drawable;
            AbstractC5504s.h(view, "view");
            AbstractC5504s.h(options, "options");
            Pair pairG = r.g(view);
            boolean zBooleanValue = ((Boolean) pairG.getFirst()).booleanValue();
            Rect rect = (Rect) pairG.getSecond();
            boolean z10 = zBooleanValue && e(view, options);
            if (!(view instanceof TextView)) {
                if (!(view instanceof ImageView)) {
                    return new C0795b(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (bVar != null ? bVar.a() : 0.0f) + view.getElevation(), i10, bVar, z10, false, zBooleanValue, rect);
                }
                if (bVar != null) {
                    bVar.g(true);
                }
                ImageView imageView = (ImageView) view;
                return new c(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), (bVar != null ? bVar.a() : 0.0f) + imageView.getElevation(), i10, bVar, z10 && (drawable = imageView.getDrawable()) != null && r.f(drawable), true, zBooleanValue, rect);
            }
            if (bVar != null) {
                bVar.g(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            io.sentry.android.replay.util.a aVar = layout != null ? new io.sentry.android.replay.util.a(layout) : null;
            int iJ = r.j(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int iC = r.c(textView);
            float x10 = textView.getX();
            float y10 = textView.getY();
            int width = textView.getWidth();
            float fA = 0.0f;
            int height = textView.getHeight();
            if (bVar != null) {
                fA = bVar.a();
            }
            return new d(aVar, Integer.valueOf(iJ), totalPaddingLeft, iC, x10, y10, width, height, fA + textView.getElevation(), i10, bVar, z10, true, zBooleanValue, rect);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0795b extends b {
        public C0795b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends b {
        public c(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends b {

        /* JADX INFO: renamed from: o */
        private final q f50492o;

        /* JADX INFO: renamed from: p */
        private final Integer f50493p;

        /* JADX INFO: renamed from: q */
        private final int f50494q;

        /* JADX INFO: renamed from: r */
        private final int f50495r;

        public /* synthetic */ d(q qVar, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? null : qVar, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? 0 : i10, (i15 & 8) != 0 ? 0 : i11, f10, f11, i12, i13, f12, i14, (i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : bVar, (i15 & 2048) != 0 ? false : z10, (i15 & 4096) != 0 ? false : z11, (i15 & 8192) != 0 ? false : z12, (i15 & 16384) != 0 ? null : rect);
        }

        public final Integer i() {
            return this.f50493p;
        }

        public final q j() {
            return this.f50492o;
        }

        public final int k() {
            return this.f50494q;
        }

        public final int l() {
            return this.f50495r;
        }

        public d(q qVar, Integer num, int i10, int i11, float f10, float f11, int i12, int i13, float f12, int i14, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
            super(f10, f11, i12, i13, f12, i14, bVar, z10, z11, z12, rect, null);
            this.f50492o = qVar;
            this.f50493p = num;
            this.f50494q = i10;
            this.f50495r = i11;
        }
    }

    public /* synthetic */ b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, i10, i11, f12, i12, bVar, z10, z11, z12, rect);
    }

    public final float a() {
        return this.f50484e;
    }

    public final int b() {
        return this.f50483d;
    }

    public final boolean c() {
        return this.f50487h;
    }

    public final Rect d() {
        return this.f50490k;
    }

    public final int e() {
        return this.f50482c;
    }

    public final void f(List list) {
        this.f50491l = list;
    }

    public final void g(boolean z10) {
        for (b bVar = this.f50486g; bVar != null; bVar = bVar.f50486g) {
            bVar.f50488i = z10;
        }
    }

    public final void h(Function1 callback) {
        List list;
        AbstractC5504s.h(callback, "callback");
        if (!((Boolean) callback.invoke(this)).booleanValue() || (list = this.f50491l) == null) {
            return;
        }
        AbstractC5504s.e(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).h(callback);
        }
    }

    private b(float f10, float f11, int i10, int i11, float f12, int i12, b bVar, boolean z10, boolean z11, boolean z12, Rect rect) {
        this.f50480a = f10;
        this.f50481b = f11;
        this.f50482c = i10;
        this.f50483d = i11;
        this.f50484e = f12;
        this.f50485f = i12;
        this.f50486g = bVar;
        this.f50487h = z10;
        this.f50488i = z11;
        this.f50489j = z12;
        this.f50490k = rect;
    }
}
