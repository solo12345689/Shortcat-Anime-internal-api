package zg;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: zg.y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7432y extends r {
    AbstractC7432y() {
    }

    public static AbstractC7432y v(byte[] bArr) throws IOException {
        C7418n c7418n = new C7418n(bArr);
        try {
            AbstractC7432y abstractC7432yO = c7418n.o();
            if (c7418n.available() == 0) {
                return abstractC7432yO;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // zg.r
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC7400e) && l(((InterfaceC7400e) obj).e());
    }

    @Override // zg.r
    public abstract int hashCode();

    abstract boolean l(AbstractC7432y abstractC7432y);

    abstract void n(C7430w c7430w, boolean z10);

    abstract boolean p();

    public void r(OutputStream outputStream) {
        C7430w c7430wA = C7430w.a(outputStream);
        c7430wA.u(this, true);
        c7430wA.c();
    }

    public void s(OutputStream outputStream, String str) {
        C7430w c7430wB = C7430w.b(outputStream, str);
        c7430wB.u(this, true);
        c7430wB.c();
    }

    abstract int t(boolean z10);

    public final boolean u(AbstractC7432y abstractC7432y) {
        return this == abstractC7432y || l(abstractC7432y);
    }

    @Override // zg.r, zg.InterfaceC7400e
    public final AbstractC7432y e() {
        return this;
    }

    AbstractC7432y w() {
        return this;
    }

    AbstractC7432y x() {
        return this;
    }
}
