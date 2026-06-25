.class public abstract Lcom/google/android/gms/internal/play_billing/T3;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(Lcom/google/android/gms/internal/play_billing/Q3;)Lcom/google/android/gms/internal/play_billing/G0;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/O3;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/O3;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/android/gms/internal/play_billing/S3;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/S3;-><init>(Lcom/google/android/gms/internal/play_billing/O3;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Lcom/google/android/gms/internal/play_billing/O3;->b:Lcom/google/android/gms/internal/play_billing/S3;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iput-object v2, v0, Lcom/google/android/gms/internal/play_billing/O3;->a:Ljava/lang/Object;

    .line 18
    .line 19
    :try_start_0
    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/play_billing/Q3;->a(Lcom/google/android/gms/internal/play_billing/O3;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iput-object p0, v0, Lcom/google/android/gms/internal/play_billing/O3;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    return-object v1

    .line 26
    :catch_0
    move-exception p0

    .line 27
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/play_billing/S3;->b(Ljava/lang/Throwable;)Z

    .line 28
    .line 29
    .line 30
    return-object v1
.end method
