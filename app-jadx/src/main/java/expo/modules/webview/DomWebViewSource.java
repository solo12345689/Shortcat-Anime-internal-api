package expo.modules.webview;

import jc.InterfaceC5363a;
import jc.InterfaceC5364b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, d2 = {"Lexpo/modules/webview/DomWebViewSource;", "Ljc/b;", "", "uri", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lexpo/modules/webview/DomWebViewSource;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUri", "getUri$annotations", "()V", "expo-dom-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DomWebViewSource implements InterfaceC5364b {
    private final String uri;

    public DomWebViewSource(String str) {
        this.uri = str;
    }

    public static /* synthetic */ DomWebViewSource copy$default(DomWebViewSource domWebViewSource, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = domWebViewSource.uri;
        }
        return domWebViewSource.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final DomWebViewSource copy(String uri) {
        return new DomWebViewSource(uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DomWebViewSource) && AbstractC5504s.c(this.uri, ((DomWebViewSource) other).uri);
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "DomWebViewSource(uri=" + this.uri + ")";
    }

    @InterfaceC5363a
    public static /* synthetic */ void getUri$annotations() {
    }
}
