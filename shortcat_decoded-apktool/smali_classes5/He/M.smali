.class public final LHe/M;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LHe/K;


# instance fields
.field private final b:Ljava/util/Map;

.field private final c:Lpf/f;

.field private final d:Lpf/h;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 1
    const-string v0, "states"

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
    iput-object p1, p0, LHe/M;->b:Ljava/util/Map;

    .line 10
    .line 11
    new-instance p1, Lpf/f;

    .line 12
    .line 13
    const-string v0, "Java nullability annotation states"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lpf/f;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LHe/M;->c:Lpf/f;

    .line 19
    .line 20
    new-instance v0, LHe/L;

    .line 21
    .line 22
    invoke-direct {v0, p0}, LHe/L;-><init>(LHe/M;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lpf/f;->d(Lkotlin/jvm/functions/Function1;)Lpf/h;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v0, "createMemoizedFunctionWithNullableValues(...)"

    .line 30
    .line 31
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LHe/M;->d:Lpf/h;

    .line 35
    .line 36
    return-void
.end method

.method static synthetic b(LHe/M;LXe/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LHe/M;->c(LHe/M;LXe/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(LHe/M;LXe/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, LHe/M;->b:Ljava/util/Map;

    .line 5
    .line 6
    invoke-static {p1, p0}, LXe/e;->a(LXe/c;Ljava/util/Map;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public a(LXe/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LHe/M;->d:Lpf/h;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
