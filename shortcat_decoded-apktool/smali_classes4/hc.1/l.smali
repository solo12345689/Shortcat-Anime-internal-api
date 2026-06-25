.class public Lhc/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Ldc/r;

.field private c:Ldc/r;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
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
    iput-object p1, p0, Lhc/l;->a:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Lhc/k;
    .locals 4

    .line 1
    new-instance v0, Lhc/k;

    .line 2
    .line 3
    iget-object v1, p0, Lhc/l;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lhc/l;->b:Ldc/r;

    .line 6
    .line 7
    iget-object v3, p0, Lhc/l;->c:Ldc/r;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lhc/k;-><init>(Ljava/lang/String;Ldc/r;Ldc/r;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final b(Ldc/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhc/l;->b:Ldc/r;

    .line 2
    .line 3
    return-void
.end method

.method public final c(Ldc/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lhc/l;->c:Ldc/r;

    .line 2
    .line 3
    return-void
.end method
