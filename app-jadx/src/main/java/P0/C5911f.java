package p0;

import Td.L;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import u0.InterfaceC6708c;

/* JADX INFO: renamed from: p0.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5911f implements InterfaceC5011d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC5909d f55679a = k.f55686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f55680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC6708c f55681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC5082a f55682d;

    /* JADX INFO: renamed from: p0.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f55683a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function1 function1) {
            super(1);
            this.f55683a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC6708c) obj);
            return L.f17438a;
        }

        public final void invoke(InterfaceC6708c interfaceC6708c) {
            this.f55683a.invoke(interfaceC6708c);
            interfaceC6708c.B1();
        }
    }

    public final void B(j jVar) {
        this.f55680b = jVar;
    }

    public final void I(InterfaceC5082a interfaceC5082a) {
        this.f55682d = interfaceC5082a;
    }

    public final j b() {
        return this.f55680b;
    }

    public final long f() {
        return this.f55679a.f();
    }

    @Override // i1.InterfaceC5011d
    public float getDensity() {
        return this.f55679a.getDensity().getDensity();
    }

    public final EnumC5027t getLayoutDirection() {
        return this.f55679a.getLayoutDirection();
    }

    public final j j(Function1 function1) {
        return p(new a(function1));
    }

    @Override // i1.InterfaceC5019l
    public float j1() {
        return this.f55679a.getDensity().j1();
    }

    public final j p(Function1 function1) {
        j jVar = new j(function1);
        this.f55680b = jVar;
        return jVar;
    }

    public final void q(InterfaceC5909d interfaceC5909d) {
        this.f55679a = interfaceC5909d;
    }

    public final void z(InterfaceC6708c interfaceC6708c) {
        this.f55681c = interfaceC6708c;
    }
}
