.class public final Lcom/google/android/gms/internal/measurement/U7;
.super Lcom/google/android/gms/internal/measurement/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const-string v0, "internal.platform"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/k;->b:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v1, Lcom/google/android/gms/internal/measurement/T7;

    .line 9
    .line 10
    const-string v2, "getVersion"

    .line 11
    .line 12
    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/measurement/T7;-><init>(Lcom/google/android/gms/internal/measurement/U7;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/Y1;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;
    .locals 0

    .line 1
    sget-object p1, Lcom/google/android/gms/internal/measurement/q;->W:Lcom/google/android/gms/internal/measurement/q;

    .line 2
    .line 3
    return-object p1
.end method
