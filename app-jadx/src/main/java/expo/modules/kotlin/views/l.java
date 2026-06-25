package expo.modules.kotlin.views;

import com.facebook.react.bridge.ReadableMapKeySetIterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements ReadableMapKeySetIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadableMapKeySetIterator f46213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Ub.l f46214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46215c;

    public l(ReadableMapKeySetIterator iterator, Ub.l filter) {
        AbstractC5504s.h(iterator, "iterator");
        AbstractC5504s.h(filter, "filter");
        this.f46213a = iterator;
        this.f46214b = filter;
        a();
    }

    private final void a() {
        while (this.f46213a.hasNextKey()) {
            String strNextKey = this.f46213a.nextKey();
            this.f46215c = strNextKey;
            if (this.f46214b.apply(strNextKey)) {
                return;
            }
        }
        this.f46215c = null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public boolean hasNextKey() {
        return this.f46215c != null;
    }

    @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
    public String nextKey() {
        String str = this.f46215c;
        AbstractC5504s.e(str);
        a();
        return str;
    }
}
