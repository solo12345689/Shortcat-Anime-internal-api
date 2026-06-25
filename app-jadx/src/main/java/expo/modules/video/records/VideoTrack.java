package expo.modules.video.records;

import android.net.Uri;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.Serializable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.C6109x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001dR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b \u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u0012\u0004\b$\u0010\u001a\u001a\u0004\b#\u0010\u0018R \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010%\u0012\u0004\b'\u0010\u001a\u001a\u0004\b\u000b\u0010&R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010(\u0012\u0004\b+\u0010\u001a\u001a\u0004\b)\u0010*R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010(\u0012\u0004\b-\u0010\u001a\u001a\u0004\b,\u0010*R\"\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010(\u0012\u0004\b/\u0010\u001a\u001a\u0004\b.\u0010*R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u00100\u0012\u0004\b3\u0010\u001a\u001a\u0004\b1\u00102R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006;"}, d2 = {"Lexpo/modules/video/records/VideoTrack;", "Ljc/b;", "Ljava/io/Serializable;", "", DiagnosticsEntry.ID_KEY, "Landroid/net/Uri;", "url", "Lexpo/modules/video/records/VideoSize;", "size", "mimeType", "", "isSupported", "", "bitrate", "averageBitrate", "peakBitrate", "", "frameRate", "Lq2/x;", "format", "<init>", "(Ljava/lang/String;Landroid/net/Uri;Lexpo/modules/video/records/VideoSize;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Lq2/x;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "getUrl$annotations", "Lexpo/modules/video/records/VideoSize;", "getSize", "()Lexpo/modules/video/records/VideoSize;", "getSize$annotations", "getMimeType", "getMimeType$annotations", "Z", "()Z", "isSupported$annotations", "Ljava/lang/Integer;", "getBitrate", "()Ljava/lang/Integer;", "getBitrate$annotations", "getAverageBitrate", "getAverageBitrate$annotations", "getPeakBitrate", "getPeakBitrate$annotations", "Ljava/lang/Float;", "getFrameRate", "()Ljava/lang/Float;", "getFrameRate$annotations", "Lq2/x;", "getFormat", "()Lq2/x;", "setFormat", "(Lq2/x;)V", "Companion", "a", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoTrack implements InterfaceC5364b, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer averageBitrate;
    private final Integer bitrate;
    private C6109x format;
    private final Float frameRate;
    private final String id;
    private final boolean isSupported;
    private final String mimeType;
    private final Integer peakBitrate;
    private final VideoSize size;
    private final Uri url;

    /* JADX INFO: renamed from: expo.modules.video.records.VideoTrack$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VideoTrack a(C6109x c6109x, boolean z10, Uri uri) {
            String str;
            if (c6109x == null || (str = c6109x.f57008a) == null) {
                return null;
            }
            VideoSize videoSize = new VideoSize(c6109x);
            String str2 = c6109x.f57022o;
            Integer numValueOf = Integer.valueOf(c6109x.f57015h);
            Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
            Integer numValueOf2 = Integer.valueOf(c6109x.f57016i);
            Integer num2 = numValueOf2.intValue() != -1 ? numValueOf2 : null;
            Float fValueOf = Float.valueOf(c6109x.f57033z);
            return new VideoTrack(str, uri, videoSize, str2, z10, num == null ? num2 : num, num, num2, !((fValueOf.floatValue() > (-1.0f) ? 1 : (fValueOf.floatValue() == (-1.0f) ? 0 : -1)) == 0) ? fValueOf : null, c6109x);
        }

        private Companion() {
        }
    }

    public VideoTrack(String id2, Uri uri, VideoSize size, String str, boolean z10, Integer num, Integer num2, Integer num3, Float f10, C6109x c6109x) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(size, "size");
        this.id = id2;
        this.url = uri;
        this.size = size;
        this.mimeType = str;
        this.isSupported = z10;
        this.bitrate = num;
        this.averageBitrate = num2;
        this.peakBitrate = num3;
        this.frameRate = f10;
        this.format = c6109x;
    }

    public final Integer getAverageBitrate() {
        return this.averageBitrate;
    }

    public final Integer getBitrate() {
        return this.bitrate;
    }

    public final C6109x getFormat() {
        return this.format;
    }

    public final Float getFrameRate() {
        return this.frameRate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final Integer getPeakBitrate() {
        return this.peakBitrate;
    }

    public final VideoSize getSize() {
        return this.size;
    }

    public final Uri getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: isSupported, reason: from getter */
    public final boolean getIsSupported() {
        return this.isSupported;
    }

    public final void setFormat(C6109x c6109x) {
        this.format = c6109x;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ VideoTrack(java.lang.String r14, android.net.Uri r15, expo.modules.video.records.VideoSize r16, java.lang.String r17, boolean r18, java.lang.Integer r19, java.lang.Integer r20, java.lang.Integer r21, java.lang.Float r22, q2.C6109x r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r1 = 1
            r7 = r1
            goto Lb
        L9:
            r7 = r18
        Lb:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L12
            r8 = r2
            goto L14
        L12:
            r8 = r19
        L14:
            r1 = r0 & 64
            if (r1 == 0) goto L1a
            r9 = r2
            goto L1c
        L1a:
            r9 = r20
        L1c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L22
            r10 = r2
            goto L24
        L22:
            r10 = r21
        L24:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2a
            r11 = r2
            goto L2c
        L2a:
            r11 = r22
        L2c:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L39
            r12 = r2
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r2 = r13
            goto L42
        L39:
            r12 = r23
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
        L42:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.video.records.VideoTrack.<init>(java.lang.String, android.net.Uri, expo.modules.video.records.VideoSize, java.lang.String, boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float, q2.x, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @InterfaceC5363a
    public static /* synthetic */ void getAverageBitrate$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getBitrate$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getFrameRate$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getPeakBitrate$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getSize$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getUrl$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void isSupported$annotations() {
    }
}
