package com.facebook.react.views.text;

import Ud.AbstractC2279u;
import android.os.Build;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.facebook.react.common.mapbuffer.a;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.Q;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f38309C = new a(null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int f38310D = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f38311A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f38312B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f38313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f38316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f38318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f38320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f38321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f38322j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f38323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private t f38325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f38326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f38327o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f38328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private D.b f38329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private D.d f38330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f38331s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f38332t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f38333u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f38334v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Integer f38335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Integer f38336x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f38337y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f38338z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(com.facebook.react.common.mapbuffer.a props) {
            AbstractC5504s.h(props, "props");
            q qVar = new q(null);
            Iterator it = props.iterator();
            while (it.hasNext()) {
                a.c cVar = (a.c) it.next();
                switch (cVar.getKey()) {
                    case 0:
                        qVar.U(Integer.valueOf(cVar.b()));
                        break;
                    case 1:
                        qVar.T(Integer.valueOf(cVar.b()));
                        break;
                    case 2:
                        qVar.f38318f = (float) cVar.c();
                        break;
                    case 3:
                        qVar.f38333u = cVar.d();
                        break;
                    case 4:
                        qVar.V((float) cVar.c());
                        break;
                    case 6:
                        qVar.Y(cVar.d());
                        break;
                    case 7:
                        qVar.W(cVar.d());
                        break;
                    case 8:
                        qVar.X(cVar.e());
                        break;
                    case 9:
                        qVar.S(cVar.f());
                        break;
                    case 10:
                        qVar.a0((float) cVar.c());
                        break;
                    case 11:
                        qVar.b0((float) cVar.c());
                        break;
                    case 15:
                        qVar.e0(cVar.d());
                        break;
                    case 18:
                        qVar.i0((float) cVar.c());
                        break;
                    case 19:
                        qVar.f0(cVar.b());
                        break;
                    case 20:
                        qVar.g0((float) cVar.c());
                        break;
                    case 21:
                        qVar.h0((float) cVar.c());
                        break;
                    case 23:
                        qVar.Z(cVar.d());
                        break;
                    case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                        qVar.R(cVar.d());
                        break;
                    case 26:
                        qVar.d0((D.d) D.d.c().get(cVar.b()));
                        break;
                    case 27:
                        qVar.j0(cVar.d());
                        break;
                    case 29:
                        qVar.c0((float) cVar.c());
                        break;
                }
            }
            return qVar;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final TextUtils.TruncateAt b(String str) {
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1074341483:
                    if (str.equals("middle")) {
                        return TextUtils.TruncateAt.MIDDLE;
                    }
                    return null;
                case 3056464:
                    str.equals("clip");
                    return null;
                case 3198432:
                    if (str.equals("head")) {
                        return TextUtils.TruncateAt.START;
                    }
                    return null;
                case 3552336:
                    if (str.equals("tail")) {
                        return TextUtils.TruncateAt.END;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final int c(String str) {
            if (str == null || AbstractC5504s.c(str, "none")) {
                return 0;
            }
            return AbstractC5504s.c(str, Constants.NORMAL) ? 1 : 2;
        }

        public final int d(Q props, int i10) {
            AbstractC5504s.h(props, "props");
            if (!props.c("textAlign")) {
                return i10;
            }
            if (!AbstractC5504s.c("justify", props.b("textAlign")) || Build.VERSION.SDK_INT < 26) {
                return q.f38310D;
            }
            return 1;
        }

        public final int e(String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1038130864) {
                    if (iHashCode != 107498) {
                        if (iHashCode == 113258 && str.equals("rtl")) {
                            return 1;
                        }
                    } else if (str.equals("ltr")) {
                        return 0;
                    }
                } else if (!str.equals("undefined")) {
                }
                AbstractC7283a.I("ReactNative", "Invalid layoutDirection: " + str);
            }
            return -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        
            if (r4.equals("auto") == false) goto L31;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int f(com.facebook.react.uimanager.Q r4, boolean r5, int r6) {
            /*
                r3 = this;
                java.lang.String r0 = "props"
                kotlin.jvm.internal.AbstractC5504s.h(r4, r0)
                java.lang.String r0 = "textAlign"
                boolean r1 = r4.c(r0)
                if (r1 != 0) goto Le
                return r6
            Le:
                java.lang.String r4 = r4.b(r0)
                r6 = 0
                if (r4 == 0) goto L6d
                int r0 = r4.hashCode()
                r1 = 5
                r2 = 3
                switch(r0) {
                    case -1364013995: goto L4c;
                    case -1249482096: goto L42;
                    case 3005871: goto L39;
                    case 3317767: goto L2c;
                    case 108511772: goto L1f;
                    default: goto L1e;
                }
            L1e:
                goto L54
            L1f:
                java.lang.String r0 = "right"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L28
                goto L54
            L28:
                if (r5 == 0) goto L2b
                return r2
            L2b:
                return r1
            L2c:
                java.lang.String r0 = "left"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L35
                goto L54
            L35:
                if (r5 == 0) goto L38
                return r1
            L38:
                return r2
            L39:
                java.lang.String r5 = "auto"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L6d
                goto L54
            L42:
                java.lang.String r5 = "justify"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L4b
                goto L54
            L4b:
                return r2
            L4c:
                java.lang.String r5 = "center"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L6b
            L54:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Invalid textAlign: "
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = "ReactNative"
                z5.AbstractC7283a.I(r5, r4)
                return r6
            L6b:
                r4 = 1
                return r4
            L6d:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.q.a.f(com.facebook.react.uimanager.Q, boolean, int):int");
        }

        public final int g(String str) {
            if (str == null) {
                return 1;
            }
            if (AbstractC5504s.c(str, "simple")) {
                return 0;
            }
            return AbstractC5504s.c(str, "balanced") ? 2 : 1;
        }

        private a() {
        }
    }

    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(String str) {
        this.f38329q = str == null ? null : D.b.f37415a.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(boolean z10) {
        if (z10 != this.f38315c) {
            this.f38315c = z10;
            V(this.f38321i);
            b0(this.f38322j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Integer num) {
        this.f38317e = num != null;
        if (num != null) {
            this.f38336x = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(Integer num) {
        this.f38314b = num != null;
        if (num != null) {
            this.f38335w = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(float f10) {
        this.f38321i = f10;
        if (f10 != -1.0f) {
            f10 = (float) (this.f38315c ? Math.ceil(B.l(f10, this.f38316d)) : Math.ceil(B.i(f10)));
        }
        this.f38320h = (int) f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(String str) {
        this.f38331s = p.b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void X(com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar == null || aVar.getCount() == 0) {
            this.f38334v = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.iterator();
        while (it.hasNext()) {
            String strD = ((a.c) it.next()).d();
            if (strD != null) {
                switch (strD.hashCode()) {
                    case -1983120972:
                        if (strD.equals("stylistic-thirteen")) {
                            arrayList.add("'ss13'");
                        }
                        break;
                    case -1933522176:
                        if (strD.equals("stylistic-fifteen")) {
                            arrayList.add("'ss15'");
                        }
                        break;
                    case -1534462052:
                        if (strD.equals("stylistic-eighteen")) {
                            arrayList.add("'ss18'");
                        }
                        break;
                    case -1195362251:
                        if (strD.equals("proportional-nums")) {
                            arrayList.add("'pnum'");
                        }
                        break;
                    case -1061392823:
                        if (strD.equals("lining-nums")) {
                            arrayList.add("'lnum'");
                        }
                        break;
                    case -771984547:
                        if (strD.equals("tabular-nums")) {
                            arrayList.add("'tnum'");
                        }
                        break;
                    case -659678800:
                        if (strD.equals("oldstyle-nums")) {
                            arrayList.add("'onum'");
                        }
                        break;
                    case 296506098:
                        if (strD.equals("stylistic-eight")) {
                            arrayList.add("'ss08'");
                        }
                        break;
                    case 309330544:
                        if (strD.equals("stylistic-seven")) {
                            arrayList.add("'ss07'");
                        }
                        break;
                    case 310339585:
                        if (strD.equals("stylistic-three")) {
                            arrayList.add("'ss03'");
                        }
                        break;
                    case 604478526:
                        if (strD.equals("stylistic-eleven")) {
                            arrayList.add("'ss11'");
                        }
                        break;
                    case 979426287:
                        if (strD.equals("stylistic-five")) {
                            arrayList.add("'ss05'");
                        }
                        break;
                    case 979432035:
                        if (strD.equals("stylistic-four")) {
                            arrayList.add("'ss04'");
                        }
                        break;
                    case 979664367:
                        if (strD.equals("stylistic-nine")) {
                            arrayList.add("'ss09'");
                        }
                        break;
                    case 1001434505:
                        if (strD.equals("stylistic-one")) {
                            arrayList.add("'ss01'");
                        }
                        break;
                    case 1001438213:
                        if (strD.equals("stylistic-six")) {
                            arrayList.add("'ss06'");
                        }
                        break;
                    case 1001439040:
                        if (strD.equals("stylistic-ten")) {
                            arrayList.add("'ss10'");
                        }
                        break;
                    case 1001439599:
                        if (strD.equals("stylistic-two")) {
                            arrayList.add("'ss02'");
                        }
                        break;
                    case 1030714463:
                        if (strD.equals("stylistic-sixteen")) {
                            arrayList.add("'ss16'");
                        }
                        break;
                    case 1044065430:
                        if (strD.equals("stylistic-twelve")) {
                            arrayList.add("'ss12'");
                        }
                        break;
                    case 1044067310:
                        if (strD.equals("stylistic-twenty")) {
                            arrayList.add("'ss20'");
                        }
                        break;
                    case 1183323111:
                        if (strD.equals("small-caps")) {
                            arrayList.add("'smcp'");
                        }
                        break;
                    case 1463562569:
                        if (strD.equals("stylistic-nineteen")) {
                            arrayList.add("'ss19'");
                        }
                        break;
                    case 1648446397:
                        if (strD.equals("stylistic-fourteen")) {
                            arrayList.add("'ss14'");
                        }
                        break;
                    case 2097122634:
                        if (strD.equals("stylistic-seventeen")) {
                            arrayList.add("'ss17'");
                        }
                        break;
                }
            }
        }
        this.f38334v = TextUtils.join(", ", arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(String str) {
        this.f38332t = p.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(String str) {
        this.f38324l = f38309C.e(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(float f10) {
        this.f38323k = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(float f10) {
        this.f38322j = f10;
        this.f38313a = f10 == -1.0f ? Float.NaN : this.f38315c ? B.m(f10, 0.0f, 2, null) : B.i(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(float f10) {
        if (f10 == this.f38316d) {
            return;
        }
        this.f38316d = f10;
        V(this.f38321i);
        b0(this.f38322j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(D.d dVar) {
        this.f38330r = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(String str) {
        List listM;
        this.f38326n = false;
        this.f38327o = false;
        if (str != null) {
            List listL = new Df.p("-").l(str, 0);
            if (listL.isEmpty()) {
                listM = AbstractC2279u.m();
            } else {
                ListIterator listIterator = listL.listIterator(listL.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listM = AbstractC2279u.T0(listL, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listM = AbstractC2279u.m();
            }
            for (String str2 : (String[]) listM.toArray(new String[0])) {
                if (AbstractC5504s.c("underline", str2)) {
                    this.f38326n = true;
                } else if (AbstractC5504s.c("strikethrough", str2)) {
                    this.f38327o = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(int i10) {
        if (i10 != this.f38312B) {
            this.f38312B = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(float f10) {
        this.f38337y = B.i(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(float f10) {
        this.f38338z = B.i(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(float f10) {
        if (f10 == this.f38311A) {
            return;
        }
        this.f38311A = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j0(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L4f
            int r0 = r3.hashCode()
            switch(r0) {
                case -1765638420: goto L2b;
                case -514507343: goto L1f;
                case 3387192: goto L16;
                case 223523538: goto La;
                default: goto L9;
            }
        L9:
            goto L33
        La:
            java.lang.String r0 = "uppercase"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L13
            goto L33
        L13:
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38366c
            goto L51
        L16:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4f
            goto L33
        L1f:
            java.lang.String r0 = "lowercase"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
            goto L33
        L28:
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38367d
            goto L51
        L2b:
            java.lang.String r0 = "capitalize"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4c
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid textTransform: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ReactNative"
            z5.AbstractC7283a.I(r0, r3)
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38365b
            goto L51
        L4c:
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38368e
            goto L51
        L4f:
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38365b
        L51:
            r2.f38325m = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.q.j0(java.lang.String):void");
    }

    public final String A() {
        return this.f38334v;
    }

    public final int B() {
        return this.f38320h;
    }

    public final int C() {
        return this.f38331s;
    }

    public final int D() {
        return this.f38332t;
    }

    public final float E() {
        float fM = this.f38315c ? B.m(this.f38323k, 0.0f, 2, null) : B.i(this.f38323k);
        int i10 = this.f38320h;
        if (i10 > 0) {
            return fM / i10;
        }
        throw new IllegalArgumentException(("FontSize should be a positive value. Current value: " + i10).toString());
    }

    public final float F() {
        return this.f38313a;
    }

    public final float G() {
        return this.f38318f;
    }

    public final D.d H() {
        return this.f38330r;
    }

    public final int I() {
        return this.f38312B;
    }

    public final float J() {
        return this.f38337y;
    }

    public final float K() {
        return this.f38338z;
    }

    public final float L() {
        return this.f38311A;
    }

    public final t M() {
        return this.f38325m;
    }

    public final boolean N() {
        return this.f38317e;
    }

    public final boolean O() {
        return this.f38314b;
    }

    public final boolean P() {
        return this.f38327o;
    }

    public final boolean Q() {
        return this.f38326n;
    }

    public final D.b w() {
        return this.f38329q;
    }

    public final Integer x() {
        return this.f38336x;
    }

    public final Integer y() {
        return this.f38335w;
    }

    public final String z() {
        return this.f38333u;
    }

    private q() {
        this.f38313a = Float.NaN;
        this.f38315c = true;
        this.f38316d = Float.NaN;
        this.f38318f = Float.NaN;
        this.f38319g = -1;
        this.f38320h = -1;
        this.f38321i = -1.0f;
        this.f38322j = -1.0f;
        this.f38323k = Float.NaN;
        this.f38324l = -1;
        this.f38325m = t.f38365b;
        this.f38328p = true;
        this.f38331s = -1;
        this.f38332t = -1;
        this.f38336x = 0;
        this.f38312B = 1426063360;
    }
}
