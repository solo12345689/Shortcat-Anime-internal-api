package expo.modules.video.records;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.Serializable;
import java.util.Locale;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.C6109x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u0012\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u000fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000fR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\t\u0010\u0019R \u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u0012\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001f"}, d2 = {"Lexpo/modules/video/records/SubtitleTrack;", "Ljc/b;", "Ljava/io/Serializable;", "", DiagnosticsEntry.ID_KEY, "language", "label", "name", "", "isDefault", "autoSelect", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getLanguage", "getLanguage$annotations", "getLabel", "getLabel$annotations", "getName", "getName$annotations", "Z", "()Z", "isDefault$annotations", "getAutoSelect", "getAutoSelect$annotations", "Companion", "a", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SubtitleTrack implements InterfaceC5364b, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean autoSelect;
    private final String id;
    private final boolean isDefault;
    private final String label;
    private final String language;
    private final String name;

    /* JADX INFO: renamed from: expo.modules.video.records.SubtitleTrack$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SubtitleTrack a(C6109x c6109x) {
            String str;
            String str2;
            boolean z10;
            if (c6109x == null || (str = c6109x.f57008a) == null || (str2 = c6109x.f57011d) == null) {
                return null;
            }
            String displayLanguage = new Locale(str2).getDisplayLanguage();
            String str3 = c6109x.f57009b;
            int i10 = c6109x.f57012e;
            boolean z11 = true;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = true;
                z11 = false;
            }
            return new SubtitleTrack(str, str2, displayLanguage, str3, z11, (i10 & 4) != 0 ? z10 : false);
        }

        private Companion() {
        }
    }

    public SubtitleTrack(String id2, String str, String str2, String str3, boolean z10, boolean z11) {
        AbstractC5504s.h(id2, "id");
        this.id = id2;
        this.language = str;
        this.label = str2;
        this.name = str3;
        this.isDefault = z10;
        this.autoSelect = z11;
    }

    public final boolean getAutoSelect() {
        return this.autoSelect;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: isDefault, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    @InterfaceC5363a
    public static /* synthetic */ void getAutoSelect$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getLabel$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getLanguage$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getName$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void isDefault$annotations() {
    }
}
