.class public abstract Lcom/google/android/gms/internal/auth/B0;
.super Lcom/google/android/gms/internal/auth/a0;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Lcom/google/android/gms/internal/auth/C0;

.field protected b:Lcom/google/android/gms/internal/auth/C0;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/auth/C0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/a0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/auth/B0;->a:Lcom/google/android/gms/internal/auth/C0;

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/C0;->n()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/gms/internal/auth/C0;->c()Lcom/google/android/gms/internal/auth/C0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/google/android/gms/internal/auth/B0;->b:Lcom/google/android/gms/internal/auth/C0;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string v0, "Default instance must be immutable."

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/auth/B0;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/B0;->a:Lcom/google/android/gms/internal/auth/C0;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/auth/C0;->o(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/google/android/gms/internal/auth/B0;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/B0;->c()Lcom/google/android/gms/internal/auth/C0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, v0, Lcom/google/android/gms/internal/auth/B0;->b:Lcom/google/android/gms/internal/auth/C0;

    .line 16
    .line 17
    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/auth/C0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/B0;->b:Lcom/google/android/gms/internal/auth/C0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/C0;->n()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/B0;->b:Lcom/google/android/gms/internal/auth/C0;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/B0;->b:Lcom/google/android/gms/internal/auth/C0;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/C0;->h()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/B0;->b:Lcom/google/android/gms/internal/auth/C0;

    .line 18
    .line 19
    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/B0;->a()Lcom/google/android/gms/internal/auth/B0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic l()Lcom/google/android/gms/internal/auth/Z0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/B0;->c()Lcom/google/android/gms/internal/auth/C0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
