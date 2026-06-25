package expo.modules.video.enums;

import Fd.B;
import Td.r;
import be.AbstractC3048a;
import expo.modules.kotlin.types.Enumerable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import q2.AbstractC6096k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0011"}, d2 = {"Lexpo/modules/video/enums/DRMType;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CLEARKEY", "FAIRPLAY", "PLAYREADY", "WIDEVINE", "isSupported", "", "toUUID", "Ljava/util/UUID;", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DRMType implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DRMType[] $VALUES;
    public static final DRMType CLEARKEY = new DRMType("CLEARKEY", 0, "clearkey");
    public static final DRMType FAIRPLAY = new DRMType("FAIRPLAY", 1, "fairplay");
    public static final DRMType PLAYREADY = new DRMType("PLAYREADY", 2, "playready");
    public static final DRMType WIDEVINE = new DRMType("WIDEVINE", 3, "widevine");
    private final String value;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46610a;

        static {
            int[] iArr = new int[DRMType.values().length];
            try {
                iArr[DRMType.CLEARKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DRMType.FAIRPLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DRMType.PLAYREADY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DRMType.WIDEVINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46610a = iArr;
        }
    }

    private static final /* synthetic */ DRMType[] $values() {
        return new DRMType[]{CLEARKEY, FAIRPLAY, PLAYREADY, WIDEVINE};
    }

    static {
        DRMType[] dRMTypeArr$values = $values();
        $VALUES = dRMTypeArr$values;
        $ENTRIES = AbstractC3048a.a(dRMTypeArr$values);
    }

    private DRMType(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static DRMType valueOf(String str) {
        return (DRMType) Enum.valueOf(DRMType.class, str);
    }

    public static DRMType[] values() {
        return (DRMType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isSupported() {
        return this != FAIRPLAY;
    }

    public final UUID toUUID() throws B {
        int i10 = a.f46610a[ordinal()];
        if (i10 == 1) {
            UUID CLEARKEY_UUID = AbstractC6096k.f56895c;
            AbstractC5504s.g(CLEARKEY_UUID, "CLEARKEY_UUID");
            return CLEARKEY_UUID;
        }
        if (i10 == 2) {
            throw new B(this);
        }
        if (i10 == 3) {
            UUID PLAYREADY_UUID = AbstractC6096k.f56897e;
            AbstractC5504s.g(PLAYREADY_UUID, "PLAYREADY_UUID");
            return PLAYREADY_UUID;
        }
        if (i10 != 4) {
            throw new r();
        }
        UUID WIDEVINE_UUID = AbstractC6096k.f56896d;
        AbstractC5504s.g(WIDEVINE_UUID, "WIDEVINE_UUID");
        return WIDEVINE_UUID;
    }
}
