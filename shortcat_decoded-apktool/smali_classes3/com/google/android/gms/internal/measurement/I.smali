.class final Lcom/google/android/gms/internal/measurement/I;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/H;


# instance fields
.field private final a:Lcom/google/android/gms/internal/measurement/Y1;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/Y1;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/I;->a:Lcom/google/android/gms/internal/measurement/Y1;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/I;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/Y1;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/I;->a:Lcom/google/android/gms/internal/measurement/Y1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/I;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/measurement/Y1;->f(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/q;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
