package expo.modules.webview;

import com.amazon.a.a.o.b;
import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\tR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\tR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\t¨\u0006\u001f"}, d2 = {"Lexpo/modules/webview/OnMessageEvent;", "Ljc/b;", "", b.f34626S, "url", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/webview/OnMessageEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getUrl", "getUrl$annotations", "getData", "getData$annotations", "expo-dom-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OnMessageEvent implements InterfaceC5364b {
    private final String data;
    private final String title;
    private final String url;

    public OnMessageEvent(String title, String url, String data) {
        AbstractC5504s.h(title, "title");
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(data, "data");
        this.title = title;
        this.url = url;
        this.data = data;
    }

    public static /* synthetic */ OnMessageEvent copy$default(OnMessageEvent onMessageEvent, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = onMessageEvent.title;
        }
        if ((i10 & 2) != 0) {
            str2 = onMessageEvent.url;
        }
        if ((i10 & 4) != 0) {
            str3 = onMessageEvent.data;
        }
        return onMessageEvent.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final OnMessageEvent copy(String title, String url, String data) {
        AbstractC5504s.h(title, "title");
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(data, "data");
        return new OnMessageEvent(title, url, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnMessageEvent)) {
            return false;
        }
        OnMessageEvent onMessageEvent = (OnMessageEvent) other;
        return AbstractC5504s.c(this.title, onMessageEvent.title) && AbstractC5504s.c(this.url, onMessageEvent.url) && AbstractC5504s.c(this.data, onMessageEvent.data);
    }

    public final String getData() {
        return this.data;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.url.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "OnMessageEvent(title=" + this.title + ", url=" + this.url + ", data=" + this.data + ")";
    }

    @InterfaceC5363a
    public static /* synthetic */ void getData$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC5363a
    public static /* synthetic */ void getUrl$annotations() {
    }
}
