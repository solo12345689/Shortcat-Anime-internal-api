package zh;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: zh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7436c extends Ih.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f66457c;

    static {
        HashSet hashSet = new HashSet();
        f66457c = hashSet;
        hashSet.add(Bg.a.f1949X0);
        hashSet.add(Bg.a.f1951Y0);
        hashSet.add(Bg.a.f1953Z0);
        hashSet.add(Ag.a.f485H3);
        hashSet.add(Ag.a.f491I3);
        hashSet.add(Ag.a.f497J3);
    }

    public C7436c() {
        super(f66457c);
    }

    @Override // Rg.a
    public PrivateKey a(Cg.b bVar) {
        return new C7434a(bVar);
    }

    @Override // Rg.a
    public PublicKey b(Dg.b bVar) {
        return new C7435b(bVar);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C7434a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof C7435b)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof C7434a) || (key instanceof C7435b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
