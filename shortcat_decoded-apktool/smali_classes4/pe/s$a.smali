.class public final Lpe/s$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpe/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpe/s$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lpe/q;)Lpe/s;
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpe/s;

    .line 7
    .line 8
    sget-object v1, Lpe/t;->b:Lpe/t;

    .line 9
    .line 10
    invoke-direct {v0, v1, p1}, Lpe/s;-><init>(Lpe/t;Lpe/q;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final b(Lpe/q;)Lpe/s;
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpe/s;

    .line 7
    .line 8
    sget-object v1, Lpe/t;->c:Lpe/t;

    .line 9
    .line 10
    invoke-direct {v0, v1, p1}, Lpe/s;-><init>(Lpe/t;Lpe/q;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final c()Lpe/s;
    .locals 1

    .line 1
    sget-object v0, Lpe/s;->d:Lpe/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Lpe/q;)Lpe/s;
    .locals 2

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpe/s;

    .line 7
    .line 8
    sget-object v1, Lpe/t;->a:Lpe/t;

    .line 9
    .line 10
    invoke-direct {v0, v1, p1}, Lpe/s;-><init>(Lpe/t;Lpe/q;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
