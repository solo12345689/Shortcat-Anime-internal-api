.class public final Ldg/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:Ljg/g;


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v0, 0x5

    .line 6
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v3, 0x5

    invoke-direct {p0, v3, v0, v1, v2}, Ldg/k;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 7

    const-string v0, "timeUnit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v1, Ljg/g;

    .line 4
    sget-object v2, Lig/e;->i:Lig/e;

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    .line 5
    invoke-direct/range {v1 .. v6}, Ljg/g;-><init>(Lig/e;IJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0, v1}, Ldg/k;-><init>(Ljg/g;)V

    return-void
.end method

.method public constructor <init>(Ljg/g;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldg/k;->a:Ljg/g;

    return-void
.end method


# virtual methods
.method public final a()Ljg/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/k;->a:Ljg/g;

    .line 2
    .line 3
    return-object v0
.end method
