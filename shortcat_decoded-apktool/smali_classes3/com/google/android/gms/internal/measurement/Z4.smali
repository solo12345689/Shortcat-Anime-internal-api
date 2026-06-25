.class final Lcom/google/android/gms/internal/measurement/Z4;
.super Lcom/google/android/gms/internal/measurement/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final synthetic c:Lcom/google/android/gms/internal/measurement/S5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/r5;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/S5;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/Z4;->c:Lcom/google/android/gms/internal/measurement/S5;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const-string p1, "getValue"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/Y1;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;
    .locals 2

    .line 1
    const-string v0, "getValue"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/z2;->a(Ljava/lang/String;ILjava/util/List;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/google/android/gms/internal/measurement/q;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/Y1;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Lcom/google/android/gms/internal/measurement/q;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/Y1;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q;->k()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Z4;->c:Lcom/google/android/gms/internal/measurement/S5;

    .line 34
    .line 35
    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/measurement/S5;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    new-instance p1, Lcom/google/android/gms/internal/measurement/u;

    .line 42
    .line 43
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/measurement/u;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-object p1
.end method
