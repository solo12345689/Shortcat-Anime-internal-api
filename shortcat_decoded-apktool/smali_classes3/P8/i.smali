.class public abstract LP8/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(LP8/k;LP8/f;)LP8/h;
    .locals 2

    .line 1
    const-string v0, "Result must not be null"

    .line 2
    .line 3
    invoke-static {p0, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, LP8/k;->b()Lcom/google/android/gms/common/api/Status;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->l()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    xor-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    const-string v1, "Status code must not be SUCCESS"

    .line 17
    .line 18
    invoke-static {v0, v1}, LR8/p;->b(ZLjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, LP8/o;

    .line 22
    .line 23
    invoke-direct {v0, p1, p0}, LP8/o;-><init>(LP8/f;LP8/k;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(LP8/k;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public static b(LP8/k;LP8/f;)LP8/g;
    .locals 1

    .line 1
    const-string v0, "Result must not be null"

    .line 2
    .line 3
    invoke-static {p0, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, LP8/p;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LP8/p;-><init>(LP8/f;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(LP8/k;)V

    .line 12
    .line 13
    .line 14
    new-instance p0, LQ8/m;

    .line 15
    .line 16
    invoke-direct {p0, v0}, LQ8/m;-><init>(LP8/h;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static c(Lcom/google/android/gms/common/api/Status;LP8/f;)LP8/h;
    .locals 1

    .line 1
    const-string v0, "Result must not be null"

    .line 2
    .line 3
    invoke-static {p0, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, LQ8/q;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LQ8/q;-><init>(LP8/f;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(LP8/k;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
