package se;

import Ud.AbstractC2279u;
import he.AbstractC4945a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import of.InterfaceC5895s;
import of.InterfaceC5896t;
import pe.EnumC6030t;
import pe.InterfaceC6014d;
import pe.InterfaceC6023m;
import pe.InterfaceC6028r;
import se.a1;
import ye.InterfaceC7224b;
import ye.InterfaceC7227e;
import ye.InterfaceC7235m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class W0 implements InterfaceC6028r, InterfaceC6476Y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f59435d = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(W0.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.m0 f59436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1.a f59437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X0 f59438c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59439a;

        static {
            int[] iArr = new int[qf.N0.values().length];
            try {
                iArr[qf.N0.f57999e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qf.N0.f58000f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qf.N0.f58001g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f59439a = iArr;
        }
    }

    public W0(X0 x02, ye.m0 descriptor) {
        C6475X c6475xD;
        Object objB0;
        AbstractC5504s.h(descriptor, "descriptor");
        this.f59436a = descriptor;
        this.f59437b = a1.b(new V0(this));
        if (x02 == null) {
            InterfaceC7235m interfaceC7235mB = getDescriptor().b();
            AbstractC5504s.g(interfaceC7235mB, "getContainingDeclaration(...)");
            if (interfaceC7235mB instanceof InterfaceC7227e) {
                objB0 = d((InterfaceC7227e) interfaceC7235mB);
            } else {
                if (!(interfaceC7235mB instanceof InterfaceC7224b)) {
                    throw new Y0("Unknown type parameter container: " + interfaceC7235mB);
                }
                InterfaceC7235m interfaceC7235mB2 = ((InterfaceC7224b) interfaceC7235mB).b();
                AbstractC5504s.g(interfaceC7235mB2, "getContainingDeclaration(...)");
                if (interfaceC7235mB2 instanceof InterfaceC7227e) {
                    c6475xD = d((InterfaceC7227e) interfaceC7235mB2);
                } else {
                    InterfaceC5896t interfaceC5896t = interfaceC7235mB instanceof InterfaceC5896t ? (InterfaceC5896t) interfaceC7235mB : null;
                    if (interfaceC5896t == null) {
                        throw new Y0("Non-class callable descriptor must be deserialized: " + interfaceC7235mB);
                    }
                    InterfaceC6014d interfaceC6014dE = AbstractC4945a.e(b(interfaceC5896t));
                    AbstractC5504s.f(interfaceC6014dE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    c6475xD = (C6475X) interfaceC6014dE;
                }
                objB0 = interfaceC7235mB.b0(new C6495j(c6475xD), Td.L.f17438a);
            }
            x02 = (X0) objB0;
        }
        this.f59438c = x02;
    }

    private final Class b(InterfaceC5896t interfaceC5896t) {
        Class clsE;
        InterfaceC5895s interfaceC5895sJ = interfaceC5896t.J();
        Qe.r rVar = interfaceC5895sJ instanceof Qe.r ? (Qe.r) interfaceC5895sJ : null;
        Qe.x xVarG = rVar != null ? rVar.g() : null;
        De.f fVar = xVarG instanceof De.f ? (De.f) xVarG : null;
        if (fVar != null && (clsE = fVar.e()) != null) {
            return clsE;
        }
        throw new Y0("Container of deserialized member is not resolved: " + interfaceC5896t);
    }

    private final C6475X d(InterfaceC7227e interfaceC7227e) {
        Class clsQ = j1.q(interfaceC7227e);
        C6475X c6475x = (C6475X) (clsQ != null ? AbstractC4945a.e(clsQ) : null);
        if (c6475x != null) {
            return c6475x;
        }
        throw new Y0("Type parameter container is not resolved: " + interfaceC7227e.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List e(W0 w02) {
        List upperBounds = w02.getDescriptor().getUpperBounds();
        AbstractC5504s.g(upperBounds, "getUpperBounds(...)");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new U0((qf.S) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // se.InterfaceC6476Y
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ye.m0 getDescriptor() {
        return this.f59436a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof W0)) {
            return false;
        }
        W0 w02 = (W0) obj;
        return AbstractC5504s.c(this.f59438c, w02.f59438c) && AbstractC5504s.c(getName(), w02.getName());
    }

    @Override // pe.InterfaceC6028r
    public String getName() {
        String strB = getDescriptor().getName().b();
        AbstractC5504s.g(strB, "asString(...)");
        return strB;
    }

    @Override // pe.InterfaceC6028r
    public List getUpperBounds() {
        Object objB = this.f59437b.b(this, f59435d[0]);
        AbstractC5504s.g(objB, "getValue(...)");
        return (List) objB;
    }

    public int hashCode() {
        return (this.f59438c.hashCode() * 31) + getName().hashCode();
    }

    @Override // pe.InterfaceC6028r
    public EnumC6030t m() {
        int i10 = a.f59439a[getDescriptor().m().ordinal()];
        if (i10 == 1) {
            return EnumC6030t.f56018a;
        }
        if (i10 == 2) {
            return EnumC6030t.f56019b;
        }
        if (i10 == 3) {
            return EnumC6030t.f56020c;
        }
        throw new Td.r();
    }

    public String toString() {
        return kotlin.jvm.internal.W.f52265a.a(this);
    }
}
