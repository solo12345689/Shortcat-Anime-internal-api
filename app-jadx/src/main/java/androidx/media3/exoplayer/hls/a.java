package androidx.media3.exoplayer.hls;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import t2.AbstractC6614a;
import w2.InterfaceC6932F;
import w2.InterfaceC6940g;
import w2.m;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class a implements InterfaceC6940g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6940g f30826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f30827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f30828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CipherInputStream f30829d;

    public a(InterfaceC6940g interfaceC6940g, byte[] bArr, byte[] bArr2) {
        this.f30826a = interfaceC6940g;
        this.f30827b = bArr;
        this.f30828c = bArr2;
    }

    @Override // w2.InterfaceC6940g
    public final long a(o oVar) {
        try {
            Cipher cipherP = p();
            try {
                cipherP.init(2, new SecretKeySpec(this.f30827b, "AES"), new IvParameterSpec(this.f30828c));
                m mVar = new m(this.f30826a, oVar);
                this.f30829d = new CipherInputStream(mVar, cipherP);
                mVar.b();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // w2.InterfaceC6940g
    public final Uri c() {
        return this.f30826a.c();
    }

    @Override // w2.InterfaceC6940g
    public void close() {
        if (this.f30829d != null) {
            this.f30829d = null;
            this.f30826a.close();
        }
    }

    @Override // w2.InterfaceC6940g
    public final Map f() {
        return this.f30826a.f();
    }

    @Override // w2.InterfaceC6940g
    public final void i(InterfaceC6932F interfaceC6932F) {
        AbstractC6614a.e(interfaceC6932F);
        this.f30826a.i(interfaceC6932F);
    }

    protected Cipher p() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // q2.InterfaceC6098m
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        AbstractC6614a.e(this.f30829d);
        int i12 = this.f30829d.read(bArr, i10, i11);
        if (i12 < 0) {
            return -1;
        }
        return i12;
    }
}
