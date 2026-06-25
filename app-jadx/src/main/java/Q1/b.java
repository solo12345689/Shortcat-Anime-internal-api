package q1;

import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import o1.C5801b;
import p1.AbstractC5915c;
import p1.C5913a;
import p1.i;
import q1.g;
import r1.C6234c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements InterfaceC0864b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f56193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f56194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f56195c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f56197e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f56198f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f56200h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f56201i;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f56196d = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f56199g = 0.0f;

        a(float f10, float f11, float f12, String str, String str2) {
            this.f56193a = f10;
            this.f56194b = f11;
            this.f56195c = f12;
            this.f56197e = str == null ? "" : str;
            this.f56198f = str2 == null ? "" : str2;
            this.f56201i = f11;
            this.f56200h = f10;
        }

        public ArrayList a() {
            ArrayList arrayList = new ArrayList();
            int i10 = (int) this.f56200h;
            int i11 = (int) this.f56201i;
            int i12 = i10;
            while (i10 <= i11) {
                arrayList.add(this.f56197e + i12 + this.f56198f);
                i12 += (int) this.f56195c;
                i10++;
            }
            return arrayList;
        }

        @Override // q1.b.InterfaceC0864b
        public float value() {
            float f10 = this.f56199g;
            if (f10 >= this.f56201i) {
                this.f56196d = true;
            }
            if (!this.f56196d) {
                this.f56199g = f10 + this.f56195c;
            }
            return this.f56199g;
        }
    }

    /* JADX INFO: renamed from: q1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface InterfaceC0864b {
        float value();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class c implements InterfaceC0864b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f56202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f56203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f56204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f56205d = false;

        c(float f10, float f11) {
            this.f56202a = f10;
            this.f56203b = f11;
            this.f56204c = f10;
        }

        @Override // q1.b.InterfaceC0864b
        public float value() {
            if (!this.f56205d) {
                this.f56204c += this.f56203b;
            }
            return this.f56204c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HashMap f56206a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HashMap f56207b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HashMap f56208c = new HashMap();

        float a(Object obj) {
            if (!(obj instanceof i)) {
                if (obj instanceof p1.e) {
                    return ((p1.e) obj).e();
                }
                return 0.0f;
            }
            String strD = ((i) obj).d();
            if (this.f56207b.containsKey(strD)) {
                return ((InterfaceC0864b) this.f56207b.get(strD)).value();
            }
            if (this.f56206a.containsKey(strD)) {
                return ((Integer) this.f56206a.get(strD)).floatValue();
            }
            return 0.0f;
        }

        ArrayList b(String str) {
            if (this.f56208c.containsKey(str)) {
                return (ArrayList) this.f56208c.get(str);
            }
            return null;
        }

        void c(String str, float f10, float f11) {
            if (this.f56207b.containsKey(str)) {
                this.f56207b.get(str);
            }
            this.f56207b.put(str, new c(f10, f11));
        }

        void d(String str, float f10, float f11, float f12, String str2, String str3) {
            if (this.f56207b.containsKey(str)) {
                this.f56207b.get(str);
            }
            a aVar = new a(f10, f11, f12, str2, str3);
            this.f56207b.put(str, aVar);
            this.f56208c.put(str, aVar.a());
        }

        void e(String str, int i10) {
            this.f56206a.put(str, Integer.valueOf(i10));
        }

        void f(String str, ArrayList arrayList) {
            this.f56208c.put(str, arrayList);
        }
    }

    static void a(g gVar, d dVar, C6068a c6068a, p1.f fVar, String str) throws p1.h {
        str.getClass();
        switch (str) {
            case "centerVertically":
                String strP = fVar.P(str);
                boolean zEquals = strP.equals("parent");
                Object obj = strP;
                if (zEquals) {
                    obj = g.f56227k;
                }
                C6068a c6068aD = gVar.d(obj);
                c6068a.m0(c6068aD);
                c6068a.p(c6068aD);
                break;
            case "center":
                String strP2 = fVar.P(str);
                C6068a c6068aD2 = strP2.equals("parent") ? gVar.d(g.f56227k) : gVar.d(strP2);
                c6068a.i0(c6068aD2);
                c6068a.z(c6068aD2);
                c6068a.m0(c6068aD2);
                c6068a.p(c6068aD2);
                break;
            case "custom":
                i(fVar, c6068a, str);
                break;
            case "rotationX":
                c6068a.S(dVar.a(fVar.y(str)));
                break;
            case "rotationY":
                c6068a.T(dVar.a(fVar.y(str)));
                break;
            case "rotationZ":
                c6068a.U(dVar.a(fVar.y(str)));
                break;
            case "translationX":
                c6068a.n0(w(gVar, dVar.a(fVar.y(str))));
                break;
            case "translationY":
                c6068a.o0(w(gVar, dVar.a(fVar.y(str))));
                break;
            case "translationZ":
                c6068a.p0(w(gVar, dVar.a(fVar.y(str))));
                break;
            case "height":
                c6068a.Y(j(fVar, str, gVar, gVar.h()));
                break;
            case "motion":
                r(fVar.y(str), c6068a);
                break;
            case "pivotX":
                c6068a.N(dVar.a(fVar.y(str)));
                break;
            case "pivotY":
                c6068a.O(dVar.a(fVar.y(str)));
                break;
            case "scaleX":
                c6068a.V(dVar.a(fVar.y(str)));
                break;
            case "scaleY":
                c6068a.W(dVar.a(fVar.y(str)));
                break;
            case "hRtlBias":
                float fA = dVar.a(fVar.y(str));
                if (gVar.r()) {
                    fA = 1.0f - fA;
                }
                c6068a.F(fA);
                break;
            case "vWeight":
                c6068a.d0(dVar.a(fVar.y(str)));
                break;
            case "alpha":
                c6068a.g(dVar.a(fVar.y(str)));
                break;
            case "hBias":
                c6068a.F(dVar.a(fVar.y(str)));
                break;
            case "vBias":
                c6068a.q0(dVar.a(fVar.y(str)));
                break;
            case "width":
                c6068a.f0(j(fVar, str, gVar, gVar.h()));
                break;
            case "hWeight":
                c6068a.a0(dVar.a(fVar.y(str)));
                break;
            case "centerHorizontally":
                String strP3 = fVar.P(str);
                boolean zEquals2 = strP3.equals("parent");
                Object obj2 = strP3;
                if (zEquals2) {
                    obj2 = g.f56227k;
                }
                C6068a c6068aD3 = gVar.d(obj2);
                c6068a.i0(c6068aD3);
                c6068a.z(c6068aD3);
                break;
            case "visibility":
                String strP4 = fVar.P(str);
                strP4.getClass();
                switch (strP4) {
                    case "invisible":
                        c6068a.r0(4);
                        c6068a.g(0.0f);
                        break;
                    case "gone":
                        c6068a.r0(8);
                        break;
                    case "visible":
                        c6068a.r0(0);
                        break;
                }
                break;
            default:
                h(gVar, dVar, fVar, c6068a, str);
                break;
        }
    }

    private static int b(String str, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    static String c(p1.f fVar) {
        Iterator it = fVar.U().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals("type")) {
                return fVar.P("type");
            }
        }
        return null;
    }

    static void d(g gVar, String str, p1.f fVar) throws p1.h {
        int i10;
        boolean zR = gVar.r();
        C6234c c6234cB = gVar.b(str, g.c.END);
        ArrayList<String> arrayListU = fVar.U();
        if (arrayListU == null) {
            return;
        }
        for (String str2 : arrayListU) {
            str2.getClass();
            switch (str2) {
                case "margin":
                    float fG = fVar.G(str2);
                    if (Float.isNaN(fG)) {
                        break;
                    } else {
                        c6234cB.K(Float.valueOf(w(gVar, fG)));
                        break;
                    }
                    break;
                case "direction":
                    String strP = fVar.P(str2);
                    strP.getClass();
                    switch (strP) {
                        case "bottom":
                            c6234cB.w0(g.c.BOTTOM);
                            break;
                        case "end":
                            if (zR) {
                                c6234cB.w0(g.c.LEFT);
                                break;
                            } else {
                                c6234cB.w0(g.c.RIGHT);
                                break;
                            }
                            break;
                        case "top":
                            c6234cB.w0(g.c.TOP);
                            break;
                        case "left":
                            c6234cB.w0(g.c.LEFT);
                            break;
                        case "right":
                            c6234cB.w0(g.c.RIGHT);
                            break;
                        case "start":
                            if (zR) {
                                c6234cB.w0(g.c.RIGHT);
                                break;
                            } else {
                                c6234cB.w0(g.c.LEFT);
                                break;
                            }
                            break;
                    }
                    break;
                case "contains":
                    C5913a c5913aB = fVar.B(str2);
                    if (c5913aB != null) {
                        for (i10 = 0; i10 < c5913aB.size(); i10++) {
                            c6234cB.s0(gVar.d(c5913aB.x(i10).d()));
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void e(int r6, q1.g r7, q1.b.d r8, p1.C5913a r9) throws p1.h {
        /*
            if (r6 != 0) goto L7
            r1.i r6 = r7.o()
            goto Lb
        L7:
            r1.j r6 = r7.A()
        Lb:
            r0 = 1
            p1.c r1 = r9.x(r0)
            boolean r2 = r1 instanceof p1.C5913a
            if (r2 == 0) goto Laf
            p1.a r1 = (p1.C5913a) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L1e
            goto Laf
        L1e:
            r2 = 0
            r3 = r2
        L20:
            int r4 = r1.size()
            if (r3 >= r4) goto L34
            java.lang.String r4 = r1.getString(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6.s0(r4)
            int r3 = r3 + 1
            goto L20
        L34:
            int r1 = r9.size()
            r3 = 2
            if (r1 <= r3) goto Laf
            p1.c r9 = r9.x(r3)
            boolean r1 = r9 instanceof p1.f
            if (r1 != 0) goto L44
            goto Laf
        L44:
            p1.f r9 = (p1.f) r9
            java.util.ArrayList r1 = r9.U()
            java.util.Iterator r1 = r1.iterator()
        L4e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            java.lang.String r4 = "style"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L69
            h(r7, r8, r9, r6, r3)
            goto L4e
        L69:
            p1.c r3 = r9.y(r3)
            boolean r4 = r3 instanceof p1.C5913a
            if (r4 == 0) goto L86
            r4 = r3
            p1.a r4 = (p1.C5913a) r4
            int r5 = r4.size()
            if (r5 <= r0) goto L86
            java.lang.String r3 = r4.getString(r2)
            float r4 = r4.D(r0)
            r6.x0(r4)
            goto L8a
        L86:
            java.lang.String r3 = r3.d()
        L8a:
            r3.getClass()
            java.lang.String r4 = "packed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto La9
            java.lang.String r4 = "spread_inside"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La3
            q1.g$a r3 = q1.g.a.SPREAD
            r6.D0(r3)
            goto L4e
        La3:
            q1.g$a r3 = q1.g.a.SPREAD_INSIDE
            r6.D0(r3)
            goto L4e
        La9:
            q1.g$a r3 = q1.g.a.PACKED
            r6.D0(r3)
            goto L4e
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.b.e(int, q1.g, q1.b$d, p1.a):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020a  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(java.lang.String r18, q1.g r19, java.lang.String r20, q1.b.d r21, p1.f r22) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.b.f(java.lang.String, q1.g, java.lang.String, q1.b$d, p1.f):void");
    }

    static long g(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF" + strSubstring;
        }
        return Long.parseLong(strSubstring, 16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00d0. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012d  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void h(q1.g r22, q1.b.d r23, p1.f r24, q1.C6068a r25, java.lang.String r26) throws p1.h {
        /*
            Method dump skipped, instruction units count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.b.h(q1.g, q1.b$d, p1.f, q1.a, java.lang.String):void");
    }

    static void i(p1.f fVar, C6068a c6068a, String str) throws p1.h {
        ArrayList<String> arrayListU;
        p1.f fVarL = fVar.L(str);
        if (fVarL == null || (arrayListU = fVarL.U()) == null) {
            return;
        }
        for (String str2 : arrayListU) {
            AbstractC5915c abstractC5915cY = fVarL.y(str2);
            if (abstractC5915cY instanceof p1.e) {
                c6068a.f(str2, abstractC5915cY.e());
            } else if (abstractC5915cY instanceof i) {
                long jG = g(abstractC5915cY.d());
                if (jG != -1) {
                    c6068a.e(str2, (int) jG);
                }
            }
        }
    }

    static q1.d j(p1.f fVar, String str, g gVar, q1.c cVar) throws p1.h {
        AbstractC5915c abstractC5915cY = fVar.y(str);
        q1.d dVarB = q1.d.b(0);
        if (abstractC5915cY instanceof i) {
            return k(abstractC5915cY.d());
        }
        if (abstractC5915cY instanceof p1.e) {
            return q1.d.b(gVar.e(Float.valueOf(cVar.a(fVar.F(str)))));
        }
        if (abstractC5915cY instanceof p1.f) {
            p1.f fVar2 = (p1.f) abstractC5915cY;
            String strR = fVar2.R("value");
            if (strR != null) {
                dVarB = k(strR);
            }
            AbstractC5915c abstractC5915cN = fVar2.N("min");
            if (abstractC5915cN != null) {
                if (abstractC5915cN instanceof p1.e) {
                    dVarB.n(gVar.e(Float.valueOf(cVar.a(((p1.e) abstractC5915cN).e()))));
                } else if (abstractC5915cN instanceof i) {
                    dVarB.o(q1.d.f56210j);
                }
            }
            AbstractC5915c abstractC5915cN2 = fVar2.N("max");
            if (abstractC5915cN2 != null) {
                if (abstractC5915cN2 instanceof p1.e) {
                    dVarB.l(gVar.e(Float.valueOf(cVar.a(((p1.e) abstractC5915cN2).e()))));
                    return dVarB;
                }
                if (abstractC5915cN2 instanceof i) {
                    dVarB.m(q1.d.f56210j);
                }
            }
        }
        return dVarB;
    }

    static q1.d k(String str) {
        q1.d dVarB;
        dVarB = q1.d.b(0);
        str.getClass();
        switch (str) {
            case "preferWrap":
                return q1.d.g(q1.d.f56210j);
            case "parent":
                return q1.d.d();
            case "spread":
                return q1.d.g(q1.d.f56211k);
            case "wrap":
                return q1.d.h();
            default:
                return str.endsWith("%") ? q1.d.e(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).r(0) : str.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR) ? q1.d.f(str).s(q1.d.f56211k) : dVarB;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0403  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(java.lang.String r18, q1.g r19, java.lang.String r20, q1.b.d r21, p1.f r22) throws p1.h {
        /*
            Method dump skipped, instruction units count: 1232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.b.l(java.lang.String, q1.g, java.lang.String, q1.b$d, p1.f):void");
    }

    static void m(g gVar, d dVar, p1.f fVar) throws p1.h {
        ArrayList<String> arrayListU = fVar.U();
        if (arrayListU == null) {
            return;
        }
        for (String str : arrayListU) {
            AbstractC5915c abstractC5915cY = fVar.y(str);
            ArrayList arrayListB = dVar.b(str);
            if (arrayListB != null && (abstractC5915cY instanceof p1.f)) {
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    t(gVar, dVar, (String) it.next(), (p1.f) abstractC5915cY);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(java.lang.String r9, q1.g r10, java.lang.String r11, q1.b.d r12, p1.f r13) throws p1.h {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.b.n(java.lang.String, q1.g, java.lang.String, q1.b$d, p1.f):void");
    }

    static void o(int i10, g gVar, C5913a c5913a) throws p1.h {
        p1.f fVar;
        String strR;
        AbstractC5915c abstractC5915cX = c5913a.x(1);
        if ((abstractC5915cX instanceof p1.f) && (strR = (fVar = (p1.f) abstractC5915cX).R(DiagnosticsEntry.ID_KEY)) != null) {
            p(i10, gVar, strR, fVar);
        }
    }

    static void p(int i10, g gVar, String str, p1.f fVar) throws p1.h {
        float fD;
        ArrayList<String> arrayListU = fVar.U();
        if (arrayListU == null) {
            return;
        }
        C6068a c6068aD = gVar.d(str);
        if (i10 == 0) {
            gVar.p(str);
        } else {
            gVar.B(str);
        }
        boolean z10 = !gVar.r() || i10 == 0;
        r1.h hVar = (r1.h) c6068aD.d();
        float F10 = 0.0f;
        boolean z11 = false;
        while (true) {
            boolean z12 = true;
            for (String str2 : arrayListU) {
                str2.getClass();
                switch (str2) {
                    case "percent":
                        C5913a c5913aB = fVar.B(str2);
                        if (c5913aB == null) {
                            F10 = fVar.F(str2);
                            z11 = true;
                            z12 = true;
                            break;
                        } else {
                            if (c5913aB.size() > 1) {
                                String string = c5913aB.getString(0);
                                fD = c5913aB.D(1);
                                string.getClass();
                                switch (string) {
                                    case "end":
                                        z12 = !z10;
                                        F10 = fD;
                                        break;
                                    case "left":
                                        z12 = true;
                                        F10 = fD;
                                        z11 = true;
                                        break;
                                    case "right":
                                        z12 = false;
                                        F10 = fD;
                                        break;
                                    case "start":
                                        z12 = z10;
                                        F10 = fD;
                                        break;
                                    default:
                                        F10 = fD;
                                        break;
                                }
                            }
                            z11 = true;
                            break;
                        }
                        break;
                    case "end":
                        F10 = w(gVar, fVar.F(str2));
                        z12 = !z10;
                        break;
                    case "right":
                        F10 = w(gVar, fVar.F(str2));
                        z12 = false;
                        break;
                    case "start":
                        F10 = w(gVar, fVar.F(str2));
                        z12 = z10;
                        break;
                }
            }
            if (z11) {
                if (z12) {
                    hVar.f(F10);
                    return;
                } else {
                    hVar.f(1.0f - F10);
                    return;
                }
            }
            if (z12) {
                hVar.h(Float.valueOf(F10));
                return;
            } else {
                hVar.e(Float.valueOf(F10));
                return;
            }
            F10 = w(gVar, fVar.F(str2));
        }
    }

    static void q(g gVar, d dVar, C5913a c5913a) throws p1.h {
        for (int i10 = 0; i10 < c5913a.size(); i10++) {
            AbstractC5915c abstractC5915cX = c5913a.x(i10);
            if (abstractC5915cX instanceof C5913a) {
                C5913a c5913a2 = (C5913a) abstractC5915cX;
                if (c5913a2.size() > 1) {
                    String string = c5913a2.getString(0);
                    string.getClass();
                    switch (string) {
                        case "vGuideline":
                            o(1, gVar, c5913a2);
                            break;
                        case "hChain":
                            e(0, gVar, dVar, c5913a2);
                            break;
                        case "vChain":
                            e(1, gVar, dVar, c5913a2);
                            break;
                        case "hGuideline":
                            o(0, gVar, c5913a2);
                            break;
                    }
                }
            }
        }
    }

    private static void r(AbstractC5915c abstractC5915c, C6068a c6068a) throws p1.h {
        if (abstractC5915c instanceof p1.f) {
            p1.f fVar = (p1.f) abstractC5915c;
            C5801b c5801b = new C5801b();
            ArrayList<String> arrayListU = fVar.U();
            if (arrayListU == null) {
                return;
            }
            for (String str : arrayListU) {
                str.getClass();
                switch (str) {
                    case "stagger":
                        c5801b.a(600, fVar.F(str));
                        break;
                    case "easing":
                        c5801b.c(603, fVar.P(str));
                        break;
                    case "quantize":
                        AbstractC5915c abstractC5915cY = fVar.y(str);
                        if (!(abstractC5915cY instanceof C5913a)) {
                            c5801b.b(610, fVar.I(str));
                            break;
                        } else {
                            C5913a c5913a = (C5913a) abstractC5915cY;
                            int size = c5913a.size();
                            if (size > 0) {
                                c5801b.b(610, c5913a.getInt(0));
                                if (size > 1) {
                                    c5801b.c(611, c5913a.getString(1));
                                    if (size > 2) {
                                        c5801b.a(602, c5913a.D(2));
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case "pathArc":
                        String strP = fVar.P(str);
                        int iB = b(strP, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                        if (iB != -1) {
                            c5801b.b(607, iB);
                            break;
                        } else {
                            System.err.println(fVar.i() + " pathArc = '" + strP + "'");
                            break;
                        }
                        break;
                    case "relativeTo":
                        c5801b.c(605, fVar.P(str));
                        break;
                }
            }
            c6068a.f56177l0 = c5801b;
        }
    }

    private static void s(g gVar, d dVar, p1.f fVar) throws p1.h {
        ArrayList<String> arrayListU = fVar.U();
        if (arrayListU == null) {
            return;
        }
        for (String str : arrayListU) {
            AbstractC5915c abstractC5915cY = fVar.y(str);
            if (abstractC5915cY instanceof p1.e) {
                dVar.e(str, abstractC5915cY.f());
            } else if (abstractC5915cY instanceof p1.f) {
                p1.f fVar2 = (p1.f) abstractC5915cY;
                if (fVar2.T("from") && fVar2.T("to")) {
                    dVar.d(str, dVar.a(fVar2.y("from")), dVar.a(fVar2.y("to")), 1.0f, fVar2.R("prefix"), fVar2.R("postfix"));
                } else if (fVar2.T("from") && fVar2.T("step")) {
                    dVar.c(str, dVar.a(fVar2.y("from")), dVar.a(fVar2.y("step")));
                } else if (fVar2.T("ids")) {
                    C5913a c5913aA = fVar2.A("ids");
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < c5913aA.size(); i10++) {
                        arrayList.add(c5913aA.getString(i10));
                    }
                    dVar.f(str, arrayList);
                } else if (fVar2.T("tag")) {
                    dVar.f(str, gVar.k(fVar2.P("tag")));
                }
            }
        }
    }

    static void t(g gVar, d dVar, String str, p1.f fVar) throws p1.h {
        u(gVar, dVar, gVar.d(str), fVar);
    }

    static void u(g gVar, d dVar, C6068a c6068a, p1.f fVar) throws p1.h {
        if (c6068a.E() == null) {
            c6068a.f0(q1.d.h());
        }
        if (c6068a.C() == null) {
            c6068a.Y(q1.d.h());
        }
        ArrayList arrayListU = fVar.U();
        if (arrayListU == null) {
            return;
        }
        Iterator it = arrayListU.iterator();
        while (it.hasNext()) {
            a(gVar, dVar, c6068a, fVar, (String) it.next());
        }
    }

    public static void v(p1.f fVar, g gVar, d dVar) {
        AbstractC5915c abstractC5915cY;
        ArrayList<String> arrayListU = fVar.U();
        if (arrayListU == null) {
            return;
        }
        for (String str : arrayListU) {
            abstractC5915cY = fVar.y(str);
            str.getClass();
            switch (str) {
                case "Helpers":
                    if (!(abstractC5915cY instanceof C5913a)) {
                        break;
                    } else {
                        q(gVar, dVar, (C5913a) abstractC5915cY);
                        break;
                    }
                    break;
                case "Generate":
                    if (!(abstractC5915cY instanceof p1.f)) {
                        break;
                    } else {
                        m(gVar, dVar, (p1.f) abstractC5915cY);
                        break;
                    }
                    break;
                case "Variables":
                    if (!(abstractC5915cY instanceof p1.f)) {
                        break;
                    } else {
                        s(gVar, dVar, (p1.f) abstractC5915cY);
                        break;
                    }
                    break;
                default:
                    if (!(abstractC5915cY instanceof p1.f)) {
                        if (abstractC5915cY instanceof p1.e) {
                            dVar.e(str, abstractC5915cY.f());
                        }
                        break;
                    } else {
                        p1.f fVar2 = (p1.f) abstractC5915cY;
                        String strC = c(fVar2);
                        if (strC == null) {
                            t(gVar, dVar, str, fVar2);
                            break;
                        } else {
                            switch (strC) {
                                case "vGuideline":
                                    p(1, gVar, str, fVar2);
                                    break;
                                case "column":
                                case "row":
                                case "grid":
                                    n(strC, gVar, str, dVar, fVar2);
                                    break;
                                case "hChain":
                                case "vChain":
                                    f(strC, gVar, str, dVar, fVar2);
                                    break;
                                case "barrier":
                                    d(gVar, str, fVar2);
                                    break;
                                case "hFlow":
                                case "vFlow":
                                    l(strC, gVar, str, dVar, fVar2);
                                    break;
                                case "hGuideline":
                                    p(0, gVar, str, fVar2);
                                    break;
                            }
                        }
                    }
                    break;
            }
        }
    }

    private static float w(g gVar, float f10) {
        return gVar.h().a(f10);
    }
}
