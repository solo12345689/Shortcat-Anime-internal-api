.class public final Lcom/google/android/gms/internal/measurement/r5;
.super Lcom/google/android/gms/internal/measurement/k;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/S5;)V
    .locals 2

    .line 1
    const-string p1, "internal.remoteConfig"

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/k;->b:Ljava/util/Map;

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/gms/internal/measurement/Z4;

    .line 9
    .line 10
    const-string v1, "getValue"

    .line 11
    .line 12
    invoke-direct {v0, p0, v1, p2}, Lcom/google/android/gms/internal/measurement/Z4;-><init>(Lcom/google/android/gms/internal/measurement/r5;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/S5;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
