package ze;

import java.util.Map;
import qf.S;
import ye.h0;
import ze.InterfaceC7369c;

/* JADX INFO: renamed from: ze.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C7370d implements InterfaceC7369c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f66201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f66202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h0 f66203c;

    public C7370d(S s10, Map map, h0 h0Var) {
        if (s10 == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (h0Var == null) {
            b(2);
        }
        this.f66201a = s10;
        this.f66202b = map;
        this.f66203c = h0Var;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // ze.InterfaceC7369c
    public Map a() {
        Map map = this.f66202b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // ze.InterfaceC7369c
    public Xe.c f() {
        return InterfaceC7369c.a.a(this);
    }

    @Override // ze.InterfaceC7369c
    public S getType() {
        S s10 = this.f66201a;
        if (s10 == null) {
            b(3);
        }
        return s10;
    }

    @Override // ze.InterfaceC7369c
    public h0 k() {
        h0 h0Var = this.f66203c;
        if (h0Var == null) {
            b(5);
        }
        return h0Var;
    }

    public String toString() {
        return af.n.f23993h.N(this, null);
    }
}
