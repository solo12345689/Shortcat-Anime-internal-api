package qf;

import Ud.AbstractC2279u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ye.InterfaceC7230h;

/* JADX INFO: renamed from: qf.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6203n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f58074e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6203n0 f58075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye.l0 f58076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f58077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f58078d;

    /* JADX INFO: renamed from: qf.n0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6203n0 a(C6203n0 c6203n0, ye.l0 typeAliasDescriptor, List arguments) {
            AbstractC5504s.h(typeAliasDescriptor, "typeAliasDescriptor");
            AbstractC5504s.h(arguments, "arguments");
            List parameters = typeAliasDescriptor.l().getParameters();
            AbstractC5504s.g(parameters, "getParameters(...)");
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((ye.m0) it.next()).a());
            }
            return new C6203n0(c6203n0, typeAliasDescriptor, arguments, Ud.S.w(AbstractC2279u.j1(arrayList, arguments)), null);
        }

        private a() {
        }
    }

    public /* synthetic */ C6203n0(C6203n0 c6203n0, ye.l0 l0Var, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6203n0, l0Var, list, map);
    }

    public final List a() {
        return this.f58077c;
    }

    public final ye.l0 b() {
        return this.f58076b;
    }

    public final B0 c(v0 constructor) {
        AbstractC5504s.h(constructor, "constructor");
        InterfaceC7230h interfaceC7230hP = constructor.p();
        if (interfaceC7230hP instanceof ye.m0) {
            return (B0) this.f58078d.get(interfaceC7230hP);
        }
        return null;
    }

    public final boolean d(ye.l0 descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (AbstractC5504s.c(this.f58076b, descriptor)) {
            return true;
        }
        C6203n0 c6203n0 = this.f58075a;
        return c6203n0 != null ? c6203n0.d(descriptor) : false;
    }

    private C6203n0(C6203n0 c6203n0, ye.l0 l0Var, List list, Map map) {
        this.f58075a = c6203n0;
        this.f58076b = l0Var;
        this.f58077c = list;
        this.f58078d = map;
    }
}
