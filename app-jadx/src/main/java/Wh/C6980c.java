package wh;

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

/* JADX INFO: renamed from: wh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C6980c extends Ih.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f63214c;

    static {
        HashSet hashSet = new HashSet();
        f63214c = hashSet;
        hashSet.add(Ag.a.f549S1);
        hashSet.add(Ag.a.f555T1);
        hashSet.add(Ag.a.f561U1);
        hashSet.add(Ag.a.f567V1);
        hashSet.add(Ag.a.f573W1);
        hashSet.add(Ag.a.f579X1);
    }

    public C6980c() {
        super(f63214c);
    }

    @Override // Rg.a
    public PrivateKey a(Cg.b bVar) {
        return new C6978a(bVar);
    }

    @Override // Rg.a
    public PublicKey b(Dg.b bVar) {
        return new C6979b(bVar);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof C6978a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof C6979b)) {
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
        if ((key instanceof C6978a) || (key instanceof C6979b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
