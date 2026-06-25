package Vf;

import Td.AbstractC2163n;
import Tf.e;
import Tf.m;
import Ud.AbstractC2279u;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: Vf.k0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C2337k0 implements Tf.e, InterfaceC2338l {

    /* JADX INFO: renamed from: a */
    private final String f20203a;

    /* JADX INFO: renamed from: b */
    private final E f20204b;

    /* JADX INFO: renamed from: c */
    private final int f20205c;

    /* JADX INFO: renamed from: d */
    private int f20206d;

    /* JADX INFO: renamed from: e */
    private final String[] f20207e;

    /* JADX INFO: renamed from: f */
    private final List[] f20208f;

    /* JADX INFO: renamed from: g */
    private List f20209g;

    /* JADX INFO: renamed from: h */
    private final boolean[] f20210h;

    /* JADX INFO: renamed from: i */
    private Map f20211i;

    /* JADX INFO: renamed from: j */
    private final Lazy f20212j;

    /* JADX INFO: renamed from: k */
    private final Lazy f20213k;

    /* JADX INFO: renamed from: l */
    private final Lazy f20214l;

    public C2337k0(String serialName, E e10, int i10) {
        AbstractC5504s.h(serialName, "serialName");
        this.f20203a = serialName;
        this.f20204b = e10;
        this.f20205c = i10;
        this.f20206d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f20207e = strArr;
        int i12 = this.f20205c;
        this.f20208f = new List[i12];
        this.f20210h = new boolean[i12];
        this.f20211i = Ud.S.i();
        Td.q qVar = Td.q.f17462b;
        this.f20212j = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: Vf.h0
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C2337k0.s(this.f20195a);
            }
        });
        this.f20213k = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: Vf.i0
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C2337k0.z(this.f20198a);
            }
        });
        this.f20214l = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: Vf.j0
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return Integer.valueOf(C2337k0.f(this.f20200a));
            }
        });
    }

    public static final int f(C2337k0 c2337k0) {
        return AbstractC2339l0.a(c2337k0, c2337k0.u());
    }

    public static /* synthetic */ void q(C2337k0 c2337k0, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c2337k0.g(str, z10);
    }

    private final Map r() {
        HashMap map = new HashMap();
        int length = this.f20207e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f20207e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    public static final Rf.b[] s(C2337k0 c2337k0) {
        Rf.b[] bVarArrChildSerializers;
        E e10 = c2337k0.f20204b;
        return (e10 == null || (bVarArrChildSerializers = e10.childSerializers()) == null) ? AbstractC2341m0.f20217a : bVarArrChildSerializers;
    }

    private final Rf.b[] t() {
        return (Rf.b[]) this.f20212j.getValue();
    }

    private final int v() {
        return ((Number) this.f20214l.getValue()).intValue();
    }

    public static final CharSequence y(C2337k0 c2337k0, int i10) {
        return c2337k0.l(i10) + ": " + c2337k0.n(i10).o();
    }

    public static final Tf.e[] z(C2337k0 c2337k0) {
        ArrayList arrayList;
        Rf.b[] bVarArrTypeParametersSerializers;
        E e10 = c2337k0.f20204b;
        if (e10 == null || (bVarArrTypeParametersSerializers = e10.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(bVarArrTypeParametersSerializers.length);
            for (Rf.b bVar : bVarArrTypeParametersSerializers) {
                arrayList.add(bVar.getDescriptor());
            }
        }
        return AbstractC2325e0.b(arrayList);
    }

    @Override // Vf.InterfaceC2338l
    public Set a() {
        return this.f20211i.keySet();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2337k0)) {
            return false;
        }
        Tf.e eVar = (Tf.e) obj;
        if (!AbstractC5504s.c(o(), eVar.o()) || !Arrays.equals(u(), ((C2337k0) obj).u()) || k() != eVar.k()) {
            return false;
        }
        int iK = k();
        for (int i10 = 0; i10 < iK; i10++) {
            if (!AbstractC5504s.c(n(i10).o(), eVar.n(i10).o()) || !AbstractC5504s.c(n(i10).h(), eVar.n(i10).h())) {
                return false;
            }
        }
        return true;
    }

    public final void g(String name, boolean z10) {
        AbstractC5504s.h(name, "name");
        String[] strArr = this.f20207e;
        int i10 = this.f20206d + 1;
        this.f20206d = i10;
        strArr[i10] = name;
        this.f20210h[i10] = z10;
        this.f20208f[i10] = null;
        if (i10 == this.f20205c - 1) {
            this.f20211i = r();
        }
    }

    @Override // Tf.e
    public List getAnnotations() {
        List list = this.f20209g;
        return list == null ? AbstractC2279u.m() : list;
    }

    @Override // Tf.e
    public Tf.l h() {
        return m.a.f17534a;
    }

    public int hashCode() {
        return v();
    }

    @Override // Tf.e
    public boolean i() {
        return e.a.c(this);
    }

    @Override // Tf.e
    public boolean isInline() {
        return e.a.b(this);
    }

    @Override // Tf.e
    public int j(String name) {
        AbstractC5504s.h(name, "name");
        Integer num = (Integer) this.f20211i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // Tf.e
    public final int k() {
        return this.f20205c;
    }

    @Override // Tf.e
    public String l(int i10) {
        return this.f20207e[i10];
    }

    @Override // Tf.e
    public List m(int i10) {
        List list = this.f20208f[i10];
        return list == null ? AbstractC2279u.m() : list;
    }

    @Override // Tf.e
    public Tf.e n(int i10) {
        return t()[i10].getDescriptor();
    }

    @Override // Tf.e
    public String o() {
        return this.f20203a;
    }

    @Override // Tf.e
    public boolean p(int i10) {
        return this.f20210h[i10];
    }

    public String toString() {
        return AbstractC2279u.w0(AbstractC5874j.x(0, this.f20205c), ", ", o() + '(', ")", 0, null, new Function1() { // from class: Vf.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2337k0.y(this.f20192a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public final Tf.e[] u() {
        return (Tf.e[]) this.f20213k.getValue();
    }

    public final void w(Annotation annotation) {
        AbstractC5504s.h(annotation, "annotation");
        List arrayList = this.f20208f[this.f20206d];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            this.f20208f[this.f20206d] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void x(Annotation a10) {
        AbstractC5504s.h(a10, "a");
        if (this.f20209g == null) {
            this.f20209g = new ArrayList(1);
        }
        List list = this.f20209g;
        AbstractC5504s.e(list);
        list.add(a10);
    }

    public /* synthetic */ C2337k0(String str, E e10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : e10, i10);
    }
}
