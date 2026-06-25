package p8;

/* JADX INFO: renamed from: p8.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C5937b extends AbstractC5941f {

    /* JADX INFO: renamed from: a */
    private final Integer f55820a;

    C5937b(Integer num) {
        this.f55820a = num;
    }

    @Override // p8.AbstractC5941f
    public Integer a() {
        return this.f55820a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5941f)) {
            return false;
        }
        Integer num = this.f55820a;
        Integer numA = ((AbstractC5941f) obj).a();
        return num == null ? numA == null : num.equals(numA);
    }

    public int hashCode() {
        Integer num = this.f55820a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f55820a + "}";
    }
}
