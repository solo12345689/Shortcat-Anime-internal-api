package expo.modules.crypto.aes.objects;

import expo.modules.crypto.aes.enums.KeySize;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lexpo/modules/crypto/aes/objects/EncryptionKey;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Lexpo/modules/crypto/aes/enums/KeySize;", "size", "<init>", "(Lexpo/modules/crypto/aes/enums/KeySize;)V", "", "bytes", "([B)V", "", "k", "()I", "c", "Lexpo/modules/crypto/aes/enums/KeySize;", "S", "()Lexpo/modules/crypto/aes/enums/KeySize;", "keySize", "Ljavax/crypto/SecretKey;", "d", "Ljavax/crypto/SecretKey;", "O", "()Ljavax/crypto/SecretKey;", "cryptoKey", "J", "()[B", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EncryptionKey extends SharedObject {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final KeySize keySize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SecretKey cryptoKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptionKey(KeySize size) throws NoSuchAlgorithmException {
        super(null, 1, 0 == true ? 1 : 0);
        AbstractC5504s.h(size, "size");
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(size.getBitSize());
        this.keySize = size;
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        AbstractC5504s.g(secretKeyGenerateKey, "generateKey(...)");
        this.cryptoKey = secretKeyGenerateKey;
    }

    public final byte[] J() {
        byte[] encoded = this.cryptoKey.getEncoded();
        AbstractC5504s.g(encoded, "getEncoded(...)");
        return encoded;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final SecretKey getCryptoKey() {
        return this.cryptoKey;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final KeySize getKeySize() {
        return this.keySize;
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public int k() {
        return this.keySize.getByteSize();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptionKey(byte[] bytes) {
        super(null, 1, 0 == true ? 1 : 0);
        AbstractC5504s.h(bytes, "bytes");
        this.keySize = KeySize.INSTANCE.a(bytes.length);
        this.cryptoKey = new SecretKeySpec(bytes, "AES");
    }
}
