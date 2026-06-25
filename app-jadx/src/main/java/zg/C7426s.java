package zg;

import java.io.IOException;

/* JADX INFO: renamed from: zg.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C7426s extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66435b = new a(C7426s.class, 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC7414l f66436a;

    /* JADX INFO: renamed from: zg.s$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y c(AbstractC7387B abstractC7387B) {
            return new C7426s((AbstractC7414l) AbstractC7414l.f66418b.c(abstractC7387B));
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return new C7426s((AbstractC7414l) AbstractC7414l.f66418b.d(c7419n0));
        }
    }

    public C7426s(AbstractC7414l abstractC7414l) {
        if (abstractC7414l == null) {
            throw new NullPointerException("'baseGraphicString' cannot be null");
        }
        this.f66436a = abstractC7414l;
    }

    static C7426s y(byte[] bArr) {
        return new C7426s(AbstractC7414l.y(bArr));
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return ~this.f66436a.hashCode();
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof C7426s) {
            return this.f66436a.l(((C7426s) abstractC7432y).f66436a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        c7430w.s(z10, 7);
        this.f66436a.n(c7430w, false);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return this.f66436a.t(z10);
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y w() {
        AbstractC7414l abstractC7414l = (AbstractC7414l) this.f66436a.w();
        return abstractC7414l == this.f66436a ? this : new C7426s(abstractC7414l);
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y x() {
        AbstractC7414l abstractC7414l = (AbstractC7414l) this.f66436a.x();
        return abstractC7414l == this.f66436a ? this : new C7426s(abstractC7414l);
    }
}
