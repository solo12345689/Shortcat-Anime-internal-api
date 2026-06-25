package expo.modules.crypto.aes.records;

import android.util.Base64;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.EitherOfThree;
import java.security.SecureRandom;
import javax.crypto.spec.GCMParameterSpec;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR4\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016R4\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0018j\u0004\u0018\u0001`\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lexpo/modules/crypto/aes/records/EncryptOptions;", "Ljc/b;", "<init>", "()V", "Ljava/security/SecureRandom;", "random", "Ljavax/crypto/spec/GCMParameterSpec;", "gcmParameterSpec$expo_crypto_release", "(Ljava/security/SecureRandom;)Ljavax/crypto/spec/GCMParameterSpec;", "gcmParameterSpec", "Lexpo/modules/kotlin/types/EitherOfThree;", "", "", "", "nonce", "Lexpo/modules/kotlin/types/EitherOfThree;", "getNonce", "()Lexpo/modules/kotlin/types/EitherOfThree;", "getNonce$annotations", "tagLength", "Ljava/lang/Integer;", "getTagLength", "()Ljava/lang/Integer;", "getTagLength$annotations", "Lexpo/modules/kotlin/types/Either;", "Lexpo/modules/crypto/aes/BinaryInput;", "additionalData", "Lexpo/modules/kotlin/types/Either;", "getAdditionalData", "()Lexpo/modules/kotlin/types/Either;", "getAdditionalData$annotations", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EncryptOptions implements InterfaceC5364b {
    private final Either<byte[], String> additionalData;
    private final EitherOfThree<String, byte[], Integer> nonce;
    private final Integer tagLength;

    public final GCMParameterSpec gcmParameterSpec$expo_crypto_release(SecureRandom random) {
        byte[] bArrDecode;
        AbstractC5504s.h(random, "random");
        EitherOfThree<String, byte[], Integer> eitherOfThree = this.nonce;
        if (eitherOfThree == null && this.tagLength == null) {
            return null;
        }
        if (eitherOfThree == null) {
            bArrDecode = new byte[12];
            random.nextBytes(bArrDecode);
        } else {
            Class cls = Integer.TYPE;
            if (eitherOfThree.h(O.b(cls))) {
                bArrDecode = new byte[((Number) this.nonce.g(O.b(cls))).intValue()];
                random.nextBytes(bArrDecode);
            } else {
                bArrDecode = this.nonce.e(O.b(String.class)) ? Base64.decode((String) this.nonce.b(O.b(String.class)), 2) : (byte[]) this.nonce.c(O.b(byte[].class));
            }
        }
        Integer num = this.tagLength;
        return new GCMParameterSpec((num != null ? num.intValue() : 16) * 8, bArrDecode);
    }

    public final Either<byte[], String> getAdditionalData() {
        return this.additionalData;
    }

    public final EitherOfThree<String, byte[], Integer> getNonce() {
        return this.nonce;
    }

    public final Integer getTagLength() {
        return this.tagLength;
    }

    @InterfaceC5363a
    public static /* synthetic */ void getAdditionalData$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getNonce$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getTagLength$annotations() {
    }
}
