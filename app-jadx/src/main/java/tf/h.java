package Tf;

import Td.AbstractC2163n;
import Td.z;
import Tf.e;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import Ud.L;
import Ud.S;
import Vf.AbstractC2325e0;
import Vf.AbstractC2339l0;
import Vf.InterfaceC2338l;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h implements e, InterfaceC2338l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f17515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f17517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f17518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String[] f17519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e[] f17520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List[] f17521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean[] f17522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f17523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e[] f17524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f17525l;

    public h(String serialName, l kind, int i10, List typeParameters, a builder) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(typeParameters, "typeParameters");
        AbstractC5504s.h(builder, "builder");
        this.f17514a = serialName;
        this.f17515b = kind;
        this.f17516c = i10;
        this.f17517d = builder.c();
        this.f17518e = AbstractC2279u.Z0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.f17519f = strArr;
        this.f17520g = AbstractC2325e0.b(builder.e());
        this.f17521h = (List[]) builder.d().toArray(new List[0]);
        this.f17522i = AbstractC2279u.V0(builder.g());
        Iterable<L> iterableJ1 = AbstractC2273n.j1(strArr);
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(iterableJ1, 10));
        for (L l10 : iterableJ1) {
            arrayList.add(z.a(l10.d(), Integer.valueOf(l10.c())));
        }
        this.f17523j = S.w(arrayList);
        this.f17524k = AbstractC2325e0.b(typeParameters);
        this.f17525l = AbstractC2163n.b(new InterfaceC5082a() { // from class: Tf.f
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return Integer.valueOf(h.d(this.f17512a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(h hVar) {
        return AbstractC2339l0.a(hVar, hVar.f17524k);
    }

    private final int e() {
        return ((Number) this.f17525l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(h hVar, int i10) {
        return hVar.l(i10) + ": " + hVar.n(i10).o();
    }

    @Override // Vf.InterfaceC2338l
    public Set a() {
        return this.f17518e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        e eVar = (e) obj;
        if (!AbstractC5504s.c(o(), eVar.o()) || !Arrays.equals(this.f17524k, ((h) obj).f17524k) || k() != eVar.k()) {
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

    @Override // Tf.e
    public List getAnnotations() {
        return this.f17517d;
    }

    @Override // Tf.e
    public l h() {
        return this.f17515b;
    }

    public int hashCode() {
        return e();
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
        Integer num = (Integer) this.f17523j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // Tf.e
    public int k() {
        return this.f17516c;
    }

    @Override // Tf.e
    public String l(int i10) {
        return this.f17519f[i10];
    }

    @Override // Tf.e
    public List m(int i10) {
        return this.f17521h[i10];
    }

    @Override // Tf.e
    public e n(int i10) {
        return this.f17520g[i10];
    }

    @Override // Tf.e
    public String o() {
        return this.f17514a;
    }

    @Override // Tf.e
    public boolean p(int i10) {
        return this.f17522i[i10];
    }

    public String toString() {
        return AbstractC2279u.w0(AbstractC5874j.x(0, k()), ", ", o() + '(', ")", 0, null, new Function1() { // from class: Tf.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.f(this.f17513a, ((Integer) obj).intValue());
            }
        }, 24, null);
    }
}
