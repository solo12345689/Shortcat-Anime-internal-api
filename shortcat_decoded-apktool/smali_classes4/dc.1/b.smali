.class public final Ldc/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lpc/X;

.field private c:Ldc/g;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpc/X;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldc/b;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Ldc/b;->b:Lpc/X;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ldc/g;
    .locals 2

    .line 1
    iget-object v0, p0, Ldc/b;->c:Ldc/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v1, "Required value was null."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final b()Lpc/X;
    .locals 1

    .line 1
    iget-object v0, p0, Ldc/b;->b:Lpc/X;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldc/b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Ldc/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldc/b;->c:Ldc/g;

    .line 2
    .line 3
    return-void
.end method
