package z;

import Gf.O;
import Gf.P;
import Td.L;
import Y.C0;
import Y.b2;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import x.C6994N;
import x.EnumC6992L;

/* JADX INFO: renamed from: z.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7267i implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f65345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f65346b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6994N f65347c = new C6994N();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0 f65348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0 f65349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0 f65350f;

    /* JADX INFO: renamed from: z.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f65351a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC6992L f65353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f65354d;

        /* JADX INFO: renamed from: z.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0991a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f65355a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f65356b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C7267i f65357c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function2 f65358d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0991a(C7267i c7267i, Function2 function2, Zd.e eVar) {
                super(2, eVar);
                this.f65357c = c7267i;
                this.f65358d = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(u uVar, Zd.e eVar) {
                return ((C0991a) create(uVar, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                C0991a c0991a = new C0991a(this.f65357c, this.f65358d, eVar);
                c0991a.f65356b = obj;
                return c0991a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f65355a;
                try {
                    if (i10 == 0) {
                        Td.v.b(obj);
                        u uVar = (u) this.f65356b;
                        this.f65357c.f65348d.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        Function2 function2 = this.f65358d;
                        this.f65355a = 1;
                        if (function2.invoke(uVar, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Td.v.b(obj);
                    }
                    this.f65357c.f65348d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    return L.f17438a;
                } catch (Throwable th2) {
                    this.f65357c.f65348d.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC6992L enumC6992L, Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.f65353c = enumC6992L;
            this.f65354d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C7267i.this.new a(this.f65353c, this.f65354d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f65351a;
            if (i10 == 0) {
                Td.v.b(obj);
                C6994N c6994n = C7267i.this.f65347c;
                u uVar = C7267i.this.f65346b;
                EnumC6992L enumC6992L = this.f65353c;
                C0991a c0991a = new C0991a(C7267i.this, this.f65354d, null);
                this.f65351a = 1;
                if (c6994n.d(uVar, enumC6992L, c0991a, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: z.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements u {
        b() {
        }

        @Override // z.u
        public float a(float f10) {
            if (Float.isNaN(f10)) {
                return 0.0f;
            }
            float fFloatValue = ((Number) C7267i.this.l().invoke(Float.valueOf(f10))).floatValue();
            C7267i.this.f65349e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
            C7267i.this.f65350f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
            return fFloatValue;
        }
    }

    public C7267i(Function1 function1) {
        this.f65345a = function1;
        Boolean bool = Boolean.FALSE;
        this.f65348d = b2.e(bool, null, 2, null);
        this.f65349e = b2.e(bool, null, 2, null);
        this.f65350f = b2.e(bool, null, 2, null);
    }

    @Override // z.x
    public boolean a() {
        return ((Boolean) this.f65348d.getValue()).booleanValue();
    }

    @Override // z.x
    public Object b(EnumC6992L enumC6992L, Function2 function2, Zd.e eVar) {
        Object objE = P.e(new a(enumC6992L, function2, null), eVar);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }

    @Override // z.x
    public float f(float f10) {
        return ((Number) this.f65345a.invoke(Float.valueOf(f10))).floatValue();
    }

    public final Function1 l() {
        return this.f65345a;
    }
}
