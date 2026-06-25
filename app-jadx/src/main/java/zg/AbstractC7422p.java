package zg;

/* JADX INFO: renamed from: zg.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7422p extends AbstractC7432y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final L f66431a = new a(AbstractC7422p.class, 5);

    /* JADX INFO: renamed from: zg.p$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return AbstractC7422p.y(c7419n0.B());
        }
    }

    AbstractC7422p() {
    }

    static AbstractC7422p y(byte[] bArr) {
        if (bArr.length == 0) {
            return C7415l0.f66420b;
        }
        throw new IllegalStateException("malformed NULL encoding encountered");
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return -1;
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        return abstractC7432y instanceof AbstractC7422p;
    }

    public String toString() {
        return "NULL";
    }
}
