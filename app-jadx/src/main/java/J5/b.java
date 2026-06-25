package j5;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f51645a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f51645a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f51645a;
    }
}
