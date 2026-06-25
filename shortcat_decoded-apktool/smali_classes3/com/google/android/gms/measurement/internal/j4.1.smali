.class final Lcom/google/android/gms/measurement/internal/j4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/measurement/internal/E3;

.field final synthetic b:J

.field final synthetic c:Z

.field final synthetic d:Lcom/google/android/gms/measurement/internal/x4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/x4;Lcom/google/android/gms/measurement/internal/E3;JZ)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/j4;->a:Lcom/google/android/gms/measurement/internal/E3;

    .line 2
    .line 3
    iput-wide p3, p0, Lcom/google/android/gms/measurement/internal/j4;->b:J

    .line 4
    .line 5
    iput-boolean p5, p0, Lcom/google/android/gms/measurement/internal/j4;->c:Z

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/j4;->d:Lcom/google/android/gms/measurement/internal/x4;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/j4;->d:Lcom/google/android/gms/measurement/internal/x4;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/j4;->a:Lcom/google/android/gms/measurement/internal/E3;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/x4;->o(Lcom/google/android/gms/measurement/internal/E3;)V

    .line 6
    .line 7
    .line 8
    iget-boolean v5, p0, Lcom/google/android/gms/measurement/internal/j4;->c:Z

    .line 9
    .line 10
    iget-wide v2, p0, Lcom/google/android/gms/measurement/internal/j4;->b:J

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/measurement/internal/x4;->X(Lcom/google/android/gms/measurement/internal/E3;JZZ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
