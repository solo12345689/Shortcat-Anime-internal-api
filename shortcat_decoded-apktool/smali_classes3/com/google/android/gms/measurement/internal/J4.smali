.class final Lcom/google/android/gms/measurement/internal/J4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/measurement/internal/E4;

.field final synthetic b:J

.field final synthetic c:Lcom/google/android/gms/measurement/internal/M4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/M4;Lcom/google/android/gms/measurement/internal/E4;J)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/J4;->a:Lcom/google/android/gms/measurement/internal/E4;

    .line 2
    .line 3
    iput-wide p3, p0, Lcom/google/android/gms/measurement/internal/J4;->b:J

    .line 4
    .line 5
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/J4;->c:Lcom/google/android/gms/measurement/internal/M4;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/J4;->c:Lcom/google/android/gms/measurement/internal/M4;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/J4;->a:Lcom/google/android/gms/measurement/internal/E4;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/J4;->b:J

    .line 7
    .line 8
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/M4;->C(Lcom/google/android/gms/measurement/internal/E4;ZJ)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/M4;->e:Lcom/google/android/gms/measurement/internal/E4;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/A3;->a:Lcom/google/android/gms/measurement/internal/X2;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/X2;->J()Lcom/google/android/gms/measurement/internal/w5;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/w5;->u(Lcom/google/android/gms/measurement/internal/E4;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
