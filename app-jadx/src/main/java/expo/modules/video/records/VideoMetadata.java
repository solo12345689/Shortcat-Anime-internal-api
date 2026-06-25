package expo.modules.video.records;

import android.net.Uri;
import com.amazon.a.a.o.b;
import java.io.Serializable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\n\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\n\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u0014\u0012\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lexpo/modules/video/records/VideoMetadata;", "Ljc/b;", "Ljava/io/Serializable;", "", b.f34626S, "artist", "Landroid/net/Uri;", "artwork", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getTitle$annotations", "()V", "getArtist", "setArtist", "getArtist$annotations", "Landroid/net/Uri;", "getArtwork", "()Landroid/net/Uri;", "setArtwork", "(Landroid/net/Uri;)V", "getArtwork$annotations", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VideoMetadata implements InterfaceC5364b, Serializable {
    private String artist;
    private Uri artwork;
    private String title;

    public VideoMetadata() {
        this(null, null, null, 7, null);
    }

    public final String getArtist() {
        return this.artist;
    }

    public final Uri getArtwork() {
        return this.artwork;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setArtist(String str) {
        this.artist = str;
    }

    public final void setArtwork(Uri uri) {
        this.artwork = uri;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public VideoMetadata(String str, String str2, Uri uri) {
        this.title = str;
        this.artist = str2;
        this.artwork = uri;
    }

    public /* synthetic */ VideoMetadata(String str, String str2, Uri uri, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : uri);
    }

    @InterfaceC5363a
    public static /* synthetic */ void getArtist$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getArtwork$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getTitle$annotations() {
    }
}
