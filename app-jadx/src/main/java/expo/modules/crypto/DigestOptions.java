package expo.modules.crypto;

import be.AbstractC3048a;
import expo.modules.kotlin.types.Enumerable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lexpo/modules/crypto/DigestOptions;", "Ljc/b;", "<init>", "()V", "Lexpo/modules/crypto/DigestOptions$Encoding;", "encoding", "Lexpo/modules/crypto/DigestOptions$Encoding;", "getEncoding", "()Lexpo/modules/crypto/DigestOptions$Encoding;", "setEncoding", "(Lexpo/modules/crypto/DigestOptions$Encoding;)V", "getEncoding$annotations", "Encoding", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DigestOptions implements InterfaceC5364b {
    private Encoding encoding = Encoding.HEX;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/crypto/DigestOptions$Encoding;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "HEX", "BASE64", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Encoding implements Enumerable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Encoding[] $VALUES;
        private final String value;
        public static final Encoding HEX = new Encoding("HEX", 0, "hex");
        public static final Encoding BASE64 = new Encoding("BASE64", 1, "base64");

        private static final /* synthetic */ Encoding[] $values() {
            return new Encoding[]{HEX, BASE64};
        }

        static {
            Encoding[] encodingArr$values = $values();
            $VALUES = encodingArr$values;
            $ENTRIES = AbstractC3048a.a(encodingArr$values);
        }

        private Encoding(String str, int i10, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Encoding valueOf(String str) {
            return (Encoding) Enum.valueOf(Encoding.class, str);
        }

        public static Encoding[] values() {
            return (Encoding[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public final Encoding getEncoding() {
        return this.encoding;
    }

    public final void setEncoding(Encoding encoding) {
        AbstractC5504s.h(encoding, "<set-?>");
        this.encoding = encoding;
    }

    @InterfaceC5363a
    public static /* synthetic */ void getEncoding$annotations() {
    }
}
