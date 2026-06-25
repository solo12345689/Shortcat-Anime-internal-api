package expo.modules.updates.reloadscreen;

import be.AbstractC3048a;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lexpo/modules/updates/reloadscreen/ImageResizeMode;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CONTAIN", "COVER", "CENTER", "STRETCH", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageResizeMode implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageResizeMode[] $VALUES;
    private final String value;
    public static final ImageResizeMode CONTAIN = new ImageResizeMode("CONTAIN", 0, "contain");
    public static final ImageResizeMode COVER = new ImageResizeMode("COVER", 1, "cover");
    public static final ImageResizeMode CENTER = new ImageResizeMode("CENTER", 2, "center");
    public static final ImageResizeMode STRETCH = new ImageResizeMode("STRETCH", 3, "stretch");

    private static final /* synthetic */ ImageResizeMode[] $values() {
        return new ImageResizeMode[]{CONTAIN, COVER, CENTER, STRETCH};
    }

    static {
        ImageResizeMode[] imageResizeModeArr$values = $values();
        $VALUES = imageResizeModeArr$values;
        $ENTRIES = AbstractC3048a.a(imageResizeModeArr$values);
    }

    private ImageResizeMode(String str, int i10, String str2) {
        this.value = str2;
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ImageResizeMode valueOf(String str) {
        return (ImageResizeMode) Enum.valueOf(ImageResizeMode.class, str);
    }

    public static ImageResizeMode[] values() {
        return (ImageResizeMode[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
