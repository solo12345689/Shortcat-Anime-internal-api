package z;

import Gf.O;
import Gf.P;
import Td.L;
import ae.AbstractC2605b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import x.C6994N;
import x.EnumC6992L;

/* JADX INFO: renamed from: z.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C7265g implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f65324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f65325b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6994N f65326c = new C6994N();

    /* JADX INFO: renamed from: z.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f65327a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EnumC6992L f65329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f65330d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC6992L enumC6992L, Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.f65329c = enumC6992L;
            this.f65330d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C7265g.this.new a(this.f65329c, this.f65330d, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f65327a;
            if (i10 == 0) {
                Td.v.b(obj);
                C6994N c6994n = C7265g.this.f65326c;
                k kVar = C7265g.this.f65325b;
                EnumC6992L enumC6992L = this.f65329c;
                Function2 function2 = this.f65330d;
                this.f65327a = 1;
                if (c6994n.d(kVar, enumC6992L, function2, this) == objF) {
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

    /* JADX INFO: renamed from: z.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements k {
        b() {
        }

        @Override // z.k
        public void a(float f10) {
            C7265g.this.d().invoke(Float.valueOf(f10));
        }
    }

    public C7265g(Function1 function1) {
        this.f65324a = function1;
    }

    @Override // z.m
    public Object a(EnumC6992L enumC6992L, Function2 function2, Zd.e eVar) {
        Object objE = P.e(new a(enumC6992L, function2, null), eVar);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }

    public final Function1 d() {
        return this.f65324a;
    }
}
