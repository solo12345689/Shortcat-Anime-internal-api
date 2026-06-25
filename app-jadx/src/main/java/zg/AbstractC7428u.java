package zg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: zg.u */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7428u extends AbstractC7432y implements InterfaceC7429v {

    /* JADX INFO: renamed from: b */
    static final L f66444b = new a(AbstractC7428u.class, 4);

    /* JADX INFO: renamed from: c */
    static final byte[] f66445c = new byte[0];

    /* JADX INFO: renamed from: a */
    byte[] f66446a;

    public AbstractC7428u(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f66446a = bArr;
    }

    public static AbstractC7428u A(G g10, boolean z10) {
        return (AbstractC7428u) f66444b.e(g10, z10);
    }

    static AbstractC7428u y(byte[] bArr) {
        return new C7419n0(bArr);
    }

    public static AbstractC7428u z(Object obj) {
        if (obj == null || (obj instanceof AbstractC7428u)) {
            return (AbstractC7428u) obj;
        }
        if (obj instanceof InterfaceC7400e) {
            AbstractC7432y abstractC7432yE = ((InterfaceC7400e) obj).e();
            if (abstractC7432yE instanceof AbstractC7428u) {
                return (AbstractC7428u) abstractC7432yE;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (AbstractC7428u) f66444b.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public byte[] B() {
        return this.f66446a;
    }

    @Override // zg.InterfaceC7429v
    public InputStream b() {
        return new ByteArrayInputStream(this.f66446a);
    }

    @Override // zg.L0
    public AbstractC7432y d() {
        return e();
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return Oh.a.q(B());
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof AbstractC7428u) {
            return Oh.a.c(this.f66446a, ((AbstractC7428u) abstractC7432y).f66446a);
        }
        return false;
    }

    public String toString() {
        return "#" + Oh.i.b(Ph.c.b(this.f66446a));
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y w() {
        return new C7419n0(this.f66446a);
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y x() {
        return new C7419n0(this.f66446a);
    }

    /* JADX INFO: renamed from: zg.u$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y c(AbstractC7387B abstractC7387B) {
            return abstractC7387B.I();
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return c7419n0;
        }
    }
}
