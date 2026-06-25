package xe;

import Ud.AbstractC2279u;
import be.AbstractC3048a;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import pe.InterfaceC6023m;
import pf.AbstractC6048m;
import pf.InterfaceC6044i;
import ye.H;

/* JADX INFO: renamed from: xe.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C7147k extends ve.i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f64412k = {O.k(new F(C7147k.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f64413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC5082a f64414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final InterfaceC6044i f64415j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: xe.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64416a = new a("FROM_DEPENDENCIES", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f64417b = new a("FROM_CLASS_LOADER", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f64418c = new a("FALLBACK", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f64419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f64420e;

        static {
            a[] aVarArrA = a();
            f64419d = aVarArrA;
            f64420e = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f64416a, f64417b, f64418c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f64419d.clone();
        }
    }

    /* JADX INFO: renamed from: xe.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final H f64421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f64422b;

        public b(H ownerModuleDescriptor, boolean z10) {
            AbstractC5504s.h(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f64421a = ownerModuleDescriptor;
            this.f64422b = z10;
        }

        public final H a() {
            return this.f64421a;
        }

        public final boolean b() {
            return this.f64422b;
        }
    }

    /* JADX INFO: renamed from: xe.k$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64423a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f64416a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f64417b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f64418c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f64423a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7147k(pf.n storageManager, a kind) {
        super(storageManager);
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(kind, "kind");
        this.f64413h = kind;
        this.f64415j = storageManager.c(new C7144h(this, storageManager));
        int i10 = c.f64423a[kind.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                f(false);
            } else {
                if (i10 != 3) {
                    throw new Td.r();
                }
                f(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u J0(C7147k c7147k, pf.n nVar) {
        Be.F fS = c7147k.s();
        AbstractC5504s.g(fS, "getBuiltInsModule(...)");
        return new u(fS, nVar, new C7146j(c7147k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b K0(C7147k c7147k) {
        InterfaceC5082a interfaceC5082a = c7147k.f64414i;
        if (interfaceC5082a == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        b bVar = (b) interfaceC5082a.invoke();
        c7147k.f64414i = null;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b O0(H h10, boolean z10) {
        return new b(h10, z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ve.i
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public List w() {
        Iterable iterableW = super.w();
        AbstractC5504s.g(iterableW, "getClassDescriptorFactories(...)");
        pf.n nVarV = V();
        AbstractC5504s.g(nVarV, "getStorageManager(...)");
        Be.F fS = s();
        AbstractC5504s.g(fS, "getBuiltInsModule(...)");
        return AbstractC2279u.H0(iterableW, new C7143g(nVarV, fS, null, 4, null));
    }

    public final u M0() {
        return (u) AbstractC6048m.a(this.f64415j, this, f64412k[0]);
    }

    @Override // ve.i
    protected Ae.c N() {
        return M0();
    }

    public final void N0(H moduleDescriptor, boolean z10) {
        AbstractC5504s.h(moduleDescriptor, "moduleDescriptor");
        P0(new C7145i(moduleDescriptor, z10));
    }

    public final void P0(InterfaceC5082a computation) {
        AbstractC5504s.h(computation, "computation");
        this.f64414i = computation;
    }

    @Override // ve.i
    protected Ae.a g() {
        return M0();
    }
}
