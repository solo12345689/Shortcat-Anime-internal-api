package qf;

import be.AbstractC3048a;
import ie.InterfaceC5082a;
import java.util.ArrayDeque;
import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uf.InterfaceC6772d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f58097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f58098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f58099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f58100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final uf.r f58101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC6207q f58102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r f58103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f58104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f58105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayDeque f58106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set f58107k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {

        /* JADX INFO: renamed from: qf.u0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0877a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f58108a;

            @Override // qf.u0.a
            public void a(InterfaceC5082a block) {
                AbstractC5504s.h(block, "block");
                if (this.f58108a) {
                    return;
                }
                this.f58108a = ((Boolean) block.invoke()).booleanValue();
            }

            public final boolean b() {
                return this.f58108a;
            }
        }

        void a(InterfaceC5082a interfaceC5082a);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f58109a = new b("CHECK_ONLY_LOWER", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f58110b = new b("CHECK_SUBTYPE_AND_LOWER", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f58111c = new b("SKIP_LOWER", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f58112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f58113e;

        static {
            b[] bVarArrA = a();
            f58112d = bVarArrA;
            f58113e = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f58109a, f58110b, f58111c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f58112d.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static abstract class a extends c {
            public a() {
                super(null);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f58114a = new b();

            private b() {
                super(null);
            }

            @Override // qf.u0.c
            public uf.j a(u0 state, uf.i type) {
                AbstractC5504s.h(state, "state");
                AbstractC5504s.h(type, "type");
                return state.j().v(type);
            }
        }

        /* JADX INFO: renamed from: qf.u0$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0878c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0878c f58115a = new C0878c();

            private C0878c() {
                super(null);
            }

            @Override // qf.u0.c
            public /* bridge */ /* synthetic */ uf.j a(u0 u0Var, uf.i iVar) {
                return (uf.j) b(u0Var, iVar);
            }

            public Void b(u0 state, uf.i type) {
                AbstractC5504s.h(state, "state");
                AbstractC5504s.h(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f58116a = new d();

            private d() {
                super(null);
            }

            @Override // qf.u0.c
            public uf.j a(u0 state, uf.i type) {
                AbstractC5504s.h(state, "state");
                AbstractC5504s.h(type, "type");
                return state.j().G(type);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract uf.j a(u0 u0Var, uf.i iVar);

        private c() {
        }
    }

    public u0(boolean z10, boolean z11, boolean z12, boolean z13, uf.r typeSystemContext, AbstractC6207q kotlinTypePreparator, r kotlinTypeRefiner) {
        AbstractC5504s.h(typeSystemContext, "typeSystemContext");
        AbstractC5504s.h(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC5504s.h(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f58097a = z10;
        this.f58098b = z11;
        this.f58099c = z12;
        this.f58100d = z13;
        this.f58101e = typeSystemContext;
        this.f58102f = kotlinTypePreparator;
        this.f58103g = kotlinTypeRefiner;
    }

    public static /* synthetic */ Boolean d(u0 u0Var, uf.i iVar, uf.i iVar2, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return u0Var.c(iVar, iVar2, z10);
    }

    public Boolean c(uf.i subType, uf.i superType, boolean z10) {
        AbstractC5504s.h(subType, "subType");
        AbstractC5504s.h(superType, "superType");
        return null;
    }

    public final void e() {
        ArrayDeque arrayDeque = this.f58106j;
        AbstractC5504s.e(arrayDeque);
        arrayDeque.clear();
        Set set = this.f58107k;
        AbstractC5504s.e(set);
        set.clear();
        this.f58105i = false;
    }

    public boolean f(uf.i subType, uf.i superType) {
        AbstractC5504s.h(subType, "subType");
        AbstractC5504s.h(superType, "superType");
        return true;
    }

    public b g(uf.j subType, InterfaceC6772d superType) {
        AbstractC5504s.h(subType, "subType");
        AbstractC5504s.h(superType, "superType");
        return b.f58110b;
    }

    public final ArrayDeque h() {
        return this.f58106j;
    }

    public final Set i() {
        return this.f58107k;
    }

    public final uf.r j() {
        return this.f58101e;
    }

    public final void k() {
        this.f58105i = true;
        if (this.f58106j == null) {
            this.f58106j = new ArrayDeque(4);
        }
        if (this.f58107k == null) {
            this.f58107k = Af.k.f430c.a();
        }
    }

    public final boolean l(uf.i type) {
        AbstractC5504s.h(type, "type");
        return this.f58100d && this.f58101e.C(type);
    }

    public final boolean m() {
        return this.f58099c;
    }

    public final boolean n() {
        return this.f58097a;
    }

    public final boolean o() {
        return this.f58098b;
    }

    public final uf.i p(uf.i type) {
        AbstractC5504s.h(type, "type");
        return this.f58102f.a(type);
    }

    public final uf.i q(uf.i type) {
        AbstractC5504s.h(type, "type");
        return this.f58103g.a(type);
    }

    public boolean r(Function1 block) {
        AbstractC5504s.h(block, "block");
        a.C0877a c0877a = new a.C0877a();
        block.invoke(c0877a);
        return c0877a.b();
    }
}
