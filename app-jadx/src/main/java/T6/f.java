package T6;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends AbstractC2149b implements d {

    /* JADX INFO: renamed from: n */
    public static final a f17208n = new a(null);

    /* JADX INFO: renamed from: f */
    private final t f17209f;

    /* JADX INFO: renamed from: g */
    private final ReactApplicationContext f17210g;

    /* JADX INFO: renamed from: h */
    private int f17211h;

    /* JADX INFO: renamed from: i */
    private int f17212i;

    /* JADX INFO: renamed from: j */
    private int f17213j;

    /* JADX INFO: renamed from: k */
    private int f17214k;

    /* JADX INFO: renamed from: l */
    private ReadableMap f17215l;

    /* JADX INFO: renamed from: m */
    private boolean f17216m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Context b(AbstractC2149b abstractC2149b) {
            List list = abstractC2149b.f17200a;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC2149b abstractC2149b2 = (AbstractC2149b) it.next();
                    if (!(abstractC2149b2 instanceof v)) {
                        return f.f17208n.b(abstractC2149b2);
                    }
                    View viewK = ((v) abstractC2149b2).k();
                    if (viewK != null) {
                        return viewK.getContext();
                    }
                    return null;
                }
            }
            return null;
        }

        private a() {
        }
    }

    public f(ReadableMap config, t nativeAnimatedNodesManager, ReactApplicationContext reactApplicationContext) {
        AbstractC5504s.h(config, "config");
        AbstractC5504s.h(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        AbstractC5504s.h(reactApplicationContext, "reactApplicationContext");
        this.f17209f = nativeAnimatedNodesManager;
        this.f17210g = reactApplicationContext;
        a(config);
    }

    private final Context j() {
        Activity currentActivity = this.f17210g.getCurrentActivity();
        return currentActivity != null ? currentActivity : f17208n.b(this);
    }

    private final void k() {
        Context contextJ;
        Integer color;
        if (this.f17215l == null || this.f17216m || (contextJ = j()) == null || (color = ColorPropConverter.getColor(this.f17215l, contextJ)) == null) {
            return;
        }
        int iIntValue = color.intValue();
        B b10 = (B) this.f17209f.k(this.f17211h);
        B b11 = (B) this.f17209f.k(this.f17212i);
        B b12 = (B) this.f17209f.k(this.f17213j);
        B b13 = (B) this.f17209f.k(this.f17214k);
        if (b10 != null) {
            b10.f17194f = Color.red(iIntValue);
        }
        if (b11 != null) {
            b11.f17194f = Color.green(iIntValue);
        }
        if (b12 != null) {
            b12.f17194f = Color.blue(iIntValue);
        }
        if (b13 != null) {
            b13.f17194f = ((double) Color.alpha(iIntValue)) / 255.0d;
        }
        this.f17216m = true;
    }

    @Override // T6.d
    public void a(ReadableMap readableMap) {
        if (readableMap == null) {
            this.f17211h = 0;
            this.f17212i = 0;
            this.f17213j = 0;
            this.f17214k = 0;
            this.f17215l = null;
            this.f17216m = false;
            return;
        }
        this.f17211h = readableMap.getInt("r");
        this.f17212i = readableMap.getInt("g");
        this.f17213j = readableMap.getInt("b");
        this.f17214k = readableMap.getInt("a");
        this.f17215l = readableMap.getMap("nativeColor");
        this.f17216m = false;
        k();
    }

    @Override // T6.AbstractC2149b
    public String e() {
        return "ColorAnimatedNode[" + this.f17203d + "]: r: " + this.f17211h + "  g: " + this.f17212i + " b: " + this.f17213j + " a: " + this.f17214k;
    }

    public final int i() {
        k();
        B b10 = (B) this.f17209f.k(this.f17211h);
        B b11 = (B) this.f17209f.k(this.f17212i);
        B b12 = (B) this.f17209f.k(this.f17213j);
        B b13 = (B) this.f17209f.k(this.f17214k);
        return com.facebook.react.views.view.b.b(b10 != null ? b10.f17194f : 0.0d, b11 != null ? b11.f17194f : 0.0d, b12 != null ? b12.f17194f : 0.0d, b13 != null ? b13.f17194f : 0.0d);
    }
}
