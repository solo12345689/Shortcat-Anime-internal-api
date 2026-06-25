package yh;

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
import zg.AbstractC7432y;

/* JADX INFO: renamed from: yh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C7253c extends Ih.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f65160c;

    static {
        HashSet hashSet = new HashSet();
        f65160c = hashSet;
        hashSet.add(Ag.a.f628e4);
        hashSet.add(Ag.a.f635f4);
        hashSet.add(Ag.a.f642g4);
    }

    public C7253c() {
        super(f65160c);
    }

    @Override // Rg.a
    public PrivateKey a(Cg.b bVar) {
        return new C7251a(bVar);
    }

    @Override // Rg.a
    public PublicKey b(Dg.b bVar) {
        return new C7252b(bVar);
    }

    @Override // Ih.a, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return a(Cg.b.n(AbstractC7432y.v(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e10) {
                throw new InvalidKeySpecException(e10.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // Ih.a, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return b(Dg.b.n(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e10) {
                throw new InvalidKeySpecException(e10.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C7251a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof C7252b)) {
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
        if ((key instanceof C7251a) || (key instanceof C7252b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
