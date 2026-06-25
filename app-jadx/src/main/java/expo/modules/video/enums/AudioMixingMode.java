package expo.modules.video.enums;

import Td.r;
import be.AbstractC3048a;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0011"}, d2 = {"Lexpo/modules/video/enums/AudioMixingMode;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MIX_WITH_OTHERS", "DUCK_OTHERS", "AUTO", "DO_NOT_MIX", "priority", "", "getPriority", "()I", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AudioMixingMode implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AudioMixingMode[] $VALUES;
    private final String value;
    public static final AudioMixingMode MIX_WITH_OTHERS = new AudioMixingMode("MIX_WITH_OTHERS", 0, "mixWithOthers");
    public static final AudioMixingMode DUCK_OTHERS = new AudioMixingMode("DUCK_OTHERS", 1, "duckOthers");
    public static final AudioMixingMode AUTO = new AudioMixingMode("AUTO", 2, "auto");
    public static final AudioMixingMode DO_NOT_MIX = new AudioMixingMode("DO_NOT_MIX", 3, "doNotMix");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46607a;

        static {
            int[] iArr = new int[AudioMixingMode.values().length];
            try {
                iArr[AudioMixingMode.DO_NOT_MIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioMixingMode.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioMixingMode.DUCK_OTHERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioMixingMode.MIX_WITH_OTHERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46607a = iArr;
        }
    }

    private static final /* synthetic */ AudioMixingMode[] $values() {
        return new AudioMixingMode[]{MIX_WITH_OTHERS, DUCK_OTHERS, AUTO, DO_NOT_MIX};
    }

    static {
        AudioMixingMode[] audioMixingModeArr$values = $values();
        $VALUES = audioMixingModeArr$values;
        $ENTRIES = AbstractC3048a.a(audioMixingModeArr$values);
    }

    private AudioMixingMode(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static AudioMixingMode valueOf(String str) {
        return (AudioMixingMode) Enum.valueOf(AudioMixingMode.class, str);
    }

    public static AudioMixingMode[] values() {
        return (AudioMixingMode[]) $VALUES.clone();
    }

    public final int getPriority() {
        int i10 = a.f46607a[ordinal()];
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 0;
        }
        throw new r();
    }

    public final String getValue() {
        return this.value;
    }
}
