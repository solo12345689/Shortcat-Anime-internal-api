package zg;

import com.facebook.imageutils.JfifUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class G extends AbstractC7432y implements InterfaceC7400e, L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f66332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f66333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f66334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC7400e f66335d;

    G(int i10, int i11, int i12, InterfaceC7400e interfaceC7400e) {
        if (interfaceC7400e == null) {
            throw new NullPointerException("'obj' cannot be null");
        }
        if (i11 == 0 || (i11 & JfifUtil.MARKER_SOFn) != i11) {
            throw new IllegalArgumentException("invalid tag class: " + i11);
        }
        this.f66332a = i10;
        this.f66333b = i11;
        this.f66334c = i12;
        this.f66335d = interfaceC7400e;
    }

    static AbstractC7432y A(int i10, int i11, C7402f c7402f) {
        return c7402f.f() == 1 ? new Z(3, i10, i11, c7402f.d(0)) : new Z(4, i10, i11, S.a(c7402f));
    }

    static AbstractC7432y B(int i10, int i11, byte[] bArr) {
        return new I0(4, i10, i11, new C7419n0(bArr));
    }

    public static G G(Object obj) {
        if (obj == null || (obj instanceof G)) {
            return (G) obj;
        }
        if (obj instanceof InterfaceC7400e) {
            AbstractC7432y abstractC7432yE = ((InterfaceC7400e) obj).e();
            if (abstractC7432yE instanceof G) {
                return (G) abstractC7432yE;
            }
        } else if (obj instanceof byte[]) {
            try {
                return y(AbstractC7432y.v((byte[]) obj));
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    private static G y(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof G) {
            return (G) abstractC7432y;
        }
        throw new IllegalStateException("unexpected object: " + abstractC7432y.getClass().getName());
    }

    static AbstractC7432y z(int i10, int i11, C7402f c7402f) {
        return c7402f.f() == 1 ? new I0(3, i10, i11, c7402f.d(0)) : new I0(4, i10, i11, C0.a(c7402f));
    }

    AbstractC7432y D(boolean z10, L l10) {
        if (z10) {
            if (M()) {
                return l10.a(this.f66335d.e());
            }
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        if (1 == this.f66332a) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        AbstractC7432y abstractC7432yE = this.f66335d.e();
        int i10 = this.f66332a;
        return i10 != 3 ? i10 != 4 ? l10.a(abstractC7432yE) : abstractC7432yE instanceof AbstractC7387B ? l10.c((AbstractC7387B) abstractC7432yE) : l10.d((C7419n0) abstractC7432yE) : l10.c(N(abstractC7432yE));
    }

    public r F() {
        if (!M()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        InterfaceC7400e interfaceC7400e = this.f66335d;
        return interfaceC7400e instanceof r ? (r) interfaceC7400e : interfaceC7400e.e();
    }

    public int I() {
        return this.f66333b;
    }

    public int K() {
        return this.f66334c;
    }

    public boolean L(int i10) {
        return this.f66333b == i10;
    }

    public boolean M() {
        int i10 = this.f66332a;
        return i10 == 1 || i10 == 3;
    }

    abstract AbstractC7387B N(AbstractC7432y abstractC7432y);

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return (((this.f66333b * 7919) ^ this.f66334c) ^ (M() ? 15 : 240)) ^ this.f66335d.e().hashCode();
    }

    @Override // zg.AbstractC7432y
    final boolean l(AbstractC7432y abstractC7432y) {
        if (!(abstractC7432y instanceof G)) {
            return false;
        }
        G g10 = (G) abstractC7432y;
        if (this.f66334c != g10.f66334c || this.f66333b != g10.f66333b) {
            return false;
        }
        if (this.f66332a != g10.f66332a && M() != g10.M()) {
            return false;
        }
        AbstractC7432y abstractC7432yE = this.f66335d.e();
        AbstractC7432y abstractC7432yE2 = g10.f66335d.e();
        if (abstractC7432yE == abstractC7432yE2) {
            return true;
        }
        if (M()) {
            return abstractC7432yE.l(abstractC7432yE2);
        }
        try {
            return Oh.a.c(getEncoded(), g10.getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    public String toString() {
        return M.e(this.f66333b, this.f66334c) + this.f66335d;
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y w() {
        return new u0(this.f66332a, this.f66333b, this.f66334c, this.f66335d);
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y x() {
        return new I0(this.f66332a, this.f66333b, this.f66334c, this.f66335d);
    }

    protected G(boolean z10, int i10, int i11, InterfaceC7400e interfaceC7400e) {
        this(z10 ? 1 : 2, i10, i11, interfaceC7400e);
    }

    protected G(boolean z10, int i10, InterfaceC7400e interfaceC7400e) {
        this(z10, 128, i10, interfaceC7400e);
    }

    @Override // zg.L0
    public final AbstractC7432y d() {
        return this;
    }
}
