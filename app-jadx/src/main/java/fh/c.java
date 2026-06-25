package Fh;

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

/* JADX INFO: loaded from: classes5.dex */
public class c extends Ih.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f6696c;

    static {
        HashSet hashSet = new HashSet();
        f6696c = hashSet;
        hashSet.add(Ag.a.f739v4);
        hashSet.add(Ag.a.f745w4);
        hashSet.add(Ag.a.f751x4);
        hashSet.add(Ag.a.f757y4);
        hashSet.add(Ag.a.f763z4);
        hashSet.add(Ag.a.f444A4);
        hashSet.add(Ag.a.f450B4);
        hashSet.add(Ag.a.f456C4);
        hashSet.add(Ag.a.f462D4);
        hashSet.add(Ag.a.f468E4);
        hashSet.add(Ag.a.f474F4);
        hashSet.add(Ag.a.f480G4);
        hashSet.add(Ag.a.f486H4);
        hashSet.add(Ag.a.f492I4);
        hashSet.add(Ag.a.f498J4);
        hashSet.add(Ag.a.f504K4);
        hashSet.add(Ag.a.f510L4);
        hashSet.add(Ag.a.f516M4);
        hashSet.add(Ag.a.f522N4);
        hashSet.add(Ag.a.f528O4);
        hashSet.add(Ag.a.f534P4);
        hashSet.add(Ag.a.f540Q4);
        hashSet.add(Ag.a.f546R4);
        hashSet.add(Ag.a.f552S4);
        hashSet.add(Ag.a.f558T4);
        hashSet.add(Ag.a.f564U4);
        hashSet.add(Ag.a.f570V4);
        hashSet.add(Ag.a.f576W4);
        hashSet.add(Ag.a.f582X4);
        hashSet.add(Ag.a.f588Y4);
        hashSet.add(Ag.a.f594Z4);
        hashSet.add(Ag.a.f601a5);
        hashSet.add(Ag.a.f608b5);
        hashSet.add(Ag.a.f615c5);
        hashSet.add(Ag.a.f622d5);
        hashSet.add(Ag.a.f629e5);
        hashSet.add(Ag.a.f636f5);
        hashSet.add(Ag.a.f643g5);
        hashSet.add(Ag.a.f650h5);
        hashSet.add(Ag.a.f657i5);
        hashSet.add(Ag.a.f664j5);
        hashSet.add(Ag.a.f671k5);
        hashSet.add(Ag.a.f678l5);
        hashSet.add(Ag.a.f685m5);
    }

    public c() {
        super(f6696c);
    }

    @Override // Rg.a
    public PrivateKey a(Cg.b bVar) {
        return new a(bVar);
    }

    @Override // Rg.a
    public PublicKey b(Dg.b bVar) {
        return new b(bVar);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof b)) {
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
        if ((key instanceof a) || (key instanceof b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }
}
