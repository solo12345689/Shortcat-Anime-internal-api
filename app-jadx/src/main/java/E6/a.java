package E6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements e {

    /* JADX INFO: renamed from: c */
    private static final Set f5660c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: a */
    private Map f5661a = new HashMap();

    /* JADX INFO: renamed from: b */
    private m f5662b;

    @Override // E6.e
    public m B1() {
        if (this.f5662b == null) {
            this.f5662b = new n(getWidth(), getHeight(), A(), x1(), getExtras());
        }
        return this.f5662b;
    }

    @Override // E6.e
    public boolean W1() {
        return false;
    }

    @Override // E6.l, k6.InterfaceC5452a
    public Map getExtras() {
        return this.f5661a;
    }

    @Override // k6.InterfaceC5452a
    public void k(String str, Object obj) {
        if (f5660c.contains(str)) {
            this.f5661a.put(str, obj);
        }
    }

    @Override // k6.InterfaceC5452a
    public void w(Map map) {
        if (map == null) {
            return;
        }
        for (String str : f5660c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f5661a.put(str, obj);
            }
        }
    }

    @Override // E6.e
    public p x1() {
        return o.f5692d;
    }
}
