package expo.modules.adapters.react;

import com.facebook.react.O;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import sb.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection f46018a = new ArrayList();

    public void a(O o10) {
        this.f46018a.add(o10);
    }

    public Collection b() {
        return this.f46018a;
    }

    @Override // sb.d
    public List c() {
        return Collections.singletonList(c.class);
    }
}
