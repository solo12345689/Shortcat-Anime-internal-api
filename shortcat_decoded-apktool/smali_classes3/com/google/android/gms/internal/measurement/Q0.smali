.class final Lcom/google/android/gms/internal/measurement/Q0;
.super Lcom/google/android/gms/internal/measurement/p1;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field final synthetic e:Lcom/google/android/gms/internal/measurement/J0;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcom/google/android/gms/internal/measurement/z1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/z1;Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/Q0;->e:Lcom/google/android/gms/internal/measurement/J0;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/Q0;->f:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/Q0;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/Q0;->h:Lcom/google/android/gms/internal/measurement/z1;

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/p1;-><init>(Lcom/google/android/gms/internal/measurement/z1;Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/Q0;->h:Lcom/google/android/gms/internal/measurement/z1;

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
    move-object v1, v0

    .line 12
    check-cast v1, Lcom/google/android/gms/internal/measurement/v0;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/Q0;->e:Lcom/google/android/gms/internal/measurement/J0;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/Q0;->f:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, p0, Lcom/google/android/gms/internal/measurement/Q0;->g:Ljava/lang/String;

    .line 19
    .line 20
    iget-wide v5, p0, Lcom/google/android/gms/internal/measurement/p1;->a:J

    .line 21
    .line 22
    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/v0;->setCurrentScreenByScionActivityInfo(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Ljava/lang/String;J)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
