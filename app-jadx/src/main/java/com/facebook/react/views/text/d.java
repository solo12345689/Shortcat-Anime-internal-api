package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.C3299o;
import com.facebook.react.uimanager.C3309z;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.O;
import com.facebook.react.uimanager.P;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends com.facebook.react.uimanager.r {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f38216C = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f38217A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Map f38218B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f38219a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f38224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private D.b f38225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private D.d f38226h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f38229k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38231m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f38234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f38235q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f38237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f38238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f38239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f38240v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f38241w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f38243y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f38244z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f38220b = new r();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f38227i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f38228j = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38230l = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f38232n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f38233o = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f38236r = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f38242x = 1426063360;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(d dVar, SpannableStringBuilder spannableStringBuilder, List list, r rVar, boolean z10, Map map, int i10) {
            r rVarW;
            float layoutWidth;
            float layoutHeight;
            if (rVar == null || (rVarW = rVar.a(dVar.w())) == null) {
                rVarW = dVar.w();
            }
            r rVar2 = rVarW;
            int childCount = dVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                P childAt = dVar.getChildAt(i11);
                AbstractC5504s.g(childAt, "getChildAt(...)");
                if (childAt instanceof d) {
                    b((d) childAt, spannableStringBuilder, list, rVar2, z10, map, spannableStringBuilder.length());
                } else if (childAt instanceof O7.a) {
                    spannableStringBuilder.append("0");
                    list.add(new P7.p(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((O7.a) childAt).f()));
                } else {
                    if (!z10) {
                        throw new C3299o("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
                    }
                    int reactTag = childAt.getReactTag();
                    YogaValue styleWidth = childAt.getStyleWidth();
                    YogaValue styleHeight = childAt.getStyleHeight();
                    w wVar = styleWidth.f38644b;
                    w wVar2 = w.POINT;
                    if (wVar == wVar2 && styleHeight.f38644b == wVar2) {
                        layoutWidth = styleWidth.f38643a;
                        layoutHeight = styleHeight.f38643a;
                    } else {
                        childAt.calculateLayout();
                        layoutWidth = childAt.getLayoutWidth();
                        layoutHeight = childAt.getLayoutHeight();
                    }
                    spannableStringBuilder.append("0");
                    list.add(new P7.p(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new P7.s(reactTag, (int) layoutWidth, (int) layoutHeight)));
                    if (map == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    map.put(Integer.valueOf(reactTag), childAt);
                }
                childAt.markUpdateSeen();
            }
            int length = spannableStringBuilder.length();
            if (length >= i10) {
                if (dVar.D()) {
                    list.add(new P7.p(i10, length, new P7.g(dVar.i())));
                }
                if (dVar.C()) {
                    list.add(new P7.p(i10, length, new P7.e(dVar.h())));
                }
                if (dVar.u() == null ? dVar.f() == D.b.f37420f : dVar.u() == D.d.f37512y) {
                    list.add(new P7.p(i10, length, new P7.f(dVar.getReactTag())));
                }
                float fD = rVar2.d();
                if (!Float.isNaN(fD) && (rVar == null || rVar.d() != fD)) {
                    list.add(new P7.p(i10, length, new P7.a(fD)));
                }
                int iC = rVar2.c();
                if (rVar == null || rVar.c() != iC) {
                    list.add(new P7.p(i10, length, new P7.d(iC)));
                }
                if (dVar.m() != -1 || dVar.n() != -1 || dVar.k() != null) {
                    int iM = dVar.m();
                    int iN = dVar.n();
                    String strL = dVar.l();
                    String strK = dVar.k();
                    AssetManager assets = dVar.getThemedContext().getAssets();
                    AbstractC5504s.g(assets, "getAssets(...)");
                    list.add(new P7.p(i10, length, new P7.c(iM, iN, strL, strK, assets)));
                }
                if (dVar.F()) {
                    list.add(new P7.p(i10, length, new P7.o()));
                }
                if (dVar.E()) {
                    list.add(new P7.p(i10, length, new P7.l()));
                }
                if ((dVar.z() != 0.0f || dVar.A() != 0.0f || dVar.B() != 0.0f) && Color.alpha(dVar.y()) != 0) {
                    list.add(new P7.p(i10, length, new P7.q(dVar.z(), dVar.A(), dVar.B(), dVar.y())));
                }
                float fE = rVar2.e();
                if (!Float.isNaN(fE) && (rVar == null || rVar.e() != fE)) {
                    list.add(new P7.p(i10, length, new P7.b(fE)));
                }
                list.add(new P7.p(i10, length, new P7.m(dVar.getReactTag())));
            }
        }

        private a() {
        }
    }

    public d(o oVar) {
        this.f38219a = oVar;
    }

    protected final float A() {
        return this.f38240v;
    }

    protected final float B() {
        return this.f38241w;
    }

    protected final boolean C() {
        return this.f38223e;
    }

    protected final boolean D() {
        return this.f38221c;
    }

    protected final boolean E() {
        return this.f38244z;
    }

    protected final boolean F() {
        return this.f38243y;
    }

    protected final void G(int i10) {
        this.f38228j = i10;
    }

    protected final Spannable H(d textShadowNode, String str, boolean z10, C3309z c3309z) {
        int iB;
        AbstractC5504s.h(textShadowNode, "textShadowNode");
        if (z10 && c3309z == null) {
            throw new IllegalStateException("nativeViewHierarchyOptimizer is required when inline views are supported");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z10 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) t.f38364a.a(str, textShadowNode.f38220b.f38345f));
        }
        f38216C.b(textShadowNode, spannableStringBuilder, arrayList, null, z10, map, 0);
        textShadowNode.f38217A = false;
        textShadowNode.f38218B = map;
        int size = arrayList.size();
        float f10 = Float.NaN;
        for (int i10 = 0; i10 < size; i10++) {
            P7.p pVar = (P7.p) arrayList.get((arrayList.size() - i10) - 1);
            P7.k kVar = pVar.f13540c;
            boolean z11 = kVar instanceof P7.r;
            if (z11 || (kVar instanceof P7.s)) {
                if (z11) {
                    iB = ((P7.r) kVar).b();
                    textShadowNode.f38217A = true;
                } else {
                    AbstractC5504s.f(kVar, "null cannot be cast to non-null type com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan");
                    P7.s sVar = (P7.s) kVar;
                    int iA = sVar.a();
                    if (map == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    O o10 = (O) map.get(Integer.valueOf(sVar.b()));
                    if (o10 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (c3309z == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    c3309z.h(o10);
                    o10.setLayoutParent(textShadowNode);
                    iB = iA;
                }
                if (Float.isNaN(f10) || iB > f10) {
                    f10 = iB;
                }
            }
            pVar.a(spannableStringBuilder, i10);
        }
        textShadowNode.f38220b.j(f10);
        o oVar = this.f38219a;
        if (oVar != null) {
            oVar.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    protected final D.b f() {
        return this.f38225g;
    }

    protected final boolean g() {
        return this.f38237s;
    }

    protected final int h() {
        return this.f38224f;
    }

    protected final int i() {
        return this.f38222d;
    }

    protected final boolean j() {
        return this.f38217A;
    }

    protected final String k() {
        return this.f38234p;
    }

    protected final String l() {
        return this.f38235q;
    }

    protected final int m() {
        return this.f38232n;
    }

    protected final int n() {
        return this.f38233o;
    }

    protected final int o() {
        return this.f38229k;
    }

    protected final boolean p() {
        return this.f38236r;
    }

    protected final Map q() {
        return this.f38218B;
    }

    protected final int r() {
        return this.f38230l;
    }

    protected final float s() {
        return this.f38238t;
    }

    @B7.a(name = "accessibilityRole")
    public final void setAccessibilityRole(String str) {
        if (isVirtual()) {
            this.f38225g = D.b.f37415a.b(str);
            markUpdated();
        }
    }

    @B7.a(name = "adjustsFontSizeToFit")
    public final void setAdjustFontSizeToFit(boolean z10) {
        if (z10 != this.f38237s) {
            this.f38237s = z10;
            markUpdated();
        }
    }

    @B7.a(defaultBoolean = true, name = "allowFontScaling")
    public final void setAllowFontScaling(boolean z10) {
        if (z10 != this.f38220b.b()) {
            this.f38220b.h(z10);
            markUpdated();
        }
    }

    @B7.a(customType = "Color", name = "backgroundColor")
    public final void setBackgroundColor(Integer num) {
        if (isVirtual()) {
            if (num != null) {
                int iIntValue = num.intValue();
                this.f38223e = true;
                this.f38224f = iIntValue;
            }
            markUpdated();
        }
    }

    @B7.a(customType = "Color", name = "color")
    public final void setColor(Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            this.f38221c = true;
            this.f38222d = iIntValue;
        }
        markUpdated();
    }

    @B7.a(name = "fontFamily")
    public final void setFontFamily(String str) {
        this.f38234p = str;
        markUpdated();
    }

    @B7.a(defaultFloat = Float.NaN, name = "fontSize")
    public final void setFontSize(float f10) {
        this.f38220b.i(f10);
        markUpdated();
    }

    @B7.a(name = "fontStyle")
    public final void setFontStyle(String str) {
        int iB = p.b(str);
        if (iB != this.f38232n) {
            this.f38232n = iB;
            markUpdated();
        }
    }

    @B7.a(name = "fontVariant")
    public final void setFontVariant(ReadableArray readableArray) {
        String strC = p.c(readableArray);
        if (AbstractC5504s.c(strC, this.f38235q)) {
            return;
        }
        this.f38235q = strC;
        markUpdated();
    }

    @B7.a(name = "fontWeight")
    public final void setFontWeight(String str) {
        int iD = p.d(str);
        if (iD != this.f38233o) {
            this.f38233o = iD;
            markUpdated();
        }
    }

    @B7.a(defaultBoolean = true, name = "includeFontPadding")
    public final void setIncludeFontPadding(boolean z10) {
        this.f38236r = z10;
    }

    @B7.a(defaultFloat = 0.0f, name = "letterSpacing")
    public final void setLetterSpacing(float f10) {
        this.f38220b.k(f10);
        markUpdated();
    }

    @B7.a(defaultFloat = Float.NaN, name = "lineHeight")
    public final void setLineHeight(float f10) {
        this.f38220b.l(f10);
        markUpdated();
    }

    @B7.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public final void setMaxFontSizeMultiplier(float f10) {
        if (f10 == this.f38220b.g()) {
            return;
        }
        this.f38220b.m(f10);
        markUpdated();
    }

    @B7.a(name = "minimumFontScale")
    public final void setMinimumFontScale(float f10) {
        if (f10 == this.f38238t) {
            return;
        }
        this.f38238t = f10;
        markUpdated();
    }

    @B7.a(defaultInt = -1, name = "numberOfLines")
    public final void setNumberOfLines(int i10) {
        if (i10 == 0) {
            i10 = -1;
        }
        this.f38227i = i10;
        markUpdated();
    }

    @B7.a(name = "role")
    public final void setRole(String str) {
        if (isVirtual()) {
            this.f38226h = D.d.f37475a.a(str);
            markUpdated();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r6.equals("left") == false) goto L27;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    @B7.a(name = "textAlign")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextAlign(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "justify"
            boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r0, r6)
            r1 = 3
            r2 = 1
            r3 = 26
            if (r0 == 0) goto L15
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L12
            r5.f38230l = r2
        L12:
            r5.f38231m = r1
            goto L66
        L15:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            if (r0 < r3) goto L1c
            r5.f38230l = r4
        L1c:
            if (r6 == 0) goto L61
            int r0 = r6.hashCode()
            switch(r0) {
                case -1364013995: goto L43;
                case 3005871: goto L3a;
                case 3317767: goto L31;
                case 108511772: goto L26;
                default: goto L25;
            }
        L25:
            goto L4b
        L26:
            java.lang.String r0 = "right"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L2f
            goto L4b
        L2f:
            r1 = 5
            goto L64
        L31:
            java.lang.String r0 = "left"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L64
            goto L4b
        L3a:
            java.lang.String r0 = "auto"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L61
            goto L4b
        L43:
            java.lang.String r0 = "center"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L63
        L4b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid textAlign: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ReactNative"
            z5.AbstractC7283a.I(r0, r6)
        L61:
            r1 = r4
            goto L64
        L63:
            r1 = r2
        L64:
            r5.f38231m = r1
        L66:
            r5.markUpdated()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.d.setTextAlign(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    @B7.a(name = "textBreakStrategy")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTextBreakStrategy(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L4b
            int r1 = r4.hashCode()
            r2 = -1924829944(0xffffffff8d456d08, float:-6.0836553E-31)
            if (r1 == r2) goto L2b
            r2 = -902286926(0xffffffffca3831b2, float:-3017836.5)
            if (r1 == r2) goto L20
            r2 = 336871677(0x141440fd, float:7.484907E-27)
            if (r1 == r2) goto L17
            goto L33
        L17:
            java.lang.String r1 = "highQuality"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L4b
            goto L33
        L20:
            java.lang.String r1 = "simple"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L29
            goto L33
        L29:
            r0 = 0
            goto L4b
        L2b:
            java.lang.String r1 = "balanced"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L4a
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid textBreakStrategy: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "ReactNative"
            z5.AbstractC7283a.I(r1, r4)
            goto L4b
        L4a:
            r0 = 2
        L4b:
            r3.f38228j = r0
            r3.markUpdated()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.d.setTextBreakStrategy(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @B7.a(name = "textDecorationLine")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextDecorationLine(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            r8.f38243y = r0
            r8.f38244z = r0
            if (r9 == 0) goto L6b
            java.lang.String r1 = " "
            java.lang.String[] r3 = new java.lang.String[]{r1}
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r2 = r9
            java.util.List r9 = Df.r.N0(r2, r3, r4, r5, r6, r7)
            boolean r1 = r9.isEmpty()
            r2 = 1
            if (r1 != 0) goto L42
            int r1 = r9.size()
            java.util.ListIterator r1 = r9.listIterator(r1)
        L25:
            boolean r3 = r1.hasPrevious()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r1.previous()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            if (r3 != 0) goto L38
            goto L25
        L38:
            int r1 = r1.nextIndex()
            int r1 = r1 + r2
            java.util.List r9 = Ud.AbstractC2279u.T0(r9, r1)
            goto L46
        L42:
            java.util.List r9 = Ud.AbstractC2279u.m()
        L46:
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String[] r9 = (java.lang.String[]) r9
            int r1 = r9.length
        L4f:
            if (r0 >= r1) goto L6b
            r3 = r9[r0]
            java.lang.String r4 = "underline"
            boolean r4 = kotlin.jvm.internal.AbstractC5504s.c(r4, r3)
            if (r4 == 0) goto L5e
            r8.f38243y = r2
            goto L68
        L5e:
            java.lang.String r4 = "line-through"
            boolean r3 = kotlin.jvm.internal.AbstractC5504s.c(r4, r3)
            if (r3 == 0) goto L68
            r8.f38244z = r2
        L68:
            int r0 = r0 + 1
            goto L4f
        L6b:
            r8.markUpdated()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.d.setTextDecorationLine(java.lang.String):void");
    }

    @B7.a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public final void setTextShadowColor(int i10) {
        if (i10 != this.f38242x) {
            this.f38242x = i10;
            markUpdated();
        }
    }

    @B7.a(name = "textShadowOffset")
    public final void setTextShadowOffset(ReadableMap readableMap) {
        this.f38239u = 0.0f;
        this.f38240v = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f38239u = B.h(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.f38240v = B.h(readableMap.getDouble("height"));
            }
        }
        markUpdated();
    }

    @B7.a(defaultInt = 1, name = "textShadowRadius")
    public final void setTextShadowRadius(float f10) {
        if (f10 == this.f38241w) {
            return;
        }
        this.f38241w = f10;
        markUpdated();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    @B7.a(name = "textTransform")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextTransform(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L52
            int r0 = r3.hashCode()
            switch(r0) {
                case -1765638420: goto L2e;
                case -514507343: goto L22;
                case 3387192: goto L16;
                case 223523538: goto La;
                default: goto L9;
            }
        L9:
            goto L36
        La:
            java.lang.String r0 = "uppercase"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L13
            goto L36
        L13:
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38366c
            goto L54
        L16:
            java.lang.String r0 = "none"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L1f
            goto L36
        L1f:
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38365b
            goto L54
        L22:
            java.lang.String r0 = "lowercase"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2b
            goto L36
        L2b:
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38367d
            goto L54
        L2e:
            java.lang.String r0 = "capitalize"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4f
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid textTransform: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ReactNative"
            z5.AbstractC7283a.I(r0, r3)
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38369f
            goto L54
        L4f:
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38368e
            goto L54
        L52:
            com.facebook.react.views.text.t r3 = com.facebook.react.views.text.t.f38369f
        L54:
            com.facebook.react.views.text.r r0 = r2.f38220b
            r0.f38345f = r3
            r2.markUpdated()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.d.setTextTransform(java.lang.String):void");
    }

    protected final int t() {
        return this.f38227i;
    }

    protected final D.d u() {
        return this.f38226h;
    }

    protected final int v() {
        if (getLayoutDirection() != com.facebook.yoga.h.RTL) {
            return this.f38231m;
        }
        int i10 = this.f38231m;
        if (i10 == 3) {
            return 5;
        }
        if (i10 != 5) {
            return i10;
        }
        return 3;
    }

    protected final r w() {
        return this.f38220b;
    }

    protected final int x() {
        return this.f38228j;
    }

    protected final int y() {
        return this.f38242x;
    }

    protected final float z() {
        return this.f38239u;
    }
}
