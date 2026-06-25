package ye;

import jf.InterfaceC5387k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import rf.AbstractC6317g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7227e f65108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f65109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC6317g f65110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC6044i f65111d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f65107f = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(f0.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f65106e = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 a(InterfaceC7227e classDescriptor, pf.n storageManager, AbstractC6317g kotlinTypeRefinerForOwnerModule, Function1 scopeFactory) {
            AbstractC5504s.h(classDescriptor, "classDescriptor");
            AbstractC5504s.h(storageManager, "storageManager");
            AbstractC5504s.h(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            AbstractC5504s.h(scopeFactory, "scopeFactory");
            return new f0(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }

        private a() {
        }
    }

    public /* synthetic */ f0(InterfaceC7227e interfaceC7227e, pf.n nVar, Function1 function1, AbstractC6317g abstractC6317g, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7227e, nVar, function1, abstractC6317g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5387k d(f0 f0Var, AbstractC6317g abstractC6317g) {
        return (InterfaceC5387k) f0Var.f65109b.invoke(abstractC6317g);
    }

    private final InterfaceC5387k e() {
        return (InterfaceC5387k) AbstractC6048m.a(this.f65111d, this, f65107f[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5387k f(f0 f0Var) {
        return (InterfaceC5387k) f0Var.f65109b.invoke(f0Var.f65110c);
    }

    public final InterfaceC5387k c(AbstractC6317g kotlinTypeRefiner) {
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.d(ff.e.s(this.f65108a))) {
            return e();
        }
        qf.v0 v0VarL = this.f65108a.l();
        AbstractC5504s.g(v0VarL, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.e(v0VarL) ? e() : kotlinTypeRefiner.c(this.f65108a, new e0(this, kotlinTypeRefiner));
    }

    private f0(InterfaceC7227e interfaceC7227e, pf.n nVar, Function1 function1, AbstractC6317g abstractC6317g) {
        this.f65108a = interfaceC7227e;
        this.f65109b = function1;
        this.f65110c = abstractC6317g;
        this.f65111d = nVar.c(new d0(this));
    }
}
