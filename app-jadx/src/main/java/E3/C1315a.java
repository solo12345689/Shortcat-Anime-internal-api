package E3;

import android.net.Uri;
import java.util.Arrays;
import t2.AbstractC6614a;
import t2.InterfaceC6621h;

/* JADX INFO: renamed from: E3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1315a implements InterfaceC6621h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6621h f5116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0049a f5117b;

    public C1315a(InterfaceC6621h interfaceC6621h) {
        this.f5116a = interfaceC6621h;
    }

    @Override // t2.InterfaceC6621h
    public com.google.common.util.concurrent.p b(Uri uri) {
        C0049a c0049a = this.f5117b;
        if (c0049a != null && c0049a.b(uri)) {
            return this.f5117b.a();
        }
        com.google.common.util.concurrent.p pVarB = this.f5116a.b(uri);
        this.f5117b = new C0049a(uri, pVarB);
        return pVarB;
    }

    @Override // t2.InterfaceC6621h
    public com.google.common.util.concurrent.p c(byte[] bArr) {
        C0049a c0049a = this.f5117b;
        if (c0049a != null && c0049a.c(bArr)) {
            return this.f5117b.a();
        }
        com.google.common.util.concurrent.p pVarC = this.f5116a.c(bArr);
        this.f5117b = new C0049a(bArr, pVarC);
        return pVarC;
    }

    /* JADX INFO: renamed from: E3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0049a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f5118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f5119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.google.common.util.concurrent.p f5120c;

        public C0049a(byte[] bArr, com.google.common.util.concurrent.p pVar) {
            this.f5118a = bArr;
            this.f5119b = null;
            this.f5120c = pVar;
        }

        public com.google.common.util.concurrent.p a() {
            return (com.google.common.util.concurrent.p) AbstractC6614a.i(this.f5120c);
        }

        public boolean b(Uri uri) {
            Uri uri2 = this.f5119b;
            return uri2 != null && uri2.equals(uri);
        }

        public boolean c(byte[] bArr) {
            byte[] bArr2 = this.f5118a;
            return bArr2 != null && Arrays.equals(bArr2, bArr);
        }

        public C0049a(Uri uri, com.google.common.util.concurrent.p pVar) {
            this.f5118a = null;
            this.f5119b = uri;
            this.f5120c = pVar;
        }
    }
}
