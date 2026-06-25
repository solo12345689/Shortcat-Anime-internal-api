package xh;

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

/* JADX INFO: renamed from: xh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7178c extends Ih.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f64585c;

    static {
        HashSet hashSet = new HashSet();
        f64585c = hashSet;
        hashSet.add(Ag.a.f483H1);
        hashSet.add(Ag.a.f501K1);
    }

    public C7178c() {
        super(f64585c);
    }

    @Override // Rg.a
    public PrivateKey a(Cg.b bVar) {
        return new C7176a(bVar);
    }

    @Override // Rg.a
    public PublicKey b(Dg.b bVar) {
        return new C7177b(bVar);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C7176a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof C7177b)) {
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
        if ((key instanceof C7176a) || (key instanceof C7177b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
