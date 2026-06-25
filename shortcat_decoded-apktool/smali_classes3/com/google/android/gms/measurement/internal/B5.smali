.class final synthetic Lcom/google/android/gms/measurement/internal/B5;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/measurement/internal/D5;

.field private final synthetic b:Landroid/app/job/JobParameters;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/D5;Landroid/app/job/JobParameters;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/B5;->a:Lcom/google/android/gms/measurement/internal/D5;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/B5;->b:Landroid/app/job/JobParameters;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/B5;->a:Lcom/google/android/gms/measurement/internal/D5;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/B5;->b:Landroid/app/job/JobParameters;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/D5;->h(Landroid/app/job/JobParameters;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
