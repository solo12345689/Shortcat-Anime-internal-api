.class public final Ljf/i;
.super Ljf/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Lpf/i;


# direct methods
.method public constructor <init>(Lie/a;)V
    .locals 2

    .line 1
    const-string v0, "getScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1, v0}, Ljf/i;-><init>(Lpf/n;Lie/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lpf/n;Lie/a;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljf/a;-><init>()V

    .line 5
    new-instance v0, Ljf/h;

    invoke-direct {v0, p2}, Ljf/h;-><init>(Lie/a;)V

    invoke-interface {p1, v0}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p1

    iput-object p1, p0, Ljf/i;->b:Lpf/i;

    return-void
.end method

.method public synthetic constructor <init>(Lpf/n;Lie/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 2
    sget-object p1, Lpf/f;->e:Lpf/n;

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2}, Ljf/i;-><init>(Lpf/n;Lie/a;)V

    return-void
.end method

.method static synthetic j(Lie/a;)Ljf/k;
    .locals 0

    .line 1
    invoke-static {p0}, Ljf/i;->k(Lie/a;)Ljf/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final k(Lie/a;)Ljf/k;
    .locals 1

    .line 1
    invoke-interface {p0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljf/k;

    .line 6
    .line 7
    instance-of v0, p0, Ljf/a;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Ljf/a;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljf/a;->h()Ljf/k;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    return-object p0
.end method


# virtual methods
.method protected i()Ljf/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ljf/i;->b:Lpf/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljf/k;

    .line 8
    .line 9
    return-object v0
.end method
