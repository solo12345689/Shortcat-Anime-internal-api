package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f42599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42600d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private E9.e f42603g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f42597a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E9.g f42598b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42601e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference f42602f = new WeakReference(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends E9.g {
        a() {
        }

        @Override // E9.g
        public void a(int i10) {
            j.this.f42601e = true;
            b bVar = (b) j.this.f42602f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // E9.g
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            j.this.f42601e = true;
            b bVar = (b) j.this.f42602f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public j(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f42597a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f42597a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f42599c = d(str);
        this.f42600d = c(str);
        this.f42601e = false;
    }

    public E9.e e() {
        return this.f42603g;
    }

    public float f(String str) {
        if (!this.f42601e) {
            return this.f42600d;
        }
        i(str);
        return this.f42600d;
    }

    public TextPaint g() {
        return this.f42597a;
    }

    public float h(String str) {
        if (!this.f42601e) {
            return this.f42599c;
        }
        i(str);
        return this.f42599c;
    }

    public void j(b bVar) {
        this.f42602f = new WeakReference(bVar);
    }

    public void k(E9.e eVar, Context context) {
        if (this.f42603g != eVar) {
            this.f42603g = eVar;
            if (eVar != null) {
                eVar.q(context, this.f42597a, this.f42598b);
                b bVar = (b) this.f42602f.get();
                if (bVar != null) {
                    this.f42597a.drawableState = bVar.getState();
                }
                eVar.p(context, this.f42597a, this.f42598b);
                this.f42601e = true;
            }
            b bVar2 = (b) this.f42602f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z10) {
        this.f42601e = z10;
    }

    public void m(boolean z10) {
        this.f42601e = z10;
    }

    public void n(Context context) {
        this.f42603g.p(context, this.f42597a, this.f42598b);
    }
}
