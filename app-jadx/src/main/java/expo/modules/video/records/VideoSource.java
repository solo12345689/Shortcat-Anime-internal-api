package expo.modules.video.records;

import Fd.AbstractC1562a;
import Fd.B;
import M2.D;
import Ud.AbstractC2279u;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import expo.modules.video.enums.ContentType;
import expo.modules.video.enums.DRMType;
import expo.modules.video.records.VideoSource;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.C6071C;
import q2.C6077I;
import w2.C6929C;
import w2.o;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010%\u0012\u0004\b*\u0010$\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010+\u0012\u0004\b0\u0010$\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R6\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u00101\u0012\u0004\b6\u0010$\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u00107\u0012\u0004\b<\u0010$\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b@\u0010$\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lexpo/modules/video/records/VideoSource;", "Ljc/b;", "Ljava/io/Serializable;", "Landroid/net/Uri;", "uri", "Lexpo/modules/video/records/DRMOptions;", "drm", "Lexpo/modules/video/records/VideoMetadata;", "metadata", "", "", "headers", "", "useCaching", "Lexpo/modules/video/enums/ContentType;", "contentType", "<init>", "(Landroid/net/Uri;Lexpo/modules/video/records/DRMOptions;Lexpo/modules/video/records/VideoMetadata;Ljava/util/Map;ZLexpo/modules/video/enums/ContentType;)V", "toMediaId", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "parseLocalAssetId", "(Landroid/net/Uri;Landroid/content/Context;)Landroid/net/Uri;", "LM2/D;", "toMediaSource", "(Landroid/content/Context;)LM2/D;", "Lq2/C;", "toMediaItem", "(Landroid/content/Context;)Lq2/C;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "getUri$annotations", "()V", "Lexpo/modules/video/records/DRMOptions;", "getDrm", "()Lexpo/modules/video/records/DRMOptions;", "setDrm", "(Lexpo/modules/video/records/DRMOptions;)V", "getDrm$annotations", "Lexpo/modules/video/records/VideoMetadata;", "getMetadata", "()Lexpo/modules/video/records/VideoMetadata;", "setMetadata", "(Lexpo/modules/video/records/VideoMetadata;)V", "getMetadata$annotations", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "getHeaders$annotations", "Z", "getUseCaching", "()Z", "setUseCaching", "(Z)V", "getUseCaching$annotations", "Lexpo/modules/video/enums/ContentType;", "getContentType", "()Lexpo/modules/video/enums/ContentType;", "getContentType$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoSource implements InterfaceC5364b, Serializable {
    private final ContentType contentType;
    private DRMOptions drm;
    private Map<String, String> headers;
    private VideoMetadata metadata;
    private Uri uri;
    private boolean useCaching;

    public VideoSource() {
        this(null, null, null, null, false, null, 63, null);
    }

    private final Uri parseLocalAssetId(Uri uri, Context context) {
        if (uri != null && uri.getScheme() == null) {
            try {
                o oVar = new o(new Uri.Builder().scheme("android.resource").appendPath(String.valueOf(context.getResources().getIdentifier(uri.toString(), "raw", context.getPackageName()))).build());
                C6929C c6929c = new C6929C(context);
                c6929c.a(oVar);
                return c6929c.c();
            } catch (C6929C.a e10) {
                Log.e("ExpoVideo", "Error parsing local asset id, falling back to original uri", e10);
            }
        }
        return uri;
    }

    private final String toMediaId() {
        Uri artwork;
        Map<String, String> headers;
        Collection<String> collectionValues;
        Map<String, String> headers2;
        Set<String> setKeySet;
        Uri uri = this.uri;
        Map<String, String> map = this.headers;
        DRMOptions dRMOptions = this.drm;
        String path = null;
        DRMType type = dRMOptions != null ? dRMOptions.getType() : null;
        DRMOptions dRMOptions2 = this.drm;
        String licenseServer = dRMOptions2 != null ? dRMOptions2.getLicenseServer() : null;
        DRMOptions dRMOptions3 = this.drm;
        Boolean boolValueOf = dRMOptions3 != null ? Boolean.valueOf(dRMOptions3.getMultiKey()) : null;
        DRMOptions dRMOptions4 = this.drm;
        String strW0 = (dRMOptions4 == null || (headers2 = dRMOptions4.getHeaders()) == null || (setKeySet = headers2.keySet()) == null) ? null : AbstractC2279u.w0(setKeySet, null, null, null, 0, null, new Function1() { // from class: Ld.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoSource.toMediaId$lambda$0((String) obj);
            }
        }, 31, null);
        DRMOptions dRMOptions5 = this.drm;
        String strW02 = (dRMOptions5 == null || (headers = dRMOptions5.getHeaders()) == null || (collectionValues = headers.values()) == null) ? null : AbstractC2279u.w0(collectionValues, null, null, null, 0, null, new Function1() { // from class: Ld.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoSource.toMediaId$lambda$1((String) obj);
            }
        }, 31, null);
        VideoMetadata videoMetadata = this.metadata;
        String title = videoMetadata != null ? videoMetadata.getTitle() : null;
        VideoMetadata videoMetadata2 = this.metadata;
        String artist = videoMetadata2 != null ? videoMetadata2.getArtist() : null;
        VideoMetadata videoMetadata3 = this.metadata;
        if (videoMetadata3 != null && (artwork = videoMetadata3.getArtwork()) != null) {
            path = artwork.getPath();
        }
        return "uri:" + uri + "Headers: " + map + "DrmType:" + type + "DrmLicenseServer:" + licenseServer + "DrmMultiKey:" + boolValueOf + "DRMHeadersKeys:" + strW0 + "}DRMHeadersValues:" + strW02 + "}NotificationDataTitle:" + title + "NotificationDataSecondaryText:" + artist + "NotificationDataArtwork:" + path + "ContentType:" + this.contentType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toMediaId$lambda$0(String it) {
        AbstractC5504s.h(it, "it");
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toMediaId$lambda$1(String it) {
        AbstractC5504s.h(it, "it");
        return it;
    }

    public final ContentType getContentType() {
        return this.contentType;
    }

    public final DRMOptions getDrm() {
        return this.drm;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final VideoMetadata getMetadata() {
        return this.metadata;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final boolean getUseCaching() {
        return this.useCaching;
    }

    public final void setDrm(DRMOptions dRMOptions) {
        this.drm = dRMOptions;
    }

    public final void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public final void setMetadata(VideoMetadata videoMetadata) {
        this.metadata = videoMetadata;
    }

    public final void setUri(Uri uri) {
        this.uri = uri;
    }

    public final void setUseCaching(boolean z10) {
        this.useCaching = z10;
    }

    public final C6071C toMediaItem(Context context) throws B {
        AbstractC5504s.h(context, "context");
        C6071C.c cVar = new C6071C.c();
        cVar.j(parseLocalAssetId(this.uri, context));
        String mimeTypeString = this.contentType.toMimeTypeString();
        if (mimeTypeString != null) {
            cVar.f(mimeTypeString);
        }
        DRMOptions dRMOptions = this.drm;
        if (dRMOptions != null) {
            if (!dRMOptions.getType().isSupported()) {
                throw new B(dRMOptions.getType());
            }
            cVar.b(dRMOptions.toDRMConfiguration());
        }
        C6077I.b bVar = new C6077I.b();
        VideoMetadata videoMetadata = this.metadata;
        if (videoMetadata != null) {
            bVar.q0(videoMetadata.getTitle());
            bVar.Q(videoMetadata.getArtist());
            Uri artwork = videoMetadata.getArtwork();
            if (artwork != null) {
                bVar.S(artwork);
            }
        }
        cVar.e(bVar.J());
        C6071C c6071cA = cVar.a();
        AbstractC5504s.g(c6071cA, "build(...)");
        return c6071cA;
    }

    public final D toMediaSource(Context context) {
        AbstractC5504s.h(context, "context");
        if (this.uri == null) {
            return null;
        }
        return AbstractC1562a.c(context, this);
    }

    public VideoSource(Uri uri, DRMOptions dRMOptions, VideoMetadata videoMetadata, Map<String, String> map, boolean z10, ContentType contentType) {
        AbstractC5504s.h(contentType, "contentType");
        this.uri = uri;
        this.drm = dRMOptions;
        this.metadata = videoMetadata;
        this.headers = map;
        this.useCaching = z10;
        this.contentType = contentType;
    }

    public /* synthetic */ VideoSource(Uri uri, DRMOptions dRMOptions, VideoMetadata videoMetadata, Map map, boolean z10, ContentType contentType, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : uri, (i10 & 2) != 0 ? null : dRMOptions, (i10 & 4) != 0 ? null : videoMetadata, (i10 & 8) != 0 ? null : map, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? ContentType.AUTO : contentType);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getContentType$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getDrm$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getUri$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getUseCaching$annotations() {
    }
}
