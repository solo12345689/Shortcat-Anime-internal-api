package V0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a */
    private final CharSequence f19623a;

    /* JADX INFO: renamed from: b */
    private final TextPaint f19624b;

    /* JADX INFO: renamed from: c */
    private final int f19625c;

    /* JADX INFO: renamed from: d */
    private float f19626d = Float.NaN;

    /* JADX INFO: renamed from: e */
    private float f19627e = Float.NaN;

    /* JADX INFO: renamed from: f */
    private BoringLayout.Metrics f19628f;

    /* JADX INFO: renamed from: g */
    private boolean f19629g;

    /* JADX INFO: renamed from: h */
    private CharSequence f19630h;

    public O(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f19623a = charSequence;
        this.f19624b = textPaint;
        this.f19625c = i10;
    }

    private final float b() {
        BoringLayout.Metrics metricsE = e();
        float fCeil = metricsE != null ? metricsE.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(h(this, 0, 0, 3, null));
        }
        return P.d(fCeil, this.f19623a, this.f19624b) ? fCeil + 0.5f : fCeil;
    }

    private final float c() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.f19624b.getTextLocale());
        CharSequence charSequence = this.f19623a;
        int i10 = 0;
        lineInstance.setText(new I(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: V0.N
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return O.d((Pair) obj, (Pair) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.d()).intValue() - ((Number) pair.c()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Pair pair2 = (Pair) it.next();
        float fG = g(((Number) pair2.getFirst()).intValue(), ((Number) pair2.getSecond()).intValue());
        while (it.hasNext()) {
            Pair pair3 = (Pair) it.next();
            fG = Math.max(fG, g(((Number) pair3.getFirst()).intValue(), ((Number) pair3.getSecond()).intValue()));
        }
        return fG;
    }

    public static final int d(Pair pair, Pair pair2) {
        return (((Number) pair.d()).intValue() - ((Number) pair.c()).intValue()) - (((Number) pair2.d()).intValue() - ((Number) pair2.c()).intValue());
    }

    private final CharSequence f() {
        CharSequence charSequence = this.f19630h;
        if (charSequence != null) {
            AbstractC5504s.e(charSequence);
            return charSequence;
        }
        if (!P.f19631a) {
            return this.f19623a;
        }
        CharSequence charSequenceE = P.e(this.f19623a);
        this.f19630h = charSequenceE;
        return charSequenceE;
    }

    private final float g(int i10, int i11) {
        return Layout.getDesiredWidth(f(), i10, i11, this.f19624b);
    }

    static /* synthetic */ float h(O o10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = o10.f().length();
        }
        return o10.g(i10, i11);
    }

    public final BoringLayout.Metrics e() {
        if (!this.f19629g) {
            this.f19628f = C2295k.f19643a.c(this.f19623a, this.f19624b, q0.k(this.f19625c));
            this.f19629g = true;
        }
        return this.f19628f;
    }

    public final float i() {
        if (!Float.isNaN(this.f19626d)) {
            return this.f19626d;
        }
        float fB = b();
        this.f19626d = fB;
        return fB;
    }

    public final float j() {
        if (!Float.isNaN(this.f19627e)) {
            return this.f19627e;
        }
        float fC = c();
        this.f19627e = fC;
        return fC;
    }
}
