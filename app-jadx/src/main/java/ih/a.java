package Ih;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;
import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends KeyFactorySpi implements Rg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f9186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C7427t f9187b = null;

    protected a(Set set) {
        this.f9186a = set;
    }

    private void c(C7427t c7427t) throws InvalidKeySpecException {
        C7427t c7427t2 = this.f9187b;
        if (c7427t2 != null) {
            if (c7427t2.u(c7427t)) {
                return;
            }
            throw new InvalidKeySpecException("incorrect algorithm OID for key: " + c7427t);
        }
        if (this.f9186a.contains(c7427t)) {
            return;
        }
        throw new InvalidKeySpecException("incorrect algorithm OID for key: " + c7427t);
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            Cg.b bVarN = Cg.b.n(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            c(bVarN.r().l());
            return a(bVarN);
        } catch (IllegalStateException e10) {
            throw new InvalidKeySpecException(e10.getMessage());
        } catch (InvalidKeySpecException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new InvalidKeySpecException(e12.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
        }
        try {
            Dg.b bVarN = Dg.b.n(((X509EncodedKeySpec) keySpec).getEncoded());
            c(bVarN.l().l());
            return b(bVarN);
        } catch (InvalidKeySpecException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new InvalidKeySpecException(e11.toString());
        }
    }
}
