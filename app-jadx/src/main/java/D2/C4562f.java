package d2;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: renamed from: d2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4562f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f44998a;

    /* JADX INFO: renamed from: d2.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f44999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C4560d f45000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f45001c = true;

        a(TextView textView) {
            this.f44999a = textView;
            this.f45000b = new C4560d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f45000b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f45000b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof C4560d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C4564h ? ((C4564h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f44999a.setFilters(a(this.f44999a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C4564h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C4564h(transformationMethod);
        }

        @Override // d2.C4562f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f45001c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // d2.C4562f.b
        public boolean b() {
            return this.f45001c;
        }

        @Override // d2.C4562f.b
        void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // d2.C4562f.b
        void d(boolean z10) {
            this.f45001c = z10;
            l();
            k();
        }

        @Override // d2.C4562f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f45001c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z10) {
            this.f45001c = z10;
        }

        void l() {
            this.f44999a.setTransformationMethod(e(this.f44999a.getTransformationMethod()));
        }
    }

    /* JADX INFO: renamed from: d2.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z10);

        abstract void d(boolean z10);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    /* JADX INFO: renamed from: d2.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f45002a;

        c(TextView textView) {
            this.f45002a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.e.k();
        }

        @Override // d2.C4562f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f45002a.a(inputFilterArr);
        }

        @Override // d2.C4562f.b
        public boolean b() {
            return this.f45002a.b();
        }

        @Override // d2.C4562f.b
        void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f45002a.c(z10);
        }

        @Override // d2.C4562f.b
        void d(boolean z10) {
            if (f()) {
                this.f45002a.i(z10);
            } else {
                this.f45002a.d(z10);
            }
        }

        @Override // d2.C4562f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f45002a.e(transformationMethod);
        }
    }

    public C4562f(TextView textView, boolean z10) {
        K1.f.h(textView, "textView cannot be null");
        if (z10) {
            this.f44998a = new a(textView);
        } else {
            this.f44998a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f44998a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f44998a.b();
    }

    public void c(boolean z10) {
        this.f44998a.c(z10);
    }

    public void d(boolean z10) {
        this.f44998a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f44998a.e(transformationMethod);
    }
}
