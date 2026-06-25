.class final Lcom/google/android/gms/measurement/internal/G4;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/measurement/internal/E4;

.field final synthetic b:Lcom/google/android/gms/measurement/internal/E4;

.field final synthetic c:J

.field final synthetic d:Z

.field final synthetic e:Lcom/google/android/gms/measurement/internal/M4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/M4;Lcom/google/android/gms/measurement/internal/E4;Lcom/google/android/gms/measurement/internal/E4;JZ)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/G4;->a:Lcom/google/android/gms/measurement/internal/E4;

    .line 2
    .line 3
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/G4;->b:Lcom/google/android/gms/measurement/internal/E4;

    .line 4
    .line 5
    iput-wide p4, p0, Lcom/google/android/gms/measurement/internal/G4;->c:J

    .line 6
    .line 7
    iput-boolean p6, p0, Lcom/google/android/gms/measurement/internal/G4;->d:Z

    .line 8
    .line 9
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/G4;->e:Lcom/google/android/gms/measurement/internal/M4;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/G4;->e:Lcom/google/android/gms/measurement/internal/M4;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/G4;->a:Lcom/google/android/gms/measurement/internal/E4;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/G4;->b:Lcom/google/android/gms/measurement/internal/E4;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/google/android/gms/measurement/internal/G4;->c:J

    .line 8
    .line 9
    iget-boolean v5, p0, Lcom/google/android/gms/measurement/internal/G4;->d:Z

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/measurement/internal/M4;->B(Lcom/google/android/gms/measurement/internal/E4;Lcom/google/android/gms/measurement/internal/E4;JZLandroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
