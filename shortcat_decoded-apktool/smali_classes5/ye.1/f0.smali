.class public final Lye/f0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lye/f0$a;
    }
.end annotation


# static fields
.field public static final e:Lye/f0$a;

.field static final synthetic f:[Lpe/m;


# instance fields
.field private final a:Lye/e;

.field private final b:Lkotlin/jvm/functions/Function1;

.field private final c:Lrf/g;

.field private final d:Lpf/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/jvm/internal/F;

    .line 2
    .line 3
    const-class v1, Lye/f0;

    .line 4
    .line 5
    const-string v2, "scopeForOwnerModule"

    .line 6
    .line 7
    const-string v3, "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->k(Lkotlin/jvm/internal/E;)Lpe/o;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    new-array v1, v1, [Lpe/m;

    .line 19
    .line 20
    aput-object v0, v1, v4

    .line 21
    .line 22
    sput-object v1, Lye/f0;->f:[Lpe/m;

    .line 23
    .line 24
    new-instance v0, Lye/f0$a;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, v1}, Lye/f0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lye/f0;->e:Lye/f0$a;

    .line 31
    .line 32
    return-void
.end method

.method private constructor <init>(Lye/e;Lpf/n;Lkotlin/jvm/functions/Function1;Lrf/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lye/f0;->a:Lye/e;

    .line 4
    iput-object p3, p0, Lye/f0;->b:Lkotlin/jvm/functions/Function1;

    .line 5
    iput-object p4, p0, Lye/f0;->c:Lrf/g;

    .line 6
    new-instance p1, Lye/d0;

    invoke-direct {p1, p0}, Lye/d0;-><init>(Lye/f0;)V

    invoke-interface {p2, p1}, Lpf/n;->c(Lie/a;)Lpf/i;

    move-result-object p1

    iput-object p1, p0, Lye/f0;->d:Lpf/i;

    return-void
.end method

.method public synthetic constructor <init>(Lye/e;Lpf/n;Lkotlin/jvm/functions/Function1;Lrf/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lye/f0;-><init>(Lye/e;Lpf/n;Lkotlin/jvm/functions/Function1;Lrf/g;)V

    return-void
.end method

.method static synthetic a(Lye/f0;)Ljf/k;
    .locals 0

    .line 1
    invoke-static {p0}, Lye/f0;->f(Lye/f0;)Ljf/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(Lye/f0;Lrf/g;)Ljf/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lye/f0;->d(Lye/f0;Lrf/g;)Ljf/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d(Lye/f0;Lrf/g;)Ljf/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lye/f0;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljf/k;

    .line 8
    .line 9
    return-object p0
.end method

.method private final e()Ljf/k;
    .locals 3

    .line 1
    iget-object v0, p0, Lye/f0;->d:Lpf/i;

    .line 2
    .line 3
    sget-object v1, Lye/f0;->f:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, Lpf/m;->a(Lpf/i;Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljf/k;

    .line 13
    .line 14
    return-object v0
.end method

.method private static final f(Lye/f0;)Ljf/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lye/f0;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iget-object p0, p0, Lye/f0;->c:Lrf/g;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljf/k;

    .line 10
    .line 11
    return-object p0
.end method


# virtual methods
.method public final c(Lrf/g;)Ljf/k;
    .locals 2

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lye/f0;->a:Lye/e;

    .line 7
    .line 8
    invoke-static {v0}, Lff/e;->s(Lye/m;)Lye/H;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Lrf/g;->d(Lye/H;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-direct {p0}, Lye/f0;->e()Ljf/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    iget-object v0, p0, Lye/f0;->a:Lye/e;

    .line 24
    .line 25
    invoke-interface {v0}, Lye/h;->l()Lqf/v0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "getTypeConstructor(...)"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lrf/g;->e(Lqf/v0;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    invoke-direct {p0}, Lye/f0;->e()Ljf/k;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    iget-object v0, p0, Lye/f0;->a:Lye/e;

    .line 46
    .line 47
    new-instance v1, Lye/e0;

    .line 48
    .line 49
    invoke-direct {v1, p0, p1}, Lye/e0;-><init>(Lye/f0;Lrf/g;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, Lrf/g;->c(Lye/e;Lie/a;)Ljf/k;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
.end method
