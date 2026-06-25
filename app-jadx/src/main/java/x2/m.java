package x2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f63778a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f63779b = new ArrayList();

    private m a(String str, Object obj) {
        this.f63778a.put((String) AbstractC6614a.e(str), AbstractC6614a.e(obj));
        this.f63779b.remove(str);
        return this;
    }

    public static m g(m mVar, long j10) {
        return mVar.e("exo_len", j10);
    }

    public static m h(m mVar, Uri uri) {
        return uri == null ? mVar.d("exo_redir") : mVar.f("exo_redir", uri.toString());
    }

    public Map b() {
        HashMap map = new HashMap(this.f63778a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List c() {
        return Collections.unmodifiableList(new ArrayList(this.f63779b));
    }

    public m d(String str) {
        this.f63779b.add(str);
        this.f63778a.remove(str);
        return this;
    }

    public m e(String str, long j10) {
        return a(str, Long.valueOf(j10));
    }

    public m f(String str, String str2) {
        return a(str, str2);
    }
}
