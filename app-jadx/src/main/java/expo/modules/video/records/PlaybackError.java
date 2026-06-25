package expo.modules.video.records;

import java.io.Serializable;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q2.C6082N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tR*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\n\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006¨\u0006\u0012"}, d2 = {"Lexpo/modules/video/records/PlaybackError;", "Ljc/b;", "Ljava/io/Serializable;", "", "message", "<init>", "(Ljava/lang/String;)V", "Lq2/N;", "exception", "(Lq2/N;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "getMessage$annotations", "()V", "Companion", "a", "expo-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlaybackError implements InterfaceC5364b, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String message;

    /* JADX INFO: renamed from: expo.modules.video.records.PlaybackError$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(C6082N c6082n) {
            String localizedMessage;
            String localizedMessage2 = c6082n.getLocalizedMessage();
            Throwable cause = c6082n.getCause();
            if (cause == null || (localizedMessage = cause.getLocalizedMessage()) == null) {
                localizedMessage = "";
            }
            return "A playback exception has occurred: " + (localizedMessage2 + " " + localizedMessage);
        }

        private Companion() {
        }
    }

    public PlaybackError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public PlaybackError(String str) {
        this.message = str;
    }

    public /* synthetic */ PlaybackError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaybackError(C6082N exception) {
        this(INSTANCE.b(exception));
        AbstractC5504s.h(exception, "exception");
    }

    @InterfaceC5363a
    public static /* synthetic */ void getMessage$annotations() {
    }
}
