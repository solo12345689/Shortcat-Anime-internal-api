package E0;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import r0.C6224f;

/* JADX INFO: renamed from: E0.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1299i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f4155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseLongArray f4156b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f4157c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f4158d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4159e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4160f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f4156b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f4156b;
                long j10 = this.f4155a;
                this.f4155a = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f4156b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f4156b;
            long j11 = this.f4155a;
            this.f4155a = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f4157c.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f4159e && source == this.f4160f) {
            return;
        }
        this.f4159e = toolType;
        this.f4160f = source;
        this.f4157c.clear();
        this.f4156b.clear();
    }

    private final F d(S s10, MotionEvent motionEvent, int i10, boolean z10) {
        long jQ;
        long jA;
        int i11;
        long jF = f(motionEvent.getPointerId(i10));
        float pressure = motionEvent.getPressure(i10);
        char c10 = ' ';
        long j10 = 4294967295L;
        long jE = C6224f.e((((long) Float.floatToRawIntBits(motionEvent.getY(i10))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i10))) << 32));
        long jG = C6224f.g(jE, 0.0f, 0.0f, 3, null);
        if (i10 == 0) {
            jA = C6224f.e((((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32));
            jQ = s10.q(jA);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jA = C1302l.f4161a.a(motionEvent, i10);
            jQ = s10.q(jA);
        } else {
            long jB = s10.B(jE);
            jQ = jE;
            jA = jB;
        }
        int toolType = motionEvent.getToolType(i10);
        int iE = toolType != 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? Q.f4086a.e() : Q.f4086a.a() : Q.f4086a.b() : Q.f4086a.c() : Q.f4086a.d() : Q.f4086a.e();
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i12 = 0;
        while (i12 < historySize) {
            float historicalX = motionEvent.getHistoricalX(i10, i12);
            float historicalY = motionEvent.getHistoricalY(i10, i12);
            char c11 = c10;
            long j11 = j10;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                i11 = i12;
            } else {
                long jE2 = C6224f.e((((long) Float.floatToRawIntBits(historicalX)) << c11) | (((long) Float.floatToRawIntBits(historicalY)) & j11));
                i11 = i12;
                arrayList.add(new C1294d(motionEvent.getHistoricalEventTime(i11), jE2, jE2, null));
            }
            i12 = i11 + 1;
            c10 = c11;
            j10 = j11;
        }
        return new F(jF, motionEvent.getEventTime(), jA, jQ, z10, pressure, iE, this.f4157c.get(motionEvent.getPointerId(i10), false), arrayList, motionEvent.getActionMasked() == 8 ? C6224f.e((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & j10) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c10)) : C6224f.f58329b.c(), jG, null);
    }

    private final long f(int i10) {
        long jValueAt;
        int iIndexOfKey = this.f4156b.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f4156b.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.f4155a;
            this.f4155a = 1 + jValueAt;
            this.f4156b.put(i10, jValueAt);
        }
        return B.b(jValueAt);
    }

    private final boolean g(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f4157c.get(pointerId, false)) {
                this.f4156b.delete(pointerId);
                this.f4157c.delete(pointerId);
            }
        }
        if (this.f4156b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f4156b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f4156b.keyAt(size);
                if (!g(motionEvent, iKeyAt)) {
                    this.f4156b.removeAt(size);
                    this.f4157c.delete(iKeyAt);
                }
            }
        }
    }

    public final E c(MotionEvent motionEvent, S s10) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f4156b.clear();
            this.f4157c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.f4157c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.f4158d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.f4158d.add(d(s10, motionEvent, i10, (z10 || i10 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        h(motionEvent);
        return new E(motionEvent.getEventTime(), this.f4158d, motionEvent);
    }

    public final void e(int i10) {
        this.f4157c.delete(i10);
        this.f4156b.delete(i10);
    }
}
