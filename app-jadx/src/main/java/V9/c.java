package V9;

import U9.b;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.EnumC0332b f19949b = b.EnumC0332b.f19401a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W9.a f19950a;

    public c(byte[] bArr) {
        if (!f19949b.a()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        this.f19950a = W9.a.a(bArr);
    }

    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!a.s(bArr2, bArr, this.f19950a.c())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
