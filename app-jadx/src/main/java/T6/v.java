package T6;

import Td.u;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class v extends AbstractC2149b {

    /* JADX INFO: renamed from: f */
    private final t f17286f;

    /* JADX INFO: renamed from: g */
    private int f17287g;

    /* JADX INFO: renamed from: h */
    private final Map f17288h;

    /* JADX INFO: renamed from: i */
    private final JavaOnlyMap f17289i;

    /* JADX INFO: renamed from: j */
    private UIManager f17290j;

    public v(ReadableMap config, t nativeAnimatedNodesManager) {
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.f17286f = nativeAnimatedNodesManager;
        this.f17287g = -1;
        this.f17289i = new JavaOnlyMap();
        ReadableMap map = config.getMap("props");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map != null ? map.keySetIterator() : null;
        this.f17288h = new LinkedHashMap();
        while (readableMapKeySetIteratorKeySetIterator != null && readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.f17288h.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
    }

    @Override // T6.AbstractC2149b
    public String e() {
        return "PropsAnimatedNode[" + this.f17203d + "] connectedViewTag: " + this.f17287g + " propNodeMapping: " + this.f17288h + " propMap: " + this.f17289i;
    }

    public final void i(int i10, UIManager uIManager) {
        if (this.f17287g == -1) {
            this.f17287g = i10;
            this.f17290j = uIManager;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.f17203d + " is already attached to a view: " + this.f17287g);
    }

    public final void j(int i10) {
        int i11 = this.f17287g;
        if (i11 == i10 || i11 == -1) {
            this.f17287g = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + i10 + " but is connected to view " + this.f17287g);
    }

    public final View k() {
        Object objB;
        try {
            u.a aVar = Td.u.f17466b;
            UIManager uIManager = this.f17290j;
            objB = Td.u.b(uIManager != null ? uIManager.resolveView(this.f17287g) : null);
        } catch (Throwable th2) {
            u.a aVar2 = Td.u.f17466b;
            objB = Td.u.b(Td.v.a(th2));
        }
        return (View) (Td.u.g(objB) ? null : objB);
    }

    public final void l() {
        int i10 = this.f17287g;
        if (i10 == -1 || C7.a.a(i10) == 2) {
            return;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.f17289i.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            this.f17289i.putNull(readableMapKeySetIteratorKeySetIterator.nextKey());
        }
        UIManager uIManager = this.f17290j;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.f17287g, this.f17289i);
        }
    }

    public final void m() {
        if (this.f17287g == -1) {
            return;
        }
        for (Map.Entry entry : this.f17288h.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC2149b abstractC2149bK = this.f17286f.k(((Number) entry.getValue()).intValue());
            if (abstractC2149bK == null) {
                throw new IllegalArgumentException("Mapped property node does not exist");
            }
            if (abstractC2149bK instanceof x) {
                ((x) abstractC2149bK).i(this.f17289i);
            } else if (abstractC2149bK instanceof B) {
                B b10 = (B) abstractC2149bK;
                Object objK = b10.k();
                if (objK instanceof Integer) {
                    this.f17289i.putInt(str, ((Number) objK).intValue());
                } else if (objK instanceof String) {
                    this.f17289i.putString(str, (String) objK);
                } else {
                    this.f17289i.putDouble(str, b10.l());
                }
            } else if (abstractC2149bK instanceof f) {
                this.f17289i.putInt(str, ((f) abstractC2149bK).i());
            } else {
                if (!(abstractC2149bK instanceof u)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + abstractC2149bK.getClass());
                }
                ((u) abstractC2149bK).i(str, this.f17289i);
            }
        }
        UIManager uIManager = this.f17290j;
        if (uIManager != null) {
            uIManager.synchronouslyUpdateViewOnUIThread(this.f17287g, this.f17289i);
        }
    }
}
