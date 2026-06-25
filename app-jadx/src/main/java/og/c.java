package Og;

import gh.e;
import gh.f;
import gh.g;
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
    private static final Set f13164c;

    static {
        HashSet hashSet = new HashSet();
        f13164c = hashSet;
        hashSet.add(Bg.a.f1949X0);
        hashSet.add(Bg.a.f1951Y0);
        hashSet.add(Bg.a.f1953Z0);
    }

    public c() {
        super(f13164c);
    }

    @Override // Rg.a
    public PrivateKey a(Cg.b bVar) {
        return new a(bVar);
    }

    @Override // Rg.a
    public PublicKey b(Dg.b bVar) {
        return new b(bVar);
    }

    @Override // Ih.a, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        f fVar;
        if (!(keySpec instanceof Sg.b)) {
            return super.engineGeneratePrivate(keySpec);
        }
        Sg.b bVar = (Sg.b) keySpec;
        e eVarA = d.a(bVar.a().b());
        if (bVar.e()) {
            fVar = new f(eVarA, bVar.d());
        } else {
            fVar = new f(eVarA, bVar.b());
            byte[] bArrC = bVar.c();
            if (bArrC != null && !Oh.a.k(bArrC, fVar.d())) {
                throw new InvalidKeySpecException("public key data does not match private key data");
            }
        }
        return new a(fVar);
    }

    @Override // Ih.a, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof Sg.c)) {
            return super.engineGeneratePublic(keySpec);
        }
        Sg.c cVar = (Sg.c) keySpec;
        return new b(new g(d.a(cVar.a().b()), cVar.b()));
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (Sg.b.class.isAssignableFrom(cls)) {
                a aVar = (a) key;
                byte[] bArrD = aVar.d();
                return bArrD != null ? new Sg.b(aVar.a(), bArrD) : new Sg.b(aVar.a(), aVar.b(), aVar.c().r());
            }
            if (Sg.c.class.isAssignableFrom(cls)) {
                a aVar2 = (a) key;
                return new Sg.c(aVar2.a(), aVar2.c().r());
            }
        } else {
            if (!(key instanceof b)) {
                throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
            if (Sg.c.class.isAssignableFrom(cls)) {
                b bVar = (b) key;
                return new Sg.c(bVar.a(), bVar.r());
            }
        }
        throw new InvalidKeySpecException("unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof a) || (key instanceof b)) {
            return key;
        }
        throw new InvalidKeyException("unsupported key type");
    }
}
