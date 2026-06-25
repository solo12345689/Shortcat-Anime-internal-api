package expo.modules.image.records;

import be.AbstractC3048a;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lexpo/modules/image/records/CachePolicy;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NONE", "DISK", "MEMORY", "MEMORY_AND_DISK", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CachePolicy implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CachePolicy[] $VALUES;
    private final String value;
    public static final CachePolicy NONE = new CachePolicy("NONE", 0, "none");
    public static final CachePolicy DISK = new CachePolicy("DISK", 1, "disk");
    public static final CachePolicy MEMORY = new CachePolicy("MEMORY", 2, "memory");
    public static final CachePolicy MEMORY_AND_DISK = new CachePolicy("MEMORY_AND_DISK", 3, "memory-disk");

    private static final /* synthetic */ CachePolicy[] $values() {
        return new CachePolicy[]{NONE, DISK, MEMORY, MEMORY_AND_DISK};
    }

    static {
        CachePolicy[] cachePolicyArr$values = $values();
        $VALUES = cachePolicyArr$values;
        $ENTRIES = AbstractC3048a.a(cachePolicyArr$values);
    }

    private CachePolicy(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static CachePolicy valueOf(String str) {
        return (CachePolicy) Enum.valueOf(CachePolicy.class, str);
    }

    public static CachePolicy[] values() {
        return (CachePolicy[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
