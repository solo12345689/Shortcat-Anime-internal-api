package expo.modules.video.records;

import expo.modules.video.enums.DRMType;
import java.io.Serializable;
import java.util.Map;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.C6071C;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0017\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR6\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u001d\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010#\u0012\u0004\b(\u0010\u0016\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lexpo/modules/video/records/DRMOptions;", "Ljc/b;", "Ljava/io/Serializable;", "Lexpo/modules/video/enums/DRMType;", "type", "", "licenseServer", "", "headers", "", "multiKey", "<init>", "(Lexpo/modules/video/enums/DRMType;Ljava/lang/String;Ljava/util/Map;Z)V", "Lq2/C$f;", "toDRMConfiguration", "()Lq2/C$f;", "Lexpo/modules/video/enums/DRMType;", "getType", "()Lexpo/modules/video/enums/DRMType;", "setType", "(Lexpo/modules/video/enums/DRMType;)V", "getType$annotations", "()V", "Ljava/lang/String;", "getLicenseServer", "()Ljava/lang/String;", "setLicenseServer", "(Ljava/lang/String;)V", "getLicenseServer$annotations", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "getHeaders$annotations", "Z", "getMultiKey", "()Z", "setMultiKey", "(Z)V", "getMultiKey$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DRMOptions implements InterfaceC5364b, Serializable {
    private Map<String, String> headers;
    private String licenseServer;
    private boolean multiKey;
    private DRMType type;

    public DRMOptions() {
        this(null, null, null, false, 15, null);
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getLicenseServer() {
        return this.licenseServer;
    }

    public final boolean getMultiKey() {
        return this.multiKey;
    }

    public final DRMType getType() {
        return this.type;
    }

    public final void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public final void setLicenseServer(String str) {
        this.licenseServer = str;
    }

    public final void setMultiKey(boolean z10) {
        this.multiKey = z10;
    }

    public final void setType(DRMType dRMType) {
        AbstractC5504s.h(dRMType, "<set-?>");
        this.type = dRMType;
    }

    public final C6071C.f toDRMConfiguration() {
        C6071C.f.a aVar = new C6071C.f.a(this.type.toUUID());
        String str = this.licenseServer;
        if (str != null) {
            aVar.o(str);
        }
        Map<String, String> map = this.headers;
        if (map != null) {
            aVar.m(map);
        }
        aVar.p(this.multiKey);
        C6071C.f fVarI = aVar.i();
        AbstractC5504s.g(fVarI, "build(...)");
        return fVarI;
    }

    public DRMOptions(DRMType type, String str, Map<String, String> map, boolean z10) {
        AbstractC5504s.h(type, "type");
        this.type = type;
        this.licenseServer = str;
        this.headers = map;
        this.multiKey = z10;
    }

    public /* synthetic */ DRMOptions(DRMType dRMType, String str, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DRMType.WIDEVINE : dRMType, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : map, (i10 & 8) != 0 ? false : z10);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getLicenseServer$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMultiKey$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getType$annotations() {
    }
}
