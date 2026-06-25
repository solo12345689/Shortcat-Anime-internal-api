package K;

import U0.W0;
import Ud.AbstractC2279u;
import a1.C2527U;
import a1.C2533a;
import a1.C2539g;
import a1.C2544l;
import a1.C2547o;
import a1.C2551s;
import a1.InterfaceC2517J;
import a1.InterfaceC2541i;
import android.view.KeyEvent;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1774y f9792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q.F f9793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2527U f9794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f9796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Q.I f9797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2517J f9798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j0 f9799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1760j f9800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r f9801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Function1 f9802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f9803l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ EnumC1766p f9805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ P f9806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.J f9807c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f9808a = new a();

            a() {
                super(1);
            }

            public final void a(Q.E e10) {
                e10.A();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Q.E) obj);
                return Td.L.f17438a;
            }
        }

        /* JADX INFO: renamed from: K.P$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0138b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0138b f9809a = new C0138b();

            C0138b() {
                super(1);
            }

            public final void a(Q.E e10) {
                e10.I();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Q.E) obj);
                return Td.L.f17438a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f9810a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2541i invoke(Q.E e10) {
                return new C2539g(W0.i(e10.u()) - e10.q(), 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class d extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f9811a = new d();

            d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2541i invoke(Q.E e10) {
                int iL = e10.l();
                if (iL != -1) {
                    return new C2539g(0, iL - W0.i(e10.u()));
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class e extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f9812a = new e();

            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2541i invoke(Q.E e10) {
                Integer numT = e10.t();
                if (numT == null) {
                    return null;
                }
                return new C2539g(W0.i(e10.u()) - numT.intValue(), 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class f extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f9813a = new f();

            f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2541i invoke(Q.E e10) {
                Integer numM = e10.m();
                if (numM != null) {
                    return new C2539g(0, numM.intValue() - W0.i(e10.u()));
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class g extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f9814a = new g();

            g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2541i invoke(Q.E e10) {
                Integer numI = e10.i();
                if (numI == null) {
                    return null;
                }
                return new C2539g(W0.i(e10.u()) - numI.intValue(), 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class h extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f9815a = new h();

            h() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC2541i invoke(Q.E e10) {
                Integer numF = e10.f();
                if (numF != null) {
                    return new C2539g(0, numF.intValue() - W0.i(e10.u()));
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9816a;

            static {
                int[] iArr = new int[EnumC1766p.values().length];
                try {
                    iArr[EnumC1766p.COPY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1766p.PASTE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1766p.CUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC1766p.LEFT_CHAR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC1766p.RIGHT_CHAR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC1766p.LEFT_WORD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC1766p.RIGHT_WORD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC1766p.PREV_PARAGRAPH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC1766p.NEXT_PARAGRAPH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC1766p.UP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC1766p.DOWN.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[EnumC1766p.PAGE_UP.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[EnumC1766p.PAGE_DOWN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[EnumC1766p.LINE_START.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[EnumC1766p.LINE_END.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[EnumC1766p.LINE_LEFT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[EnumC1766p.LINE_RIGHT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[EnumC1766p.HOME.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[EnumC1766p.END.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[EnumC1766p.DELETE_PREV_CHAR.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[EnumC1766p.DELETE_NEXT_CHAR.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[EnumC1766p.DELETE_PREV_WORD.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[EnumC1766p.DELETE_NEXT_WORD.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[EnumC1766p.DELETE_FROM_LINE_START.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[EnumC1766p.DELETE_TO_LINE_END.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[EnumC1766p.NEW_LINE.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[EnumC1766p.TAB.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[EnumC1766p.SELECT_ALL.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[EnumC1766p.SELECT_LEFT_CHAR.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[EnumC1766p.SELECT_RIGHT_CHAR.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[EnumC1766p.SELECT_LEFT_WORD.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[EnumC1766p.SELECT_RIGHT_WORD.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[EnumC1766p.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[EnumC1766p.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[EnumC1766p.SELECT_LINE_START.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[EnumC1766p.SELECT_LINE_END.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[EnumC1766p.SELECT_LINE_LEFT.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[EnumC1766p.SELECT_LINE_RIGHT.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[EnumC1766p.SELECT_UP.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[EnumC1766p.SELECT_DOWN.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[EnumC1766p.SELECT_PAGE_UP.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[EnumC1766p.SELECT_PAGE_DOWN.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[EnumC1766p.SELECT_HOME.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[EnumC1766p.SELECT_END.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[EnumC1766p.DESELECT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[EnumC1766p.UNDO.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[EnumC1766p.REDO.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[EnumC1766p.CHARACTER_PALETTE.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                f9816a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC1766p enumC1766p, P p10, kotlin.jvm.internal.J j10) {
            super(1);
            this.f9805a = enumC1766p;
            this.f9806b = p10;
            this.f9807c = j10;
        }

        public final void a(Q.E e10) {
            C2527U c2527uG;
            C2527U c2527uC;
            switch (i.f9816a[this.f9805a.ordinal()]) {
                case 1:
                    this.f9806b.h().o(false);
                    break;
                case 2:
                    this.f9806b.h().T();
                    break;
                case 3:
                    this.f9806b.h().s();
                    break;
                case 4:
                    e10.b(a.f9808a);
                    break;
                case 5:
                    e10.c(C0138b.f9809a);
                    break;
                case 6:
                    e10.B();
                    break;
                case 7:
                    e10.J();
                    break;
                case 8:
                    e10.G();
                    break;
                case 9:
                    e10.D();
                    break;
                case 10:
                    e10.Q();
                    break;
                case 11:
                    e10.z();
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    e10.c0();
                    break;
                case 13:
                    e10.b0();
                    break;
                case 14:
                    e10.P();
                    break;
                case 15:
                    e10.M();
                    break;
                case 16:
                    e10.N();
                    break;
                case 17:
                    e10.O();
                    break;
                case 18:
                    e10.L();
                    break;
                case 19:
                    e10.K();
                    break;
                case 20:
                    List listY = e10.Y(c.f9810a);
                    if (listY != null) {
                        this.f9806b.f(listY);
                    }
                    break;
                case 21:
                    List listY2 = e10.Y(d.f9811a);
                    if (listY2 != null) {
                        this.f9806b.f(listY2);
                    }
                    break;
                case 22:
                    List listY3 = e10.Y(e.f9812a);
                    if (listY3 != null) {
                        this.f9806b.f(listY3);
                    }
                    break;
                case 23:
                    List listY4 = e10.Y(f.f9813a);
                    if (listY4 != null) {
                        this.f9806b.f(listY4);
                    }
                    break;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    List listY5 = e10.Y(g.f9814a);
                    if (listY5 != null) {
                        this.f9806b.f(listY5);
                    }
                    break;
                case 25:
                    List listY6 = e10.Y(h.f9815a);
                    if (listY6 != null) {
                        this.f9806b.f(listY6);
                    }
                    break;
                case 26:
                    if (!this.f9806b.i()) {
                        this.f9806b.e(new C2533a("\n", 1));
                    } else {
                        this.f9806b.j().l().invoke(C2551s.j(this.f9806b.f9803l));
                    }
                    break;
                case 27:
                    if (!this.f9806b.i()) {
                        this.f9806b.e(new C2533a("\t", 1));
                    } else {
                        this.f9807c.f52255a = false;
                    }
                    break;
                case 28:
                    e10.R();
                    break;
                case 29:
                    ((Q.E) e10.A()).S();
                    break;
                case 30:
                    ((Q.E) e10.I()).S();
                    break;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    ((Q.E) e10.B()).S();
                    break;
                case 32:
                    ((Q.E) e10.J()).S();
                    break;
                case 33:
                    ((Q.E) e10.G()).S();
                    break;
                case 34:
                    ((Q.E) e10.D()).S();
                    break;
                case 35:
                    ((Q.E) e10.P()).S();
                    break;
                case 36:
                    ((Q.E) e10.M()).S();
                    break;
                case 37:
                    ((Q.E) e10.N()).S();
                    break;
                case 38:
                    ((Q.E) e10.O()).S();
                    break;
                case 39:
                    ((Q.E) e10.Q()).S();
                    break;
                case 40:
                    ((Q.E) e10.z()).S();
                    break;
                case 41:
                    e10.c0().S();
                    break;
                case 42:
                    e10.b0().S();
                    break;
                case 43:
                    ((Q.E) e10.L()).S();
                    break;
                case 44:
                    ((Q.E) e10.K()).S();
                    break;
                case 45:
                    e10.d();
                    break;
                case 46:
                    j0 j0VarK = this.f9806b.k();
                    if (j0VarK != null) {
                        j0VarK.b(e10.Z());
                    }
                    j0 j0VarK2 = this.f9806b.k();
                    if (j0VarK2 != null && (c2527uG = j0VarK2.g()) != null) {
                        this.f9806b.f9802k.invoke(c2527uG);
                        break;
                    }
                    break;
                case 47:
                    j0 j0VarK3 = this.f9806b.k();
                    if (j0VarK3 != null && (c2527uC = j0VarK3.c()) != null) {
                        this.f9806b.f9802k.invoke(c2527uC);
                        break;
                    }
                    break;
                case 48:
                    AbstractC1767q.b();
                    break;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Q.E) obj);
            return Td.L.f17438a;
        }
    }

    public /* synthetic */ P(C1774y c1774y, Q.F f10, C2527U c2527u, boolean z10, boolean z11, Q.I i10, InterfaceC2517J interfaceC2517J, j0 j0Var, C1760j c1760j, r rVar, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1774y, f10, c2527u, z10, z11, i10, interfaceC2517J, j0Var, c1760j, rVar, function1, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(InterfaceC2541i interfaceC2541i) {
        f(AbstractC2279u.e(interfaceC2541i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(List list) {
        C2544l c2544lN = this.f9792a.n();
        List listD1 = AbstractC2279u.d1(list);
        listD1.add(0, new C2547o());
        this.f9802k.invoke(c2544lN.b(listD1));
    }

    private final void g(Function1 function1) {
        Q.E e10 = new Q.E(this.f9794c, this.f9798g, this.f9792a.j(), this.f9797f);
        function1.invoke(e10);
        if (W0.g(e10.u(), this.f9794c.k()) && AbstractC5504s.c(e10.e(), this.f9794c.i())) {
            return;
        }
        this.f9802k.invoke(e10.Z());
    }

    private final C2533a m(KeyEvent keyEvent) {
        Integer numA;
        if (S.a(keyEvent) && (numA = this.f9800i.a(keyEvent)) != null) {
            return new C2533a(E.a(new StringBuilder(), numA.intValue()).toString(), 1);
        }
        return null;
    }

    public final Q.F h() {
        return this.f9793b;
    }

    public final boolean i() {
        return this.f9796e;
    }

    public final C1774y j() {
        return this.f9792a;
    }

    public final j0 k() {
        return this.f9799h;
    }

    public final boolean l(KeyEvent keyEvent) {
        EnumC1766p enumC1766pA;
        C2533a c2533aM = m(keyEvent);
        if (c2533aM != null) {
            if (!this.f9795d) {
                return false;
            }
            e(c2533aM);
            this.f9797f.b();
            return true;
        }
        if (!C0.c.e(C0.d.b(keyEvent), C0.c.f2484a.a()) || (enumC1766pA = this.f9801j.a(keyEvent)) == null || (enumC1766pA.b() && !this.f9795d)) {
            return false;
        }
        kotlin.jvm.internal.J j10 = new kotlin.jvm.internal.J();
        j10.f52255a = true;
        g(new b(enumC1766pA, this, j10));
        j0 j0Var = this.f9799h;
        if (j0Var != null) {
            j0Var.a();
        }
        return j10.f52255a;
    }

    private P(C1774y c1774y, Q.F f10, C2527U c2527u, boolean z10, boolean z11, Q.I i10, InterfaceC2517J interfaceC2517J, j0 j0Var, C1760j c1760j, r rVar, Function1 function1, int i11) {
        this.f9792a = c1774y;
        this.f9793b = f10;
        this.f9794c = c2527u;
        this.f9795d = z10;
        this.f9796e = z11;
        this.f9797f = i10;
        this.f9798g = interfaceC2517J;
        this.f9799h = j0Var;
        this.f9800i = c1760j;
        this.f9801j = rVar;
        this.f9802k = function1;
        this.f9803l = i11;
    }

    public /* synthetic */ P(C1774y c1774y, Q.F f10, C2527U c2527u, boolean z10, boolean z11, Q.I i10, InterfaceC2517J interfaceC2517J, j0 j0Var, C1760j c1760j, r rVar, Function1 function1, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(c1774y, f10, (i12 & 4) != 0 ? new C2527U((String) null, 0L, (W0) null, 7, (DefaultConstructorMarker) null) : c2527u, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? false : z11, i10, (i12 & 64) != 0 ? InterfaceC2517J.f23518a.a() : interfaceC2517J, (i12 & 128) != 0 ? null : j0Var, c1760j, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? AbstractC1769t.a() : rVar, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? a.f9804a : function1, i11, null);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f9804a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2527U) obj);
            return Td.L.f17438a;
        }

        public final void a(C2527U c2527u) {
        }
    }
}
