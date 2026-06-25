.class public interface abstract Lg1/p;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/p$a;,
        Lg1/p$b;
    }
.end annotation


# static fields
.field public static final a:Lg1/p$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lg1/p$a;->a:Lg1/p$a;

    .line 2
    .line 3
    sput-object v0, Lg1/p;->a:Lg1/p$a;

    .line 4
    .line 5
    return-void
.end method

.method public static synthetic c(Lg1/p;)Lg1/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lg1/p;->g(Lg1/p;)Lg1/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static e(Lg1/p;)F
    .locals 0

    .line 1
    check-cast p0, Lg1/c;

    .line 2
    .line 3
    invoke-virtual {p0}, Lg1/c;->a()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method private static g(Lg1/p;)Lg1/p;
    .locals 0

    .line 1
    return-object p0
.end method

.method public static synthetic h(Lg1/p;)F
    .locals 0

    .line 1
    invoke-static {p0}, Lg1/p;->e(Lg1/p;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public abstract a()F
.end method

.method public abstract b()J
.end method

.method public d(Lie/a;)Lg1/p;
    .locals 1

    .line 1
    sget-object v0, Lg1/p$b;->b:Lg1/p$b;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p1}, Lie/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lg1/p;

    .line 15
    .line 16
    return-object p1
.end method

.method public f(Lg1/p;)Lg1/p;
    .locals 3

    .line 1
    instance-of v0, p1, Lg1/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, p0, Lg1/c;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v0, Lg1/c;

    .line 10
    .line 11
    check-cast p1, Lg1/c;

    .line 12
    .line 13
    invoke-virtual {p1}, Lg1/c;->j()Ls0/A1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lg1/c;->a()F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    new-instance v2, Lg1/n;

    .line 22
    .line 23
    invoke-direct {v2, p0}, Lg1/n;-><init>(Lg1/p;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v2}, Lg1/m;->a(FLie/a;)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-direct {v0, v1, p1}, Lg1/c;-><init>(Ls0/A1;F)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    if-eqz v0, :cond_1

    .line 35
    .line 36
    instance-of v1, p0, Lg1/c;

    .line 37
    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    if-nez v0, :cond_2

    .line 42
    .line 43
    instance-of v0, p0, Lg1/c;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    new-instance v0, Lg1/o;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lg1/o;-><init>(Lg1/p;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0}, Lg1/p;->d(Lie/a;)Lg1/p;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method public abstract i()Ls0/h0;
.end method
