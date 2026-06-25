.class final synthetic Lcom/google/android/gms/measurement/internal/A5;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/D5;

.field private final synthetic b:Lcom/google/android/gms/measurement/internal/q2;

.field private final synthetic c:Landroid/app/job/JobParameters;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/D5;Lcom/google/android/gms/measurement/internal/q2;Landroid/app/job/JobParameters;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/A5;->a:Lcom/google/android/gms/measurement/internal/D5;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/A5;->b:Lcom/google/android/gms/measurement/internal/q2;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/A5;->c:Landroid/app/job/JobParameters;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/A5;->a:Lcom/google/android/gms/measurement/internal/D5;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/A5;->b:Lcom/google/android/gms/measurement/internal/q2;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/A5;->c:Landroid/app/job/JobParameters;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/measurement/internal/D5;->g(Lcom/google/android/gms/measurement/internal/q2;Landroid/app/job/JobParameters;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
