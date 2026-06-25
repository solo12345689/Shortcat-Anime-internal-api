package com.swmansion.gesturehandler.react;

import Qa.AbstractC2081d;
import Qa.q;
import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.react.k;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements Qa.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f44288d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f44289a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f44290b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f44291c = new SparseArray();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final int[] f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        AbstractC5504s.e(array);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = array.getInt(i10);
        }
        return iArr;
    }

    @Override // Qa.e
    public boolean a(AbstractC2081d handler, AbstractC2081d otherHandler) {
        AbstractC5504s.h(handler, "handler");
        AbstractC5504s.h(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f44289a.get(handler.T());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == otherHandler.T()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Qa.e
    public boolean b(AbstractC2081d handler, AbstractC2081d otherHandler) {
        AbstractC5504s.h(handler, "handler");
        AbstractC5504s.h(otherHandler, "otherHandler");
        return otherHandler instanceof q ? ((q) otherHandler).X0() : otherHandler instanceof k.b;
    }

    @Override // Qa.e
    public boolean c(AbstractC2081d handler, AbstractC2081d otherHandler) {
        AbstractC5504s.h(handler, "handler");
        AbstractC5504s.h(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f44290b.get(handler.T());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == otherHandler.T()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Qa.e
    public boolean d(AbstractC2081d handler, AbstractC2081d otherHandler) {
        AbstractC5504s.h(handler, "handler");
        AbstractC5504s.h(otherHandler, "otherHandler");
        int[] iArr = (int[]) this.f44291c.get(handler.T());
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == otherHandler.T()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(AbstractC2081d handler, ReadableMap config) {
        AbstractC5504s.h(handler, "handler");
        AbstractC5504s.h(config, "config");
        handler.A0(this);
        if (config.hasKey("waitFor")) {
            this.f44289a.put(handler.T(), f(config, "waitFor"));
        }
        if (config.hasKey("simultaneousHandlers")) {
            this.f44290b.put(handler.T(), f(config, "simultaneousHandlers"));
        }
        if (config.hasKey("blocksHandlers")) {
            this.f44291c.put(handler.T(), f(config, "blocksHandlers"));
        }
    }

    public final void g(int i10) {
        this.f44289a.remove(i10);
        this.f44290b.remove(i10);
    }

    public final void h() {
        this.f44289a.clear();
        this.f44290b.clear();
    }
}
