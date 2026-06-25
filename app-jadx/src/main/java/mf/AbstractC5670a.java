package mf;

import Ud.AbstractC2279u;
import Ze.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import lf.AbstractC5594a;
import mf.N;

/* JADX INFO: renamed from: mf.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC5670a implements InterfaceC5677h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC5594a f53405a;

    /* JADX INFO: renamed from: mf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class C0832a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53406a;

        static {
            int[] iArr = new int[EnumC5673d.values().length];
            try {
                iArr[EnumC5673d.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5673d.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5673d.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f53406a = iArr;
        }
    }

    public AbstractC5670a(AbstractC5594a protocol) {
        AbstractC5504s.h(protocol, "protocol");
        this.f53405a = protocol;
    }

    @Override // mf.InterfaceC5677h
    public List a(Se.t proto, Ue.d nameResolver) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        List listM = (List) proto.v(this.f53405a.p());
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(d((Se.b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // mf.InterfaceC5677h
    public List b(N container, Se.h proto) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        List listM = (List) proto.v(this.f53405a.d());
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(d((Se.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // mf.InterfaceC5677h
    public List c(N container, Ze.p proto, EnumC5673d kind) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(kind, "kind");
        List listM = null;
        if (proto instanceof Se.j) {
            i.f fVarG = this.f53405a.g();
            if (fVarG != null) {
                listM = (List) ((Se.j) proto).v(fVarG);
            }
        } else {
            if (!(proto instanceof Se.o)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = C0832a.f53406a[kind.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            i.f fVarL = this.f53405a.l();
            if (fVarL != null) {
                listM = (List) ((Se.o) proto).v(fVarL);
            }
        }
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(d((Se.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // mf.InterfaceC5677h
    public List e(N container, Ze.p callableProto, EnumC5673d kind, int i10, Se.v proto) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(callableProto, "callableProto");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(proto, "proto");
        List listM = (List) proto.v(this.f53405a.h());
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(d((Se.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // mf.InterfaceC5677h
    public List f(N container, Se.o proto) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        i.f fVarJ = this.f53405a.j();
        List listM = fVarJ != null ? (List) proto.v(fVarJ) : null;
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(d((Se.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // mf.InterfaceC5677h
    public List g(N container, Se.o proto) {
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        i.f fVarK = this.f53405a.k();
        List listM = fVarK != null ? (List) proto.v(fVarK) : null;
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(d((Se.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // mf.InterfaceC5677h
    public List h(N container, Ze.p proto, EnumC5673d kind) {
        List listM;
        AbstractC5504s.h(container, "container");
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(kind, "kind");
        if (proto instanceof Se.e) {
            listM = (List) ((Se.e) proto).v(this.f53405a.c());
        } else if (proto instanceof Se.j) {
            listM = (List) ((Se.j) proto).v(this.f53405a.f());
        } else {
            if (!(proto instanceof Se.o)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = C0832a.f53406a[kind.ordinal()];
            if (i10 == 1) {
                listM = (List) ((Se.o) proto).v(this.f53405a.i());
            } else if (i10 == 2) {
                listM = (List) ((Se.o) proto).v(this.f53405a.m());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listM = (List) ((Se.o) proto).v(this.f53405a.n());
            }
        }
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(d((Se.b) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // mf.InterfaceC5677h
    public List i(Se.r proto, Ue.d nameResolver) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        List listM = (List) proto.v(this.f53405a.o());
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(d((Se.b) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // mf.InterfaceC5677h
    public List j(N.a container) {
        AbstractC5504s.h(container, "container");
        List listM = (List) container.f().v(this.f53405a.a());
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(d((Se.b) it.next(), container.b()));
        }
        return arrayList;
    }

    protected final AbstractC5594a m() {
        return this.f53405a;
    }
}
