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
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lexpo/modules/video/enums/ContentFit;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CONTAIN", "FILL", "COVER", "toResizeMode", "", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContentFit implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContentFit[] $VALUES;
    private final String value;
    public static final ContentFit CONTAIN = new ContentFit("CONTAIN", 0, "contain");
    public static final ContentFit FILL = new ContentFit("FILL", 1, "fill");
    public static final ContentFit COVER = new ContentFit("COVER", 2, "cover");

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46608a;

        static {
            int[] iArr = new int[ContentFit.values().length];
            try {
                iArr[ContentFit.CONTAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentFit.FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentFit.COVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46608a = iArr;
        }
    }

    private static final /* synthetic */ ContentFit[] $values() {
        return new ContentFit[]{CONTAIN, FILL, COVER};
    }

    static {
        ContentFit[] contentFitArr$values = $values();
        $VALUES = contentFitArr$values;
        $ENTRIES = AbstractC3048a.a(contentFitArr$values);
    }

    private ContentFit(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ContentFit valueOf(String str) {
        return (ContentFit) Enum.valueOf(ContentFit.class, str);
    }

    public static ContentFit[] values() {
        return (ContentFit[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final int toResizeMode() {
        int i10 = a.f46608a[ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 4;
        }
        throw new r();
    }
}
