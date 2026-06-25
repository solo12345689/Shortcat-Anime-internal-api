package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f28730a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static HandlerThread f28731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Handler f28732f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        SparseIntArray[] f28734b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f28735c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f28736d = new WindowOnFrameMetricsAvailableListenerC0490a();

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class WindowOnFrameMetricsAvailableListenerC0490a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0490a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f28733a & 1) != 0) {
                    aVar.f(aVar.f28734b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f28733a & 2) != 0) {
                    aVar2.f(aVar2.f28734b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f28733a & 4) != 0) {
                    aVar3.f(aVar3.f28734b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f28733a & 8) != 0) {
                    aVar4.f(aVar4.f28734b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f28733a & 16) != 0) {
                    aVar5.f(aVar5.f28734b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f28733a & 64) != 0) {
                    aVar6.f(aVar6.f28734b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f28733a & 32) != 0) {
                    aVar7.f(aVar7.f28734b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f28733a & 128) != 0) {
                    aVar8.f(aVar8.f28734b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f28733a & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                    aVar9.f(aVar9.f28734b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f28733a = i10;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (f28731e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f28731e = handlerThread;
                handlerThread.start();
                f28732f = new Handler(f28731e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f28734b;
                if (sparseIntArrayArr[i10] == null && (this.f28733a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f28736d, f28732f);
            this.f28735c.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f28734b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            Iterator it = this.f28735c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f28735c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f28736d);
            return this.f28734b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f28734b;
            this.f28734b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.f28735c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = (WeakReference) this.f28735c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f28736d);
                    this.f28735c.remove(size);
                }
            }
            return this.f28734b;
        }

        void f(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {
        b() {
        }

        public abstract void a(Activity activity);

        public abstract SparseIntArray[] b();

        public abstract SparseIntArray[] c(Activity activity);

        public abstract SparseIntArray[] d();

        public abstract SparseIntArray[] e();
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f28730a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f28730a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f28730a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f28730a.d();
    }

    public SparseIntArray[] e() {
        return this.f28730a.e();
    }

    public FrameMetricsAggregator(int i10) {
        this.f28730a = new a(i10);
    }
}
