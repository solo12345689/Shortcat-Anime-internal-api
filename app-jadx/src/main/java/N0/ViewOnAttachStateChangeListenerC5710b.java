package n0;

import R0.B;
import R0.C2092a;
import R0.C2099h;
import R0.s;
import R0.u;
import R0.w;
import R0.x;
import Td.C2160k;
import Td.L;
import Td.r;
import U0.C2197e;
import U0.S0;
import U0.T0;
import Ud.AbstractC2279u;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AbstractC2718m1;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.C2715l1;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.lifecycle.DefaultLifecycleObserver;
import be.AbstractC3048a;
import i1.C5029v;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import k1.AbstractC5436a;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n0.ViewOnAttachStateChangeListenerC5710b;
import r0.C6226h;
import t.AbstractC6565o;
import t.AbstractC6566p;
import t.C6540F;
import t.C6550P;

/* JADX INFO: renamed from: n0.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC5710b implements o, DefaultLifecycleObserver, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: p */
    public static final a f53791p = new a(null);

    /* JADX INFO: renamed from: q */
    public static final int f53792q = 8;

    /* JADX INFO: renamed from: a */
    private final AndroidComposeView f53793a;

    /* JADX INFO: renamed from: b */
    private InterfaceC5082a f53794b;

    /* JADX INFO: renamed from: c */
    private N0.d f53795c;

    /* JADX INFO: renamed from: k */
    private long f53803k;

    /* JADX INFO: renamed from: m */
    private C2715l1 f53805m;

    /* JADX INFO: renamed from: n */
    private boolean f53806n;

    /* JADX INFO: renamed from: d */
    private final List f53796d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private long f53797e = 100;

    /* JADX INFO: renamed from: f */
    private EnumC0838b f53798f = EnumC0838b.f53808a;

    /* JADX INFO: renamed from: g */
    private boolean f53799g = true;

    /* JADX INFO: renamed from: h */
    private final If.g f53800h = If.j.b(1, null, null, 6, null);

    /* JADX INFO: renamed from: i */
    private final Handler f53801i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j */
    private AbstractC6565o f53802j = AbstractC6566p.b();

    /* JADX INFO: renamed from: l */
    private C6540F f53804l = AbstractC6566p.c();

    /* JADX INFO: renamed from: o */
    private final Runnable f53807o = new Runnable() { // from class: n0.a
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnAttachStateChangeListenerC5710b.j(this.f53790a);
        }
    };

    /* JADX INFO: renamed from: n0.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: n0.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class EnumC0838b extends Enum {

        /* JADX INFO: renamed from: a */
        public static final EnumC0838b f53808a = new EnumC0838b("SHOW_ORIGINAL", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC0838b f53809b = new EnumC0838b("SHOW_TRANSLATED", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ EnumC0838b[] f53810c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ EnumEntries f53811d;

        static {
            EnumC0838b[] enumC0838bArrA = a();
            f53810c = enumC0838bArrA;
            f53811d = AbstractC3048a.a(enumC0838bArrA);
        }

        private EnumC0838b(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ EnumC0838b[] a() {
            return new EnumC0838b[]{f53808a, f53809b};
        }

        public static EnumC0838b valueOf(String str) {
            return (EnumC0838b) Enum.valueOf(EnumC0838b.class, str);
        }

        public static EnumC0838b[] values() {
            return (EnumC0838b[]) f53810c.clone();
        }
    }

    /* JADX INFO: renamed from: n0.b$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c {

        /* JADX INFO: renamed from: a */
        public static final c f53812a = new c();

        private c() {
        }

        private final void b(ViewOnAttachStateChangeListenerC5710b viewOnAttachStateChangeListenerC5710b, LongSparseArray longSparseArray) {
            TranslationResponseValue value;
            CharSequence text;
            u uVar;
            s sVarB;
            C2092a c2092a;
            Function1 function1;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                long jKeyAt = longSparseArray.keyAt(i10);
                ViewTranslationResponse viewTranslationResponseA = i.a(longSparseArray.get(jKeyAt));
                if (viewTranslationResponseA != null && (value = viewTranslationResponseA.getValue("android:text")) != null && (text = value.getText()) != null && (uVar = (u) viewOnAttachStateChangeListenerC5710b.l().c((int) jKeyAt)) != null && (sVarB = uVar.b()) != null && (c2092a = (C2092a) R0.m.a(sVarB.y(), R0.l.f14981a.A())) != null && (function1 = (Function1) c2092a.a()) != null) {
                }
            }
        }

        public static final void e(ViewOnAttachStateChangeListenerC5710b viewOnAttachStateChangeListenerC5710b, LongSparseArray longSparseArray) {
            f53812a.b(viewOnAttachStateChangeListenerC5710b, longSparseArray);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(n0.ViewOnAttachStateChangeListenerC5710b r15, long[] r16, int[] r17, java.util.function.Consumer r18) {
            /*
                r14 = this;
                r0 = r16
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L72
                r3 = r0[r2]
                t.o r5 = r15.l()
                int r3 = (int) r3
                java.lang.Object r3 = r5.c(r3)
                R0.u r3 = (R0.u) r3
                if (r3 == 0) goto L6d
                R0.s r3 = r3.b()
                if (r3 != 0) goto L1c
                goto L6d
            L1c:
                n0.AbstractC5712d.a()
                androidx.compose.ui.platform.AndroidComposeView r4 = r15.m()
                android.view.autofill.AutofillId r4 = n0.AbstractC5713e.a(r4)
                int r5 = r3.q()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r4 = n0.AbstractC5711c.a(r4, r5)
                androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.y()
                R0.x r5 = R0.x.f15043a
                R0.B r5 = r5.J()
                java.lang.Object r3 = R0.m.a(r3, r5)
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L6d
                r12 = 62
                r13 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r3 = k1.AbstractC5436a.e(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r3 == 0) goto L6d
                U0.e r5 = new U0.e
                r6 = 0
                r7 = 2
                r5.<init>(r3, r6, r7, r6)
                java.lang.String r3 = "android:text"
                android.view.translation.TranslationRequestValue r5 = n0.AbstractC5714f.a(r5)
                n0.g.a(r4, r3, r5)
                android.view.translation.ViewTranslationRequest r3 = n0.h.a(r4)
                r4 = r18
                r4.accept(r3)
                goto L6f
            L6d:
                r4 = r18
            L6f:
                int r2 = r2 + 1
                goto L4
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.ViewOnAttachStateChangeListenerC5710b.c.c(n0.b, long[], int[], java.util.function.Consumer):void");
        }

        public final void d(final ViewOnAttachStateChangeListenerC5710b viewOnAttachStateChangeListenerC5710b, final LongSparseArray longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (AbstractC5504s.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(viewOnAttachStateChangeListenerC5710b, longSparseArray);
            } else {
                viewOnAttachStateChangeListenerC5710b.m().post(new Runnable() { // from class: n0.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewOnAttachStateChangeListenerC5710b.c.e(viewOnAttachStateChangeListenerC5710b, longSparseArray);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: n0.b$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f53813a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.f53827a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.f53828b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53813a = iArr;
        }
    }

    /* JADX INFO: renamed from: n0.b$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f53814a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f53815b;

        /* JADX INFO: renamed from: d */
        int f53817d;

        e(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f53815b = obj;
            this.f53817d |= Integer.MIN_VALUE;
            return ViewOnAttachStateChangeListenerC5710b.this.d(this);
        }
    }

    /* JADX INFO: renamed from: n0.b$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C2715l1 f53818a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewOnAttachStateChangeListenerC5710b f53819b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C2715l1 c2715l1, ViewOnAttachStateChangeListenerC5710b viewOnAttachStateChangeListenerC5710b) {
            super(2);
            this.f53818a = c2715l1;
            this.f53819b = viewOnAttachStateChangeListenerC5710b;
        }

        public final void a(int i10, s sVar) {
            if (this.f53818a.a().a(sVar.q())) {
                return;
            }
            this.f53819b.F(i10, sVar);
            this.f53819b.q();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), (s) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: n0.b$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function2 {
        g() {
            super(2);
        }

        public final void a(int i10, s sVar) {
            ViewOnAttachStateChangeListenerC5710b.this.F(i10, sVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), (s) obj2);
            return L.f17438a;
        }
    }

    public ViewOnAttachStateChangeListenerC5710b(AndroidComposeView androidComposeView, InterfaceC5082a interfaceC5082a) {
        this.f53793a = androidComposeView;
        this.f53794b = interfaceC5082a;
        this.f53805m = new C2715l1(androidComposeView.getSemanticsOwner().d(), AbstractC6566p.b());
    }

    private final void A() {
        C6540F c6540f = this.f53804l;
        int[] iArr = c6540f.f60106b;
        long[] jArr = c6540f.f60105a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = iArr[(i10 << 3) + i12];
                        if (!l().b(i13)) {
                            f(i13);
                            q();
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void B(int i10, String str) {
        N0.d dVar;
        if (Build.VERSION.SDK_INT >= 29 && (dVar = this.f53795c) != null) {
            AutofillId autofillIdB = dVar.b(i10);
            if (autofillIdB != null) {
                dVar.f(autofillIdB, str);
            } else {
                H0.a.c("Invalid content capture ID");
                throw new C2160k();
            }
        }
    }

    private final void C() {
        C2092a c2092a;
        Function1 function1;
        AbstractC6565o abstractC6565oL = l();
        Object[] objArr = abstractC6565oL.f60107c;
        long[] jArr = abstractC6565oL.f60105a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        SemanticsConfiguration semanticsConfigurationY = ((u) objArr[(i10 << 3) + i12]).b().y();
                        if (AbstractC5504s.c(R0.m.a(semanticsConfigurationY, x.f15043a.v()), Boolean.FALSE) && (c2092a = (C2092a) R0.m.a(semanticsConfigurationY, R0.l.f14981a.B())) != null && (function1 = (Function1) c2092a.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final N0.f D(s sVar, int i10) {
        N0.b bVarA;
        AutofillId autofillIdA;
        String strE;
        N0.d dVar = this.f53795c;
        if (dVar == null || Build.VERSION.SDK_INT < 29 || (bVarA = N0.e.a(this.f53793a)) == null) {
            return null;
        }
        if (sVar.t() != null) {
            autofillIdA = dVar.b(r4.q());
            if (autofillIdA == null) {
                return null;
            }
        } else {
            autofillIdA = bVarA.a();
        }
        N0.f fVarC = dVar.c(autofillIdA, sVar.q());
        if (fVarC == null) {
            return null;
        }
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        x xVar = x.f15043a;
        if (semanticsConfigurationY.e(xVar.B())) {
            return null;
        }
        Bundle bundleA = fVarC.a();
        if (bundleA != null) {
            bundleA.putLong("android.view.contentcapture.EventTimestamp", this.f53803k);
            bundleA.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i10);
        }
        String str = (String) R0.m.a(semanticsConfigurationY, xVar.I());
        if (str != null) {
            fVarC.e(sVar.q(), null, null, str);
        }
        if (((Boolean) R0.m.a(semanticsConfigurationY, xVar.w())) != null) {
            fVarC.b("android.widget.ViewGroup");
        }
        List list = (List) R0.m.a(semanticsConfigurationY, xVar.J());
        if (list != null) {
            fVarC.b("android.widget.TextView");
            fVarC.f(AbstractC5436a.e(list, "\n", null, null, 0, null, null, 62, null));
        }
        C2197e c2197e = (C2197e) R0.m.a(semanticsConfigurationY, xVar.g());
        if (c2197e != null) {
            fVarC.b("android.widget.EditText");
            fVarC.f(c2197e);
        }
        List list2 = (List) R0.m.a(semanticsConfigurationY, xVar.d());
        if (list2 != null) {
            fVarC.c(AbstractC5436a.e(list2, "\n", null, null, 0, null, null, 62, null));
        }
        C2099h c2099h = (C2099h) R0.m.a(semanticsConfigurationY, xVar.D());
        if (c2099h != null && (strE = AbstractC2718m1.e(c2099h.p())) != null) {
            fVarC.b(strE);
        }
        T0 t0C = AbstractC2718m1.c(semanticsConfigurationY);
        if (t0C != null) {
            S0 s0L = t0C.l();
            fVarC.g(C5029v.h(s0L.i().n()) * s0L.b().getDensity() * s0L.b().j1(), 0, 0, 0);
        }
        C6226h c6226hJ = sVar.j();
        fVarC.d((int) c6226hJ.i(), (int) c6226hJ.l(), 0, 0, (int) (c6226hJ.j() - c6226hJ.i()), (int) (c6226hJ.e() - c6226hJ.l()));
        return fVarC;
    }

    public final void F(int i10, s sVar) {
        if (o()) {
            I(sVar);
            e(sVar.q(), D(sVar, i10));
            k(sVar, new g());
        }
    }

    private final void G(s sVar) {
        if (o()) {
            f(sVar.q());
            List listV = sVar.v();
            int size = listV.size();
            for (int i10 = 0; i10 < size; i10++) {
                G((s) listV.get(i10));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void H() {
        /*
            r16 = this;
            r0 = r16
            t.F r1 = r0.f53804l
            r1.h()
            t.o r1 = r0.l()
            int[] r2 = r1.f60106b
            java.lang.Object[] r3 = r1.f60107c
            long[] r1 = r1.f60105a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L31:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            R0.u r12 = (R0.u) r12
            t.F r14 = r0.f53804l
            androidx.compose.ui.platform.l1 r15 = new androidx.compose.ui.platform.l1
            R0.s r12 = r12.b()
            t.o r5 = r0.l()
            r15.<init>(r12, r5)
            r14.s(r13, r15)
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            androidx.compose.ui.platform.l1 r1 = new androidx.compose.ui.platform.l1
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f53793a
            R0.v r2 = r2.getSemanticsOwner()
            R0.s r2 = r2.d()
            t.o r3 = r0.l()
            r1.<init>(r2, r3)
            r0.f53805m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.ViewOnAttachStateChangeListenerC5710b.H():void");
    }

    private final void I(s sVar) {
        C2092a c2092a;
        Function1 function1;
        Function1 function12;
        SemanticsConfiguration semanticsConfigurationY = sVar.y();
        Boolean bool = (Boolean) R0.m.a(semanticsConfigurationY, x.f15043a.v());
        if (this.f53798f == EnumC0838b.f53808a && AbstractC5504s.c(bool, Boolean.TRUE)) {
            C2092a c2092a2 = (C2092a) R0.m.a(semanticsConfigurationY, R0.l.f14981a.B());
            if (c2092a2 == null || (function12 = (Function1) c2092a2.a()) == null) {
                return;
            }
            return;
        }
        if (this.f53798f != EnumC0838b.f53809b || !AbstractC5504s.c(bool, Boolean.FALSE) || (c2092a = (C2092a) R0.m.a(semanticsConfigurationY, R0.l.f14981a.B())) == null || (function1 = (Function1) c2092a.a()) == null) {
            return;
        }
    }

    private final void e(int i10, N0.f fVar) {
        if (fVar == null) {
            return;
        }
        this.f53796d.add(new m(i10, this.f53803k, n.f53827a, fVar));
    }

    private final void f(int i10) {
        this.f53796d.add(new m(i10, this.f53803k, n.f53828b, null));
    }

    private final void h(AbstractC6565o abstractC6565o) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j10;
        char c10;
        long j11;
        int i10;
        s sVar;
        int i11;
        s sVar2;
        long j12;
        int i12;
        long[] jArr3;
        AbstractC6565o abstractC6565o2 = abstractC6565o;
        int[] iArr3 = abstractC6565o2.f60106b;
        long[] jArr4 = abstractC6565o2.f60105a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr4[i13];
            char c11 = 7;
            long j14 = -9187201950435737472L;
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j13 & 255) < 128) {
                        int i17 = iArr3[(i13 << 3) + i16];
                        c10 = c11;
                        C2715l1 c2715l1 = (C2715l1) this.f53804l.c(i17);
                        u uVar = (u) abstractC6565o2.c(i17);
                        s sVarB = uVar != null ? uVar.b() : null;
                        if (sVarB == null) {
                            H0.a.c("no value for specified key");
                            throw new C2160k();
                        }
                        if (c2715l1 == null) {
                            C6550P c6550pT = sVarB.y().t();
                            j11 = j14;
                            Object[] objArr = c6550pT.f60044b;
                            long[] jArr5 = c6550pT.f60043a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i18 = 0;
                                int i19 = i14;
                                while (true) {
                                    long j15 = jArr5[i18];
                                    iArr2 = iArr3;
                                    if ((((~j15) << c10) & j15 & j11) != j11) {
                                        int i20 = 8 - ((~(i18 - length2)) >>> 31);
                                        int i21 = 0;
                                        while (i21 < i20) {
                                            if ((j15 & 255) < 128) {
                                                i12 = i21;
                                                B b10 = (B) objArr[(i18 << 3) + i21];
                                                x xVar = x.f15043a;
                                                jArr3 = jArr4;
                                                if (AbstractC5504s.c(b10, xVar.J())) {
                                                    List list = (List) R0.m.a(sVarB.y(), xVar.J());
                                                    B(sVarB.q(), String.valueOf(list != null ? (C2197e) AbstractC2279u.o0(list) : null));
                                                }
                                            } else {
                                                i12 = i21;
                                                jArr3 = jArr4;
                                            }
                                            j15 >>= i19;
                                            i21 = i12 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i20 != i19) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i18 == length2) {
                                        break;
                                    }
                                    i18++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i19 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j11 = j14;
                            C6550P c6550pT2 = sVarB.y().t();
                            Object[] objArr2 = c6550pT2.f60044b;
                            long[] jArr6 = c6550pT2.f60043a;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i22 = 0;
                                while (true) {
                                    long j16 = jArr6[i22];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j16) << c10) & j16 & j11) != j11) {
                                        int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                        int i24 = 0;
                                        while (i24 < i23) {
                                            if ((j16 & 255) < 128) {
                                                i11 = i24;
                                                B b11 = (B) objArr3[(i22 << 3) + i24];
                                                x xVar2 = x.f15043a;
                                                sVar2 = sVarB;
                                                if (AbstractC5504s.c(b11, xVar2.J())) {
                                                    List list2 = (List) R0.m.a(c2715l1.b(), xVar2.J());
                                                    C2197e c2197e = list2 != null ? (C2197e) AbstractC2279u.o0(list2) : null;
                                                    j12 = j13;
                                                    List list3 = (List) R0.m.a(sVar2.y(), xVar2.J());
                                                    C2197e c2197e2 = list3 != null ? (C2197e) AbstractC2279u.o0(list3) : null;
                                                    if (!AbstractC5504s.c(c2197e, c2197e2)) {
                                                        B(sVar2.q(), String.valueOf(c2197e2));
                                                    }
                                                }
                                                j16 >>= 8;
                                                i24 = i11 + 1;
                                                sVarB = sVar2;
                                                j13 = j12;
                                            } else {
                                                i11 = i24;
                                                sVar2 = sVarB;
                                            }
                                            j12 = j13;
                                            j16 >>= 8;
                                            i24 = i11 + 1;
                                            sVarB = sVar2;
                                            j13 = j12;
                                        }
                                        sVar = sVarB;
                                        j10 = j13;
                                        if (i23 != 8) {
                                            break;
                                        }
                                    } else {
                                        sVar = sVarB;
                                        j10 = j13;
                                    }
                                    if (i22 == length3) {
                                        break;
                                    }
                                    i22++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    sVarB = sVar;
                                    j13 = j10;
                                }
                            }
                            i10 = 8;
                        }
                        j10 = j13;
                        i10 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j10 = j13;
                        c10 = c11;
                        j11 = j14;
                        i10 = i14;
                    }
                    j13 = j10 >> i10;
                    i16++;
                    abstractC6565o2 = abstractC6565o;
                    i14 = i10;
                    c11 = c10;
                    j14 = j11;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i15 != i14) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            abstractC6565o2 = abstractC6565o;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void i() {
        C2092a c2092a;
        InterfaceC5082a interfaceC5082a;
        AbstractC6565o abstractC6565oL = l();
        Object[] objArr = abstractC6565oL.f60107c;
        long[] jArr = abstractC6565oL.f60105a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        SemanticsConfiguration semanticsConfigurationY = ((u) objArr[(i10 << 3) + i12]).b().y();
                        if (R0.m.a(semanticsConfigurationY, x.f15043a.v()) != null && (c2092a = (C2092a) R0.m.a(semanticsConfigurationY, R0.l.f14981a.a())) != null && (interfaceC5082a = (InterfaceC5082a) c2092a.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0045, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(n0.ViewOnAttachStateChangeListenerC5710b r4) {
        /*
            boolean r0 = r4.o()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "ContentCapture:changeChecker"
            android.os.Trace.beginSection(r0)
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.f53793a     // Catch: java.lang.Throwable -> L45
            r1 = 1
            r2 = 0
            r3 = 0
            K0.p0.j(r0, r3, r1, r2)     // Catch: java.lang.Throwable -> L45
            r4.A()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "ContentCapture:sendAppearEvents"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L45
            androidx.compose.ui.platform.AndroidComposeView r0 = r4.f53793a     // Catch: java.lang.Throwable -> L40
            R0.v r0 = r0.getSemanticsOwner()     // Catch: java.lang.Throwable -> L40
            R0.s r0 = r0.d()     // Catch: java.lang.Throwable -> L40
            androidx.compose.ui.platform.l1 r1 = r4.f53805m     // Catch: java.lang.Throwable -> L40
            r4.z(r0, r1)     // Catch: java.lang.Throwable -> L40
            Td.L r0 = Td.L.f17438a     // Catch: java.lang.Throwable -> L40
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L45
            t.o r0 = r4.l()     // Catch: java.lang.Throwable -> L45
            r4.h(r0)     // Catch: java.lang.Throwable -> L45
            r4.H()     // Catch: java.lang.Throwable -> L45
            r4.f53806n = r3     // Catch: java.lang.Throwable -> L45
            android.os.Trace.endSection()
            return
        L40:
            r4 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L45
            throw r4     // Catch: java.lang.Throwable -> L45
        L45:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.ViewOnAttachStateChangeListenerC5710b.j(n0.b):void");
    }

    private final void k(s sVar, Function2 function2) {
        List listV = sVar.v();
        int size = listV.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = listV.get(i11);
            if (l().b(((s) obj).q())) {
                function2.invoke(Integer.valueOf(i10), obj);
                i10++;
            }
        }
    }

    private final void n() {
        C2092a c2092a;
        Function1 function1;
        AbstractC6565o abstractC6565oL = l();
        Object[] objArr = abstractC6565oL.f60107c;
        long[] jArr = abstractC6565oL.f60105a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        SemanticsConfiguration semanticsConfigurationY = ((u) objArr[(i10 << 3) + i12]).b().y();
                        if (AbstractC5504s.c(R0.m.a(semanticsConfigurationY, x.f15043a.v()), Boolean.TRUE) && (c2092a = (C2092a) R0.m.a(semanticsConfigurationY, R0.l.f14981a.B())) != null && (function1 = (Function1) c2092a.a()) != null) {
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void p() {
        N0.d dVar = this.f53795c;
        if (dVar == null || Build.VERSION.SDK_INT < 29 || this.f53796d.isEmpty()) {
            return;
        }
        List list = this.f53796d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) list.get(i10);
            int i11 = d.f53813a[mVar.c().ordinal()];
            if (i11 == 1) {
                N0.f fVarB = mVar.b();
                if (fVarB != null) {
                    dVar.d(fVarB.h());
                }
            } else {
                if (i11 != 2) {
                    throw new r();
                }
                AutofillId autofillIdB = dVar.b(mVar.a());
                if (autofillIdB != null) {
                    dVar.e(autofillIdB);
                }
            }
        }
        dVar.a();
        this.f53796d.clear();
    }

    public final void q() {
        this.f53800h.d(L.f17438a);
    }

    private final void z(s sVar, C2715l1 c2715l1) {
        k(sVar, new f(c2715l1, this));
        List listV = sVar.v();
        int size = listV.size();
        for (int i10 = 0; i10 < size; i10++) {
            s sVar2 = (s) listV.get(i10);
            if (l().b(sVar2.q()) && this.f53804l.b(sVar2.q())) {
                Object objC = this.f53804l.c(sVar2.q());
                if (objC == null) {
                    H0.a.c("node not present in pruned tree before this change");
                    throw new C2160k();
                }
                z(sVar2, (C2715l1) objC);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0083, code lost:
    
        if (Gf.Z.a(r5, r0) == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0083 -> B:48:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(Zd.e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof n0.ViewOnAttachStateChangeListenerC5710b.e
            if (r0 == 0) goto L13
            r0 = r9
            n0.b$e r0 = (n0.ViewOnAttachStateChangeListenerC5710b.e) r0
            int r1 = r0.f53817d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53817d = r1
            goto L18
        L13:
            n0.b$e r0 = new n0.b$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53815b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f53817d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.f53814a
            If.i r2 = (If.i) r2
            Td.v.b(r9)
        L2f:
            r9 = r2
            goto L4a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r2 = r0.f53814a
            If.i r2 = (If.i) r2
            Td.v.b(r9)
            goto L58
        L41:
            Td.v.b(r9)
            If.g r9 = r8.f53800h
            If.i r9 = r9.iterator()
        L4a:
            r0.f53814a = r9
            r0.f53817d = r4
            java.lang.Object r2 = r9.a(r0)
            if (r2 != r1) goto L55
            goto L85
        L55:
            r7 = r2
            r2 = r9
            r9 = r7
        L58:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r2.next()
            boolean r9 = r8.o()
            if (r9 == 0) goto L6c
            r8.p()
        L6c:
            boolean r9 = r8.f53806n
            if (r9 != 0) goto L79
            r8.f53806n = r4
            android.os.Handler r9 = r8.f53801i
            java.lang.Runnable r5 = r8.f53807o
            r9.post(r5)
        L79:
            long r5 = r8.f53797e
            r0.f53814a = r2
            r0.f53817d = r3
            java.lang.Object r9 = Gf.Z.a(r5, r0)
            if (r9 != r1) goto L2f
        L85:
            return r1
        L86:
            Td.L r9 = Td.L.f17438a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.ViewOnAttachStateChangeListenerC5710b.d(Zd.e):java.lang.Object");
    }

    public final AbstractC6565o l() {
        if (this.f53799g) {
            this.f53799g = false;
            this.f53802j = w.a(this.f53793a.getSemanticsOwner(), -1);
            this.f53803k = System.currentTimeMillis();
        }
        return this.f53802j;
    }

    public final AndroidComposeView m() {
        return this.f53793a;
    }

    public final boolean o() {
        return o.f53831i0.a() && this.f53795c != null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(androidx.lifecycle.r rVar) {
        this.f53795c = (N0.d) this.f53794b.invoke();
        F(-1, this.f53793a.getSemanticsOwner().d());
        p();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(androidx.lifecycle.r rVar) {
        G(this.f53793a.getSemanticsOwner().d());
        p();
        this.f53795c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f53801i.removeCallbacks(this.f53807o);
        this.f53795c = null;
    }

    public final void r() {
        this.f53798f = EnumC0838b.f53808a;
        i();
    }

    public final void s(long[] jArr, int[] iArr, Consumer consumer) {
        c.f53812a.c(this, jArr, iArr, consumer);
    }

    public final void t() {
        this.f53798f = EnumC0838b.f53808a;
        n();
    }

    public final void u() {
        this.f53799g = true;
        if (o()) {
            q();
        }
    }

    public final void v() {
        this.f53799g = true;
        if (!o() || this.f53806n) {
            return;
        }
        this.f53806n = true;
        this.f53801i.post(this.f53807o);
    }

    public final void x() {
        this.f53798f = EnumC0838b.f53809b;
        C();
    }

    public final void y(ViewOnAttachStateChangeListenerC5710b viewOnAttachStateChangeListenerC5710b, LongSparseArray longSparseArray) {
        c.f53812a.d(viewOnAttachStateChangeListenerC5710b, longSparseArray);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
