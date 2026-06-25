.class final Lcom/google/android/gms/internal/measurement/Z0;
.super Lcom/google/android/gms/internal/measurement/p1;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final synthetic e:Ljava/lang/Runnable;

.field final synthetic f:Lcom/google/android/gms/internal/measurement/z1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/z1;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/Z0;->e:Ljava/lang/Runnable;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/Z0;->f:Lcom/google/android/gms/internal/measurement/z1;

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/p1;-><init>(Lcom/google/android/gms/internal/measurement/z1;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Z0;->f:Lcom/google/android/gms/internal/measurement/z1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/z1;->n()Lcom/google/android/gms/internal/measurement/v0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LR8/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/google/android/gms/internal/measurement/v0;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/Z0;->e:Ljava/lang/Runnable;

    .line 14
    .line 15
    new-instance v2, Lcom/google/android/gms/internal/measurement/Y0;

    .line 16
    .line 17
    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/measurement/Y0;-><init>(Lcom/google/android/gms/internal/measurement/Z0;Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/measurement/v0;->retrieveAndUploadBatches(Lcom/google/android/gms/internal/measurement/B0;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
