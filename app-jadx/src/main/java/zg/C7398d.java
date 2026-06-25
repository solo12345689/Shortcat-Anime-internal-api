package zg;

import java.io.IOException;

/* JADX INFO: renamed from: zg.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7398d extends AbstractC7432y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final L f66394b = new a(C7398d.class, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C7398d f66395c = new C7398d((byte) 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C7398d f66396d = new C7398d((byte) -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f66397a;

    /* JADX INFO: renamed from: zg.d$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return C7398d.y(c7419n0.B());
        }
    }

    private C7398d(byte b10) {
        this.f66397a = b10;
    }

    static C7398d y(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b10 = bArr[0];
        return b10 != -1 ? b10 != 0 ? new C7398d(b10) : f66395c : f66396d;
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return z() ? 1 : 0;
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        return (abstractC7432y instanceof C7398d) && z() == ((C7398d) abstractC7432y).z();
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        c7430w.m(z10, 1, this.f66397a);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, 1);
    }

    public String toString() {
        return z() ? "TRUE" : "FALSE";
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y w() {
        return z() ? f66396d : f66395c;
    }

    public boolean z() {
        return this.f66397a != 0;
    }
}
