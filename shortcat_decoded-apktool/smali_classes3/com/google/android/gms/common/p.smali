.class final synthetic Lcom/google/android/gms/common/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field private final synthetic a:Z

.field private final synthetic b:Ljava/lang/String;

.field private final synthetic c:Lcom/google/android/gms/common/n;


# direct methods
.method synthetic constructor <init>(ZLjava/lang/String;Lcom/google/android/gms/common/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/google/android/gms/common/p;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/common/p;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/common/p;->c:Lcom/google/android/gms/common/n;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/common/p;->a:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/p;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/google/android/gms/common/p;->c:Lcom/google/android/gms/common/n;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/common/s;->e(ZLjava/lang/String;Lcom/google/android/gms/common/n;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
