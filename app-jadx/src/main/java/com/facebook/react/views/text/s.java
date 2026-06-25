package com.facebook.react.views.text;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.B;
import com.facebook.react.uimanager.D;
import com.facebook.react.views.text.q;
import h7.C4914b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f38347a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f38349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f38350d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f38351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f38352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f38353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f38354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f38355e;

        public final float a() {
            return this.f38355e;
        }

        public final float b() {
            return this.f38353c;
        }

        public final float c() {
            return this.f38352b;
        }

        public final boolean d() {
            return this.f38351a;
        }

        public final float e() {
            return this.f38354d;
        }

        public final void f(float f10) {
            this.f38355e = f10;
        }

        public final void g(float f10) {
            this.f38353c = f10;
        }

        public final void h(float f10) {
            this.f38352b = f10;
        }

        public final void i(boolean z10) {
            this.f38351a = z10;
        }

        public final void j(float f10) {
            this.f38354d = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f38356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f38357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f38358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f38359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f38360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final double f38361f;

        public b(q props, int i10, int i11, boolean z10, double d10, double d11) {
            AbstractC5504s.h(props, "props");
            this.f38356a = props;
            this.f38357b = i10;
            this.f38358c = i11;
            this.f38359d = z10;
            this.f38360e = d10;
            this.f38361f = d11;
        }

        public final double a() {
            return this.f38361f;
        }

        public final int b() {
            return this.f38357b;
        }

        public final q c() {
            return this.f38356a;
        }

        public final int d() {
            return this.f38358c;
        }

        public final double e() {
            return this.f38360e;
        }

        public final boolean f() {
            return this.f38359d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38363b;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38362a = iArr;
            int[] iArr2 = new int[com.facebook.yoga.p.values().length];
            try {
                iArr2[com.facebook.yoga.p.EXACTLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.facebook.yoga.p.AT_MOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f38363b = iArr2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends ThreadLocal {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextPaint initialValue() {
            return new TextPaint(1);
        }
    }

    static {
        String simpleName = s.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        f38348b = simpleName;
        f38349c = new d();
        f38350d = new ConcurrentHashMap();
    }

    private s() {
    }

    private final void B(TextPaint textPaint, q qVar, Context context) {
        if (qVar.B() != -1) {
            textPaint.setTextSize(qVar.B());
        }
        if (qVar.C() == -1 && qVar.D() == -1 && qVar.z() == null) {
            return;
        }
        int iC = qVar.C();
        int iD = qVar.D();
        String strZ = qVar.z();
        AssetManager assets = context.getAssets();
        AbstractC5504s.g(assets, "getAssets(...)");
        Typeface typefaceA = p.a(null, iC, iD, strZ, assets);
        textPaint.setTypeface(typefaceA);
        if (qVar.C() == -1 || qVar.C() == typefaceA.getStyle()) {
            return;
        }
        int iC2 = qVar.C() & (~typefaceA.getStyle());
        textPaint.setFakeBoldText((iC2 & 1) != 0);
        textPaint.setTextSkewX((iC2 & 2) != 0 ? -0.25f : 0.0f);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(Spannable spannable, float f10, com.facebook.yoga.p widthYogaMeasureMode, float f11, com.facebook.yoga.p heightYogaMeasureMode, float f12, int i10, boolean z10, int i11, int i12, Layout.Alignment alignment, int i13, TextPaint textPaint) {
        Spannable text = spannable;
        TextPaint paint = textPaint;
        AbstractC5504s.h(text, "text");
        AbstractC5504s.h(widthYogaMeasureMode, "widthYogaMeasureMode");
        AbstractC5504s.h(heightYogaMeasureMode, "heightYogaMeasureMode");
        AbstractC5504s.h(alignment, "alignment");
        AbstractC5504s.h(paint, "paint");
        s sVar = f38347a;
        BoringLayout.Metrics metricsS = sVar.s(text, paint);
        Layout layoutG = sVar.g(text, metricsS, f10, widthYogaMeasureMode, z10, i11, i12, alignment, i13, null, -1, paint);
        int iC = (int) (Float.isNaN(f12) ? B.f37368a.c(4) : f12);
        int i14 = 0;
        Class<P7.d> cls = P7.d.class;
        Iterator itA = AbstractC5489c.a((P7.d[]) text.getSpans(0, text.length(), cls));
        int iMax = iC;
        while (itA.hasNext()) {
            iMax = Math.max(iMax, ((P7.d) itA.next()).getSize());
        }
        int i15 = iMax;
        while (i15 > iC) {
            if ((i10 == -1 || i10 == 0 || layoutG.getLineCount() <= i10) && ((heightYogaMeasureMode == com.facebook.yoga.p.UNDEFINED || layoutG.getHeight() <= f11) && (text.length() != 1 || layoutG.getLineWidth(i14) <= f10))) {
                return;
            }
            int iMax2 = i15 - Math.max(1, (int) B.f37368a.c(1));
            float f13 = iMax2 / iMax;
            paint.setTextSize(Math.max((int) (paint.getTextSize() * f13), iC));
            Iterator itA2 = AbstractC5489c.a((P7.d[]) text.getSpans(i14, text.length(), cls));
            while (itA2.hasNext()) {
                P7.d dVar = (P7.d) itA2.next();
                text.setSpan(new P7.d(Math.max((int) (dVar.getSize() * f13), iC)), text.getSpanStart(dVar), text.getSpanEnd(dVar), text.getSpanFlags(dVar));
                text.removeSpan(dVar);
            }
            if (metricsS != null) {
                metricsS = f38347a.s(text, paint);
            }
            layoutG = f38347a.g(text, metricsS, f10, widthYogaMeasureMode, z10, i11, i12, alignment, i13, null, -1, paint);
            text = spannable;
            paint = textPaint;
            i15 = iMax2;
            iMax = iMax;
            cls = cls;
            i14 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        if (h7.C4914b.s() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        r22.add(new P7.p(r6, r8, new P7.i(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        r22.add(new P7.p(r6, r8, new P7.f(r11)));
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(android.content.Context r19, com.facebook.react.common.mapbuffer.a r20, android.text.SpannableStringBuilder r21, java.util.List r22, int[] r23) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.s.b(android.content.Context, com.facebook.react.common.mapbuffer.a, android.text.SpannableStringBuilder, java.util.List, int[]):void");
    }

    private final Spannable c(Context context, com.facebook.react.common.mapbuffer.a aVar, int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<b> arrayList = new ArrayList(aVar.getCount());
        int count = aVar.getCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= count) {
                break;
            }
            com.facebook.react.common.mapbuffer.a aVarF0 = aVar.F0(i11);
            q qVarA = q.f38309C.a(aVarF0.F0(5));
            String strA = t.f38364a.a(aVarF0.getString(0), qVarA.M());
            sb2.append(strA);
            int length = strA.length();
            int i12 = aVarF0.H(1) ? aVarF0.getInt(1) : -1;
            boolean z10 = aVarF0.H(2) && aVarF0.getBoolean(2);
            double d10 = Double.NaN;
            double d11 = aVarF0.H(3) ? aVarF0.getDouble(3) : Double.NaN;
            if (aVarF0.H(4)) {
                d10 = aVarF0.getDouble(4);
            }
            arrayList.add(new b(qVarA, length, i12, z10, d11, d10));
            i11++;
        }
        SpannableString spannableString = new SpannableString(sb2);
        int i13 = 0;
        for (b bVar : arrayList) {
            int i14 = i10 + 1;
            int iB = bVar.b() + i13;
            int i15 = i13 == 0 ? 18 : 34;
            if (bVar.f()) {
                spannableString.setSpan(new P7.s(bVar.d(), (int) B.j(bVar.e()), (int) B.j(bVar.a())), i13, iB, i15);
            } else {
                if (bVar.c().H() == null ? bVar.c().w() == D.b.f37420f : bVar.c().H() == D.d.f37512y) {
                    if (C4914b.s()) {
                        spannableString.setSpan(new P7.i(i10), i13, iB, i15);
                    } else {
                        spannableString.setSpan(new P7.f(bVar.d()), i13, iB, i15);
                    }
                }
                if (bVar.c().O()) {
                    Integer numY = bVar.c().y();
                    spannableString.setSpan(numY != null ? new P7.g(numY.intValue()) : null, i13, iB, i15);
                }
                if (bVar.c().N()) {
                    Integer numX = bVar.c().x();
                    spannableString.setSpan(numX != null ? new P7.e(numX.intValue()) : null, i13, iB, i15);
                }
                if (!Float.isNaN(bVar.c().G())) {
                    spannableString.setSpan(new P7.j(bVar.c().G()), i13, iB, i15);
                }
                if (!Float.isNaN(bVar.c().E())) {
                    spannableString.setSpan(new P7.a(bVar.c().E()), i13, iB, i15);
                }
                spannableString.setSpan(new P7.d(bVar.c().B()), i13, iB, i15);
                if (bVar.c().C() != -1 || bVar.c().D() != -1 || bVar.c().z() != null) {
                    int iC = bVar.c().C();
                    int iD = bVar.c().D();
                    String strA2 = bVar.c().A();
                    String strZ = bVar.c().z();
                    AssetManager assets = context.getAssets();
                    AbstractC5504s.g(assets, "getAssets(...)");
                    spannableString.setSpan(new P7.c(iC, iD, strA2, strZ, assets), i13, iB, i15);
                }
                if (bVar.c().Q()) {
                    spannableString.setSpan(new P7.o(), i13, iB, i15);
                }
                if (bVar.c().P()) {
                    spannableString.setSpan(new P7.l(), i13, iB, i15);
                }
                if ((bVar.c().J() != 0.0f || bVar.c().K() != 0.0f || bVar.c().L() != 0.0f) && Color.alpha(bVar.c().I()) != 0) {
                    spannableString.setSpan(new P7.q(bVar.c().J(), bVar.c().K(), bVar.c().L(), bVar.c().I()), i13, iB, i15);
                }
                if (!Float.isNaN(bVar.c().F())) {
                    spannableString.setSpan(new P7.b(bVar.c().F()), i13, iB, i15);
                }
                if (C4914b.s()) {
                    spannableString.setSpan(new P7.h(i10), i13, iB, i15);
                    if (iArr != null) {
                        iArr[i10] = bVar.d();
                    }
                } else {
                    spannableString.setSpan(new P7.m(bVar.d()), i13, iB, i15);
                }
            }
            i10 = i14;
            i13 = iB;
        }
        return spannableString;
    }

    private final float d(Layout layout, float f10, com.facebook.yoga.p pVar, int i10) {
        if (pVar != com.facebook.yoga.p.EXACTLY) {
            float lineBottom = layout.getLineBottom(i10 - 1);
            if (pVar != com.facebook.yoga.p.AT_MOST || lineBottom <= f10) {
                return lineBottom;
            }
        }
        return f10;
    }

    private final int e(Layout layout, int i10) {
        return (i10 == -1 || i10 == 0) ? layout.getLineCount() : Math.min(i10, layout.getLineCount());
    }

    private final float f(Layout layout, Spanned spanned, float f10, com.facebook.yoga.p pVar, int i10) {
        return pVar == com.facebook.yoga.p.EXACTLY ? f10 : layout.getWidth();
    }

    private final Layout g(Spannable spannable, BoringLayout.Metrics metrics, float f10, com.facebook.yoga.p pVar, boolean z10, int i10, int i11, Layout.Alignment alignment, int i12, TextUtils.TruncateAt truncateAt, int i13, TextPaint textPaint) {
        if (metrics != null && (pVar == com.facebook.yoga.p.UNDEFINED || metrics.width <= ((float) Math.floor(f10)))) {
            BoringLayout boringLayoutMake = BoringLayout.make(spannable, textPaint, pVar == com.facebook.yoga.p.EXACTLY ? (int) Math.floor(f10) : metrics.width, alignment, 1.0f, 0.0f, metrics, z10);
            AbstractC5504s.g(boringLayoutMake, "make(...)");
            return boringLayoutMake;
        }
        int iCeil = (int) Math.ceil(Layout.getDesiredWidth(spannable, textPaint));
        int i14 = c.f38363b[pVar.ordinal()];
        if (i14 == 1) {
            iCeil = (int) Math.floor(f10);
        } else if (i14 == 2) {
            iCeil = Math.min(iCeil, (int) Math.floor(f10));
        }
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, iCeil).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setBreakStrategy(i10).setHyphenationFrequency(i11);
        AbstractC5504s.g(hyphenationFrequency, "setHyphenationFrequency(...)");
        if (i13 != -1 && i13 != 0) {
            hyphenationFrequency.setEllipsize(truncateAt).setMaxLines(i13);
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 26) {
            hyphenationFrequency.setJustificationMode(i12);
        }
        if (i15 >= 28) {
            hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
        }
        StaticLayout staticLayoutBuild = hyphenationFrequency.build();
        AbstractC5504s.g(staticLayoutBuild, "build(...)");
        return staticLayoutBuild;
    }

    private final Layout h(Spannable spannable, TextPaint textPaint, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2) {
        Spannable spannable2;
        TextPaint textPaint2;
        BoringLayout.Metrics metrics;
        TextUtils.TruncateAt truncateAt;
        boolean z10;
        int i10;
        int i11;
        BoringLayout.Metrics metricsS = s(spannable, textPaint);
        q.a aVar3 = q.f38309C;
        int iG = aVar3.g(aVar2.getString(2));
        boolean z11 = aVar2.H(4) ? aVar2.getBoolean(4) : true;
        int iC = aVar3.c(aVar2.getString(5));
        boolean z12 = aVar2.H(3) ? aVar2.getBoolean(3) : false;
        int i12 = aVar2.H(0) ? aVar2.getInt(0) : -1;
        TextUtils.TruncateAt truncateAtB = aVar2.H(1) ? aVar3.b(aVar2.getString(1)) : null;
        String strO = o(aVar);
        Layout.Alignment alignmentN = n(aVar, spannable, strO);
        int iQ = q(strO);
        if (z12) {
            a(spannable, f10, com.facebook.yoga.p.EXACTLY, f11, pVar2, aVar2.H(6) ? (float) aVar2.getDouble(6) : Float.NaN, i12, z11, iG, iC, alignmentN, iQ, textPaint);
            i12 = i12;
            alignmentN = alignmentN;
            iQ = iQ;
            spannable2 = spannable;
            metrics = metricsS;
            truncateAt = truncateAtB;
            z10 = z11;
            i10 = iG;
            i11 = iC;
            textPaint2 = textPaint;
        } else {
            spannable2 = spannable;
            textPaint2 = textPaint;
            metrics = metricsS;
            truncateAt = truncateAtB;
            z10 = z11;
            i10 = iG;
            i11 = iC;
        }
        return g(spannable2, metrics, f10, pVar, z10, i10, i11, alignmentN, iQ, truncateAt, i12, textPaint2);
    }

    private final Layout i(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2, o oVar) {
        Spannable spannableM = m(context, aVar, oVar);
        return h(spannableM, aVar.H(3) ? ((P7.n[]) spannableM.getSpans(0, 0, P7.n.class))[0].a() : z(q.f38309C.a(aVar.F0(4)), context), aVar, aVar2, f10, pVar, f11, pVar2);
    }

    public static final PreparedLayout j(Context context, ReadableMapBuffer attributedString, ReadableMapBuffer paragraphAttributes, float f10, com.facebook.yoga.p widthYogaMeasureMode, float f11, com.facebook.yoga.p heightYogaMeasureMode, o oVar) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(attributedString, "attributedString");
        AbstractC5504s.h(paragraphAttributes, "paragraphAttributes");
        AbstractC5504s.h(widthYogaMeasureMode, "widthYogaMeasureMode");
        AbstractC5504s.h(heightYogaMeasureMode, "heightYogaMeasureMode");
        ReadableMapBuffer readableMapBufferF0 = attributedString.F0(2);
        int[] iArr = new int[readableMapBufferF0.getCount()];
        s sVar = f38347a;
        Layout layoutH = sVar.h(sVar.k(context, readableMapBufferF0, oVar, iArr), sVar.x(q.f38309C.a(attributedString.F0(4)), context), attributedString, paragraphAttributes, f10, widthYogaMeasureMode, f11, heightYogaMeasureMode);
        int i10 = paragraphAttributes.H(0) ? paragraphAttributes.getInt(0) : -1;
        return new PreparedLayout(layoutH, i10, sVar.r(layoutH, paragraphAttributes, f11, heightYogaMeasureMode, i10), iArr);
    }

    private final Spannable k(Context context, com.facebook.react.common.mapbuffer.a aVar, o oVar, int[] iArr) {
        if (C4914b.h()) {
            Spannable spannableC = c(context, aVar, iArr);
            if (oVar != null) {
                oVar.onPostProcessSpannable(spannableC);
            }
            return spannableC;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        b(context, aVar, spannableStringBuilder, arrayList, iArr);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((P7.p) arrayList.get((arrayList.size() - i10) - 1)).a(spannableStringBuilder, i10);
        }
        if (oVar != null) {
            oVar.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    private final Layout.Alignment n(com.facebook.react.common.mapbuffer.a aVar, Spannable spannable, String str) {
        boolean z10 = t(aVar) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        Layout.Alignment alignment = z10 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        return str == null ? alignment : AbstractC5504s.c(str, "center") ? Layout.Alignment.ALIGN_CENTER : AbstractC5504s.c(str, "right") ? z10 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : alignment;
    }

    private final String o(com.facebook.react.common.mapbuffer.a aVar) {
        if (!aVar.H(2)) {
            return null;
        }
        com.facebook.react.common.mapbuffer.a aVarF0 = aVar.F0(2);
        if (aVarF0.getCount() != 0) {
            com.facebook.react.common.mapbuffer.a aVarF02 = aVarF0.F0(0).F0(5);
            if (aVarF02.H(12)) {
                return aVarF02.getString(12);
            }
        }
        return null;
    }

    public static final int p(com.facebook.react.common.mapbuffer.a attributedString, Spannable spanned) {
        AbstractC5504s.h(attributedString, "attributedString");
        AbstractC5504s.h(spanned, "spanned");
        s sVar = f38347a;
        Layout.Alignment alignmentN = sVar.n(attributedString, spanned, sVar.o(attributedString));
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spanned, 0, spanned.length());
        int i10 = c.f38362a[alignmentN.ordinal()];
        if (i10 == 1) {
            return zIsRtl ? 5 : 3;
        }
        if (i10 == 2) {
            return zIsRtl ? 3 : 5;
        }
        if (i10 == 3) {
            return 1;
        }
        throw new Td.r();
    }

    private final int q(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return -1;
        }
        return (str == null || !AbstractC5504s.c(str, "justified")) ? 0 : 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r4.equals("auto") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r4.equals("top") == false) goto L29;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float r(android.text.Layout r3, com.facebook.react.common.mapbuffer.ReadableMapBuffer r4, float r5, com.facebook.yoga.p r6, int r7) {
        /*
            r2 = this;
            r0 = 8
            boolean r1 = r4.H(r0)
            if (r1 == 0) goto Ld
            java.lang.String r4 = r4.getString(r0)
            goto Le
        Ld:
            r4 = 0
        Le:
            r0 = 0
            if (r4 != 0) goto L12
            return r0
        L12:
            int r1 = r3.getHeight()
            int r7 = r2.e(r3, r7)
            float r3 = r2.d(r3, r5, r6, r7)
            float r5 = (float) r1
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 <= 0) goto L24
            return r0
        L24:
            int r6 = r4.hashCode()
            switch(r6) {
                case -1383228885: goto L4d;
                case -1364013995: goto L3f;
                case 115029: goto L35;
                case 3005871: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L55
        L2c:
            java.lang.String r3 = "auto"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L3e
            goto L55
        L35:
            java.lang.String r3 = "top"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L3e
            goto L55
        L3e:
            return r0
        L3f:
            java.lang.String r6 = "center"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L48
            goto L55
        L48:
            float r3 = r3 - r5
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            return r3
        L4d:
            java.lang.String r6 = "bottom"
            boolean r6 = r4.equals(r6)
            if (r6 != 0) goto L6c
        L55:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Invalid textAlignVertical: "
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ReactNative"
            z5.AbstractC7283a.I(r4, r3)
            return r0
        L6c:
            float r3 = r3 - r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.s.r(android.text.Layout, com.facebook.react.common.mapbuffer.ReadableMapBuffer, float, com.facebook.yoga.p, int):float");
    }

    private final BoringLayout.Metrics s(Spannable spannable, TextPaint textPaint) {
        return Build.VERSION.SDK_INT < 33 ? BoringLayout.isBoring(spannable, textPaint) : BoringLayout.isBoring(spannable, textPaint, TextDirectionHeuristics.FIRSTSTRONG_LTR, true, null);
    }

    public static final WritableArray u(Context context, com.facebook.react.common.mapbuffer.a attributedString, com.facebook.react.common.mapbuffer.a paragraphAttributes, float f10, float f11, o oVar) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(attributedString, "attributedString");
        AbstractC5504s.h(paragraphAttributes, "paragraphAttributes");
        s sVar = f38347a;
        com.facebook.yoga.p pVar = com.facebook.yoga.p.EXACTLY;
        Layout layoutI = sVar.i(context, attributedString, paragraphAttributes, f10, pVar, f11, pVar, oVar);
        CharSequence text = layoutI.getText();
        AbstractC5504s.g(text, "getText(...)");
        return com.facebook.react.views.text.b.a(text, layoutI, context);
    }

    public static final float[] v(PreparedLayout preparedLayout, float f10, com.facebook.yoga.p widthYogaMeasureMode, float f11, com.facebook.yoga.p heightYogaMeasureMode) {
        AbstractC5504s.h(preparedLayout, "preparedLayout");
        AbstractC5504s.h(widthYogaMeasureMode, "widthYogaMeasureMode");
        AbstractC5504s.h(heightYogaMeasureMode, "heightYogaMeasureMode");
        Layout layout = preparedLayout.getLayout();
        CharSequence text = layout.getText();
        AbstractC5504s.f(text, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text;
        int maximumNumberOfLines = preparedLayout.getMaximumNumberOfLines();
        s sVar = f38347a;
        int iE = sVar.e(layout, maximumNumberOfLines);
        float f12 = sVar.f(layout, spanned, f10, widthYogaMeasureMode, iE);
        float fD = sVar.d(layout, f11, heightYogaMeasureMode, iE);
        ArrayList arrayList = new ArrayList();
        B b10 = B.f37368a;
        arrayList.add(Float.valueOf(b10.e(f12)));
        arrayList.add(Float.valueOf(b10.e(fD)));
        a aVar = new a();
        int iY = 0;
        while (iY < spanned.length()) {
            iY = sVar.y(layout, spanned, f12, iE, iY, preparedLayout.getVerticalOffset(), aVar);
            if (aVar.d()) {
                B b11 = B.f37368a;
                arrayList.add(Float.valueOf(b11.e(aVar.c())));
                arrayList.add(Float.valueOf(b11.e(aVar.b())));
                arrayList.add(Float.valueOf(b11.e(aVar.e())));
                arrayList.add(Float.valueOf(b11.e(aVar.a())));
            }
        }
        float[] fArr = new float[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = arrayList.get(i10);
            AbstractC5504s.g(obj, "get(...)");
            fArr[i10] = ((Number) obj).floatValue();
        }
        return fArr;
    }

    public static final long w(Context context, com.facebook.react.common.mapbuffer.a attributedString, com.facebook.react.common.mapbuffer.a paragraphAttributes, float f10, com.facebook.yoga.p widthYogaMeasureMode, float f11, com.facebook.yoga.p heightYogaMeasureMode, o oVar, float[] fArr) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(attributedString, "attributedString");
        AbstractC5504s.h(paragraphAttributes, "paragraphAttributes");
        AbstractC5504s.h(widthYogaMeasureMode, "widthYogaMeasureMode");
        AbstractC5504s.h(heightYogaMeasureMode, "heightYogaMeasureMode");
        s sVar = f38347a;
        Layout layoutI = sVar.i(context, attributedString, paragraphAttributes, f10, widthYogaMeasureMode, f11, heightYogaMeasureMode, oVar);
        int iY = 0;
        int i10 = paragraphAttributes.H(0) ? paragraphAttributes.getInt(0) : -1;
        CharSequence text = layoutI.getText();
        AbstractC5504s.f(text, "null cannot be cast to non-null type android.text.Spanned");
        Spanned spanned = (Spanned) text;
        int iE = sVar.e(layoutI, i10);
        float f12 = sVar.f(layoutI, spanned, f10, widthYogaMeasureMode, iE);
        float fD = sVar.d(layoutI, f11, heightYogaMeasureMode, iE);
        if (fArr != null) {
            a aVar = new a();
            int i11 = 0;
            while (iY < spanned.length()) {
                iY = f38347a.y(layoutI, spanned, f12, iE, iY, 0.0f, aVar);
                if (aVar.d()) {
                    B b10 = B.f37368a;
                    fArr[i11] = b10.e(aVar.c());
                    fArr[i11 + 1] = b10.e(aVar.b());
                    i11 += 2;
                }
            }
        }
        B b11 = B.f37368a;
        return com.facebook.yoga.q.a(b11.e(f12), b11.e(fD));
    }

    private final TextPaint x(q qVar, Context context) {
        TextPaint textPaint = new TextPaint(1);
        B(textPaint, qVar, context);
        return textPaint;
    }

    private final int y(Layout layout, Spanned spanned, float f10, int i10, int i11, float f11, a aVar) {
        float primaryHorizontal;
        int iNextSpanTransition = spanned.nextSpanTransition(i11, spanned.length(), P7.s.class);
        P7.s[] sVarArr = (P7.s[]) spanned.getSpans(i11, iNextSpanTransition, P7.s.class);
        if (sVarArr.length == 0) {
            aVar.i(false);
            return iNextSpanTransition;
        }
        Q6.a.a(sVarArr.length == 1);
        P7.s sVar = sVarArr[0];
        int spanStart = spanned.getSpanStart(sVar);
        int lineForOffset = layout.getLineForOffset(spanStart);
        boolean z10 = layout.getEllipsisCount(lineForOffset) > 0;
        if (lineForOffset > i10 || (z10 && spanStart >= layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset))) {
            aVar.h(Float.NaN);
            aVar.g(Float.NaN);
        } else {
            float fC = sVar.c();
            float fA = sVar.a();
            boolean zIsRtlCharAt = layout.isRtlCharAt(spanStart);
            boolean z11 = layout.getParagraphDirection(lineForOffset) == -1;
            if (C4914b.e() || spanStart != spanned.length() - 1) {
                primaryHorizontal = z11 == zIsRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart);
                if (!C4914b.e() && z11 && !zIsRtlCharAt) {
                    primaryHorizontal = f10 - (layout.getLineRight(lineForOffset) - primaryHorizontal);
                }
                if (zIsRtlCharAt) {
                    primaryHorizontal -= fC;
                }
                aVar.h(layout.getLineBaseline(lineForOffset) - fA);
                aVar.g(primaryHorizontal);
            } else {
                float lineWidth = (spanned.length() <= 0 || spanned.charAt(layout.getLineEnd(lineForOffset) - 1) != '\n') ? layout.getLineWidth(lineForOffset) : layout.getLineMax(lineForOffset);
                if (z11) {
                    primaryHorizontal = f10 - lineWidth;
                    aVar.h(layout.getLineBaseline(lineForOffset) - fA);
                    aVar.g(primaryHorizontal);
                } else {
                    primaryHorizontal = layout.getLineRight(lineForOffset);
                    primaryHorizontal -= fC;
                    aVar.h(layout.getLineBaseline(lineForOffset) - fA);
                    aVar.g(primaryHorizontal);
                }
            }
        }
        aVar.h(aVar.c() + f11);
        aVar.i(true);
        aVar.j(sVar.c());
        aVar.f(sVar.a());
        return iNextSpanTransition;
    }

    private final TextPaint z(q qVar, Context context) {
        Object obj = f38349c.get();
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        TextPaint textPaint = (TextPaint) obj;
        textPaint.setTypeface(null);
        textPaint.setTextSize(12.0f);
        textPaint.setFakeBoldText(false);
        textPaint.setTextSkewX(0.0f);
        B(textPaint, qVar, context);
        return textPaint;
    }

    public final void A(int i10, Spannable sp) {
        AbstractC5504s.h(sp, "sp");
        f38350d.put(Integer.valueOf(i10), sp);
    }

    public final void l(int i10) {
        f38350d.remove(Integer.valueOf(i10));
    }

    public final Spannable m(Context context, com.facebook.react.common.mapbuffer.a attributedString, o oVar) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(attributedString, "attributedString");
        if (!attributedString.H(3)) {
            return k(context, attributedString.F0(2), oVar, null);
        }
        Object obj = f38350d.get(Integer.valueOf(attributedString.getInt(3)));
        if (obj != null) {
            return (Spannable) obj;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean t(com.facebook.react.common.mapbuffer.a attributedString) {
        AbstractC5504s.h(attributedString, "attributedString");
        if (!attributedString.H(2)) {
            return false;
        }
        com.facebook.react.common.mapbuffer.a aVarF0 = attributedString.F0(2);
        if (aVarF0.getCount() == 0) {
            return false;
        }
        com.facebook.react.common.mapbuffer.a aVarF02 = aVarF0.F0(0).F0(5);
        return aVarF02.H(23) && q.f38309C.e(aVarF02.getString(23)) == 1;
    }
}
