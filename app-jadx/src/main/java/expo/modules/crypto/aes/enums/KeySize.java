package expo.modules.crypto.aes.enums;

import be.AbstractC3048a;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import expo.modules.kotlin.types.Enumerable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xb.C7125e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/crypto/aes/enums/KeySize;", "Lexpo/modules/kotlin/types/Enumerable;", "", "", "bitSize", "<init>", "(Ljava/lang/String;II)V", "I", "getBitSize", "()I", "getByteSize", "byteSize", "Companion", "a", "AES128", "AES192", "AES256", "expo-crypto_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeySize implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KeySize[] $VALUES;
    public static final KeySize AES128 = new KeySize("AES128", 0, 128);
    public static final KeySize AES192 = new KeySize("AES192", 1, JfifUtil.MARKER_SOFn);
    public static final KeySize AES256 = new KeySize("AES256", 2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int bitSize;

    /* JADX INFO: renamed from: expo.modules.crypto.aes.enums.KeySize$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KeySize a(int i10) throws C7125e {
            Object next;
            Iterator<E> it = KeySize.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((KeySize) next).getByteSize() == i10) {
                    break;
                }
            }
            KeySize keySize = (KeySize) next;
            if (keySize != null) {
                return keySize;
            }
            throw new C7125e(i10);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ KeySize[] $values() {
        return new KeySize[]{AES128, AES192, AES256};
    }

    static {
        KeySize[] keySizeArr$values = $values();
        $VALUES = keySizeArr$values;
        $ENTRIES = AbstractC3048a.a(keySizeArr$values);
        INSTANCE = new Companion(null);
    }

    private KeySize(String str, int i10, int i11) {
        this.bitSize = i11;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static KeySize valueOf(String str) {
        return (KeySize) Enum.valueOf(KeySize.class, str);
    }

    public static KeySize[] values() {
        return (KeySize[]) $VALUES.clone();
    }

    public final int getBitSize() {
        return this.bitSize;
    }

    public final int getByteSize() {
        return this.bitSize / 8;
    }
}
