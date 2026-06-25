package zg;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
class N0 implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C7418n f66357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f66358b = a();

    public N0(byte[] bArr) {
        this.f66357a = new C7418n(bArr, true);
    }

    private Object a() {
        try {
            return this.f66357a.o();
        } catch (IOException e10) {
            throw new C7431x("malformed ASN.1: " + e10, e10);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f66358b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f66358b;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.f66358b = a();
        return obj;
    }
}
