.class public abstract Lcom/google/android/gms/internal/auth/Z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static a(Lcom/google/android/gms/internal/auth/U;)Lcom/google/android/gms/internal/auth/U;
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/google/android/gms/internal/auth/X;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p0, Lcom/google/android/gms/internal/auth/V;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Lcom/google/android/gms/internal/auth/V;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/auth/V;-><init>(Lcom/google/android/gms/internal/auth/U;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/auth/X;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/auth/X;-><init>(Lcom/google/android/gms/internal/auth/U;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_2
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/U;
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/auth/Y;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/auth/Y;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
