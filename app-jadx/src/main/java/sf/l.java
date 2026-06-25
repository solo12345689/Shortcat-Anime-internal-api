package sf;

import Ud.AbstractC2279u;
import Ud.a0;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import qf.S;
import qf.v0;
import vf.AbstractC6867d;
import ye.H;
import ye.InterfaceC7235m;
import ye.Z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a */
    public static final l f59724a = new l();

    /* JADX INFO: renamed from: b */
    private static final H f59725b = e.f59605a;

    /* JADX INFO: renamed from: c */
    private static final C6529a f59726c;

    /* JADX INFO: renamed from: d */
    private static final S f59727d;

    /* JADX INFO: renamed from: e */
    private static final S f59728e;

    /* JADX INFO: renamed from: f */
    private static final Z f59729f;

    /* JADX INFO: renamed from: g */
    private static final Set f59730g;

    static {
        String str = String.format(b.f59593b.b(), Arrays.copyOf(new Object[]{"unknown class"}, 1));
        AbstractC5504s.g(str, "format(...)");
        Xe.f fVarQ = Xe.f.q(str);
        AbstractC5504s.g(fVarQ, "special(...)");
        f59726c = new C6529a(fVarQ);
        f59727d = d(k.f59712v, new String[0]);
        f59728e = d(k.f59662Q0, new String[0]);
        f fVar = new f();
        f59729f = fVar;
        f59730g = a0.c(fVar);
    }

    private l() {
    }

    public static final g a(h kind, boolean z10, String... formatParams) {
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(formatParams, "formatParams");
        return z10 ? new m(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new g(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final g b(h kind, String... formatParams) {
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(formatParams, "formatParams");
        return a(kind, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final i d(k kind, String... formatParams) {
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(formatParams, "formatParams");
        return f59724a.g(kind, AbstractC2279u.m(), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean m(InterfaceC7235m interfaceC7235m) {
        if (interfaceC7235m == null) {
            return false;
        }
        l lVar = f59724a;
        return lVar.n(interfaceC7235m) || lVar.n(interfaceC7235m.b()) || interfaceC7235m == f59725b;
    }

    private final boolean n(InterfaceC7235m interfaceC7235m) {
        return interfaceC7235m instanceof C6529a;
    }

    public static final boolean o(S s10) {
        if (s10 == null) {
            return false;
        }
        v0 v0VarN0 = s10.N0();
        return (v0VarN0 instanceof j) && ((j) v0VarN0).b() == k.f59718y;
    }

    public final i c(k kind, v0 typeConstructor, String... formatParams) {
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(typeConstructor, "typeConstructor");
        AbstractC5504s.h(formatParams, "formatParams");
        return f(kind, AbstractC2279u.m(), typeConstructor, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final j e(k kind, String... formatParams) {
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(formatParams, "formatParams");
        return new j(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final i f(k kind, List arguments, v0 typeConstructor, String... formatParams) {
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(arguments, "arguments");
        AbstractC5504s.h(typeConstructor, "typeConstructor");
        AbstractC5504s.h(formatParams, "formatParams");
        return new i(typeConstructor, b(h.f59620h, typeConstructor.toString()), kind, arguments, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final i g(k kind, List arguments, String... formatParams) {
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(arguments, "arguments");
        AbstractC5504s.h(formatParams, "formatParams");
        return f(kind, arguments, e(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public final C6529a h() {
        return f59726c;
    }

    public final H i() {
        return f59725b;
    }

    public final Set j() {
        return f59730g;
    }

    public final S k() {
        return f59728e;
    }

    public final S l() {
        return f59727d;
    }

    public final String p(S type) {
        AbstractC5504s.h(type, "type");
        AbstractC6867d.z(type);
        v0 v0VarN0 = type.N0();
        AbstractC5504s.f(v0VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
        return ((j) v0VarN0).c(0);
    }
}
