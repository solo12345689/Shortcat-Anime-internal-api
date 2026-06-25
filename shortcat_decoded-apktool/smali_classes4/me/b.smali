.class public final Lme/b;
.super Lme/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final c:Lme/b$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lme/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lme/b$a;

    .line 5
    .line 6
    invoke-direct {v0}, Lme/b$a;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lme/b;->c:Lme/b$a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public g()Ljava/util/Random;
    .locals 2

    .line 1
    iget-object v0, p0, Lme/b;->c:Lme/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "get(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, Ljava/util/Random;

    .line 13
    .line 14
    return-object v0
.end method
