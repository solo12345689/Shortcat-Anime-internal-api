package w2;

import android.net.Uri;
import java.io.IOException;
import w2.InterfaceC6940g;

/* JADX INFO: renamed from: w2.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6928B implements InterfaceC6940g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6928B f62765a = new C6928B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC6940g.a f62766b = new InterfaceC6940g.a() { // from class: w2.A
        @Override // w2.InterfaceC6940g.a
        public final InterfaceC6940g a() {
            return C6928B.p();
        }
    };

    private C6928B() {
    }

    public static /* synthetic */ C6928B p() {
        return new C6928B();
    }

    @Override // w2.InterfaceC6940g
    public long a(o oVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // w2.InterfaceC6940g
    public Uri c() {
        return null;
    }

    @Override // q2.InterfaceC6098m
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // w2.InterfaceC6940g
    public void close() {
    }

    @Override // w2.InterfaceC6940g
    public void i(InterfaceC6932F interfaceC6932F) {
    }
}
