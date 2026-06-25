package Xf;

import Td.AbstractC2151b;
import Td.AbstractC2152c;
import Td.C2150a;
import Td.C2160k;
import Wf.C2359c;
import Wf.C2363g;
import ae.AbstractC2605b;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2364a f21926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f21927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21929d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.k implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21931b;

        a(Zd.e eVar) {
            super(3, eVar);
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC2152c abstractC2152c, Td.L l10, Zd.e eVar) {
            a aVar = Q.this.new a(eVar);
            aVar.f21931b = abstractC2152c;
            return aVar.invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f21930a;
            if (i10 == 0) {
                Td.v.b(obj);
                AbstractC2152c abstractC2152c = (AbstractC2152c) this.f21931b;
                byte bF = Q.this.f21926a.F();
                if (bF == 1) {
                    return Q.this.j(true);
                }
                if (bF == 0) {
                    return Q.this.j(false);
                }
                if (bF != 6) {
                    if (bF == 8) {
                        return Q.this.f();
                    }
                    AbstractC2364a.x(Q.this.f21926a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new C2160k();
                }
                Q q10 = Q.this;
                this.f21930a = 1;
                obj = q10.i(abstractC2152c, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return (Wf.i) obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f21933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f21934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f21935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f21936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f21937e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f21939g;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21937e = obj;
            this.f21939g |= Integer.MIN_VALUE;
            return Q.this.i(null, this);
        }
    }

    public Q(C2363g configuration, AbstractC2364a lexer) {
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(lexer, "lexer");
        this.f21926a = lexer;
        this.f21927b = configuration.q();
        this.f21928c = configuration.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Wf.i f() {
        byte bJ = this.f21926a.j();
        if (this.f21926a.F() == 4) {
            AbstractC2364a.x(this.f21926a, "Unexpected leading comma", 0, null, 6, null);
            throw new C2160k();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f21926a.e()) {
            arrayList.add(e());
            bJ = this.f21926a.j();
            if (bJ != 4) {
                AbstractC2364a abstractC2364a = this.f21926a;
                boolean z10 = bJ == 9;
                int i10 = abstractC2364a.f21965a;
                if (!z10) {
                    AbstractC2364a.x(abstractC2364a, "Expected end of the array or comma", i10, null, 4, null);
                    throw new C2160k();
                }
            }
        }
        if (bJ == 8) {
            this.f21926a.k((byte) 9);
        } else if (bJ == 4) {
            if (!this.f21928c) {
                C.h(this.f21926a, "array");
                throw new C2160k();
            }
            this.f21926a.k((byte) 9);
        }
        return new C2359c(arrayList);
    }

    private final Wf.i g() {
        return (Wf.i) AbstractC2151b.b(new C2150a(new a(null)), Td.L.f17438a);
    }

    private final Wf.i h() {
        byte bK = this.f21926a.k((byte) 6);
        if (this.f21926a.F() == 4) {
            AbstractC2364a.x(this.f21926a, "Unexpected leading comma", 0, null, 6, null);
            throw new C2160k();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f21926a.e()) {
                break;
            }
            String strQ = this.f21927b ? this.f21926a.q() : this.f21926a.o();
            this.f21926a.k((byte) 5);
            linkedHashMap.put(strQ, e());
            bK = this.f21926a.j();
            if (bK != 4) {
                if (bK != 7) {
                    AbstractC2364a.x(this.f21926a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new C2160k();
                }
            }
        }
        if (bK == 6) {
            this.f21926a.k((byte) 7);
        } else if (bK == 4) {
            if (!this.f21928c) {
                C.i(this.f21926a, null, 1, null);
                throw new C2160k();
            }
            this.f21926a.k((byte) 7);
        }
        return new Wf.C(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(Td.AbstractC2152c r20, Zd.e r21) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Xf.Q.i(Td.c, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Wf.E j(boolean z10) {
        String strQ = (this.f21927b || !z10) ? this.f21926a.q() : this.f21926a.o();
        return (z10 || !AbstractC5504s.c(strQ, "null")) ? new Wf.v(strQ, z10, null, 4, null) : Wf.z.INSTANCE;
    }

    public final Wf.i e() {
        byte bF = this.f21926a.F();
        if (bF == 1) {
            return j(true);
        }
        if (bF == 0) {
            return j(false);
        }
        if (bF == 6) {
            int i10 = this.f21929d + 1;
            this.f21929d = i10;
            this.f21929d--;
            return i10 == 200 ? g() : h();
        }
        if (bF == 8) {
            return f();
        }
        AbstractC2364a.x(this.f21926a, "Cannot read Json element because of unexpected " + AbstractC2365b.c(bF), 0, null, 6, null);
        throw new C2160k();
    }
}
